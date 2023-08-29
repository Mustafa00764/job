package uz.datatalim.bottomnaviagtionmenu.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.datatalim.bottomnaviagtionmenu.R
import uz.datatalim.bottomnaviagtionmenu.model.Horizantal
import uz.datatalim.bottomnaviagtionmenu.model.Horizantaltwo

class HorizantalAdapter(var list: ArrayList<Horizantal>):RecyclerView.Adapter<HorizantalAdapter.HorizantalViewholder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HorizantalViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizantal,parent,false)
        return  HorizantalViewholder(view)
    }

    override fun getItemCount() = list.size



    override fun onBindViewHolder(holder: HorizantalViewholder, position: Int) {
        val horizantal = list[position]


        holder.apply {
            Glide.with(iv_person).load("https://o.remove.bg/downloads/2ff96980-4471-4b7b-bc31-9b1376ea18b8/image-removebg-preview.png").into(iv_person)
            tvbigtext.text = horizantal.bigtext
            tvminitext.text = horizantal.minitext


        }


    }
    class HorizantalViewholder(view: View):RecyclerView.ViewHolder(view){
        val tvbigtext = view.findViewById<TextView>(R.id.tv_big_text)

        val iv_person = view.findViewById<ImageView>(R.id.iv_person)
        val tvminitext = view.findViewById<TextView>(R.id.tv_mini_text)

    }
}