package com.example.api

import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.example.api.R.id.button1
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity() : AppCompatActivity(),View.OnClickListener, Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun onClick(v: View?) {
        if(v!!.getId() == R.id.button1) {
            MyAsyncTask(this).execute("Param1")
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener(this)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }
}