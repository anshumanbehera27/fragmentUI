package com.example.andriodui21.fragements

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.andriodui21.databinding.FragmentProfileBinding


class FragementProfile : Fragment() {
    private lateinit var frgementprofile: FragmentProfileBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        //return super.onCreateView(inflater, container, savedInstanceState)
        frgementprofile = FragmentProfileBinding.inflate(layoutInflater)
        return  frgementprofile.root
    }

}