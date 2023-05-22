package com.example.apptracker.ui.car

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.example.apptracker.R
import com.example.apptracker.databinding.FragmentCarBinding
import com.example.apptracker.ui.car.viewmodel.CarViewModel

class CarFragment : Fragment() {

    private val carViewModel: CarViewModel by activityViewModels{
        CarViewModel.Factory
    }

    private lateinit var binding: FragmentCarBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCarBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setViewModel()
    }

    private fun setViewModel(){
        binding.viewmodel = carViewModel
    }

}