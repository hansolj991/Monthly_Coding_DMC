package com.example.monthly_coding_dmc

import android.content.ContentValues.TAG
import android.content.Context
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.io.*
import android.hardware.Camera.open
import android.os.ParcelFileDescriptor.open
import android.system.Os.open
import java.nio.channels.AsynchronousFileChannel.open
import java.nio.channels.AsynchronousServerSocketChannel.open
import java.nio.channels.AsynchronousSocketChannel.open
import java.nio.channels.DatagramChannel.open
import java.nio.channels.FileChannel.open
import java.nio.channels.Pipe.open
import java.nio.channels.Selector.open
import java.nio.channels.ServerSocketChannel.open
import java.nio.channels.SocketChannel.open

class DBHelper(context: Context, name : String, factory : SQLiteDatabase.CursorFactory, version: Int):
                   SQLiteOpenHelper(context, name, factory, version) {

    private val dbPath = ""
    private val dbName = "SQL"

    //DB생성
    override fun onCreate(db: SQLiteDatabase) {
        TODO("Not yet implemented")

    }

    //DB업그레이드
    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        TODO("Not yet implemented")
    }

    //DB 파일 열기 함수
    @Throws(SQLException::class)
    fun OpenDBFile(): Boolean {
        //DB파일이 있는지 체크
        if (!CheckDatabaseFileExist()) {
            CreateDatabase()
        }

        //db경로
        val mPath: String = dbPath + dbName

        //DB 열기
        var mDatabase = null
        try {
            mDatabase = SQLiteDatabase.openDatabase(mPath, null, SQLiteDatabase.CREATE_IF_NECESSARY) as Nothing?
        } catch (sqlException: SQLException) {
            Log.e(TAG, "[ERROR]" + "Can't Open Database")
        }
        return mDatabase != null
    }

    fun CheckDatabaseFileExist(): Boolean {
        val file = File(dbPath + dbName)
        return file.exists()
    }

    // DB 만들기
    @Throws(SQLException::class)
    fun CreateDatabase() {
        //DB 읽어오기
        this.readableDatabase
        close()

        //DB 복사
        try {
            CopyDatabaseFile()
            Log.e(TAG, "[SUCCESS] $dbName are Created")
        } catch (ioException: IOException) {
            // Error Message
            Log.e(TAG, "[ERROR] Unable to create $dbName")
            throw Error(TAG)
        }
    }

    // DB 복사
    @Throws(IOException::class)
    fun CopyDatabaseFile() {
        val inputStream: InputStream = Context.assets.open()
        val outputFileName: String = dbPath + dbName
        val outputStream: OutputStream = FileOutputStream(outputFileName)
        val buffer = ByteArray(1024)
        var length: Int
        while (inputStream.read(buffer).also { length = it } > 0) {
            outputStream.write(buffer, 0, length)
        }
        outputStream.flush()
        outputStream.close()
        inputStream.close()
    }
}