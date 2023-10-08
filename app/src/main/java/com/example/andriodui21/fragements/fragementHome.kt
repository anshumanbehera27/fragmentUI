package com.example.andriodui21.fragements

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.andriodui21.databinding.FragmentHomeBinding



class fragementHome : Fragment() {
    private lateinit var fragOnebinding:FragmentHomeBinding
    private val image_url = "https://goo.gl/gEgYUd"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        //return super.onCreateView(inflater, container, savedInstanceState)
        fragOnebinding = FragmentHomeBinding.inflate(layoutInflater)
        return fragOnebinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Glide.with(view).load(image_url).into(fragOnebinding.iv)
    }

    companion object{
        // Singleton pattern -> Asked in a lot of sys desineroud
        // why we need single pattern -> in case of DB we dont want multiple instance
        // of database so we create a single instance and use it accorse the app

       private var instantce: fragementHome? = null
        fun newInstance() :Fragment{
            if (instantce== null){
                instantce = fragementHome()

            }
            return instantce!!
        }
    }
// todo 3  How to Add the  image through URL


}