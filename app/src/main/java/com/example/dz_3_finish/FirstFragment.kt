package com.example.dz_3_finish

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.dz_3_finish.Profile.BurgerAdapter
import com.example.dz_3_finish.Profile.Profile
import com.example.dz_3_finish.databinding.FragmentFirstBinding

class FirstFragment : Fragment(), (Pizza) -> Unit {

    private lateinit var adapter: BurgerAdapter

    private lateinit var adapterPizza: PizzaAdapter

    private var arrayListPizza: ArrayList<Pizza> = ArrayList()

    private var arraylistProf: ArrayList<Profile> = ArrayList()

    private lateinit var binding: FragmentFirstBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        list()
        adapt()
        listPizza()
        adaptPizza()
    }

    private fun list() {
        arraylistProf.add(Profile("Takeaways", R.drawable.prof_burger))
        arraylistProf.add(Profile("Grocery", R.drawable.profi_grocery))
        arraylistProf.add(Profile("Convenience", R.drawable.profi_conviense))
        arraylistProf.add(Profile("Pharmacy", R.drawable.profi_phormacu))
    }

    private fun adapt() {
        adapter = BurgerAdapter(arraylistProf)
        binding.recuclerviewProf.adapter = adapter
    }

    private fun listPizza() {
        arrayListPizza.add(
            Pizza(
                R.drawable.burger, "Burger Craze", "4.6(601)",
                "American", "Burgers", "15 -20 min", "Delivery: FREE", "Minimum:$10",
                "1.5 km away", "30 minutes",
                "Двойная котлета из говядины Халяль, пшеничная булочка с кунжутом, хрустящие листья салата айсберг, томаты...",
            )
        )
        arrayListPizza.add(
            Pizza(
                R.drawable.pizza, "Vegetarian Pizza", "4.6(601)",
                "Italian", "Burgers", "10 -15 min", "Delivery: FREE", "Minimum:$10",
                "0.8 km away", "30 minutes",
                "Composition: Papa John's signature tomato sauce, tomatoes, mozzarella cheese, onions, black olives, sweet green peppers, champignons"
            )
        )
        arrayListPizza.add(
            Pizza(
                R.drawable.burger, "Burger Craze", "4.6(601)",
                "American", "Burgers", "15 -20 min", "Delivery: FREE", "Minimum:$10",
                "1.5 km away", "30 minutes",
                "Двойная котлета из говядины Халяль, пшеничная булочка с кунжутом, хрустящие листья салата айсберг, томаты..."
            )
        )
        arrayListPizza.add(
            Pizza(
                R.drawable.pizza, "Vegetarian Pizza", "4.6(601)",
                "Italian", "Burgers", "10 -15 min", "Delivery: FREE", "Minimum:$10",
                "0.8 km away", "30 minutes",
                "Composition: Papa John's signature tomato sauce, tomatoes, mozzarella cheese, onions, black olives, sweet green peppers, champignons"
            )
        )
    }

    private fun adaptPizza() {
        adapterPizza = PizzaAdapter(arrayListPizza, this)
        binding.recuclerviewPizza.adapter = adapterPizza
    }

    override fun invoke(p1: Pizza) {
        val bundle = Bundle()
        bundle.putSerializable("pizza", p1)
        findNavController().navigate(R.id.action_firstFragment_to_secondFragment, bundle)
    }
}

