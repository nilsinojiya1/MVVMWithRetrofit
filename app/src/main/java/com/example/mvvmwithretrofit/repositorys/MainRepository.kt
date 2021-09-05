package com.example.mvvmwithretrofit.repositorys

import com.example.mvvmwithretrofit.service.RetrofitService

class MainRepository (private val retrofitService: RetrofitService) {
    fun getAllMovies() = retrofitService.getAllMovies()
}