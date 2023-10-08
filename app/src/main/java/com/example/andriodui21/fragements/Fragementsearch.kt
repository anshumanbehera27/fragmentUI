package com.example.andriodui21.fragements

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.andriodui21.databinding.FragmentProfileBinding
import com.example.andriodui21.databinding.FragmentSearchBinding


class Fragementsearch : Fragment() {
    private lateinit var frgementprofile: FragmentSearchBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return super.onCreateView(inflater, container, savedInstanceState)
        frgementprofile = FragmentSearchBinding.inflate(layoutInflater)
        return  frgementprofile.root
    }

}