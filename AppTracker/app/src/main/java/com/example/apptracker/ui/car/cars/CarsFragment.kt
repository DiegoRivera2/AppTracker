package com.example.apptracker.ui.car.cars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apptracker.R
import com.example.apptracker.data.model.CarModel
import com.example.apptracker.databinding.FragmentCarBinding
import com.example.apptracker.ui.car.cars.recyclerview.CarRecyclerViewAdapter
import com.example.apptracker.ui.car.viewmodel.CarViewModel


class CarsFragment : Fragment() {

    private val carViewModel: CarViewModel by activityViewModels {
        CarViewModel.Factory
    }

    private lateinit var adapter: CarRecyclerViewAdapter
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

        setRecyclerView(view)

    }

    private fun setRecyclerView(view: View){
        binding.recyclerView.layoutManager = LinearLayoutManager(view.context)

        adapter = CarRecyclerViewAdapter { selectedCar ->
            showSelectedItem(selectedCar)
        }

        binding.recyclerView.adapter = adapter
        displayCars()
    }

    private fun displayCars() {
        adapter.setData(carViewModel.getCars())
        adapter.notifyDataSetChanged()
    }

    private fun showSelectedItem(car: CarModel) {
        carViewModel.setSelectedMovie(car)
        findNavController().navigate(R.id.action_carsFragment_to_carFragment)
    }


}