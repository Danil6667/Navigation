package com.danil.navigation.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.danil.navigation.databinding.FragmentDEtailBinding

class DetailFragment : Fragment() {

    private val name: CharSequence?
    private var binding: FragmentDEtailBinding? = null
    private val args: DetailFragment by navArgs <DetailFragment>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDEtailBinding.inflate(inflater, container,false)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getData()
    }

    private fun getData() {
        binding?.detTxt?.text = args.name
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}