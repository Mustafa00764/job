package uz.datatalim.bottomnaviagtionmenu.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import uz.datatalim.bottomnaviagtionmenu.R
import uz.datatalim.bottomnaviagtionmenu.adapter.ViewpagerAdapter
import uz.datatalim.bottomnaviagtionmenu.ui.fragment.HomeFragment
import uz.datatalim.bottomnaviagtionmenu.ui.fragment.SecondFragment

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<Fragment>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        loadList()
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        val navController = navHostFragment.navController
        val bNavMenu = findViewById<BottomNavigationView>(R.id.bottomNavigation)
        bNavMenu.setupWithNavController(navController)
    }
    private fun loadList() {
        list = ArrayList()
        list.add(HomeFragment())
        list.add(SecondFragment())
        list.add(HomeFragment())
        list.add(SecondFragment())


        //        users.add(User("", "Azamaat"))
//        users.add(User("", "Bekzod"))
//        users.add(User("", "Alibek"))
//        users.add(User("", "Hasan"))
//        users.add(User("", "Dilmirod"))
//        users.add(User("", "Javohir"))
//        users.add(User("", "Mustafo"))
//        users.add(User("", "Azizbek"))
    }
}