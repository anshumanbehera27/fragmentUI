package com.example.andriodui21

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.example.andriodui21.databinding.ViewpagerTestBinding
import com.example.andriodui21.fragements.FragementPost
import com.example.andriodui21.fragements.Fragementsearch
import com.example.andriodui21.fragements.fragementHome
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener

class viewpageTest:AppCompatActivity() {


    // todo 2 inlisized the layzyKey Word
 lateinit var binding: ViewpagerTestBinding
 lateinit var OnPageChangeCallback:OnPageChangeCallback

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ViewpagerTestBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.viewpager.adapter = ViewPagerAdpater(supportFragmentManager ,lifecycle)

        binding.tablayout.addOnTabSelectedListener(object :OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if(tab != null){
                    binding.viewpager.currentItem = tab.position
                }}
            override fun onTabUnselected(tab: TabLayout.Tab?) {


            }

            override fun onTabReselected(tab: TabLayout.Tab?) {

            }

        })
        OnPageChangeCallback = object :OnPageChangeCallback(){
            // todo1 here how to the systemWorks
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.tablayout.selectTab(binding.tablayout.getTabAt(position))
            }

        }
        binding.viewpager.registerOnPageChangeCallback(OnPageChangeCallback)


    }

    override fun onDestroy() {
        super.onDestroy()
        binding.viewpager.unregisterOnPageChangeCallback(OnPageChangeCallback)
    }
}
class ViewPagerAdpater(
    fragmentManager: FragmentManager ,lifecycle: Lifecycle
):FragmentStateAdapter(fragmentManager ,lifecycle){
    override fun getItemCount() = 3

    override fun createFragment(position: Int): Fragment {
      return  when(position){
            0 -> return fragementHome()
            1 -> return Fragementsearch()
            2 -> return FragementPost()
            else -> fragementHome()
        }

    }

}
