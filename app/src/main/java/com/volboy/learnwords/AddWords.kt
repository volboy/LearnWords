package com.volboy.learnwords

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.volboy.learnwords.databinding.FragmentAddWordsBinding

class AddLearn : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val binding = DataBindingUtil.inflate<FragmentAddWordsBinding>(inflater, R.layout.fragment_add_words, container, false)
        binding.itemLearn.setOnClickListener {
            Toast.makeText(context, "Add words and learn them", Toast.LENGTH_SHORT).show()
        }
        return binding.root
    }
}