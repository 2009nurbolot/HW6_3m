package com.example.hw6_3m
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw6_3m.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentMainBinding.inflate(inflater,container,false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter=BakeryAdapter(arrayListOf(
            Bakery("хлеб"),
            Bakery("торт"),
            Bakery("пирог"),
            Bakery("кекс"),
            Bakery("ккровсоны"),
            Bakery("булочка"),
            Bakery("печенье"),
            Bakery("пряник"),
            Bakery("чизкейк"),
            Bakery("синабоны--")
        ))
        binding.rvBakery.adapter=adapter
    }
}