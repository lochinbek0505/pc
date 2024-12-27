package uz.falconmobile.pc.ui

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import uz.falconmobile.pc.R
import uz.falconmobile.pc.adapters.BrandPartsAdapter
import uz.falconmobile.pc.adapters.ModelPartsAdapter
import uz.falconmobile.pc.databinding.ActivityMainBinding
import uz.falconmobile.pc.databinding.ActivityModelBinding
import uz.falconmobile.pc.models.brand_model
import uz.falconmobile.pc.models.main_model
import uz.falconmobile.pc.models.pc_model

class ModelActivity : AppCompatActivity() {

    private lateinit var binding: ActivityModelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityModelBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var title = intent.getStringExtra("title3")
        binding.tvTitle.text = title

        var data = intent.getSerializableExtra("data3") as brand_model

        var adapter =
            ModelPartsAdapter(this,data.model_list, object : ModelPartsAdapter.ItemSelectListener {
                override fun onClick(date: pc_model) {

                    var intent = Intent(this@ModelActivity, ShowActivity::class.java)
                    intent.putExtra("data5", date)
                    startActivity(intent)


                }


            })

        binding.recycler.adapter = adapter

        val animation = AnimationUtils.loadLayoutAnimation(this , R.anim.layout_animation_fall_down)
        binding.recycler.layoutAnimation=animation

    }
}