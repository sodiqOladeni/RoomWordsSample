package retrofit_tutotrial.ibadan.android.roomwordssample;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by ${sodiqOladeni} on 7/24/2018.
 */
@Entity(tableName = "word_table")
public class Word {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @NonNull
    @ColumnInfo(name = "word")
    private String mWord;

    public Word(@NonNull String word) {
        this.mWord = word;
    }

    @Ignore
    public Word(int id, @NonNull String mWord) {
        this.id = id;
        this.mWord = mWord;
    }

    public String getWord(){return this.mWord;}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
