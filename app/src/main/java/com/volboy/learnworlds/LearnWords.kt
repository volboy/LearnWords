package com.volboy.learnworlds

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.volboy.learnworlds.databinding.FragmentLearnWordsBinding

class LearnWords : Fragment() {
    private lateinit var binding: FragmentLearnWordsBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate<FragmentLearnWordsBinding>(inflater, R.layout.fragment_learn_words, container, false)
        setListeners()
        return binding.root
    }

    private fun setListeners() {
        val clickableViews: List<View> = listOf(binding.itemENGRUS, binding.itemRUSENG, binding.itemTRANSCRIP, binding.itemRANDOM)
        for (item in clickableViews) {
            item.setOnClickListener { choiceLearnMode(it) }
        }
    }

    private fun choiceLearnMode(view: View) {
        when (view) {
            binding.itemENGRUS -> Toast.makeText(context, "Translate from English to Russian", Toast.LENGTH_SHORT).show()
            binding.itemRUSENG -> Toast.makeText(context, "Translate from Russian to English", Toast.LENGTH_SHORT).show()
            binding.itemTRANSCRIP -> Toast.makeText(context, "Translate from Transcription to word", Toast.LENGTH_SHORT).show()
            binding.itemRANDOM -> Toast.makeText(context, "Random mode", Toast.LENGTH_SHORT).show()
            else -> Toast.makeText(context, "Choice the mode", Toast.LENGTH_SHORT).show()
        }


    }
}