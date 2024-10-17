package com.unh.tinylog.ui.home

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.unh.tinylog.R

class ChildAdapter(
    private val mExampleList: ArrayList<ChildCard>,
    private val context: HomeFragment
) : RecyclerView.Adapter<ChildAdapter.ExampleViewHolder>() {

    class ExampleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val mImageView: ImageView = itemView.findViewById(R.id.image_view)
        val mTextView1: TextView = itemView.findViewById(R.id.text_view_1)
        val mTextView2: TextView = itemView.findViewById(R.id.text_view_2)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExampleViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_child_layout, parent, false)

        return ExampleViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return mExampleList.size
    }

    override fun onBindViewHolder(holder: ExampleViewHolder, position: Int) {
        val(imageResource, text1, text2) = mExampleList[position]
        holder.mTextView1.text = text1
        holder.mTextView2.text = text2
        //holder.mImageView.setImageResource(imageResource)
        holder.itemView.setOnClickListener {
            Log.d("MYTEST","Position $position")
        }
    }

}