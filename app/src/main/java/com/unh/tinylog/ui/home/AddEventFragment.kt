package com.unh.tinylog.ui.home

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SeekBar
import androidx.activity.addCallback
import androidx.navigation.fragment.findNavController
import com.unh.tinylog.R
import com.unh.tinylog.databinding.FragmentAddEventBinding

class AddEventFragment : Fragment() {

    companion object {
        fun newInstance() = AddEventFragment()
    }

    private val viewModel: AddEventViewModel by viewModels()

    private var _binding: FragmentAddEventBinding? = null
    private val binding get() = _binding!!

    private var childAgeDesc: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val callback = requireActivity().onBackPressedDispatcher.addCallback(this){
            findNavController().navigate(AddEventFragmentDirections.actionAddEventFragmentToNavigationHome())
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddEventBinding.inflate(inflater, container, false)

        binding.switchGender.setOnClickListener{

        }

        binding.seekAge.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, currentVal: Int, p2: Boolean) {
                when(currentVal){
                    in 0..4 -> childAgeDesc = "Infant"
                    in 5..12 -> childAgeDesc = "Toddler"
                    in 13..24 -> childAgeDesc = "Baby"
                }
                binding.txtChildAge.text = "$currentVal Month Old $childAgeDesc"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }

        })

        return binding.root
        //return inflater.inflate(R.layout.fragment_add_event, container, false)
    }
}