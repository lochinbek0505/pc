package uz.falconmobile.pc.models

import java.io.Serializable

data class brand_model(

    var brand_name: String,
    var model_list: ArrayList<pc_model>


):Serializable