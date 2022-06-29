package com.example.asqarnon.main.myOrders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.example.asqarnon.R
import com.example.asqarnon.databinding.FragmentAllOredrsBinding
import com.example.asqarnon.main.model.BreadModel

class AllOrdersFragment : Fragment(), OrdersAdapter.UserItemListener {

    private lateinit var binding: FragmentAllOredrsBinding

    private lateinit var viewModel: AllOrdersViewModel
    private lateinit var adapter: OrdersAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_all_oredrs, container, false)
        viewModel = ViewModelProvider(this)[AllOrdersViewModel::class.java]

        return binding.root
    }

    override fun onResume() {
        super.onResume()
        setRv()
    }

    private fun setRv() {
        getList()
        adapter = OrdersAdapter(this)
        binding.rvBread.adapter = adapter

    }
    private fun getList():List<BreadModel>{
        return listOf(

            BreadModel("Patir","3500 so'm",context?.let { ContextCompat.getDrawable(it, R.drawable.bread_1) }!!,"Tandirdan uzilgan issiqqina , sedanali patir non"),
            BreadModel("Patir","3500 so'm",context?.let { ContextCompat.getDrawable(it, R.drawable.bread_1) }!!,"Tandirdan uzilgan issiqqina , sedanali patir non"),
            BreadModel("Patir","3500 so'm",context?.let { ContextCompat.getDrawable(it, R.drawable.bread_1) }!!,"Tandirdan uzilgan issiqqina , sedanali patir non"),
            BreadModel("Patir","3500 so'm",context?.let { ContextCompat.getDrawable(it, R.drawable.bread_1) }!!,"Tandirdan uzilgan issiqqina , sedanali patir non"),
            BreadModel("Patir","3500 so'm",context?.let { ContextCompat.getDrawable(it, R.drawable.bread_1) }!!,"Tandirdan uzilgan issiqqina , sedanali patir non"),
            BreadModel("Patir","3500 so'm",context?.let { ContextCompat.getDrawable(it, R.drawable.bread_1) }!!,"Tandirdan uzilgan issiqqina , sedanali patir non"),

        )

    }

    override fun onClick(user: BreadModel) {
        TODO("Not yet implemented")
    }

}