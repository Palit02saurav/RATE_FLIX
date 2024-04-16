package com.example.rate_fix.ui.toprated

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.rate_fix.Movie_02
import com.example.rate_fix.Movie_06
import com.example.rate_fix.Movie_08
import com.example.rate_fix.Movie_09
import com.example.rate_fix.Movie_10
import com.example.rate_fix.Movie_11
import com.example.rate_fix.databinding.FragmentTopratedBinding

class TopratedFragment : Fragment() {

    private var _binding: FragmentTopratedBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTopratedBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.imagebutt01.setOnClickListener {
            val intent = Intent(context, Movie_02::class.java)
            startActivity(intent)
        }

        binding.imagebutt02.setOnClickListener {
            val intent = Intent(context, Movie_10::class.java)
            startActivity(intent)
        }

        binding.imagebutt03.setOnClickListener {
            val intent = Intent(context, Movie_08::class.java)
            startActivity(intent)
        }

        binding.imagebutt04.setOnClickListener {
            val intent = Intent(context, Movie_06::class.java)
            startActivity(intent)
        }

        binding.imagebutt05.setOnClickListener {
            val intent = Intent(context, Movie_09::class.java)
            startActivity(intent)
        }

        binding.imagebutt06.setOnClickListener {
            val intent = Intent(context, Movie_11::class.java)
            startActivity(intent)
        }

        binding.imagebutt07.setOnClickListener {
            val intent = Intent(context, Movie_11::class.java)
            startActivity(intent)
        }

        binding.imagebutt08.setOnClickListener {
            val intent = Intent(context, Movie_11::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
