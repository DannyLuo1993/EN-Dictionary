package com.danny.dictionary;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Word {

    public Word(String englishword, String chineseword, boolean invisible) {
        this.englishword = englishword;
        this.chineseword = chineseword;
        this.invisible = invisible;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "english word")
    private String englishword;

    @ColumnInfo(name = "chinese word")
    private String chineseword;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnglishword() {
        return englishword;
    }

    public void setEnglishword(String englishword) {
        this.englishword = englishword;
    }

    public String getChineseword() {
        return chineseword;
    }

    public void setChineseword(String chineseword) {
        this.chineseword = chineseword;
    }

    public boolean isInvisible() {
        return invisible;
    }

    public void setInvisible(boolean invisible) {
        this.invisible = invisible;
    }

    @ColumnInfo(name = "chinese invisible flag")
    private boolean invisible;


}
