package com.example.clean_architecture_mvvm_news_app.db

import androidx.room.TypeConverter
import com.example.clean_architecture_mvvm_news_app.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }

}