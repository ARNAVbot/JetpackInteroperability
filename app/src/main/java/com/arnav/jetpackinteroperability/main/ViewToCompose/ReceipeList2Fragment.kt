package com.arnav.jetpackinteroperability.main.ViewToCompose

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.Fragment
import com.arnav.jetpackinteroperability.R

/**
 * The following fragment shows how to inflate an existing custom view(which might or might not be in compose) into a ComposeView
 * into an existing fragment which is not in compose .
 */
class ReceipeList2Fragment  : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_receipe2_list, container, false)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ComposeView>(R.id.compose_view).setContent {
            Column(modifier = Modifier
                .border(BorderStroke(1.dp, Color.Black))
                .padding(16.dp)) {
                Text(text = "This is a composeable inside the fragment")
                Spacer(modifier = Modifier.padding(10.dp))
                CircularProgressIndicator()
                Spacer(modifier = Modifier.padding(10.dp))
                Text(text = "Neat")
                Spacer(modifier = Modifier.padding(10.dp))

                val customView = HorizontalDottedProgress(context = context)
                AndroidView(factory = {customView})
            }
        }
    }
}