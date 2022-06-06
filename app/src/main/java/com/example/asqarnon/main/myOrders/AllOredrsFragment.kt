package com.example.asqarnon.main.myOrders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.asqarnon.R

class AllOredrsFragment : Fragment() {

    companion object {
        fun newInstance() = AllOredrsFragment()
    }

    private lateinit var viewModel: AllOredrsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_all_oredrs, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AllOredrsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}