package com.example.recyclerview

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    val mDatas=mutableListOf<Data>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        mDatas.add(Data("aaaa","bb","cc",getDrawable( R.drawable.heyin1)!!))
        mDatas.add(Data("aaaa","bb","cc",getDrawable( R.drawable.heyin2)!!))
        mDatas.add(Data("aaaa","bb","cc",getDrawable( R.drawable.heyin3)!!))
        mDatas.add(Data("aaaa","bb","cc",getDrawable( R.drawable.heyin4)!!))
        mDatas.add(Data("aaaa","bb","cc",getDrawable( R.drawable.heyin1)!!))
        mDatas.add(Data("aaaa","bb","cc",getDrawable( R.drawable.heyin2)!!))

        initDogRecyclerView()


    }

    fun initDogRecyclerView(){
        val adapter=Adapter() //어댑터 객체 만듦
        adapter.datalist = mDatas //데이터 넣어줌
        binding.recycler.adapter=adapter //리사이클러뷰에 어댑터 연결
//        val layoutManager = LinearLayoutManager(requireContext())
//        binding.recycler.layoutManager = layoutManager
//
//        val centerOfScreen = binding.recycler.width / 2
//        layoutManager.scrollToPositionWithOffset( 5 , centerOfScreen) //itemPosition - 이동시키고자 하는 item Position

//        binding.recycler.layoutManager= LinearLayoutManager(this).also{it.orientation = LinearLayoutManager.HORIZONTAL} //레이아웃 매니저 연결
//        binding.recycler.layoutManager = LinearLayoutManager(t)
    }

//    fun initializelist(){ //임의로 데이터 넣어서 만들어봄
//        with(mDatas){
//            add(Data("aa","bb","cc",ContextCompat.getDrawable(Context, R.drawable.heyin1)!!))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//            add(Data("aa","bb","cc"))
//        }
//    }
}