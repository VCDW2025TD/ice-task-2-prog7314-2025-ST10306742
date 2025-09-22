package com.example.memestreamapp.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.memestreamapp.databinding.FragmentCreateMemeBinding

class CreateMemeFragment : Fragment() {

    private var _binding: FragmentCreateMemeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCreateMemeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // TODO: Implement gallery pick, caption overlay, location fetch, POST to API
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
