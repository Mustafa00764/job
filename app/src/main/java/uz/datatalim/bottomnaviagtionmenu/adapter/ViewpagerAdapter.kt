package uz.datatalim.bottomnaviagtionmenu.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import uz.datatalim.bottomnaviagtionmenu.model.Vertical


class ViewpagerAdapter(val fragments:ArrayList<Fragment>,fm: FragmentManager):FragmentPagerAdapter(fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getCount(): Int = fragments.size


    override fun getItem(position: Int): Fragment {
      return fragments[position]
    }


}


