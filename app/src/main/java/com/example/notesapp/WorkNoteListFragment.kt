package com.example.notesapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.notesapp.databinding.FragmentWorkNoteListBinding


class WorkNoteListFragment : Fragment() {

    private val TAG = "lifecycle"
    private lateinit var binding: FragmentWorkNoteListBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "WorkNoteListFragment onAttach: call")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "WorkNoteListFragment onCreate: call")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_work_note_list, container, false)
        Log.d(TAG, "WorkNoteListFragment onCreateView: call")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "WorkNoteListFragment onViewCreated: call")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "WorkNoteListFragment onActivityCreated: call")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "WorkNoteListFragment onStart: call")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "WorkNoteListFragment onResume: call")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "WorkNoteListFragment onPause: call")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "WorkNoteListFragment onStop: call")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "WorkNoteListFragment onDestroyView: call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "WorkNoteListFragment onDestroy: call")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "WorkNoteListFragment onDetach: call ")
    }

}