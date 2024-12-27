package uz.falconmobile.pc.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import uz.falconmobile.pc.R
import uz.falconmobile.pc.databinding.ItemLayoutBinding
import uz.falconmobile.pc.models.brand_model
import uz.falconmobile.pc.models.pc_model

class ModelPartsAdapter(
  var  context:Context,
    private val items: List<pc_model>,
    val listener: ItemSelectListener
) : RecyclerView.Adapter<ModelPartsAdapter.PcPartViewHolder>() {

    interface ItemSelectListener {

        fun onClick(date: pc_model)

    }

    // ViewHolder class using ViewBinding
    class PcPartViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(pcPart: pc_model) {
            binding.ilTvName.text = pcPart.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PcPartViewHolder {
        val binding = ItemLayoutBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PcPartViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PcPartViewHolder, position: Int) {
        holder.bind(items[position])

        holder.itemView.setOnClickListener {

            listener.onClick(items[position])

        }

    }

    override fun getItemCount(): Int = items.size
}

