package com.example.designapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.designapp.fragments.HeartFragment
import com.example.designapp.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity()/*, BottomNavigationView.OnNavigationItemSelectedListener */{
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*supportActionBar?.hide()
        bottomNavigationViewMainActivity.background = null
        bottomNavigationViewMainActivity.menu.getItem(1).isEnabled = false

        bottomNavigationViewMainActivity.setOnNavigationItemSelectedListener(this)
        loadFragment(HomeFragment())


        // Floating Actiong Button Listener
        fabMainActivity.setOnClickListener {
            Toast.makeText(this, "fab clicked..!", Toast.LENGTH_SHORT).show()
        }*/
    }

    /*override fun onNavigationItemSelected(item: MenuItem): Boolean {
        var fragment: Fragment? = null

        when (item.itemId) {
            R.id.home -> fragment = HomeFragment()
            R.id.heart -> fragment = HeartFragment()
//            R.id.fabMainActivity -> fragment = ScanFragment()
        }

        fragment?.let { loadFragment(it) }
        return true
    }

    override fun onPointerCaptureChanged(hasCapture: Boolean) {}

    private fun loadFragment(fragment: Fragment?) {

        //to attach fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_host_main_activity, fragment!!)
            .commit()
    }*/
}