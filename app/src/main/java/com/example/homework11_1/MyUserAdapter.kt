package com.example.homework11_1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.homework11_1.databinding.ActivityItemViewBinding

class MyUserAdapter(context: Context, val list: ArrayList<User>):ArrayAdapter<User>(context,R.layout.activity_item_view,list){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var myItemBinding = ActivityItemViewBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        myItemBinding.nameA.text = list[position].name
        myItemBinding.image.setImageResource(list[position].image)


        return myItemBinding.root
        }
    }