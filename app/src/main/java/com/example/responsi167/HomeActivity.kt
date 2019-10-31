package com.example.responsi167

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.list.*
import kotlinx.android.synthetic.main.list2.*

class HomeActivity : AppCompatActivity() {

    lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.list)
        listView = findViewById(R.id.listView)
        var list = mutableListOf<Model>()

        list.add(Model("Burger Sapi",   "Burger dari daging sapi",   R.drawable.burger  ))
        list.add(Model("Milk Cream",   "Krim susu mantapppp",   R.drawable.cream  ))
        list.add(Model("Donat Enak", "Donat yang terbuat dari coklat Impor", R.drawable.donat  ))
        list.add(Model("Ikan Goreng",  "Ikan Goreng yang dilengkapi dengan Saus",  R.drawable.ikan  ))
        list.add(Model("Kentang Goreng",  "Kentang Goreng yang renyah dilengkapi dengan saus sambal",  R.drawable.kentang  ))
        list.add(Model("Pizza",  "Pizza dengan Topping yang bisa anda pilih", R.drawable.pizza2  ))
        list.add(Model("Salad Sehat",  "Salad yang sehat dan enak",  R.drawable.salad  ))
        list.add(Model("Salmon Goreng/Bakar",  "Salmon goreng dengan kualitas impor",  R.drawable.salmon  ))
        list.add(Model("Sandwich",  "Sandwich dengan beragam isian",  R.drawable.sandwich  ))
        list.add(Model("Waffles ",  "Waffle yang dibuat dengan cinta",  R.drawable.waffles  ))

        listView.adapter = Adapter(this,R.layout.list2,list)

        listView.setOnItemClickListener{parent, view, position, id ->

            if (position==0){
                Toast.makeText(this, "Burger dari daging sapi kualitas impor,dengan harga yang terjangkau",   Toast.LENGTH_SHORT).show()

            }
            if (position==1){
                Toast.makeText(this, "Krim susu mantapppp dengan susu kualitas pilihan,100% murni",   Toast.LENGTH_SHORT).show()
            }
            if (position==2){
                Toast.makeText(this, "Donat yang terbuat dari coklat Impor,rasanya manis,tidak menyebabkan diabetes", Toast.LENGTH_SHORT).show()
            }
            if (position==3){
                Toast.makeText(this, "Ikan Goreng yang dilengkapi dengan Saus Sambal tradisional Indonesia,awas pedas",  Toast.LENGTH_SHORT).show()
            }
            if (position==4){
                Toast.makeText(this, "Kentang Goreng yang renyah dilengkapi dengan saus sambal terasi pilihan",  Toast.LENGTH_SHORT).show()
            }
            if (position==5){
                Toast.makeText(this, "Pizza dengan Topping yang bisa anda pilih sendiri,dan ukuran yang pas!",  Toast.LENGTH_SHORT).show()
            }
            if (position==6){
                Toast.makeText(this, "Salad yang sehat dan enak serta bergizi dan baik untuk tubuh",  Toast.LENGTH_SHORT).show()
            }
            if (position==7){
                Toast.makeText(this, "Salmon goreng dengan kualitas impor,serta terjaga kualitasnya",  Toast.LENGTH_SHORT).show()
            }
            if (position==8){
                Toast.makeText(this, "Sandwich dengan beragam isian didalamnya!",  Toast.LENGTH_SHORT).show()
            }
            if (position==9){
                Toast.makeText(this, "Waffle yang dibuat dengan cinta dan kasih sayang",  Toast.LENGTH_SHORT).show()
            }

        }
        avatar.setOnClickListener {
            val intent = Intent (this,AccountActivity::class.java)
            startActivity(intent)
        }
    }
}