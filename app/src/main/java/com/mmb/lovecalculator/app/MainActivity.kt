package com.mmb.lovecalculator.app

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.mmb.lovecalculator.R
import com.mmb.lovecalculator.app.ui.love.LoveFragment
import com.mmb.lovecalculator.app.ui.recent.RecentFragment
import com.mmb.lovecalculator.data.repository.LoveRepository
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject lateinit var loveRepository:LoveRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.content_frame, LoveFragment())
            .commit()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.activity_menu_toolbar , menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId){
            R.id.recentResults->{
                supportFragmentManager.beginTransaction()
                    .replace(R.id.content_frame , RecentFragment())
                    .addToBackStack(null)
                    .commit()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
