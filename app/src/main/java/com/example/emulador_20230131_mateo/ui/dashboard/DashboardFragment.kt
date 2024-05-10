package com.example.emulador_20230131_mateo.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.emulador_20230131_mateo.R
import com.example.emulador_20230131_mateo.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

    private var _binding: FragmentDashboardBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dashboard, container, false)

        val btnVerperfil = view.findViewById<Button>(R.id.btnVerperfil)
        val txtAdios = view.findViewById<TextView>(R.id.txtAdios)

        btnVerperfil.setOnClickListener {
            txtAdios.text = "Carlos Mateo Amaya Meléndez"
        }

        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}