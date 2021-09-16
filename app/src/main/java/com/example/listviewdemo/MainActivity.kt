package com.example.listviewdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.core.view.size

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listview = findViewById<ListView>(R.id.main_ListView)
        listview.adapter = MyCustomAdapter(this);
    }

    private class MyCustomAdapter(context: Context) : BaseAdapter(){
      private val mContext: Context
      init{
          mContext = context
      }

        override fun getCount(): Int {
            return 100
        }

        override fun getItem(p0: Int): Any {
            return "TEST STRING"
        }

        override fun getItemId(position: Int): Long {
            return position.toLong()
        }

        override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup?): View {
           val textView = TextView(mContext)
            textView.text = "this is my first listView"
            return textView
        }
    }
}