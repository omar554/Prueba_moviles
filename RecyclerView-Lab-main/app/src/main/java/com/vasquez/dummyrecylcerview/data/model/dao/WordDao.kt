package com.vasquez.dummyrecylcerview.data.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.vasquez.dummyrecylcerview.data.model.Word

@Dao
interface WordDao {
    @Query("SELECT * FROM  word_table")
    fun getAllWords(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun insertWord(word: Word)

    @Update
    suspend fun updateWord(word: Word)

    @Delete
    suspend fun deleteWord(word: Word)
}