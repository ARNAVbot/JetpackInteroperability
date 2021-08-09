package com.arnav.jetpackinteroperability.FragmentToCompose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

/**
 * Here , we have an existing project which uses a fragment. Line 21-22 used to use a traditional approach
 * to inflate a fragment.
 * Now , here we have demonstrated how to convert an existing fragment to a composable view.
 */
class ReceipeListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        val view = inflater.inflate(R.layout.fragment_receipe_list, container, false)
//        return view

        val view = ComposeView(requireContext())
        view.apply {
            setContent {
                Text("hey composable")
            }
        }
        return view
    }
}