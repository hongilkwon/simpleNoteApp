package com.example.notesapp

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

const val NOTE_TYPE_PUBLIC: Int = 0
const val NOTE_TYPE_PRIVATE: Int = 1

open class Notes(
        @PrimaryKey
        var id: Int = 0,
        var type: Int = 0,
        var title: String = "",
        var description: String = "",
        var createDate: Date? = null,
        var updateDate: Date? = null
): RealmObject()
