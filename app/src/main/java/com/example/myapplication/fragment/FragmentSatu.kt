package com.example.myapplication.fragment

import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.findNavController
import com.example.myapplication.BaseNereON
import com.example.myapplication.Profile
import com.example.myapplication.R
import com.example.myapplication.RecycleViewProfile
import kotlinx.android.synthetic.main.activity_alarm.*

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class FragmentSatu : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }
    private lateinit var interfaceData: InterfaceData
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_satu,container, false)
        interfaceData = activity as InterfaceData
        val save = view.findViewById<Button>(R.id.buttonsave)
        val gender = view.findViewById<EditText>(R.id.editTextTextPersonName10)
        val umur = view.findViewById<EditText>(R.id.editTextTextPersonName11)
        val preferences = androidx.preference.PreferenceManager.getDefaultSharedPreferences(activity)

        save.setOnClickListener {
            interfaceData.send(gender.text.toString() +" , "+ umur.text.toString() + "Tahun")
        }
        return view
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentSatu.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentSatu().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}