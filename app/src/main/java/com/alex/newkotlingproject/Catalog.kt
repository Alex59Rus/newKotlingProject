package com.alex.newkotlingproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.alex.newkotlingproject.databinding.ActivityMainBinding
import com.alex.newkotlingproject.databinding.FragmentCatalogBinding

private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Catalog : Fragment() {

    private var binding: CatalogBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_catalog, container, false)
        /*binding = FragmentCatalogBinding.inflate(inflater, container, false)
            binding?.button?.setOnClickListener(View.OnClickListener {
                binding?.myText?.text = "Text changed!"*/
        return binding?.root
    }
}