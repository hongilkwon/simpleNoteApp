package com.example.notesapp

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import com.example.notesapp.databinding.FragmentNormalNoteListBinding
import com.example.notesapp.databinding.FragmentNoteListBinding


class NormalNoteListFragment : Fragment() {

    companion object {
        const val TAB_LABEL = "일상"
        private const val TAG = "lifecycle"
        private const val VTAG = "viewModel"
    }



    private lateinit var binding: FragmentNormalNoteListBinding
    private val activityViewModel: NotesViewModel by activityViewModels()

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "NormalNoteListFragment onAttach: call")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "NormalNoteListFragment onCreate: call")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_normal_note_list, container, false)
        binding.noteViewModel = activityViewModel

        Log.d(TAG, "NormalNoteListFragment onCreateView: call")
        Log.d(VTAG, "NormalNoteListFragment ${activityViewModel.getRef()}")
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "NormalNoteListFragment onViewCreated: call")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "NormalNoteListFragment onActivityCreated: call")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "NormalNoteListFragment onStart: call")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "NormalNoteListFragment onResume: call")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "NormalNoteListFragment onPause: call")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "NormalNoteListFragment onStop: call")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "NormalNoteListFragment onDestroyView: call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "NormalNoteListFragment onDestroy: call")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "NormalNoteListFragment onDetach: call ")
    }
}