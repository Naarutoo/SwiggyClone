package com.example.swiggyclone

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.swiggyclone.fragments.AccountFragment
import com.example.swiggyclone.fragments.CartFragment
import com.example.swiggyclone.fragments.SearchFragment
import com.example.swiggyclone.fragments.SwiggyFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val swiggyFragment = SwiggyFragment()
    private val searchFragment = SearchFragment()
    private val cartFragment = CartFragment()
    private val accountFragment = AccountFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        replaceFragment(swiggyFragment)

        bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId){
                R.id.ic_swiggy -> replaceFragment(swiggyFragment)
                R.id.ic_search -> replaceFragment(searchFragment)
                R.id.ic_cart -> replaceFragment(cartFragment)
                R.id.ic_account -> replaceFragment(accountFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.container, fragment).commit()
        }
    }
}