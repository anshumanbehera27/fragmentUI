package com.example.andriodui21

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.andriodui21.databinding.ActivityFragTestBinding
import com.example.andriodui21.fragements.FragementPost
import com.example.andriodui21.fragements.FragementProfile
import com.example.andriodui21.fragements.Fragementsearch
import com.example.andriodui21.fragements.fragementHome

class fragTestActivity : AppCompatActivity() {
    // TODO 1 another way to do the view binding
    private  val fragTestBinding by lazy {
        ActivityFragTestBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(fragTestBinding.root)
        // TODO when ever you use lot of frgement you will use  set on ItemSelectedListinear
        fragTestBinding.btnNavation.setOnItemSelectedListener(){
            when(it.itemId){
                R.id.botNavHome -> setFrgementTOContainer(fragementHome())
                R.id.botnavSerch ->setFrgementTOContainer(Fragementsearch())
                    // go to search
                R.id.botNavPost -> setFrgementTOContainer(FragementPost())
                    // goto post
                R.id.botNavProfile -> setFrgementTOContainer(FragementProfile())
                // goto profile
                else ->  setFrgementTOContainer(fragementHome())
            }
            true
        }

    }
    private fun setFrgementTOContainer(fragement: Fragment){
        supportFragmentManager.beginTransaction()
            .replace(fragTestBinding.container.id ,fragement)
            .commit()

    }

}
// todo for the switch fragement

//        fragTestBinding.btn.setOnClickListener {
//            // replace the current fragement from the container
//            // and add the fragementTwo in its place
//            supportFragmentManager.beginTransaction()
//                .replace(fragTestBinding.container.id , FragmentTwo()).commit()
//
//
//        }

