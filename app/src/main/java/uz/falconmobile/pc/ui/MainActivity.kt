package uz.falconmobile.pc.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.falconmobile.pc.databinding.ActivityMainBinding
import uz.falconmobile.pc.models.pc_model
import uz.falconmobile.pc.models.tansfer_model

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.cvTashqi.setOnClickListener {


            var intent = Intent(this, SelectActivity::class.java)
            intent.putExtra("data1", "1")
            intent.putExtra("title","PC ning tashqi qurilmalari")

            startActivity(intent)
        }

        binding.cvIchki.setOnClickListener {

            var intent = Intent(this, SelectActivity::class.java)
            intent.putExtra("data1", "2")
            intent.putExtra("title","PC ning ichki qurilmalari")
            startActivity(intent)
        }

//        binding.cvTashqi.setOnClickListener {
//
//            var intent = Intent(this, SelectActivity::class.java)
//            intent.putExtra("data", list_tashqi)
//            startActivity(intent)
//        }
    }
}