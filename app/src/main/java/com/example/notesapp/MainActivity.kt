package com.example.notesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp

import androidx.navigation.ui.setupActionBarWithNavController
import com.example.notesapp.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "lifecycle"
        private const val VTAG = "viewModel"
    }

    private lateinit var mBinding: ActivityMainBinding
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private val mViewModel: NotesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        mBinding.viewModel = mViewModel

        navController = Navigation.findNavController(this,  R.id.nav_host_fragment)
        appBarConfiguration = AppBarConfiguration(navController.graph)
        setupActionBarWithNavController(navController, appBarConfiguration)

        Log.d(TAG, "MainActivity onCreate: call")
        Log.d(VTAG, "MainActivity ${mViewModel.getRef()}")
    }

    override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity onStart: call")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity onRestart: call")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity onResume: call")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity onPause: call")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity onStop: call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity onDestroy: call")
    }
}
