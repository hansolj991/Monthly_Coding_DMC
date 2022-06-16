package com.example.monthly_coding_dmc

import android.content.ContentValues.TAG
import android.content.Context
import android.database.SQLException
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import java.io.*

class DBHelper(context: Context, name : String, factory : SQLiteDatabase.CursorFactory, version: Int):
                   SQLiteOpenHelper(context, name, factory, version) {

    private val dbName = "SQLiteDatabase.db"

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
    fun OpenDBFile(context: Context): Boolean {
        //DB파일이 있는지 체크
        if (!CheckDatabaseFileExist()) {
            CreateDatabase(context)
        }

        //db경로
        val mPath: String = dbName

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
        val file = File(dbName)
        return file.exists()
    }

    // DB 만들기
    @Throws(SQLException::class)
    fun CreateDatabase(context: Context) {
        //DB 읽어오기
        this.readableDatabase
        close()

        //DB 복사
        try {
            CopyDatabaseFile(context)
            Log.e(TAG, "[SUCCESS] $dbName are Created")
        } catch (ioException: IOException) {
            // Error Message
            Log.e(TAG, "[ERROR] Unable to create $dbName")
            throw Error(TAG)
        }
    }

    // DB 복사
    @Throws(IOException::class)
    fun CopyDatabaseFile(context: Context) {
        val inputStream: InputStream = context.assets.open(dbName)
        val outputFileName: String = dbName
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