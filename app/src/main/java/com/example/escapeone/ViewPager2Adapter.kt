package com.example.escapeone

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.app.NotificationCompat
import androidx.recyclerview.widget.RecyclerView

class ViewPager2Adapter(private val context: Context, private val ctnts: List<String>, private val notis: List<String>)
    : RecyclerView.Adapter<ViewPager2Adapter.PagerViewHolder>(){

    override fun getItemCount(): Int = ctnts.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PagerViewHolder =
        PagerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.page_item, parent, false))

    override fun onBindViewHolder(holder: PagerViewHolder, position: Int) {
        holder.bind(ctnts[position],position,notis[position])
    }

    inner class PagerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        private val titletxt: TextView = itemView.findViewById(R.id.page_title)
        private val content: TextView = itemView.findViewById(R.id.page_content)
        private val pbackground: ConstraintLayout = itemView.findViewById(R.id.page_back)

        fun bind(ctnt: String, position: Int, noti: String){
            if(position==0){
                titletxt.text = ctnt[0].toString().plus('.')
                content.text = ctnt.substring(1)
            }else{
                titletxt.visibility = View.GONE
                if (ctnt.contains("badending")){
                    pbackground.setBackgroundColor(Color.RED)
                    var tmp = ctnt.split("badending")
                    content.text = tmp[1]
                }
                else{
                    content.text = ctnt
                }
            }

            if (noti != ""){

            }

        }
    }
}