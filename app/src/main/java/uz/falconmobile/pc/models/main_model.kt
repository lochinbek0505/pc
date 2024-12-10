package uz.falconmobile.pc.models

import java.io.Serializable
import java.util.ArrayList

data  class main_model(

    var hardware_name:String,
    var brand_list:ArrayList<brand_model>
):Serializable