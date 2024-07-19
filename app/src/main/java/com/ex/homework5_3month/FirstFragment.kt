package com.ex.homework5_3month

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ex.homework5_3month.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {
    private var number = 0
    private lateinit var binding : FragmentFirstBinding;


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root;
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonOne.setOnClickListener(View.OnClickListener  {
            number++
            binding.tvZero.text = number.toString()

        })
        binding.buttonTwo.setOnClickListener(View.OnClickListener {
            number--
            binding.tvZero.text = number.toString()
        })

    }


}