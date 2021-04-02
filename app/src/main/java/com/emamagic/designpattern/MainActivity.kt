package com.emamagic.designpattern

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.emamagic.designpattern.builder.Person
import com.emamagic.designpattern.delegation.EmployKotlin
import com.emamagic.designpattern.delegation.coder.Coder
import com.emamagic.designpattern.delegation.designer.Designer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //////////////////////////////// Delegation //////////////////////////////////////

        // TAG -> DELEGATION
        val employ = EmployKotlin(
                Coder(),
                Designer()
        )
        employ.code()
        employ.design()



        //////////////////////////////// Builder //////////////////////////////////////

        val person: Person = Person.Builder()
                .name("ali")
                .family("rezaii")
                .phone("00999999")
                .age(22)
                .build()

        Log.e("BUILDER", "Person -> $person")



    }
}