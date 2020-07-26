package com.danny.dictionary;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = (Word.class), version = 1, exportSchema = false)

public abstract class WordDataBase extends RoomDatabase {

    //内部WordDao抽象方法
    public abstract WordDao wordDao();

    //创建数据库单例
    private static WordDataBase INSTANCE;

    public static WordDataBase getInstance(Context context){
        INSTANCE = Room.databaseBuilder(context.getApplicationContext(),WordDataBase.class,"Word database")
                   .build();
        return INSTANCE;
    }
}
