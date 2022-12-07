package com.danil.navigation.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
//import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.danil.navigation.databinding.ItemFirstBinding
import com.danil.navigation.ui.fragments.MainFragment
import com.danil.navigation.ui.model.MainModel

class FirstAdapter(
    private var mainList: ArrayList<MainModel>,
    private val onClickListener: (name: MainModel) -> Unit
) : RecyclerView.Adapter<FirstAdapter.FirstViewHolder>() {

    inner class FirstViewHolder(private val binding: ItemFirstBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            itemView.setOnClickListener {
                onClickListener(mainList[bindingAdapterPosition])
            }
        }

        fun onBind(mainModel: MainModel) {
            binding.tvName.text = mainModel.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FirstViewHolder {
        val binding = ItemFirstBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FirstViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FirstViewHolder, position: Int) {
        holder.onBind(mainList[position])
    }

    override fun getItemCount(): Int {
        return mainList.size
    }
}