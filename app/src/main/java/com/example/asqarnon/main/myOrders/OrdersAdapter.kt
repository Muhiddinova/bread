package com.example.asqarnon.main.myOrders

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.asqarnon.databinding.ItemOrdersBinding
import com.example.asqarnon.main.model.BreadModel

class OrdersAdapter(private val itemClickListener:UserItemListener):RecyclerView.Adapter<OrdersAdapter.VH>() {
    private var list= arrayListOf<BreadModel>()
    interface UserItemListener {
        fun onClick(user: BreadModel)
    }
    fun updateData(list:ArrayList<BreadModel>){
        this.list=list
        notifyDataSetChanged()
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemOrdersBinding.inflate(inflater, parent, false)
        return VH(binding)
    }
    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemView.setOnClickListener {
            itemClickListener.onClick(list[position])
        }
        holder.onBind(list[position])
    }

    override fun getItemCount() = list.size

    class VH(private val binding: ItemOrdersBinding) : RecyclerView.ViewHolder(binding.root) {
        fun onBind(bread: BreadModel) {
            binding.imgBread.setImageDrawable(bread.breadImage)
        }
    }
}