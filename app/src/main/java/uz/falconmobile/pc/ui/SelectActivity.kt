package uz.falconmobile.pc.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import uz.falconmobile.pc.adapters.BrandPartsAdapter
import uz.falconmobile.pc.adapters.PcPartsAdapter
import uz.falconmobile.pc.databinding.ActivitySelectBinding
import uz.falconmobile.pc.models.brand_model
import uz.falconmobile.pc.models.main_model
import uz.falconmobile.pc.models.pc_model
import uz.falconmobile.pc.models.tansfer_model

class SelectActivity : AppCompatActivity() {

    lateinit var binding: ActivitySelectBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var title = intent.getStringExtra("title")
        binding.tvTitle.text = title

        var data = intent.getStringExtra("data1")


        // Part 1: CPUs
        val cpuModels = main_model(
            "CPU (Protsessor)", arrayListOf(
                brand_model(
                    "Intel", arrayListOf(
                        pc_model(
                            "Intel Core i3", """
                    Intel i3 – Intel kompaniyasining Core seriyasidagi boshlang‘ich darajadagi protsessorlar qatoriga kiradi...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "Intel Core i5", """
                    Intel i5 – Intel kompaniyasining o‘rta darajadagi protsessorlar seriyasiga kiradi...
                    """,
                            0, ""
                        )
                    )
                ),
                brand_model(
                    "AMD", arrayListOf(
                        pc_model(
                            "AMD Ryzen 3", """
                    AMD Ryzen 3 – AMD kompaniyasining boshlang‘ich darajadagi protsessorlar qatoriga kiradi...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "AMD Ryzen 5", """
                    AMD Ryzen 5 – AMD kompaniyasining o‘rta darajadagi protsessorlari...
                    """,
                            0, ""
                        )
                    )
                ),
                brand_model(
                    "Apple", arrayListOf(
                        pc_model(
                            "Apple M1", """
                    Apple M1 – Apple kompaniyasining ARM arxitekturasiga asoslangan birinchi protsessori...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "Apple M2", """
                    Apple M2 – Apple kompaniyasining yangi avlod protsessori...
                    """,
                            0, ""
                        )
                    )
                ),
                brand_model(
                    "Snapdragon", arrayListOf(
                        pc_model(
                            "Snapdragon 8cx Gen 3", """
                    Snapdragon 8cx Gen 3 – Qualcomm kompaniyasining ARM asosidagi protsessori...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )

// Part 2: GPUs
        val gpuModels = main_model(
            "GPU (Grafik protsessor)", arrayListOf(
                brand_model(
                    "NVIDIA", arrayListOf(
                        pc_model(
                            "NVIDIA GeForce GTX 1650", """
                    NVIDIA GeForce GTX 1650 – o‘rta darajadagi grafik protsessor bo‘lib...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "NVIDIA GeForce RTX 3060", """
                    NVIDIA GeForce RTX 3060 – yuqori darajadagi grafik protsessor...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )

// Part 3: Motherboards
        val motherboardModels = main_model(
            "Motherboards", arrayListOf(
                brand_model(
                    "ASUS", arrayListOf(
                        pc_model(
                            "ASUS ROG STRIX B550-F", """
                    ASUS ROG STRIX B550-F – yuqori sifatli va optimallikni ta’minlaydi...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )
        val memoryModels = main_model(
            "Memory (RAM)", arrayListOf(
                brand_model(
                    "Corsair", arrayListOf(
                        pc_model(
                            "Corsair Vengeance LPX 16GB", """
                    Corsair Vengeance LPX 16GB – 16GB DDR4 RAM with high performance...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "Corsair Dominator Platinum 32GB", """
                    Corsair Dominator Platinum 32GB – premium DDR4 RAM with improved heat dissipation...
                    """,
                            0, ""
                        )
                    )
                ),
                brand_model(
                    "G.SKILL", arrayListOf(
                        pc_model(
                            "G.SKILL Ripjaws V 16GB", """
                    G.SKILL Ripjaws V 16GB – reliable and affordable DDR4 RAM...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )

        val storageModels = main_model(
            "Storage Devices", arrayListOf(
                brand_model(
                    "Samsung", arrayListOf(
                        pc_model(
                            "Samsung 970 EVO Plus 1TB", """
                    Samsung 970 EVO Plus 1TB – fast and reliable NVMe SSD with high read/write speeds...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "Samsung 860 EVO 500GB", """
                    Samsung 860 EVO 500GB – SATA SSD with reliable performance for everyday use...
                    """,
                            0, ""
                        )
                    )
                ),
                brand_model(
                    "Western Digital", arrayListOf(
                        pc_model(
                            "WD Black SN850X 1TB", """
                    WD Black SN850X 1TB – ultra-fast PCIe Gen 4 SSD for gaming and high-performance workloads...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )

        val psuModels = main_model(
            "Power Supply Units (PSU)", arrayListOf(
                brand_model(
                    "Corsair", arrayListOf(
                        pc_model(
                            "Corsair RM850x 850W", """
                    Corsair RM850x 850W – fully modular power supply with 80 Plus Gold certification...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "Corsair TX650M 650W", """
                    Corsair TX650M 650W – reliable and efficient power supply for mid-range systems...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )

        val coolingModels = main_model(
            "Cooling Systems", arrayListOf(
                brand_model(
                    "NZXT", arrayListOf(
                        pc_model(
                            "NZXT Kraken X63 280mm", """
                    NZXT Kraken X63 280mm – powerful AIO liquid cooler for superior cooling performance...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "NZXT Aer RGB 2 120mm", """
                    NZXT Aer RGB 2 120mm – high-performance air cooler with customizable RGB lighting...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )

        val soundCardModels = main_model(
            "Sound Cards", arrayListOf(
                brand_model(
                    "Creative", arrayListOf(
                        pc_model(
                            "Creative Sound BlasterX AE-5", """
                    Creative Sound BlasterX AE-5 – high-end PCIe sound card for audiophile-grade sound...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "Creative Sound Blaster Z", """
                    Creative Sound Blaster Z – a great mid-range sound card for immersive audio...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )

        val networkCardModels = main_model(
            "Network Cards", arrayListOf(
                brand_model(
                    "TP-Link", arrayListOf(
                        pc_model(
                            "TP-Link Archer T6E", """
                    TP-Link Archer T6E – Wi-Fi 6 PCIe network card for high-speed wireless connection...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "TP-Link TG-3468", """
                    TP-Link TG-3468 – affordable Ethernet network card for stable wired networking...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )

        val opticalDriveModels = main_model(
            "Optical Drives", arrayListOf(
                brand_model(
                    "LG", arrayListOf(
                        pc_model(
                            "LG WH16NS40", """
                    LG WH16NS40 – Blu-ray writer with fast read/write speeds and high compatibility...
                    """,
                            0, ""
                        ),
                        pc_model(
                            "LG GP96YB70", """
                    LG GP96YB70 – portable external DVD writer for convenience and ease of use...
                    """,
                            0, ""
                        )
                    )
                )
            )
        )

// More parts (RAM, Storage, etc.) can follow in similar structures.

// Combine all parts into the main list
        val baza = arrayListOf(
            cpuModels,
            gpuModels,
            motherboardModels,
            memoryModels,
            storageModels,
            psuModels,
            coolingModels,
            soundCardModels,
            networkCardModels,
            opticalDriveModels
            // Add other parts here
        )

        val monitorModels = main_model(
            "Monitor", arrayListOf(
                brand_model(
                    "Samsung", arrayListOf(
                        pc_model(
                            "Samsung Odyssey G7", """
                    Samsung Odyssey G7 – 27 dyuymli curvli monitor, 2560x1440 piksel rezolyutsiyasida ishlaydi.
                    240 Hz yangilanish tezligi va 1 ms javob vaqti bilan yuqori darajadagi o‘yinlar uchun moslashtirilgan. 
                    QOLED texnologiyasi va 1000R egri chizig‘i bilan vizual tajribangizni yangi darajaga olib chiqadi.
                    """,
                            0, "Samsung Odyssey G7"
                        ),
                        pc_model(
                            "Samsung U28E590D", """
                    Samsung U28E590D – 28 dyuymli 4K UHD monitor, 3840x2160 piksel rezolyutsiyasiga ega.
                    IPS paneli va sRGB 98% rang qamrovi bilan tasvirlarning aniq va tabiiy bo‘lishini ta'minlaydi. 
                    Yaxshi multitasking va kontent yaratish uchun ideal variant.
                    """,
                            0, "Samsung U28E590D"
                        )
                    )
                ),
                brand_model(
                    "LG", arrayListOf(
                        pc_model(
                            "LG 27GN950-B", """
                    LG 27GN950-B – 27 dyuymli 4K UHD IPS monitor, 144 Hz yangilanish tezligi va 1 ms javob vaqti.
                    NVIDIA G-Sync va AMD FreeSync texnologiyalari bilan o‘yinlar uchun mukammal tajriba ta'minlaydi.
                    HDR10 va DCI-P3 ranglar qamrovi bilan professional video tahrirchilari uchun moslashtirilgan.
                    """,
                            0, "LG 27GN950-B"
                        )
                    )
                )
            )
        )
        val mouseModels = main_model(
            "Mouse", arrayListOf(
                brand_model(
                    "Logitech", arrayListOf(
                        pc_model(
                            "Logitech G Pro X Superlight", """
                    Logitech G Pro X Superlight – 63 grammdan yengil simsiz o‘yin sichqonchasi. 
                    25,600 DPI ga qadar sozlanadigan sensor va Hero optik texnologiya bilan yuqori aniqlik va tezlikni ta'minlaydi.
                    Tezkor reaksiya va mukammal ergonomik dizayn bilan raqobatbardosh o‘yinchilar uchun ideal variant.
                    """,
                            0, "Logitech G Pro X Superlight"
                        ),
                        pc_model(
                            "Logitech MX Master 3", """
                    Logitech MX Master 3 – Office ishlariga mo‘ljallangan simsiz sichqoncha. 
                    Yengil va qulay dizaynga ega, batareya 70 kun davomida ishlashi mumkin. 
                    4000 DPI sensor va tezkor aylanish bilan yaxshi ishlashni ta'minlaydi.
                    """,
                            0, "Logitech MX Master 3"
                        )
                    )
                ),
                brand_model(
                    "Razer", arrayListOf(
                        pc_model(
                            "Razer DeathAdder V2", """
                    Razer DeathAdder V2 – o‘yin sichqonchasi, 20,000 DPI sensor va Razer Optical Mouse Switches bilan yuqori tezlikda ishlashni ta'minlaydi. 
                    Ergonomik dizayn va simli dizayn orqali o‘yinchilar uchun mukammal nazoratni beradi.
                    """,
                            0, "Razer DeathAdder V2"
                        )
                    )
                )
            )
        )
        val keyboardModels = main_model(
            "Keyboard", arrayListOf(
                brand_model(
                    "Corsair", arrayListOf(
                        pc_model(
                            "Corsair K95 RGB Platinum XT", """
                    Corsair K95 RGB Platinum XT – 6 ta makros tugmasi va Cherry MX switchlari bilan yuqori darajadagi o‘yin klaviaturasi.
                    RGB yoritilishi va 100% anti-ghosting texnologiyasi bilan yuqori samarali foydalanish imkonini beradi.
                    """,
                            0, "Corsair K95 RGB Platinum XT"
                        ),
                        pc_model(
                            "Corsair K70 RGB MK.2", """
                    Corsair K70 RGB MK.2 – Cherry MX red switchlar bilan o‘yinlar uchun optimallashtirilgan. 
                    RGB yoritilishi va alloy dizayni bilan mustahkam va estetik jihatdan jozibali. 
                    Yaxshi klaviatura har qanday o‘yin tajribasini yaxshilaydi.
                    """,
                            0, "Corsair K70 RGB MK.2"
                        )
                    )
                ),
                brand_model(
                    "Razer", arrayListOf(
                        pc_model(
                            "Razer Huntsman Elite", """
                    Razer Huntsman Elite – Optik switchlar va RGB yoritilishi bilan yuqori darajadagi o‘yin klaviaturasi.
                    To‘liq o‘lchamli dizayn va ergonomik yostiq bilan uzoq vaqt davomida qulay foydalanish uchun mo‘ljallangan.
                    """,
                            0, "Razer Huntsman Elite"
                        )
                    )
                )
            )
        )
        val printerModels = main_model(
            "Printer", arrayListOf(
                brand_model(
                    "HP", arrayListOf(
                        pc_model(
                            "HP LaserJet Pro MFP M428fdw", """
                    HP LaserJet Pro MFP M428fdw – Laser printer, fax, skaner va nusxalash imkoniyatlariga ega. 
                    40 ppm gacha bosib chiqarish tezligi va ikki tomonlama bosib chiqarish imkoniyati bilan ofislar uchun qulay.
                    Simli va simsiz ulanish imkoniyatlari mavjud.
                    """,
                            0, "HP LaserJet Pro MFP M428fdw"
                        ),
                        pc_model(
                            "HP DeskJet 3755", """
                    HP DeskJet 3755 – Kompakt inkjet printer, o‘lchami kichik va eng ko‘p foydalaniladigan ofis ishlariga mo‘ljallangan. 
                    8.5 x 14 dyuymli formatda yuqori sifatli bosma hujjatlar yaratadi.
                    """,
                            0, "HP DeskJet 3755"
                        )
                    )
                ),
                brand_model(
                    "Canon", arrayListOf(
                        pc_model(
                            "Canon PIXMA TS9120", """
                    Canon PIXMA TS9120 – Inkjet printer, yuqori sifatli rasm va hujjat bosib chiqarish imkoniyatlariga ega. 
                    6 ta alohida inkli kartrij va Wi-Fi ulanish imkoniyatlari mavjud.
                    """,
                            0, "Canon PIXMA TS9120"
                        )
                    )
                )
            )
        )
        val scannerModels = main_model(
            "Scanner", arrayListOf(
                brand_model(
                    "Epson", arrayListOf(
                        pc_model(
                            "Epson Perfection V600", """
                    Epson Perfection V600 – yuqori sifatli rangli skaner. 6400 dpi gacha rezolyutsiya bilan rasmlar va hujjatlarni yuqori aniqlikda skanerlash imkoniyatiga ega.
                    O‘zgaruvchan sizib o‘tish tizimi bilan suratlarni va skanerlarni tez va oson ishlashga imkon beradi.
                    """,
                            0, "Epson Perfection V600"
                        )
                    )
                ),
                brand_model(
                    "Canon", arrayListOf(
                        pc_model(
                            "Canon CanoScan LiDE 400", """
                    Canon CanoScan LiDE 400 – 4800 x 4800 dpi gacha yuqori sifatli skaner. 
                    Kompakt va engil dizayn, va USB 3.0 ulanishi bilan tez va oson skanerlash imkoniyatini ta'minlaydi.
                    """,
                            0, "Canon CanoScan LiDE 400"
                        )
                    )
                )
            )
        )

//         monitors, mice, keyboards, printers, and scanners,
        var baza2 = arrayListOf(

            monitorModels,
            mouseModels,
            keyboardModels,
            printerModels,
            scannerModels,


            )


        if (data == "1") {
            var adapter = PcPartsAdapter(baza2, object : PcPartsAdapter.ItemSelectListener {
                override fun onClick(date: main_model) {
                    var intent = Intent(this@SelectActivity, BrandActivity::class.java)
                    intent.putExtra("data2", date)
                    intent.putExtra("title2", date.hardware_name)
                    startActivity(intent)


                }
            })

            binding.recycler.adapter = adapter

        }
        if (data == "2") {
            var adapter = PcPartsAdapter(baza, object : PcPartsAdapter.ItemSelectListener {
                override fun onClick(date: main_model) {
                    var intent = Intent(this@SelectActivity, BrandActivity::class.java)
                    intent.putExtra("data2", date)
                    intent.putExtra("title2", date.hardware_name)
                    startActivity(intent)


                }
            })
            binding.recycler.adapter = adapter

        }

    }
}