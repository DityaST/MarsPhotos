
package com.example.android.marsphotos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/**
 * MainActivity ini untuk mengatur konten atau isi tampilan dari activity_main dalam sebuah fragment yang berisi
 * OverviewFragment
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}