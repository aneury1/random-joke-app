package com.aneury1.random_joke.UserInterface.View

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.aneury1.random_joke.Data.Model.dataModel.Joke
import com.aneury1.random_joke.R
import com.aneury1.random_joke.Utils.Constant
import com.aneury1.random_joke.Utils.PassData
import com.aneury1.random_joke.databinding.ActivityMainBinding
import com.aneury1.random_joke.databinding.FragmentSingleJokeBinding


class SingleJoke : Fragment(){

    lateinit var binding : FragmentSingleJokeBinding

     lateinit var  bundler: Bundle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bundler = savedInstanceState ?: Bundle()
      ///  binding = FragmentSingleJokeBinding.inflate(layoutInflater)
      ///  binding.tvSetupJokeSingle.text = "Fdfdfdffd"
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val ret: View?= inflater.inflate(R.layout.fragment_two_part_joke, container, false)
        bundler = savedInstanceState ?: Bundle()
        val setup : String? = bundler.getString(Constant.JOKE_SETUP)
        ret!!.findViewById<TextView>(R.id.tv_setup_joke_fr1).text = setup ?:" "
       return ret
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            SingleJoke().apply {
                arguments = Bundle().apply {
                }
            }
    }

    lateinit var  joke: Joke


}