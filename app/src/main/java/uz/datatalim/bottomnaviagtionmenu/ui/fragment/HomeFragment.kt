package uz.datatalim.bottomnaviagtionmenu.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import uz.datatalim.bottomnaviagtionmenu.R
import uz.datatalim.bottomnaviagtionmenu.adapter.HorizantalAdapter
import uz.datatalim.bottomnaviagtionmenu.adapter.HorizantaltwoAdater
import uz.datatalim.bottomnaviagtionmenu.adapter.UserAdapter
import uz.datatalim.bottomnaviagtionmenu.adapter.VerticalAdapter
import uz.datatalim.bottomnaviagtionmenu.model.Horizantal
import uz.datatalim.bottomnaviagtionmenu.model.Horizantaltwo
import uz.datatalim.bottomnaviagtionmenu.model.User
import uz.datatalim.bottomnaviagtionmenu.model.Vertical


class HomeFragment : Fragment() {
lateinit var user2:ArrayList<Horizantal>
lateinit var user3:ArrayList<Horizantaltwo>
    lateinit var userf4:ArrayList<Vertical>
    lateinit var adapter: UserAdapter
    lateinit var users: ArrayList<User>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews(view)
        initViews2(view)
    }






    private fun initViews2(view: View) {
        loadList2()
        val rvn2 = view.findViewById<RecyclerView>(R.id.rv_n1)
        rvn2.adapter = HorizantalAdapter(user2)
    }


    private fun loadList2() {
        user2 = ArrayList()
        user2.add(Horizantal("Get tips to find work","Learn how to optimize search,\\nuse Connects, and more to\\nland your first job."))
            }





    private fun initViews(view: View) {
        loadList()
        val rvn2 = view.findViewById<RecyclerView>(R.id.rv_n1)
        rvn2.layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
        rvn2.adapter = HorizantaltwoAdater(user3)
        val rvUser = view.findViewById<RecyclerView>(R.id.rv_users)
        rvUser.layoutManager = LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)
        rvUser.adapter = VerticalAdapter(userf4)

//        val etSearch = view.findViewById<EditText>(R.id.et_search)
//        rvUser.layoutManager = LinearLayoutManager(requireContext())
//        adapter = UserAdapter()
//        rvUser.adapter = adapter
//        adapter.submitList(users)

//        etSearch.addTextChangedListener {
//            Log.d("Editt", it.toString())
//            adapter.filter.filter(it)
//        }

    }

    private fun loadList() {
        userf4 = ArrayList()
        user3 = ArrayList()
        user3.add(Horizantaltwo("Get tips to find work","Learn how to optimize search,\\nuse Connects, and more to\\nland your first job."))
        user3.add(Horizantaltwo("Get tips to find work","Learn how to optimize search,\\nuse Connects, and more to\\nland your first job."))

        userf4.add(Vertical("Browse jobs that match your expence to a client's\\nhiring preferences. Ordered by most relevant.","We need somewone who have GP\\nconsole account","Fixed-price - Posted 7 hr.ago","$25","Budget ","Entry level","Budget","Hello, Need an  Publisher for publishing my android App\\non Google Play. I have Ready-made...","more","Smartphon","Table","Native App Development","spend"))
        userf4.add(Vertical("Browse jobs that match your expence to a client's\\nhiring preferences. Ordered by most relevant.","We need somewone who have GP\\nconsole account","Fixed-price - Posted 7 hr.ago","$25","Budget ","Entry level","Budget","Hello, Need an  Publisher for publishing my android App\\non Google Play. I have Ready-made...","more","Smartphon","Table","Native App Development","spend"))
        userf4.add(Vertical("Browse jobs that match your expence to a client's\\nhiring preferences. Ordered by most relevant.","We need somewone who have GP\\nconsole account","Fixed-price - Posted 7 hr.ago","$25","Budget ","Entry level","Budget","Hello, Need an  Publisher for publishing my android App\\non Google Play. I have Ready-made...","more","Smartphon","Table","Native App Development","spend"))
        userf4.add(Vertical("Browse jobs that match your expence to a client's\\nhiring preferences. Ordered by most relevant.","We need somewone who have GP\\nconsole account","Fixed-price - Posted 7 hr.ago","$25","Budget ","Entry level","Budget","Hello, Need an  Publisher for publishing my android App\\non Google Play. I have Ready-made...","more","Smartphon","Table","Native App Development","spend"))
        userf4.add(Vertical("Browse jobs that match your expence to a client's\\nhiring preferences. Ordered by most relevant.","We need somewone who have GP\\nconsole account","Fixed-price - Posted 7 hr.ago","$25","Budget ","Entry level","Budget","Hello, Need an  Publisher for publishing my android App\\non Google Play. I have Ready-made...","more","Smartphon","Table","Native App Development","spend"))
        userf4.add(Vertical("Browse jobs that match your expence to a client's\\nhiring preferences. Ordered by most relevant.","We need somewone who have GP\\nconsole account","Fixed-price - Posted 7 hr.ago","$25","Budget ","Entry level","Budget","Hello, Need an  Publisher for publishing my android App\\non Google Play. I have Ready-made...","more","Smartphon","Table","Native App Development","spend"))
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