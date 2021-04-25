package com.example.e_safe.onboarding.screens

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.e_safe.R
import kotlinx.android.synthetic.main.fragment_fourthscreen.view.*


class fourthscreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_fourthscreen, container, false)


        view.fina.setOnClickListener{
            findNavController().navigate(R.id.action_viewPagerFragment_to_homefragment)
            onBoardingfinished()

        }

        return view
    }

    private fun onBoardingfinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("Finished",true)
        editor.apply()
    }


}