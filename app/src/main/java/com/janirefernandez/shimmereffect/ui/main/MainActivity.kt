package com.janirefernandez.shimmereffect.ui.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.janirefernandez.shimmereffect.data.model.Animal
import com.janirefernandez.shimmereffect.databinding.ActivityMainBinding
import com.janirefernandez.shimmereffect.ui.adapters.AnimalAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val viewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Start Shimmer
        binding.shimmerView.startShimmer()

        viewModel.getAnimals(10)
        viewModel.animalList.observe(this) {
            initRecyclerView(it)
        }
    }

    private fun initRecyclerView(animalList: List<Animal>) {

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = AnimalAdapter(animalList)
        binding.recyclerView.adapter = adapter
        //Stop Shimmer
        binding.shimmerView.stopShimmer()
        //Hide Shimmer view
        binding.shimmerView.isVisible = false
    }
}