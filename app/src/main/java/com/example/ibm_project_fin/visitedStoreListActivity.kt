package com.example.ibm_project_fin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_search_store_list.*
import kotlinx.android.synthetic.main.activity_visited_store_list.*

class visitedStoreListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visited_store_list)
        //Toast.makeText(applicationContext,"VisitedStoreList 실행",Toast.LENGTH_LONG).show()
        //메인액티비티에서 데이터 받아오기
        var intent=intent
        if(intent!=null){
            Toast.makeText(applicationContext,"intent is not null",Toast.LENGTH_LONG).show()
            //Log.i("size : ",intent.extras.toString())
            var data=intent.extras?.getSerializable("onedata") as ArrayList<StoreData>
        }
        else{
            Toast.makeText(applicationContext,"intent is null",Toast.LENGTH_LONG).show()
        }


/*
        //recyclerview에 어댑터 달기
        visited_store_list_recyclerView.layoutManager=LinearLayoutManager(applicationContext,LinearLayoutManager.VERTICAL,false)
        var adapter=visited_store_list_adapter(visitedStoreData)
        adapter.itemtouchlistener=object:visited_store_list_adapter.OnItemTouch{
            override fun onitemtouch(
                viewholder: visited_store_list_adapter.MyViewHolder,
                view: View,
                data: StoreData,
                position: Int
            ) {
                //모든 데이터 전송 fulldata
                //클릭한 데이터 전송 onedata
                val mapIntent= Intent(applicationContext,mapActivity::class.java)
                mapIntent.putExtra("fulldata",visitedStoreData)
                mapIntent.putExtra("onedata",data)
                startActivity(mapIntent)
            }

        }
        visited_store_list_recyclerView.adapter=adapter*/


        //뒤로가기 버튼을 클릭한 경우
        visited_store_list_back.setOnClickListener {
            finish()
        }

        //지도 버튼 클릭한 경우
        visited_store_list_map.setOnClickListener {
            //모든 데이터 전송 fulldata
            //가장 상위의 데이터 전송 onedata
            /*val mapIntent= Intent(applicationContext,mapActivity::class.java)
            mapIntent.putExtra("fulldata",visitedStoreData)
            mapIntent.putExtra("onedata",visitedStoreData[0])
            startActivity(mapIntent)*/
        }


    }
}