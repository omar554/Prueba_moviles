package com.vasquez.dummyrecylcerview.data.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.vasquez.dummyrecylcerview.data.model.Synonym
import com.vasquez.dummyrecylcerview.data.model.Word

@Dao
interface SynonymDao {

    @Query("SELECT w.term, w.definition, w.is_fav FROM synonym_table as st INNER JOIN word_table as w ON w.term == st.synonym_term WHERE st.term = :term")
    fun getAllSynonym(term: String): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWord(word: Synonym)

    @Update
    suspend fun updateWord(word: Synonym)

    @Delete
    suspend fun deleteWord(word: Synonym)
}