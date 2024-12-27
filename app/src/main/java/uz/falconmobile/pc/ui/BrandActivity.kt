package uz.falconmobile.pc.ui

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import uz.falconmobile.pc.R
import uz.falconmobile.pc.adapters.BrandPartsAdapter
import uz.falconmobile.pc.databinding.ActivityBrandBinding
import uz.falconmobile.pc.models.brand_model
import uz.falconmobile.pc.models.main_model

class BrandActivity : AppCompatActivity() {

    lateinit var binding: ActivityBrandBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBrandBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var title = intent.getStringExtra("title2")
        binding.tvTitle.text = title

        var data = intent.getSerializableExtra("data2") as main_model

        var adapter =
            BrandPartsAdapter(this, data.brand_list, object : BrandPartsAdapter.ItemSelectListener {
            override fun onClick(date: brand_model) {


                var intent = Intent(this@BrandActivity, ModelActivity::class.java)
                intent.putExtra("data3", date)
                intent.putExtra("title3", date.brand_name)
                startActivity(intent)




            }


        })

        binding.recycler.adapter = adapter
        val animation = AnimationUtils.loadLayoutAnimation(this , R.anim.layout_animation_fall_down)
        binding.recycler.layoutAnimation=animation


    }
}