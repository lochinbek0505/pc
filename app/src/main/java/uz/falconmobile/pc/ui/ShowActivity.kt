package uz.falconmobile.pc.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import uz.falconmobile.pc.databinding.ActivityShowBinding
import uz.falconmobile.pc.models.pc_model

class ShowActivity : AppCompatActivity() {

    private lateinit var binding: ActivityShowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var data = intent.getSerializableExtra(
            "data3"
        ) as pc_model
        binding.tvTitle.text = data.title
        binding.youtubePlayerView.addYouTubePlayerListener(object : AbstractYouTubePlayerListener() {
            override fun onReady(youTubePlayer: YouTubePlayer) {
                super.onReady(youTubePlayer)

                // Load a video by its YouTube video ID
                val videoId = "dQw4w9WgXcQ" // Replace with your desired video ID
                youTubePlayer.loadVideo(videoId, 0f)
            }
        })
        binding.asTv.text=data.text
        binding.asIv.setImageResource(data.image)
    }
}