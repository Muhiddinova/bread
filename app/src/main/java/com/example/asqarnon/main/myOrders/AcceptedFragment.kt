package com.example.asqarnon.main.myOrders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asqarnon.R

class AcceptedFragment : Fragment() {

    companion object {
        fun newInstance() = AcceptedFragment()
    }

    private lateinit var viewModel: AcceptedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(AcceptedViewModel::class.java)
        return inflater.inflate(R.layout.fragment_paid_orders, container, false)

    }



}