package com.volboy.learnwords

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.volboy.learnwords.databinding.FragmentRulesBinding

class RulesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentRulesBinding>(
            inflater,
            R.layout.fragment_rules,
            container,
            false
        )

        return binding.root

    }


}