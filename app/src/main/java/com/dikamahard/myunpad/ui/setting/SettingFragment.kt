package com.dikamahard.myunpad.ui.setting

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dikamahard.myunpad.LoginActivity
import com.dikamahard.myunpad.R
import com.dikamahard.myunpad.databinding.FragmentSettingBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


/**
 * A simple [Fragment] subclass.
 * Use the [SettingFragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class SettingFragment : Fragment() {

    private lateinit var binding: FragmentSettingBinding
//    private val binding get() = _binding!!
    val mAuth = FirebaseAuth.getInstance()
    val db = Firebase.database

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSettingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnLogout.setOnClickListener {
            mAuth.signOut()
            startActivity(Intent(requireActivity(), LoginActivity::class.java))
        }
    }

}