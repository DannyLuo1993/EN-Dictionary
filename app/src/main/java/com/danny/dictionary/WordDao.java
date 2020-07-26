package com.danny.dictionary;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface WordDao {

    @Insert
    void insertword (Word... words);

    @Update
    void updateword (Word... words);

    @Query("DELETE FROM Word")
    void deleteallword();

    @Query("SELECT * FROM Word ORDER BY ID DESC")
    LiveData<List<Word>> getallwordslive();

}
