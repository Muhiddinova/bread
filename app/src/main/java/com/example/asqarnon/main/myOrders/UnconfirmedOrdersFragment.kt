package com.example.asqarnon.main.myOrders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asqarnon.R

class UnconfirmedOrdersFragment : Fragment() {

    private lateinit var viewModel: UnconfirmedOrdersViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this)[UnconfirmedOrdersViewModel::class.java]
        return inflater.inflate(R.layout.fragment_unconfirmed_orders, container, false)
    }
}