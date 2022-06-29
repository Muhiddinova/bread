package com.example.asqarnon.main.myOrders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asqarnon.R

class ConfirmedOrdersFragment : Fragment() {

    companion object {
        fun newInstance() = ConfirmedOrdersFragment()
    }

    private lateinit var viewModel: ConfirmedOrdersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(ConfirmedOrdersViewModel::class.java)
        return inflater.inflate(R.layout.fragment_confirmed_orders, container, false)
    }



}