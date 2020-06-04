package com.example.bandwagon

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.new_layout.view.*

class myadapter (val arrayList: ArrayList<model>,val context: Context):
    RecyclerView.Adapter<myadapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItem(model: model) {
            itemView.title.text = model.title
            itemView.description.text = model.desc
            itemView.imageIv.setImageResource(model.image)
            itemView.price.text=(model.price)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.new_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(arrayList[position])
        holder.itemView.setOnClickListener {
            //get position of selected item
            val model = arrayList.get(position)
            //get title and description with intent
            var gTitle: String = model.title
            var gDescription: String = model.desc
            var gImage: Int = model.image
            var gPrice:String=model.price
            //create intent
            val intent = Intent(context, thirdActivity::class.java)
            //put items with putExtra intent
            intent.putExtra("gTitle", gTitle)
            intent.putExtra("gDescription", gDescription)
            intent.putExtra("gImage", gImage)
            intent.putExtra("gPrice",gPrice)
            //start another activity
            context.startActivity(intent)
        }
    }
}


