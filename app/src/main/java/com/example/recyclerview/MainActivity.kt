package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.adapter.SuperHeroAdapter
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        SuperHeroProvider.superHeroList
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val manager = LinearLayoutManager(this)
//        val decoration = DividerItemDecoration(this, manager.orientation)

        binding.recyclerSuperHero.layoutManager = manager
        binding.recyclerSuperHero.adapter = SuperHeroAdapter(SuperHeroProvider.superHeroList) { superHero -> onItemSelected (superHero) }
//        binding.recyclerSuperHero.addItemDecoration(decoration)
    }

    fun onItemSelected(superHero: SuperHero) {
        Toast.makeText(this, superHero.name, Toast.LENGTH_SHORT).show()
    }
}