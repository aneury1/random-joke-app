package com.aneury1.random_joke.UserInterface.View

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.aneury1.random_joke.Data.Model.dataModel.Joke
import com.aneury1.random_joke.Data.Model.dataModel.JokeSerializable
import com.aneury1.random_joke.R
import com.aneury1.random_joke.Utils.Constant
import com.aneury1.random_joke.databinding.FragmentTwoPartJokeBinding


class TwoPartJoke : Fragment() {

    lateinit var  bundler: Bundle
    lateinit var binding: FragmentTwoPartJokeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        bundler = savedInstanceState ?: Bundle()

        ///        binding = FragmentTwoPartJokeBinding.inflate(layoutInflater)
   ///     binding.tvSetupJokeFr1.text = "HOLAAAAA"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val ret: View? = inflater.inflate(R.layout.fragment_two_part_joke, container, false)
        bundler = savedInstanceState ?: Bundle()

        val setup :String? = bundler.getString(Constant.JOKE_SETUP)
        val delivery: String? =bundler.getString(Constant.JOKE_DELIVERY)

        ret!!.findViewById<TextView>(R.id.tv_setup_joke_fr1).text= setup ?:" "
        ret!!.findViewById<TextView>(R.id.tv_value_fr1).text = delivery ?:" "
        return ret
    }

    companion object {
        @JvmStatic
        fun newInstance(joke: Joke) =
            TwoPartJoke().apply {
                arguments = Bundle().apply {

                }
            }
    }

    lateinit var joke: Joke

}