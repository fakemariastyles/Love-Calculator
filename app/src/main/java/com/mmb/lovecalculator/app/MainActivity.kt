package com.mmb.lovecalculator.app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mmb.lovecalculator.R
import com.mmb.lovecalculator.app.ui.LoveFragment.LoveFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction()
            .replace(R.id.content_frame, LoveFragment())
            .commit()
    }
}
