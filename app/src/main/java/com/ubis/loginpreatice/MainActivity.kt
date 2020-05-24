package com.ubis.loginpreatice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_login.setOnClickListener {

            val getid = edit_getid.text.toString()
            val getpass = edit_getpass.text.toString()

//            Log.d("입력아이디",getid)
//            Log.d("입력 비번",getpass)

            if ( getid == "admin") {
                Log.d("입력값 확인", "admin임")
            }
            else if( getid == "admin@admin.com") {
                Log.d("입력값 확인", "관리자 이메일임")
            }
            else {
                Log.d("입력값 확인", "틀린 아이디")
            }
        }
    }
}
