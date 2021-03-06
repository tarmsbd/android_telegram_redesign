package com.tarms.bd.messagingapp.fragment.attachment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

import com.tarms.bd.messagingapp.R
import com.tarms.bd.messagingapp.utils.PrefUtils

/**
 * A simple [Fragment] subclass.
 */
class AttachmentBottomSheetFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_attachment_bottomsheet, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    private fun loadImagesFromDeviceStorage() {
        
    }

}
