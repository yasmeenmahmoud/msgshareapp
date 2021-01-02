package com.example.msgshareapp.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.msgshareapp.model.Hobby
import com.example.msgshareapp.R
import com.example.msgshareapp.showToast
import kotlinx.android.synthetic.main.hobbies_item.view.*

class HobbiersAdapter(private val context: Context, private val hobbies: List<Hobby>) :
    RecyclerView.Adapter<HobbiersAdapter.MyVierHolder>() {
    //inflate layout to myviewholder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVierHolder {
        return MyVierHolder(
            LayoutInflater.from(context).inflate(R.layout.hobbies_item, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return hobbies.size
    }

    override fun onBindViewHolder(holder: MyVierHolder, position: Int) {
        val hobby = hobbies[position]
        //send object of data to my view holder and set data to layout items
        holder.setData(hobby, position)
    }

    inner class MyVierHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {
        var pos: Int = 0
        var hobbyy: Hobby? = null

        //on item clicked
        init {
            itemview.setOnClickListener {
                context.showToast(hobbyy!!.title + "  clicked")
                //Toast.makeText(context, hobbyy!!.title + "  clicked", Toast.LENGTH_SHORT).show()
            }
            itemview.imgShare.setOnClickListener {
                val intent = Intent()
                intent.setAction(Intent.ACTION_SEND)
                intent.putExtra(Intent.EXTRA_TEXT, hobbyy!!.title)
                intent.type = "text/plain"
                context.startActivity(Intent.createChooser(intent, "choose appp"))
            }
        }

        fun setData(hobby: Hobby?, position: Int) {
            itemView.txvTitle.text = (hobby?.title)
            this.pos = position
            this.hobbyy = hobby
        }

    }
}