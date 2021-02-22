package com.example.notesapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.notesapp.databinding.FragmentAddNotesBinding


class AddNotesFragment : Fragment() {

    private val TAG = "MainActivity"

    private lateinit var binding: FragmentAddNotesBinding
    private val mViewModel: NotesViewModel by viewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "AddNotesFragment onAttach: call")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "AddNotesFragment onCreate: call")
    }

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "AddNotesFragment onCreateView: call")
       return DataBindingUtil.inflate<FragmentAddNotesBinding>(inflater, R.layout.fragment_add_notes, container, false).root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "AddNotesFragment onViewCreated: call")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "AddNotesFragment onActivityCreated: call")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "AddNotesFragment onStart: call")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "AddNotesFragment onResume: call")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "AddNotesFragment onPause: call")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "AddNotesFragment onStop: call")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "AddNotesFragment onDestroyView: call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "AddNotesFragment onDestroy: call")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "AddNotesFragment onDetach: call")
    }

}