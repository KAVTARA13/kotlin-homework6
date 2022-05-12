package com.example.fragments.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.example.fragments.R

class DeepLinkFragment:Fragment(R.layout.deep_link_fragment) {
    private val args:HomeFragmentArgs by navArgs()
    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView2)
        val deepAmount = args.amount
        textView.text = deepAmount.toString()
    }
}