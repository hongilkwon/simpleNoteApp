package com.example.notesapp

import android.util.Log
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.navigation.findNavController

class NotesViewModel: ViewModel() {

    private val TAG = "NotesViewModel"
    private var cnt: Int =0

    fun navigationToAddNotesFragment(view: View){
        view.findNavController().navigate(R.id.action_noteListFragment2_to_addNotesFragment2)
        Log.d(TAG, "noteAdd")
    }

    fun getRef() = this.toString()

}