package com.example.hw6_3m

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.hw6_3m.databinding.ItemBakeryBinding

class BakeryAdapter(private val dataList:List<Bakery>): RecyclerView.Adapter<BakeryAdapter.ViewHolder>(){
    class ViewHolder(private var binding: ItemBakeryBinding): RecyclerView.ViewHolder(binding.root){
        fun bind(bakary: Bakery){
            binding.tvBakery.text = bakary.name
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BakeryAdapter.ViewHolder {
        return ViewHolder(
            ItemBakeryBinding.inflate(
               LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: BakeryAdapter.ViewHolder, position: Int) {
        holder.bind(dataList[position])

    }

    override fun getItemCount(): Int {
        return dataList.size
    }
}
