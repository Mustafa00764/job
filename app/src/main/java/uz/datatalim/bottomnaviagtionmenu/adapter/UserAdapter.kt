package uz.datatalim.bottomnaviagtionmenu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import uz.datatalim.bottomnaviagtionmenu.R
import uz.datatalim.bottomnaviagtionmenu.model.User

class UserAdapter :  RecyclerView.Adapter<RecyclerView.ViewHolder>(), Filterable {
    val list=ArrayList<User>()
    var oldList=ArrayList<User>()

    fun submitList(list: ArrayList<User>){
        this.list.clear()
        this.list.addAll(list)
        this.oldList=list
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_search, parent, false)
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = list[position]
        if (holder is UserViewHolder) {
            holder.apply {
                tvUsername.text = user.userName
            }
        }
    }

    class UserViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvUsername = view.findViewById<TextView>(R.id.tv_fullname)
        val ivUser = view.findViewById<ImageView>(R.id.iv_profile)
    }

    override fun getFilter(): Filter {
        return myFliter
    }

    private val myFliter = object : Filter() {
        override fun performFiltering(p0: CharSequence?): FilterResults {
            var newList = ArrayList<User>()
            if (p0.isNullOrEmpty()) {
                newList.addAll(oldList)
            } else {
                for (item in oldList) {
                    if (item.userName.lowercase().startsWith(p0.toString().lowercase())) {
                        newList.add(item)
                    }
                }
            }

            val result = FilterResults()
            result.values = newList

            return result
        }

        override fun publishResults(p0: CharSequence?, p1: FilterResults?) {
            list.clear()
            list.addAll(p1?.values as ArrayList<User>)
            notifyDataSetChanged()
        }

    }
}