package com.danil.navigation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.danil.navigation.databinding.FragmentSecondBinding

class SecondDetailFragment : Fragment() {

    private var binding: FragmentSecondBinding? = null
    private val args by navArgs<SecondDetailFragmentArgs>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        binding?.detImg?.let {
            Glide.with(it).load(args.image).into(it)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}