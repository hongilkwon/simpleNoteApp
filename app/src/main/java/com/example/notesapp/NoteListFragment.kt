package com.example.notesapp


import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import com.example.notesapp.databinding.FragmentNoteListBinding
import kotlinx.android.synthetic.main.fragment_note_list.*


class NoteListFragment: Fragment() {

    private val TAG = "lifecycle"

    private lateinit var binding: FragmentNoteListBinding
    private val activityViewModel: NotesViewModel by viewModels()

    private lateinit var normalListFragment: NormalNoteListFragment
    private lateinit var workNoteListFragment: WorkNoteListFragment

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "NoteListFragment onAttach: call $context ")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "NoteListFragment onCreate: call")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = DataBindingUtil.inflate<FragmentNoteListBinding>(inflater, R.layout.fragment_note_list, container,false)
        binding.noteViewModel = activityViewModel

        normalListFragment = NormalNoteListFragment()
        workNoteListFragment = WorkNoteListFragment()

        Log.d(TAG, "NoteListFragment onCreateView: call")
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // fragment view 생성이 된후 viewPager setting
        val pagerAdapter = NoteListPagerAdapter(childFragmentManager)
        pagerAdapter.addItem(normalListFragment)
        pagerAdapter.addItem(workNoteListFragment)
        binding.mViewPager.adapter = pagerAdapter

        //TapLayout 설정.
        binding.mTabLayout.setupWithViewPager(mViewPager)

        Log.d(TAG, "NoteListFragment onViewCreated: call")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAG, "NoteListFragment onActivityCreated: call")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "NoteListFragment onStart: call")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "NoteListFragment onResume: call")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "NoteListFragment onPause: call")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "NoteListFragment onStop: call")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "NoteListFragment onDestroyView: call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "NoteListFragment onDestroy: call")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "NoteListFragment onDetach: call ")
    }
}

