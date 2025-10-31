package com.ingeniero.launcher

import android.app.Activity
import android.content.Intent
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent()
        intent.setClassName(
            "com.sprd.engineermode",
            "com.sprd.engineermode.EngineerModeActivity"
        )
        startActivity(intent)
        finish()
    }
}
