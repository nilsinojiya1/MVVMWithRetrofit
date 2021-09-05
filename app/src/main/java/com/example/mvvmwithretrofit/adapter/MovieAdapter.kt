package com.example.mvvmwithretrofit.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mvvmwithretrofit.databinding.ItemMovieBinding
import com.example.mvvmwithretrofit.models.Movie

class MovieAdapter: RecyclerView.Adapter<MainViewHolder>() {

    var movies = mutableListOf<Movie>()

    fun setMovieList(movies: List<Movie>) {
        this.movies = movies.toMutableList()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = ItemMovieBinding.inflate(inflater, parent, false)
        return MainViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val movie = movies[position]
        holder.binding.name.text = movie.name
        Glide.with(holder.itemView.context)
            .load(movie.imageUrl)
            .into(holder.binding.imageview)

    }

    override fun getItemCount(): Int {
        return movies.size
    }

}

class MainViewHolder(val binding: ItemMovieBinding) : RecyclerView.ViewHolder(binding.root) {

}
