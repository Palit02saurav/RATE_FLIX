package com.example.rate_fix.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.rate_fix.Bollywood_Activity
import com.example.rate_fix.Gamer
import com.example.rate_fix.Gandx
import com.example.rate_fix.Hindi_Actiivity
import com.example.rate_fix.Hollywood_Activity
import com.example.rate_fix.Movie07
import com.example.rate_fix.Movie_01
import com.example.rate_fix.Movie_02
import com.example.rate_fix.Movie_03
import com.example.rate_fix.Movie_04
import com.example.rate_fix.Movie_05
import com.example.rate_fix.Movie_06
import com.example.rate_fix.Movie_08
import com.example.rate_fix.Movie_09
import com.example.rate_fix.Movie_10
import com.example.rate_fix.Movie_11
import com.example.rate_fix.Others_Activity
import com.example.rate_fix.activity_tollywood
import com.example.rate_fix.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater)
        val root: View = binding.root

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        binding.screen01.setOnClickListener {
            val intent = Intent(context,Bollywood_Activity::class.java)
            startActivity(intent)
        }

        binding.screen02.setOnClickListener {
            val intent = Intent(context,Hollywood_Activity::class.java)
            startActivity(intent)
        }

        binding.screen03.setOnClickListener {
            val intent = Intent(context,activity_tollywood::class.java)
            startActivity(intent)
        }

        binding.screen04.setOnClickListener {
            val intent = Intent(context,Others_Activity::class.java)
            startActivity(intent)
        }

        binding.top1.setOnClickListener {
            val intent = Intent(context, Movie_02::class.java)
            startActivity(intent)
        }

        binding.top2.setOnClickListener {
            val intent = Intent(context, Movie_10::class.java)
            startActivity(intent)
        }

        binding.top3.setOnClickListener {
            val intent = Intent(context, Movie_08::class.java)
            startActivity(intent)
        }

        binding.top4.setOnClickListener {
            val intent = Intent(context, Movie_06::class.java)
            startActivity(intent)
        }

        binding.top5.setOnClickListener {
            val intent = Intent(context, Movie07::class.java)
            startActivity(intent)
        }

        binding.top6.setOnClickListener {
            val intent = Intent(context, Movie_09::class.java)
            startActivity(intent)
        }

        binding.rec01.setOnClickListener {
            val intent = Intent(context, Movie_06::class.java)
            startActivity(intent)
        }

        binding.rec02.setOnClickListener {
            val intent = Intent(context, Movie07::class.java)
            startActivity(intent)
        }

        binding.rec03.setOnClickListener {
            val intent = Intent(context, Movie_08::class.java)
            startActivity(intent)
        }

        binding.rec04.setOnClickListener {
            val intent = Intent(context, Movie_11::class.java)
            startActivity(intent)
        }

        binding.rec05.setOnClickListener {
            val intent = Intent(context, Movie_11::class.java)
            startActivity(intent)
        }

        binding.rec06.setOnClickListener {
            val intent = Intent(context, Movie_11::class.java)
            startActivity(intent)
        }

        binding.rec07.setOnClickListener {
            val intent = Intent(context, Movie_02::class.java)
            startActivity(intent)
        }



        binding.rec1.setOnClickListener {
            val intent = Intent(context, Movie_03::class.java)
            startActivity(intent)
        }
        binding.rec2.setOnClickListener {
            val intent = Intent(context, Movie_01::class.java)
            startActivity(intent)
        }
        binding.rec3.setOnClickListener {
            val intent = Intent(context, Movie_04::class.java)
            startActivity(intent)
        }
        binding.rec4.setOnClickListener {
            val intent = Intent(context, Gandx::class.java)
            startActivity(intent)
        }
        binding.rec5.setOnClickListener {
            val intent = Intent(context, Gamer::class.java)
            startActivity(intent)
        }


        binding.linimg02.setOnClickListener {
            val intent = Intent(context, Movie_04::class.java)
            startActivity(intent)
        }
        binding.linimg04.setOnClickListener {
            val intent = Intent(context, Movie_05::class.java)
            startActivity(intent)
        }
        binding.linimg01.setOnClickListener {
            val intent = Intent(context, Movie_04::class.java)
            startActivity(intent)
        }
        binding.linimg03.setOnClickListener {
            val intent = Intent(context, Movie_04::class.java)
            startActivity(intent)
        }



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
