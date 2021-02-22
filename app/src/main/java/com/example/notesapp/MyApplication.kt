package com.example.notesapp

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class MyApplication :Application() {

    override fun onCreate() {
        super.onCreate()

        //init Realm
        Realm.init(this)

        val configuration =  RealmConfiguration.Builder()
            .name("note.realm")
            .deleteRealmIfMigrationNeeded()
            .schemaVersion(0)
            .build()

        Realm.setDefaultConfiguration(configuration)
    }
}