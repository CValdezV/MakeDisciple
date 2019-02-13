package edu.cwu.makedisciple.Database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase db;
    private static DatabaseAccess instance;
    Cursor cursor = null;

    //private constructor
    public DatabaseAccess(Context context){
        this.openHelper = new DatabaseHelper(context);
    }

    //return instance of database
    public static DatabaseAccess getInstance(Context context){
        if (instance == null){
            instance = new DatabaseAccess(context);
        }
        return instance;
    }
    //opens connection to database
    public void open(){
        this.db=openHelper.getWritableDatabase();
    }
    //closes connection to database
    public void close(){
        if (db!=null){
            this.db.close();
        }
    }
    //query to database and return results from database
    public String getContent(int id){
        cursor = db.rawQuery("SELECT content FROM bookContent WHERE _id = '"+id+"';", new String[]{});
        cursor.moveToFirst();

        String content = cursor.getString(0);


        return content;

    }

}
