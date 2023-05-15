package com.example.dz_3_finish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.dz_3_finish.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getBundle()
    }

    private fun getBundle() {
        val pizza: Pizza = arguments?.getSerializable("pizza") as Pizza
        binding.secondName.text = pizza.name
        binding.textTime.text = pizza.time
        binding.secondCountry.text = pizza.country
        binding.secondEstimation.text = pizza.estimation
        binding.secondFreeClub.text = pizza.freeClub
        binding.secondMealName.text = pizza.mealName
        binding.secondTextKm.text = pizza.km
        binding.secondMinimum.text = pizza.minimum
        binding.secondTimeAround.text = pizza.around
        binding.secondInfo.text = pizza.info
        Glide.with(binding.secondImage).load(pizza.image).into(binding.secondImage)
    }
}