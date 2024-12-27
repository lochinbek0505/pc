package uz.falconmobile.pc.ui

import android.content.Intent
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import uz.falconmobile.pc.R
import uz.falconmobile.pc.adapters.PcPartsAdapter
import uz.falconmobile.pc.databinding.ActivitySelectBinding
import uz.falconmobile.pc.models.brand_model
import uz.falconmobile.pc.models.main_model
import uz.falconmobile.pc.models.pc_model

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
                            "Intel Celeron ",
                            """Intel Celeron — bu Intel kompaniyasining arzon narxdagi, o'rta darajadagi va past darajadagi protsessorlar oilasidir. Celeron protsessorlari asosan kundalik ishlarda, ta'lim, ofis dasturlari, internetda serfing qilish, o'yinlar va boshqa yengil vazifalar uchun ishlatiladi. Quyidagi ma'lumotlar Celeron protsessorlarining ba'zi asosiy jihatlarini ko'rsatadi:

Asosiy Xususiyatlari:
Arzonlik: Celeron protsessorlari o'zining arzon narxi bilan mashhur. Bu protsessorlar past darajadagi ishlov berish quvvatiga ega, shuning uchun ular ko'proq byudjetli kompyuter tizimlari uchun tavsiya etiladi.

Past ishlash tezligi: Celeron protsessorlari ko'pincha i3, i5, i7 yoki i9 kabi Intelning yuqori darajadagi protsessorlariga nisbatan pastroq ishlash tezligiga ega bo'ladi. Biroq, ular kundalik ishlarda yaxshi samarali ishlaydi.

Yadro soni: Ko'plab Celeron protsessorlarida ikki yoki to'rtta yadro mavjud. Bu asosan oddiy ko'p vazifali ishlarda yetarli bo'ladi, ammo og'ir dasturlar yoki o'yinlar uchun yetarli bo'lmasligi mumkin.

Cache: Celeron protsessorlarida kichik miqdordagi cache xotira mavjud. Cache xotira tezkor ma'lumotlar uchun ishlatiladi, ammo Celeron protsessorlarida bu miqdor past bo'lishi mumkin.

Energiya samaradorligi: Celeron protsessorlari kam energiya sarfi bilan ishlab chiqariladi, bu esa ularni mobil qurilmalarda, masalan, noutbuklarda samarali qiladi.

Ishlash imkoniyatlari: Bu protsessorlar oddiy vazifalar uchun yaxshi bo'lsa-da, ilg'or grafiklar, video montaj, 3D ishlov berish yoki yuqori darajadagi o'yinlar uchun mos emas.

Celeron Protsessorlarining Foydalanish So'halari:
Byudjetli kompyuterlar: Celeron protsessorlari past narxdagi kompyuterlar uchun ishlatiladi, masalan, ofis ishlarida ishlatiladigan yoki internetga kirish uchun mo'ljallangan kompyuterlar.
Noutbuklar: Celeron protsessorlari noutbuklar, ayniqsa, o'quvchilar va oddiy foydalanuvchilar uchun yaxshi variant.
Kichik qurilmalar: Ba'zi Celeron protsessorlari kichik va yengil qurilmalarda ham ishlatiladi.
Celeron Protsessorlarining Kamchiliklari:
Ishlash tezligi: Og'ir dasturlar yoki o'yinlar uchun unchalik yaxshi emas.
Tez eskirishi: Texnologiya tez rivojlanib borayotganligi sababli, Celeron protsessorlari ko'proq eski va zamonaviy dasturlar uchun unchalik samarali bo'lmasligi mumkin.
Xulosa:
Intel Celeron protsessorlari oddiy va byudjetli ishlash uchun yaxshi tanlov bo'lsa-da, yuqori samaradorlikni talab qiladigan vazifalar uchun muqobil protsessorlar (masalan, Intel i3, i5, i7) tavsiya etiladi. Ular asosan kundalik vazifalar uchun, ofis ishlarida yoki internetda ishlashda yaxshi ishlaydi.""",
                            R.drawable.intel_celeron,
                            "BVUX1OP8JUE"
                        ),
                        pc_model(
                            "Intel Pentium Gold ",
                            """Intel Pentium Gold — Intel kompaniyasining yana bir byudjetga mo'ljallangan protsessorlar oilasidir. Pentium Gold protsessorlari Celeron protsessorlariga nisbatan yuqoriroq ishlash va samaradorlikka ega bo'lib, ko'proq ofis dasturlari, internet serfing qilish va yengil ko'p vazifali ishlar uchun tavsiya etiladi. Pentium Gold protsessorlari quyidagi xususiyatlarga ega:

Asosiy Xususiyatlari:
Yuqori Ishlash Tezligi: Pentium Gold protsessorlari, odatda, Celeron protsessorlariga qaraganda yuqoriroq takt tezligiga ega bo'ladi, bu esa ularni tezroq va samarali qiladi. Shuningdek, ular ko'proq yadro va yuqori xotira hajmiga ega bo'lishi mumkin.

Yadro va Ishlash Quvvati: Pentium Gold protsessorlarining ko'plab versiyalarida ikki yadro mavjud, ammo ba'zi versiyalarda to'rt yadroli modellar ham mavjud. Bu ko'proq ko'p vazifali ishlashni qo'llab-quvvatlaydi, masalan, ofis dasturlari, video tomosha qilish va yengil multitasking uchun.

Cache Xotira: Pentium Gold protsessorlarida, odatda, 4 MB yoki undan ko'proq L3 cache xotira mavjud. Bu tezkor ma'lumotlarga tez kirish imkoniyatini beradi va ishlash samaradorligini oshiradi.

Hyper-Threading Texnologiyasi: Ba'zi Pentium Gold protsessorlarida Hyper-Threading texnologiyasi mavjud bo'lib, bu har bir yadroda ikki qo'shimcha virtual to'g'ri ishlov berish oqimi yaratadi. Bu, ayniqsa, multitaskingda samarali ishlashga yordam beradi.

Energiya Samaradorligi: Pentium Gold protsessorlari Celeron protsessorlariga nisbatan past energiya sarfini ta'minlaydi, bu esa ularni noutbuklar va boshqa mobil qurilmalar uchun yaxshi variant qiladi.

Grafika: Pentium Gold protsessorlari Intel UHD Graphics bilan jihozlangan bo'lib, bu grafik ishlashni ta'minlaydi. Bu, eng yaxshi o'yinlarni o'ynash uchun mos bo'lmasa-da, oddiy grafika ishlarida yaxshi ishlaydi, masalan, video tomosha qilish yoki yengil grafika ishlov berish.

Pentium Gold Protsessorlarining Foydalanish So'halari:
Byudjetli Noutbuklar: Pentium Gold protsessorlari noutbuklar uchun yaxshi variant bo'lib, ular kundalik ishlarda, masalan, internetda serfing qilish, ofis dasturlari va video tomosha qilishda yaxshi ishlaydi.
Ish Stansiyalari: Pentium Gold protsessorlari oddiy ish stansiyalari uchun, masalan, kirish darajasidagi ofis tizimlari yoki yengil ishlar uchun yaxshi tanlovdir.
Kundalik Kompyuter Ishlari: Internetda serfing, video tomosha qilish, fayllarni tahrirlash va boshqa oddiy vazifalar uchun ideal.
Pentium Gold Protsessorlarining Kamchiliklari:
Og'ir O'yinlar va Dasturlar uchun Yetarli Emas: Pentium Gold protsessorlari yuqori darajadagi o'yinlar, video montaj yoki ilmiy hisoblash kabi murakkab vazifalar uchun yetarli emas.
Yuqori Darajadagi Multitasking uchun Kamchiliklar: Ko'p vazifali ishlarda yuqori samaradorlikka erishish uchun yuqori darajadagi protsessorlar (masalan, Intel Core i5 yoki i7) yaxshiroq variant bo'lishi mumkin.
Xulosa:
Intel Pentium Gold protsessorlari byudjetga mo'ljallangan kompyuterlar uchun yaxshi tanlovdir. Ular Celeron protsessorlariga qaraganda yuqoriroq ishlash tezligi, ko'proq yadro va yaxshi samaradorlikni ta'minlaydi, ammo ular hali ham og'ir dasturlar va o'yinlar uchun mos emas. Oddiy kompyuter ishlarida, ofis dasturlarida va internetda serfing qilishda samarali ishlaydi.""",
                            R.drawable.intel_pentium,
                            "lqXl9Of8WvY&t=81s"
                        ),
                        pc_model(
                            "Intel Core i3", """
Intel i3 – Intel kompaniyasining Core seriyasidagi boshlang‘ich darajadagi protsessorlar qatoriga kiradi. Ushbu protsessorlar asosan kundalik ishlarga mo‘ljallangan va o‘rta darajadagi unumdorlikni ta’minlaydi. Keling, u haqida asosiy ma’lumotlarni ko‘rib chiqamiz:

Intel Core i3 protsessorining asosiy xususiyatlari:

1. Yadro soni (Cores): Odatda 2 yoki 4 ta yadroga ega, lekin yangi avlodlarda ko‘proq bo‘lishi mumkin.


2. Oqimlar soni (Threads): Intel Hyper-Threading texnologiyasi tufayli har bir yadroda qo‘shimcha oqim mavjud bo‘lishi mumkin.


3. Soat chastotasi (Clock Speed): 2.0 GHz dan 4.5 GHz gacha (avlodiga qarab).


4. Keş xotira: 3 MB dan 8 MB gacha (avlodiga qarab).


5. Grafik protsessor (Integrated GPU): Intel UHD Graphics, 4K videolarni qo‘llab-quvvatlaydi.


6. Yaroqliligi: Kundalik ishlar (matn tahrirlash, internetdan foydalanish), video tomosha qilish va yengil o‘yinlar uchun mos.



Qo‘llaniladigan joylar:

Ish stoli kompyuterlari (Desktop PC).

Noutbuklar (Laptop).

Yengil o‘yinlar va multimedia dasturlari uchun.                    """,
                            R.drawable.intel_i3, "bEOYz85O7O8"
                        ),
                        pc_model(
                            "Intel Core i5", """
Intel Core i5 protsessorlari Intel kompaniyasining o‘rtacha darajadagi protsessorlar qatoriga kiradi. Ushbu protsessorlar yuqori unumdorlikni talab qiluvchi vazifalar uchun ham, kundalik ishlovchi ilovalar uchun ham mos keladi. Quyida asosiy ma'lumotlar keltirilgan:

Asosiy xususiyatlari:

1. Yadrolar soni: Odatda 4, 6 yoki 10 ta yadroga ega. Eng so‘nggi avlodlarda 14 tagacha yadro mavjud.


2. Oqimlar soni (Threads): Ba’zi modellar hyper-threading funksiyasini qo‘llab-quvvatlaydi.


3. Soat chastotasi: 1,8 GHz dan 4,8 GHz gacha, Turbo Boost texnologiyasi bilan maksimal chastotaga chiqadi.


4. Keş xotira: 6 MB dan 20 MB gacha.


5. Integratsiyalangan grafik protsessor: Intel UHD yoki Iris Xe grafikasi bilan jihozlangan.


6. Energiya samaradorligi: TDP (Thermal Design Power) darajasi 15W dan 65W gacha o‘zgaradi, bu esa quvvatni tejash imkonini beradi.



Qo‘llanilishi:

Ofis ishlari va multitasking: Matnli hujjatlar bilan ishlash, veb-sahifalarni ko‘rib chiqish va bir nechta ilovani bir vaqtda ochish.

O‘yinlar: Ko‘pchilik zamonaviy o‘yinlarni o‘rta darajada grafika sozlamalarida o‘ynash uchun yetarli.

Kontent yaratish: Yengil va o‘rta darajadagi video tahrirlash va grafika ishlari.

4K video pleybek: Yuqori sifatli videolarni to‘siqsiz tomosha qilish.


Afzalliklari:

Balanslangan narx va sifat: Core i5 seriyasi yuqori unumdorlikni ortiqcha xarajatlarsiz ta’minlaydi.

Moslashuvchanlik: Ko‘pchilik foydalanuvchilar uchun mos texnik xususiyatlarga ega.                    """,
                            R.drawable.intel_i5, "4XscfA1dT60"
                        ),
                        pc_model(
                            "Intel Core i7", """
Intel Core i7 protsessorlari yuqori unumdorlik va ko'p vazifalarni bajarishga mo'ljallangan. Ushbu seriya o'yinlar, video tahrirlash, 3D modeling, va boshqa murakkab ilovalar uchun juda mos keladi. Intel Core i7 protsessorlari quyidagi asosiy xususiyatlarga ega:

1. Hyper-Threading Technology: Har bir fizikaviy yadro uchun ikki ishlov berish ipini qo'llab-quvvatlaydi, bu esa ko'p vazifali ishlashni yaxshilaydi.


2. Intel Turbo Boost Technology: Protsessor tezligini talabga muvofiq oshirish imkonini beradi, bu esa yuqori samaradorlikka olib keladi.


3. Katta kechikishsiz kesh xotira: Yadrolar o'rtasida ish yuklamasini samarali taqsimlash imkonini beradi.


4. Grafik ishlash: Intel HD Graphics va UHD Graphics orqali sifatli video oqimlarini qo'llab-quvvatlaydi va oddiy o'yinlar uchun yetarli grafik kuch taklif etadi.


5. DDR4 va DDR5 xotira qo'llab-quvvatlashi: Ma'lumotlarni tezkor o'qish va yozish imkonini beradi.


6. Zamonaviy xavfsizlik texnologiyalari: Intel Secure Key va Intel BIOS Guard kabi texnologiyalar orqali tizim xavfsizligi ta'minlanadi【54】【55】【56】.



Intel Core i7 protsessorlari oilasiga tegishli modellar qatorida portativ noutbuklar uchun yaratilgan Core i7-1165G7 va ish stoli uchun mo'ljallangan yuqori unumdor Core i7-13700K modellarini keltirish mumkin. Ular o'zining energiya samaradorligi va yuqori tezlikli ko'p yadroli ishlashi bilan ajralib turadi.                    """,
                            R.drawable.intel_i7, "LlPwrI8m05M"
                        ),
                        pc_model(
                            "Intel Core i9",
                            """
Intel Core i9 — bu Intel kompaniyasining yuqori darajadagi protsessorlar oilasi bo'lib, eng yuqori ishlash tezligi, ko'p yadroli ishlov berish quvvati va ko'plab ilg'or texnologiyalarni taqdim etadi. Intel i9 protsessorlari, asosan, og'ir vazifalarni bajarishda, o'yinlar, video montaj, 3D modellashtirish, ilmiy hisoblash va boshqa yuqori darajadagi ishlov berish talab qiladigan vazifalar uchun mo'ljallangan.

Asosiy Xususiyatlari:
Ko'p Yadrolar va Tablolar: Intel i9 protsessorlarida ko'pincha 8, 10, 12 yoki undan ko'proq yadro mavjud. Bu ko'p yadroli ishlov berish quvvatini ta'minlab, ko'p vazifali ishlashda juda samarali bo'ladi. Ko'p yadroli ishlov berish og'ir hisoblash ishlarini tez va samarali amalga oshirish imkonini beradi.

Hyper-Threading Texnologiyasi: Intel i9 protsessorlarida Hyper-Threading texnologiyasi mavjud, bu har bir yadro uchun ikki virtual oqimni yaratadi. Bu texnologiya multitaskingni yanada samarali qilishga yordam beradi va ko'plab dasturlarni bir vaqtda ishlatishni qo'llab-quvvatlaydi.

Yuqori Ishlash Tezligi: Intel Core i9 protsessorlari yuqori takt tezligiga ega, ba'zi modellar 5.0 GHz yoki undan yuqori tezlikka chiqishi mumkin. Bu tezlik intensiv ishlov berish va o'yinlar uchun juda muhimdir.

Overclocking Imkoniyati: Ba'zi i9 protsessorlari overclocking (tezlikni oshirish) imkoniyatini taqdim etadi. Bu foydalanuvchilarga protsessorni standartdan yuqori tezlikda ishlatishga imkon beradi, bu esa qo'shimcha ishlash quvvatini ta'minlaydi.

Turbo Boost Texnologiyasi: Intel Turbo Boost texnologiyasi protsessorning ishlash tezligini avtomatik ravishda oshiradi, agar protsessor ko'proq quvvatga ehtiyoj sezsa. Bu o'yinlar yoki og'ir dasturlarni ishlatishda samarali bo'ladi.

L3 Cache: i9 protsessorlarida katta hajmdagi L3 cache xotira mavjud, bu tezkor ma'lumotlarga tezroq kirish imkoniyatini beradi va ishlash samaradorligini oshiradi.

Grafik Ishlov Berish: Ba'zi i9 protsessorlarida Intel UHD Graphics yoki boshqa grafik protsessorlar mavjud. Biroq, yuqori darajadagi grafik ishlov berish uchun alohida grafik kartalar (GPU) tavsiya etiladi.

Qattiq Energiya Talablari: i9 protsessorlari yuqori ishlash quvvatiga ega bo'lsa-da, ular ko'proq energiya sarflashi mumkin. Bu, ayniqsa, overclocking qilishda va intensiv ishlov berish jarayonlarida sezilarli bo'ladi.

Intel i9 Protsessorlarining Foydalanish So'halari:
Yuqori Darajadagi O'yinlar: i9 protsessorlari yuqori grafiklar va tezkor ishlashni talab qiladigan o'yinlar uchun juda mos keladi. Bu protsessorlar eng so'nggi o'yinlarni yuqori sifatli grafikalar bilan o'ynash uchun kerakli quvvatni ta'minlaydi.

Video Montaj va Ilmiy Hisoblash: Intel i9 protsessorlari, og'ir video montaj dasturlari (masalan, Adobe Premiere Pro) va ilmiy hisoblash yoki 3D modellashtirish uchun juda mos keladi. Ular katta hajmdagi videolarni tahrirlash yoki murakkab hisoblashlarni bajarish uchun zarur bo'lgan barcha quvvatni ta'minlaydi.

Virtualizatsiya: Ko'p yadroli ishlov berish va Hyper-Threading texnologiyasi yordamida i9 protsessorlari virtual mashinalarni yaratish va boshqarishda samarali ishlaydi. Bu serverlar yoki ishlab chiqarish tizimlarida ishlashda foydalidir.

Kreativ Ishlar: Grafik dizayn, 3D animatsiya, musiqiy ishlab chiqish kabi kreativ ishlar uchun i9 protsessorlarining yuqori ishlash imkoniyatlari juda foydalidir.

Intel i9 Protsessorlarining Kamchiliklari:
Narx: Intel i9 protsessorlari yuqori narxga ega, shuning uchun ular ko'proq professional foydalanuvchilarga, o'yinchilar va texnik jihatdan talabchan foydalanuvchilarga mo'ljallangan. Bu protsessorlar odatdagi byudjetli foydalanuvchilar uchun juda qimmat bo'lishi mumkin.

Energiya Sarfi: i9 protsessorlarining ishlash quvvati yuqori bo'lsa-da, ular ko'proq energiya sarflaydi, bu esa sovutish tizimlarini va batareya ishlash muddatini boshqarishda muammolar tug'dirishi mumkin (noto'g'ri sovutish tizimlari ishlatilsa).

Sovutish Talablari: Yuqori ishlash tezligi va energiya sarfi sababli, i9 protsessorlari yaxshi sovutish tizimiga muhtoj. Haroratni boshqarish uchun kuchli sovutish tizimi kerak bo'ladi, aks holda protsessor tezda qizib ketishi mumkin.

Xulosa:
Intel Core i9 protsessorlari yuqori darajadagi ishlov berish quvvati, ko'p yadroli ishlov berish va ilg'or texnologiyalarni taqdim etadi. Ular yuqori darajadagi o'yinlar, video montaj, ilmiy hisoblash va boshqa og'ir vazifalar uchun ideal. Biroq, ular yuqori narx va energiya sarfi bilan ajralib turadi. Agar siz yuqori ishlashni talab qiladigan dasturlarni ishlatadigan foydalanuvchi bo'lsangiz, Intel i9 protsessorlari juda yaxshi variant bo'ladi.""",
                            R.drawable.intel_i9,
                            "suQnh1TvGHw"
                        ),

                        )
                ),
                brand_model(
                    "AMD", arrayListOf(
                        pc_model(
                            "AMD Ryzen 3", """
AMD Ryzen 3 protsessorlari AMD kompaniyasining byudjet sinfida joylashgan, boshlang‘ich darajadagi ishlashni ta'minlovchi protsessorlar turkumidir. Ular o‘rta darajadagi va oddiy ishlash uchun qulay, masalan, ofis ishlari, internetda faoliyat yuritish, media tomosha qilish va yengil o‘yinlar o‘ynash kabi ishlar uchun mo'ljallangan.

Asosiy xususiyatlar:

1. Yadrolar va oqimlar soni: Ryzen 3 protsessorlari odatda 4 ta yadroga va 4 ta oqimga ega, ba’zi modellar 8 ta oqimni qo‘llab-quvvatlaydi (Hyper-Threading texnologiyasi).


2. Soat chastotasi: 3.5 GHz dan yuqori bo‘lgan tezlikka chiqadi, Turbo Boost funksiyasi yordamida yana tezlashadi.


3. Grafik protsessor: Ba'zi Ryzen 3 protsessorlari integratsiyalangan grafikaga ega (masalan, Vega grafikasi), bu esa o‘rta darajadagi grafika ishlashni ta’minlaydi.


4. Energiya samaradorligi: Past quvvat sarfi bilan ishlaydi, bu esa laptoplar va kichik ish stoli tizimlari uchun ideal qiladi.



Qollanish joylari:

Ofis va kundalik ishlash: Matn tahrirlash, elektron pochta, internetda ko‘rish va boshqa yengil vazifalar uchun.

Yengil o‘yinlar: Grafik ishlashning yuqori darajalarini talab qilmaydigan o‘yinlar uchun mos.

Multimedia tomosha qilish: 1080p video va ko‘plab ommaviy video xizmatlarida muammosiz ishlaydi.


AMD Ryzen 3 protsessorlari, ayniqsa, arzon narxdagi kompyuterlar uchun juda yaxshi variant hisoblanadi. Agar tezlik va samaradorlik uchun byudjetni tejashni xohlasangiz, bu protsessor siz uchun mos kelishi mumkin.
                    """,
                            R.drawable.ryzen_3, "wfrStYYU_-c"
                        ),
                        pc_model(
                            "AMD Ryzen 5", """
AMD Ryzen 5 protsessorlari AMD kompaniyasining o‘rta darajadagi kuchli va ko‘p vazifali ishlov beruvchi protsessorlar turkumiga kiradi. Ular yuqori samaradorlikni ta’minlash uchun ko‘p yadroli ishlash imkoniyatiga ega bo‘lib, ko‘plab zamonaviy ilovalar, o‘yinlar va ko‘p vazifali ishlash uchun juda mos keladi. Ryzen 5 protsessorlari 6 yoki 8 yadroli konfiguratsiyalarni taklif etadi va ko‘plab modellari yuqori tezlikda ishlaydi, bu esa ular uchun mukammal unumdorlikni ta’minlaydi.

Asosiy xususiyatlar:

1. Yadrolar soni: Ryzen 5 protsessorlari odatda 6 ta yadroga ega, ba’zi yuqori modellarda 8 ta yadro bo‘lishi mumkin.

2. Oqimlar soni: Hyper-Threading texnologiyasi bilan har bir yadroda ikkita oqim mavjud, bu ko‘p vazifali ishlashni optimallashtiradi.

3. Soat chastotasi: 3.6 GHz dan 4.6 GHz gacha, ba’zi modellarda Turbo Boost yordamida tezlik yanada oshadi.

4. Keş xotira: 12 MB dan 32 MB gacha.

5. Integratsiyalangan grafik protsessor: Ba'zi modellarda Radeon Vega grafikasi mavjud.

6. Energiya samaradorligi: TDP (Thermal Design Power) darajasi 65W dan 105W gacha, bu esa energiya tejash imkoniyatini ta’minlaydi.

Qollanilishi:

O‘yinlar: Zamonaviy o‘yinlarni yuqori sifatli grafikalar bilan o‘ynash uchun juda mos.

Kontent yaratish: Video tahrirlash, 3D modellash va grafik dizayn ishlarida yuqori samaradorlikni ta’minlaydi.

Multitasking: Bir nechta dastur bir vaqtda ishlaganda ham samarali ishlaydi.

Ko‘p yadroli ilovalar: Ryzen 5 protsessorlari ko‘p yadroli ilovalar uchun ayniqsa yaxshi.

Misollar:

AMD Ryzen 5 3600X: 6 ta yadro, 12 ta oqim, 4.4 GHz maksimal soat tezligi.

AMD Ryzen 5 5600X: 6 ta yadro, 12 ta oqim, 4.6 GHz maksimal soat tezligi.

Ushbu protsessorlar o‘rta darajadagi kompyuter foydalanuvchilari uchun juda mos keladi, ayniqsa o‘yinlar va grafik ishlov berish talablariga javob beradi.                    """,
                            R.drawable.ryzen_5, "HkeX66A2-Po"
                        ),
                        pc_model(
                            "AMD Ryzen 7", """
AMD Ryzen 7 protsessorlari, AMD kompaniyasining yuqori darajadagi o‘rta va yuqori darajali ishlov beruvchilari bo‘lib, ko‘p yadroli ishlash va yuqori samaradorlikni ta'minlash uchun mo‘ljallangan. Ular, ayniqsa, o‘yinda yuqori samaradorlik va murakkab vazifalarni bajarishda (masalan, video tahrirlash, 3D modellash, va boshqa kontent yaratish) juda yaxshi natijalarga erishadi.

Asosiy xususiyatlar:

1. Yadrolar soni: Ryzen 7 protsessorlari 8 yadro va 16 oqimni taklif etadi, bu ko‘p vazifali ishlashni yuqori tezlikda amalga oshiradi.

2. Soat chastotasi: Ryzen 7 protsessorlarida 3.6 GHz dan 5.0 GHz gacha bo‘lgan soat tezligi mavjud. Turbo Boost texnologiyasi yordamida maksimal tezlik yanada oshadi.

3. Keş xotira: 12MB dan 32MB gacha.

4. Hyper-Threading texnologiyasi: Har bir yadro ikki oqimni qo‘llab-quvvatlaydi, bu esa ko‘p vazifalarni tez va samarali bajarishga yordam beradi.

5. Grafik ishlash: Ba'zi modellarda integratsiyalangan grafik (Radeon Vega) mavjud, lekin ko‘pincha alohida grafik kartalar bilan ishlash tavsiya etiladi.

Qo‘llanilishi:

Yuqori darajadagi o‘yinlar: Ryzen 7 protsessorlari yuqori tezlikda o‘yinlar o‘ynash va yuqori sifatli grafikalarni boshqarish uchun juda mos.

Kontent yaratish va video tahrirlash: 8 yadroli arxitekturasi bilan bu protsessorlar yuqori darajadagi video tahrirlash va 3D modellash ishlarini tez va samarali bajaradi.

Multitasking: Bir nechta ilovalar bir vaqtda ishlayotganda ham yuqori samaradorlikni ta'minlaydi.

Misollar:

AMD Ryzen 7 3700X – 8 ta yadro, 16 ta oqim, 4.4 GHz maksimal soat tezligi.

AMD Ryzen 7 5800X – 8 ta yadro, 16 ta oqim, 4.7 GHz maksimal soat tezligi.

AMD Ryzen 7 7700X – 8 ta yadro, 16 ta oqim, 5.4 GHz maksimal soat tezligi.

Afzalliklari:

Narx va samaradorlik: Ryzen 7 protsessorlari yuqori samaradorlikni maqbul narxda ta'minlaydi, bu esa ularni ishlov berish va o‘yinlar uchun ideal tanlovga aylantiradi.

Ko‘p yadroli ishlov berish: Ko‘p yadroli ilovalar va multitasking uchun juda mos.
                    """,
                            R.drawable.ryzen_7, "PyG1vYXj4Vo"
                        ), pc_model(
                            "AMD Ryzen 9",
                            """AMD Ryzen 9 — bu AMD kompaniyasining yuqori darajadagi protsessorlari oilasiga kiradi, va ular asosan yuqori ishlash quvvatini talab qiladigan vazifalar uchun mo'ljallangan. Ryzen 9 protsessorlari ko'p yadroli ishlov berish, multitasking, o'yinlar, video montaj, ilmiy hisoblash va boshqa og'ir vazifalarni samarali bajaradi. AMD Ryzen 9 protsessorlari Intel Core i9 protsessorlarining raqibi sifatida o'rnatilgan.

Asosiy Xususiyatlari:
Ko'p Yadroli Texnologiya: Ryzen 9 protsessorlarida ko'plab yadro va iplar mavjud. Masalan, ba'zi Ryzen 9 protsessorlarida 12 ta yoki 16 ta yadro va 24 ta yoki 32 ta ip mavjud. Bu ko'p yadroli ishlov berish ko'p vazifali ishlashda juda samarali bo'ladi, masalan, video tahrirlash, ilmiy hisoblash, va og'ir dasturlarni ishlatishda.

Zen Arxitekturasi: Ryzen 9 protsessorlari Zen arxitekturasi asosida ishlab chiqarilgan. Bu arxitektura, Intelning Core seriyasiga qaraganda, ko'plab yadro va iplar bilan yuqori samaradorlikni ta'minlashga yordam beradi, shuningdek, quvvat samaradorligini yaxshilaydi.

Precision Boost va XFR Texnologiyalari: Ryzen 9 protsessorlarida Precision Boost va XFR (Extended Frequency Range) texnologiyalari mavjud. Bu texnologiyalar protsessorning ishlash tezligini avtomatik ravishda oshiradi, agar vazifa qiyinlashsa yoki qo'shimcha ishlov berish quvvati kerak bo'lsa. Bu ishlashni yanada yaxshilaydi.

Overclocking Imkoniyati: AMD Ryzen 9 protsessorlari overclocking (tezlikni oshirish) imkoniyatini taqdim etadi, bu esa maksimal ishlash tezligini olish imkonini beradi. Bunday protsessorlar o'yinlar yoki boshqa yuqori talablar bilan ishlashda juda foydalidir.

L3 Cache: Ryzen 9 protsessorlarida katta hajmdagi L3 cache (32 MB yoki undan ko'p) mavjud bo'lib, bu tezkor ma'lumotlarga tezroq kirish imkoniyatini yaratadi va umumiy ishlashni tezlashtiradi.

PCIe 4.0: Ryzen 9 protsessorlari PCIe 4.0 texnologiyasini qo'llab-quvvatlaydi, bu esa yuqori tezlikda ma'lumot uzatishni ta'minlaydi. Bu texnologiya xotira qurilmalari, SSDlar va grafik kartalarini tezroq ishlatishni ta'minlaydi.

Grafik Ishlov Berish: Ryzen 9 protsessorlari asosan alohida grafik kartalar (GPU) bilan ishlash uchun mo'ljallangan, lekin ba'zi modelarda integratsiyalangan grafik mavjud (masalan, Ryzen 9 3400G). Biroq, yuqori darajadagi o'yinlar yoki video tahrir qilish uchun alohida GPU talab etiladi.

Ryzen 9 Protsessorlarining Foydalanish So'halari:
Yuqori Darajadagi O'yinlar: Ryzen 9 protsessorlari eng so'nggi o'yinlarni yuqori grafik sozlamalarida o'ynash uchun mo'ljallangan. Ko'p yadro va yuqori tezlik o'yinlarni yuqori sifatli grafikalar bilan o'ynash uchun zarur bo'lgan quvvatni ta'minlaydi.

Video Montaj va Ilmiy Hisoblash: Ryzen 9 protsessorlari video tahrirlash va ilmiy hisoblash ishlarini samarali bajaradi. Professional video montaj dasturlari, masalan, Adobe Premiere Pro yoki DaVinci Resolve, ko'plab yadro va iplarni talab qiladi, bu esa Ryzen 9 protsessorlarida juda yaxshi ishlaydi.

3D Modellash va Rendering: Ryzen 9 protsessorlari 3D modellash va rendering kabi og'ir grafik ishlov berishda samarali ishlaydi. Ular bu turdagi vazifalarni tez va samarali bajarishda yordam beradi.

Virtualizatsiya: Ko'p yadroli ishlov berish va yuqori samaradorlik ryzen 9 protsessorlarini virtualizatsiya, serverlar, va ko'p mashinali tizimlar uchun juda yaxshi variant qiladi.

Kreativ Ishlar va Ilovalar: Grafik dizayn, 3D animatsiya, musiqiy ishlab chiqish kabi kreativ ishlar uchun Ryzen 9 protsessorlarining yuqori ishlash imkoniyatlari juda foydalidir.

Ryzen 9 Protsessorlarining Kamchiliklari:
Narx: Ryzen 9 protsessorlari yuqori samaradorlikka ega bo'lsada, ular qimmat va byudjetli foydalanuvchilar uchun mos kelmasligi mumkin. Bu protsessorlar asosan professional foydalanuvchilar uchun mo'ljallangan.

Energiya Sarfi: Ryzen 9 protsessorlari yuqori ishlash tezligi va ko'p yadroli quvvatga ega bo'lib, ular ko'proq energiya sarflashi mumkin. Bu, ayniqsa, overclocking qilganda yoki og'ir ishlov berish paytida sezilarli bo'lishi mumkin.

Sovutish Talablari: Yuqori ishlash quvvati va energiya sarfi sababli, Ryzen 9 protsessorlari yaxshi sovutish tizimiga muhtoj. Yaxshi sovutish tizimi bo'lmasa, protsessor qizib ketishi mumkin.

Xulosa:
AMD Ryzen 9 protsessorlari yuqori darajadagi ishlov berish quvvatini, ko'p yadroli ishlov berish va ilg'or texnologiyalarni taqdim etadi. Ular yuqori darajadagi o'yinlar, video montaj, ilmiy hisoblash, 3D modellash va boshqa og'ir vazifalar uchun ideal. Bu protsessorlar yuqori narx va energiya sarfi bilan ajralib turadi, ammo yuqori darajadagi samaradorlikni ta'minlaydi. Agar siz yuqori ishlashni talab qiladigan dasturlarni ishlatadigan foydalanuvchi bo'lsangiz, AMD Ryzen 9 protsessorlari juda yaxshi variant bo'ladi.






""",
                            R.drawable.ryzen_9,
                            "3enpjstERmE"
                        )
                    )
                ),
                brand_model(
                    "Apple", arrayListOf(
                        pc_model(
                            "Apple M1", """
Apple M1 — bu Apple tomonidan ishlab chiqilgan birinchi ARM arxitekturasiga asoslangan protsessor bo'lib, Mac kompyuterlari uchun mo'ljallangan. 2020-yilning noyabrida taqdim etilgan bu chip, Intel x86 protsessorlaridan o'tish orqali Apple'ning kompyuter texnologiyalaridagi yangi davrni boshlab berdi. M1 chipining o‘ziga xosligi shundaki, unda ko'plab komponentlar bitta chipga joylashtirilgan, bu esa kompyuterning samaradorligini va energiya tejamkorligini oshiradi.

Apple M1ning asosiy xususiyatlari:

1. 8 yadroli CPU: M1 protsessorida 8 ta yadro mavjud, ulardan 4 tasi yuqori samaradorlikka ega (Firestorm), 4 tasi esa energiya tejamkor (Icestorm) yadro sifatida ishlaydi. Bu arxitektura yuqori tezlikni va samaradorlikni ta'minlaydi.

2. Birlashtirilgan xotira arxitekturasi (UMA): M1 chipi RAM xotirasini protsessor bilan birlashtirib, ma'lumotlar almashinuvi tezligini va samaradorligini oshiradi.

3. 8 yadroli GPU: M1 chipida 8 ta grafik protsessor yadro mavjud bo'lib, bu o‘yinlar va grafika bilan ishlashda yaxshi natijalar beradi. U grafik ishlov berish va video tahrirlash kabi vazifalarni samarali bajaradi.

4. 16 yadroli Neural Engine: M1 chipida mavjud bo‘lgan Neural Engine sun'iy intellekt va mashina o‘rganish vazifalarini tez va samarali bajarishga yordam beradi.

5. Energiyani tejash: ARM arxitekturasi tufayli M1 chipi ko‘p energiya sarflamagan holda yuqori ishlashni ta'minlaydi. Bu, ayniqsa, MacBook Air va MacBook Pro kabi mobil qurilmalarda batareya muddati uzoq bo‘lishiga yordam beradi.

6. macOS bilan moslik: M1 chipi macOS Big Sur va undan keyingi versiyalar bilan mukammal integratsiyalangan, bu esa Apple’ning dasturiy ta'minoti va uskunalari o'rtasida mukammal sinxronizatsiyani ta'minlaydi.

Qurilmalarda ishlatilishi:

Apple M1 chipi bir nechta Apple qurilmalarida, jumladan MacBook Air, MacBook Pro (13 dyuym), Mac Mini va 24 dyuymli iMacda ishlaydi. Bu protsessorlar yuqori samaradorlik va energiya tejash imkoniyatlari bilan mashhur.

Apple M1 chipi o‘zining innovatsion yondoshuvi va tezkor ishlash qobiliyati bilan texnologiya sohasida katta o‘zgarishlarni keltirib chiqardi. Bu protsessor, ayniqsa, o‘zining energiya samaradorligi va kuchli ishlash xususiyatlari bilan yuqori baholangan.                    """,
                            R.drawable.apple_m1, "_i_XWx05FTw"
                        ),
                        pc_model(
                            "Apple M2", """
Apple M2 — bu Apple kompaniyasining ikkinchi avlod ARM asosidagi protsessoridir. 2022-yilning iyunida taqdim etilgan M2 chipi, Apple’ning o‘ziga xos M1 protsessoridan keyingi bosqich bo‘lib, yanada yaxshilangan ishlash va samaradorlikni ta’minlaydi. M2 chipi, avvalgi M1 modeliga nisbatan ko‘proq yadro va tezlikka ega bo‘lib, ko‘p vazifali ishlov berish va o‘yindagi samaradorlikni yanada oshirgan.

Apple M2ning asosiy xususiyatlari:

1. 8 yadroli CPU: M2 chipi 8 ta yadrodan iborat, ulardan 4 tasi yuqori samaradorlikka (Firestorm), 4 tasi esa energiya samaradorlikka (Icestorm) mo‘ljallangan. Bu, ko‘p vazifali ishlov berishda samaradorlikni oshiradi.


2. 10 yadroli GPU: M2 chipi GPUni yanada yaxshilab, 10 ta grafik yadro bilan taqdim etadi. Bu o‘yinlar va grafik ishlov berish kabi vazifalarni yuqori tezlikda bajarishga yordam beradi.


3. 16 yadroli Neural Engine: Mashina o‘rganish va sun'iy intellekt ishlov berishda samarali ishlash uchun 16 ta yadrodan iborat Neural Engine mavjud.


4. Birlashtirilgan xotira arxitekturasi (UMA): M2 chipida mavjud bo‘lgan birlashtirilgan xotira arxitekturasi samarali ishlashni ta'minlaydi, ma'lumotlar tezroq almashinadi va samaradorlik oshadi.


5. Energiyani tejash: Apple M2 chipi, o‘zining ARM arxitekturasi bilan yuqori samaradorlikni ta’minlashga yordam beradi, shu bilan birga energiya iste'molini minimallashtiradi.


6. Video va multimedia ishlov berish: Apple M2, video tahrirlash va boshqa media ishlov berish vazifalarida yuqori tezlik va sifatni ta'minlash uchun maxsus texnologiyalarni o‘z ichiga oladi.

Qurilmalarda ishlatilishi:

Apple M2 chipi, ayniqsa MacBook Air va 13 dyuymli MacBook Pro kabi qurilmalarda ishlatiladi. Bu chipning ishlash samaradorligi va energiya tejash imkonini beradi.                    """,
                            R.drawable.apple_m1, "_i_XWx05FTw"
                        ),

                        )
                ),
                brand_model(
                    "Snapdragon", arrayListOf(
                        pc_model(
                            "Snapdragon 400 series",
                            """Snapdragon 400 series — bu Qualcomm kompaniyasining arzon va o'rtacha darajadagi mobil protsessorlar oilasiga kiradi. Bu seriya, asosan, byudjetli smartfonlar va o'rta darajadagi qurilmalar uchun mo'ljallangan. Snapdragon 400 seriyasidagi protsessorlar, foydalanuvchiga umumiy foydalanish, o'yinlar, multimedia va internet uchun qulay ishlashni ta'minlaydi, lekin yuqori darajadagi ishlov berish yoki resurslarni talab qiladigan vazifalar uchun mo'ljallangan yuqori darajadagi protsessorlar bilan raqobatlashmaydi.

Asosiy Xususiyatlari:
Arzon Narx: Snapdragon 400 seriyasi protsessorlari arzon narxga ega bo'lib, byudjetli smartfonlar va o'rta darajadagi qurilmalar uchun ideal tanlovdir. Ular foydalanuvchiga asosan kundalik ishlov berish quvvati va samaradorlikni ta'minlaydi.

Kichik Yadroli Dizayn: Snapdragon 400 seriyasidagi protsessorlar odatda 4 yoki 8 yadroli dizaynni taqdim etadi. Bu protsessorlar foydalanuvchiga yaxshi multitasking imkoniyatini beradi, lekin yuqori darajadagi ishlov berish uchun ko'proq yadro va kuchliroq protsessorlar talab etiladi.

Adreno Grafikasi: Snapdragon 400 seriyasi protsessorlarida Adreno grafika protsessori mavjud. Bu grafik protsessor foydalanuvchiga o'rtacha darajadagi o'yinlar, video tomosha qilish va multimedia ilovalarini ishlatishda samarali ishlashni ta'minlaydi.

LTE Qo'llab-quvvatlash: Snapdragon 400 seriyasidagi ba'zi protsessorlar LTE (4G) tarmog'ini qo'llab-quvvatlaydi, bu esa tezkor internet aloqasini ta'minlashga yordam beradi. Bu smartfonlar uchun mobil internet aloqasini yaxshilash imkonini yaratadi.

Energiyani Samarali Ishlatish: Qualcomm Snapdragon 400 seriyasidagi protsessorlar, energiya samaradorligi uchun optimallashtirilgan bo'lib, bu uzoq vaqt davomida qurilmaning batareya ishlash muddatini oshiradi.

Qurilmaning Samaradorligi: Snapdragon 400 seriyasi protsessorlari o'rtacha ishlash tezligi va samaradorlikni ta'minlaydi. Ular ko'pchilik foydalanuvchilar uchun kundalik ishlov berish, ijtimoiy tarmoqlarni ko'rish, internetni surish va video tomosha qilish kabi vazifalarni yaxshi bajaradi.

Snapdragon 400 Seriyasining Foydalanish So'halari:
Byudjetli Smartfonlar: Snapdragon 400 seriyasidagi protsessorlar asosan byudjetli smartfonlar va o'rta darajadagi qurilmalar uchun ishlab chiqilgan. Bu protsessorlar arzon narxdagi qurilmalarda yaxshi ishlashni ta'minlaydi.

Multimedia va Internet: Snapdragon 400 seriyasidagi protsessorlar o'rtacha darajadagi video tomosha qilish, internetni surish va ijtimoiy tarmoqlarda vaqt o'tkazish kabi kundalik vazifalarni bajarishda samarali ishlaydi.

O'yinlar: Bu seriya protsessorlari o'rtacha darajadagi o'yinlarni o'ynash uchun mos keladi, ammo yuqori grafiklar va yuqori darajadagi o'yinlar uchun yaxshiroq protsessorlar talab etiladi.

VoIP va Aloqa Ilovalari: Snapdragon 400 seriyasi protsessorlari, VoIP ilovalari (masalan, Skype, WhatsApp) va boshqa aloqa ilovalarini ishlatishda samarali ishlaydi.

Kamchiliklari:
Cheklangan Ishlov Berish Quvvati: Snapdragon 400 seriyasidagi protsessorlar yuqori darajadagi ishlov berish talab qiladigan vazifalar uchun yaroqsizdir. Ular ko'proq oddiy va o'rtacha darajadagi ishlov berish uchun mo'ljallangan.

Grafika va O'yinlar: Bu seriya protsessorlari yuqori darajadagi o'yinlar va grafik ishlov berishni qo'llab-quvvatlamaydi. Agar foydalanuvchi yuqori sifatli o'yinlar o'ynashni xohlaydigan bo'lsa, Snapdragon 400 seriyasidagi protsessorlar kamchilikka ega bo'lishi mumkin.

Kam Yadro va Resurslar: Snapdragon 400 seriyasidagi protsessorlar ko'proq yadro va resurslarga ega yuqori darajadagi protsessorlar bilan raqobatlashishga qodir emas. Bu ko'plab ko'p yadroli ishlov berishni talab qiladigan vazifalar uchun cheklovlar yaratadi.

Xulosa:
Snapdragon 400 series protsessorlari byudjetli va o'rta darajadagi smartfonlar uchun juda yaxshi tanlovdir. Ular kundalik vazifalarni bajarishda, internetni surishda, multimedia tomosha qilishda va o'rtacha darajadagi o'yinlarda yaxshi ishlaydi. Biroq, yuqori darajadagi ishlov berish va grafiklarni talab qiladigan vazifalar uchun ular kamchilikka ega. Agar siz yuqori darajadagi o'yinlarni o'ynash yoki og'ir ishlov berishni amalga oshirishni rejalashtirmasangiz, Snapdragon 400 seriyasi yaxshi variant bo'lishi mumkin.""",
                            R.drawable.snapdragon_400,
                            "DjtohyNEM6w"
                        ),

                        pc_model(
                            "Snapdragon 600 series",
                            """Snapdragon 600 series — bu Qualcomm kompaniyasining o'rtacha darajadagi mobil protsessorlar oilasiga kiradi, va u yuqori samaradorlik bilan arzon narxdagi smartfonlar va qurilmalarga mo'ljallangan. Snapdragon 600 seriyasi, umumiy foydalanish, multimedia, o'yinlar va multitasking uchun yaxshi ishlashni ta'minlaydi, lekin yuqori darajadagi ishlov berish yoki resurslarni talab qiladigan vazifalar uchun Snapdragon 800 seriyasiga qaraganda pastroq samaradorlikni ko'rsatadi.

Asosiy Xususiyatlari:
Yuqori Samaradorlik va Keng Qo'llanilishi: Snapdragon 600 seriyasi protsessorlari o'rtacha va yuqori darajadagi ishlov berishni ta'minlaydi, bu esa ularni o'rtacha narxdagi smartfonlar va o'rta darajadagi qurilmalar uchun yaxshi tanlov qiladi. Ular foydalanuvchiga o'yinlar, internetni surish, video tomosha qilish va boshqa multimedia ilovalarini samarali bajarishga yordam beradi.

Kichik va Yaxshilangan Yadro Dizayni: Snapdragon 600 seriyasidagi protsessorlar, 4 yoki 8 yadroli konfiguratsiyalarda bo'lishi mumkin. Bu ko'p yadroli dizayn, ko'p vazifali ishlov berishda samarali ishlashni ta'minlaydi. Yadro ishlash tezligi odatda 1.8 GHz dan 2.0 GHz gacha bo'ladi.

Adreno Grafikasi: Snapdragon 600 seriyasidagi protsessorlar Adreno grafika protsessoriga ega bo'lib, o'rtacha darajadagi o'yinlar va multimedia ilovalarini yaxshi ishlatishga imkon beradi. Adreno grafikasi yuqori sifatli video va o'yinlarni qo'llab-quvvatlaydi, lekin yuqori darajadagi grafik ishlov berish uchun yuqori darajadagi protsessorlar talab etiladi.

LTE Qo'llab-quvvatlash: Snapdragon 600 seriyasidagi protsessorlar LTE (4G) aloqasini qo'llab-quvvatlaydi, bu esa tezkor internetni ta'minlaydi. Bu smartfonlar uchun mobil internet aloqasini yaxshilash imkonini yaratadi.

Energiyani Samarali Ishlatish: Snapdragon 600 seriyasi protsessorlari energiya samaradorligi uchun optimallashtirilgan bo'lib, batareya ishlash muddatini oshirishga yordam beradi. Bu arzon va o'rtacha darajadagi qurilmalar uchun muhim afzallikdir.

Snapdragon Hexagon DSP: Hexagon DSP (Digital Signal Processor) texnologiyasi yordamida Snapdragon 600 seriyasi protsessorlari audio, video va sensorli ishlov berishni samarali bajaradi. Bu texnologiya, masalan, kamera va avtonomiyatni yaxshilash uchun ishlatiladi.

Snapdragon 600 Seriyasining Foydalanish So'halari:
O'rta Darajadagi Smartfonlar: Snapdragon 600 seriyasi protsessorlari o'rta darajadagi smartfonlar uchun idealdir. Ular yaxshi ishlashni, batareya samaradorligini va arzon narxni ta'minlaydi.

Multimedia va Internet: Snapdragon 600 seriyasidagi protsessorlar, video tomosha qilish, internetni surish va ijtimoiy tarmoqlarda faoliyat yuritish kabi kundalik vazifalarni bajarishda yaxshi ishlaydi.

O'yinlar: Bu seriya protsessorlari o'rtacha darajadagi o'yinlarni o'ynash uchun mos keladi. Ular yuqori grafikli o'yinlar uchun juda mos bo'lmasligi mumkin, ammo ko'plab o'yinlarni o'ynashda yaxshi natijalar ko'rsatadi.

Multitasking: Snapdragon 600 seriyasidagi protsessorlar ko'p yadroli ishlov berishni qo'llab-quvvatlaydi, bu esa bir nechta ilovalar yoki vazifalarni bir vaqtning o'zida bajarishda samarali ishlashni ta'minlaydi.

VoIP va Aloqa Ilovalari: Snapdragon 600 seriyasi protsessorlari, masalan, Skype, WhatsApp kabi VoIP ilovalarini ishlatishda samarali ishlaydi, va umumiy kommunikatsiya ilovalarini qo'llab-quvvatlaydi.

Kamchiliklari:
Cheklangan Ishlov Berish Quvvati: Snapdragon 600 seriyasi protsessorlari yuqori darajadagi ishlov berishni talab qiladigan vazifalar uchun yaroqsizdir. Bu protsessorlar yuqori darajadagi ilmiy hisoblash yoki video tahrir qilish kabi vazifalarda pastroq ishlash ko'rsatkichlarini taqdim etadi.

Grafika va O'yinlar: Snapdragon 600 seriyasi o'yinlar uchun yaxshi ishlaydi, lekin eng so'nggi va yuqori grafikli o'yinlar uchun yaroqsizdir. Agar siz yuqori sifatli o'yinlarni o'ynashni xohlasangiz, yuqori darajadagi protsessorlar yaxshiroq variant bo'lishi mumkin.

Kengaytirilgan Funksiyalar: Snapdragon 600 seriyasidagi protsessorlar yuqori darajadagi kameralar, 5G qo'llab-quvvatlash yoki boshqa ilg'or funksiyalarni taqdim etmaydi. Ba'zi foydalanuvchilar uchun bu cheklovlar bo'lishi mumkin.

Xulosa:
Snapdragon 600 series protsessorlari o'rta darajadagi smartfonlar va qurilmalar uchun ajoyib variant bo'lib, ular yaxshi ishlashni, samarali energiya ishlatishni va arzon narxni ta'minlaydi. O'rtacha darajadagi o'yinlar, video tomosha qilish, internetni surish va multitasking kabi kundalik vazifalar uchun mukammaldir. Biroq, yuqori darajadagi o'yinlar yoki og'ir ishlov berish talab qiladigan vazifalar uchun ular kamchilikka ega. Agar siz o'rtacha darajadagi qurilmani ishlatish niyatida bo'lsangiz, Snapdragon 600 seriyasi yaxshi tanlov bo'lishi mumkin.






""",
                            R.drawable.snapdragon_600,
                            "fTNI6KQg444"
                        ),
                        pc_model(
                            "Snapdragon 8cx Gen 3", """
Snapdragon 8cx — bu Qualcomm kompaniyasining yuqori samarali ARM asosidagi protsessoridir. U ayniqsa Windows 10 va Windows 11 operatsion tizimida ishlash uchun mo‘ljallangan va asosan ultrabuklar, 2-in-1 noutbuklar va boshqa mobil qurilmalarda ishlatiladi. Snapdragon 8cx chipi, ayniqsa, yuqori energiya samaradorligi, uzoq batareya muddati va kuchli ishlov berish imkoniyatlari bilan tanilgan.

Snapdragon 8cx ning asosiy xususiyatlari:

1. 8 yadroli CPU: Snapdragon 8cx protsessori 8 ta yadroga ega. Bu yadrolarning 4 tasi yuqori samaradorlik uchun mo‘ljallangan va 4 tasi esa energiya samaradorligini ta’minlaydi. Bu yadro tuzilishi ko‘p vazifali ishlov berish uchun qulay.


2. Adreno GPU: Snapdragon 8cx chipida yuqori samarali Adreno 680 GPU mavjud bo‘lib, bu o‘yinchilar uchun grafik ishlov berish va video tahrirlashni yuqori tezlikda amalga oshiradi.


3. 5G ulanish imkoniyati: Snapdragon 8cx 5G ulanishni qo‘llab-quvvatlaydi, bu esa yuqori tezlikda internetga ulanishni ta'minlaydi va mobil ishlov berishda yangi imkoniyatlar yaratadi.


4. AI va mashina o‘rganish: Snapdragon 8cx chipi sun'iy intellekt va mashina o‘rganish imkoniyatlarini qo‘llab-quvvatlaydi, bu esa mobil ilovalar va dasturlarning ishlash samaradorligini oshiradi.


5. Energiya samaradorligi: Snapdragon 8cx ARM arxitekturasi yordamida yuqori ishlashni ta'minlaydi va shu bilan birga batareya muddatini uzoqroq saqlaydi. Bu noutbuklar va mobil qurilmalarda uzoq vaqt davomida ishlash imkonini beradi.



Qurilmalarda ishlatilishi:

Snapdragon 8cx protsessori asosan Windows 2-in-1 noutbuklari, ultrabuklar va boshqa mobil qurilmalarda ishlatiladi. Misol uchun, Lenovo Flex 5G, HP Elite Dragonfly G2, va Microsoft Surface Pro X kabi qurilmalarda Snapdragon 8cx chipi ishlatiladi.

Bu protsessor ko‘p vazifali ishlov berishda, yuqori samaradorlik va energiya tejamkorlikda o‘zining qulayligi bilan ajralib turadi.                    """,
                            R.drawable.snapdragon, "FjRTpti2-o8"
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
NVIDIA GeForce GTX 1650 – o‘rta darajadagi grafik protsessor bo‘lib, NVIDIA Turing arxitekturasiga asoslangan. Ushbu GPU asosan o‘yinlar, grafik dizayn va video montaj kabi vazifalar uchun mo‘ljallangan. Quyidagi asosiy xususiyatlarga ega:

Texnik xususiyatlari:
CUDA yadrolari: 896 ta
Bazaviy chastota: 1485 MHz (overclock qilish mumkin)
Video xotira: 4 GB GDDR5 (128-bit shina kengligi)
TDP (Thermal Design Power): 75 Vt
Maxsus interfeys: PCIe 3.0
Monitor ulanishlari: HDMI 2.0b, DisplayPort 1.4, DVI-D
Texnologiya: 12 nm ishlab chiqarish jarayoni
Afzalliklari:
Energiya samaradorligi: TDP past bo‘lib, qo‘shimcha quvvat manbaisiz ishlaydi.
Narx va sifat nisbati: O‘rta darajali kompyuter yig‘ish uchun ajoyib tanlov.
O‘yinlar uchun optimizatsiya: Full HD (1080p) formatida o‘yinlarni o‘rtacha yoki yuqori sozlamalarda o‘ynash imkonini beradi.
Turing arxitekturasi: NVIDIA tomonidan yangi grafik texnologiyalar qo‘llab-quvvatlanadi.
Kamchiliklari:
Ray tracing yo‘qligi: Realistik yorug‘lik va soyalar effektlarini to‘liq qo‘llab-quvvatlamaydi.
Kelajak uchun yetarlicha kuchli emas: 1440p yoki 4K formatli o‘yinlar va og‘ir grafik ishlov berish uchun unchalik mos emas.
Ushbu grafik karta ixcham va samarali bo‘lib, budjet cheklangan foydalanuvchilar uchun yaxshi tanlov hisoblanadi. Bu karta yordamida ko‘plab zamonaviy o‘yinlarni qulay darajada o‘ynash mumkin. Shu bilan birga, montaj va oddiy 3D modellashtirish vazifalarini ham uddalay oladi.



                    """,
                            R.drawable.ic_nvdia_1650, "HshelOYnBrY"
                        ),
                        pc_model(
                            "NVIDIA GeForce RTX 3060", """
NVIDIA RTX 3060 — bu NVIDIA kompaniyasining Ampere arxitekturasiga asoslangan o‘rta darajali grafik kartasidir. 2021-yilning fevralida taqdim etilgan bu karta o‘yin o‘ynash, video tahrirlash va 3D ishlov berish uchun yuqori samaradorlikni ta’minlaydi. RTX 3060 12GB GDDR6 xotiraga ega bo‘lib, yuqori tezlikda o‘yinlar o‘ynash va grafika ishlov berish imkoniyatlarini beradi.

RTX 3060ning asosiy xususiyatlari:

1. Ampere Arxitekturasi: RTX 3060 karta Ampere arxitekturasi asosida ishlaydi, bu esa ko‘proq yadro va samarali ishlov berishni ta’minlaydi, shuningdek, yangi texnologiyalar, masalan, Ray Tracing va DLSS (Deep Learning Super Sampling) qo‘llab-quvvatlanadi.


2. Ray Tracing va DLSS: Ray Tracing texnologiyasi o‘yinlardagi yorug‘lik va soyalarni realistik tarzda taqdim etadi. DLSS esa o‘yinda tasvir sifatini yaxshilash uchun sun’iy intellektni qo‘llaydi, bu esa yuqori kadr tezligini saqlashga yordam beradi.


3. 12GB GDDR6 Xotira: RTX 3060 12GB GDDR6 video xotiraga ega bo‘lib, bu o‘yinlarda yuqori tasvir sifatini ta’minlaydi va og‘ir grafik ishlov berish vazifalarini osonlik bilan bajaradi.


4. O‘yinlarda yuqori samaradorlik: RTX 3060 o‘rta va yuqori darajadagi o‘yinlarda ajoyib ishlashni ta’minlaydi, shu jumladan 4K o‘yinlarda ham yaxshi natijalar ko‘rsatadi.


5. RTX 3060 va Video Tahrirlash: Video tahrirlash va 3D model yaratish kabi professional ishlov berish uchun ham yuqori samaradorlikni ta’minlaydi, ayniqsa, video va grafik dizayn sohasida ishlayotganlar uchun.



Qurilmalarda ishlatilishi:

RTX 3060 grafik kartasi o‘rta va yuqori darajali o‘yin kompyuterlari, ish stantsiyalarida va professional dizayn hamda ishlab chiqish jarayonlarida ishlatiladi.

NVIDIA RTX 3060 kartasi o‘yinchilar, kontent yaratuvchilar va grafik ishlarni bajaradigan foydalanuvchilar uchun juda yaxshi tanlovdir. Yangi texnologiyalar, samarali ishlash va katta xotira miqdori bilan o‘rta darajali foydalanuvchilar uchun ideal hisoblanadi.                    """,
                            R.drawable.nvdia_3600, "8rz32GVndEM"
                        ),

                        )
                ),
                brand_model(
                    "AMD", arrayListOf(

                        pc_model(

                            "AMD Radeon RX 6600",
                            """
                            AMD Radeon RX 6600 — bu AMD kompaniyasining o‘rta darajali grafik kartasi bo‘lib, RDNA 2 arxitekturasiga asoslangan. 2021-yilning iyulida taqdim etilgan bu karta, o‘rta darajadagi o‘yinlar va 1080p o‘yinlar uchun yuqori samaradorlikni ta’minlaydi. RX 6600 grafika kartasi, ayniqsa, ray tracing texnologiyasi va AMD FidelityFX Super Resolution (FSR) qo‘llab-quvvatlanishi bilan tanilgan.

RX 6600 ning asosiy xususiyatlari:

1. RDNA 2 Arxitekturasi: RX 6600, AMD ning yangi RDNA 2 arxitekturasi asosida ishlab chiqilgan, bu arxitektura ko‘proq yadro va samarali ishlov berishni ta’minlaydi, shu bilan birga energiya samaradorligini ham oshiradi.


2. 8GB GDDR6 Xotira: RX 6600 karta 8GB GDDR6 video xotiraga ega bo‘lib, bu o‘rta darajadagi o‘yinlarda yuqori tasvir sifatini va silliq ishlashni ta’minlaydi.


3. Ray Tracing va FSR: Ray tracing texnologiyasi o‘yinlardagi yorug‘lik va soyalarni realistik tarzda taqdim etadi. FidelityFX Super Resolution (FSR) esa o‘yinda tasvir sifatini yaxshilash uchun ishlatiladi, bu esa kadr tezligini oshiradi va o‘yinni yanada silliq qiladi.


4. 1080p O‘yinlarda Yaxshi Samaradorlik: RX 6600 karta, 1080p o‘yinlarida yuqori samaradorlikni ta’minlaydi va ko‘plab zamonaviy o‘yinlarda yuqori grafik sozlamalarda yaxshi ishlaydi.


5. Energiyani tejash: RX 6600 o‘zining RDNA 2 arxitekturasi bilan energiya iste'molini minimallashtirib, yuqori samaradorlikni ta’minlaydi.



Qurilmalarda ishlatilishi:

RX 6600 grafik kartasi o‘rta darajadagi o‘yin kompyuterlari uchun idealdir. Bu kartaning yuqori grafik samaradorligi va arzon narxi uni o‘rta darajadagi o‘yinchilar uchun yaxshitanlovidir.
                            """,
                            R.drawable.nvdia_6600,
                            "HPbUAsG9ZZo"


                        ),
                        pc_model(
                            "AMD Radeon RX 6700",
                            """
                                
                                AMD Radeon RX 6700 — bu AMD kompaniyasining yuqori darajali grafik kartalaridan biri bo‘lib, RDNA 2 arxitekturasiga asoslangan. U 2021-yilda chiqarilgan va yuqori samaradorlikni ta’minlash uchun mo‘ljallangan. RX 6700, ayniqsa, 1440p o‘yinlarida yuqori grafik natijalarga erishish uchun idealdir. U Ray Tracing, FidelityFX Super Resolution (FSR) va boshqa zamonaviy texnologiyalarni qo‘llab-quvvatlaydi.

RX 6700 ning asosiy xususiyatlari:

1. RDNA 2 Arxitekturasi: RX 6700, AMD ning RDNA 2 arxitekturasi asosida ishlab chiqilgan. Bu arxitektura yuqori samaradorlik va energiya tejash imkoniyatlarini birlashtiradi. Ray tracing texnologiyasi va FSR kabi imkoniyatlar orqali tasvir sifatini yaxshilash mumkin.


2. 12GB GDDR6 Xotira: RX 6700 karta 12GB GDDR6 video xotiraga ega, bu esa og‘ir o‘yinlar va grafik ishlov berish dasturlarini qo‘llab-quvvatlaydi, yuqori xotira talab qiladigan vazifalarni bajarishda yordam beradi.


3. 1440p O‘yinlar uchun mukammal: RX 6700 karta, 1440p o‘yinlarda yuqori samaradorlikni ta’minlaydi, shu bilan birga 4K o‘yinlarda ham yaxshi natijalar ko‘rsatishi mumkin.


4. Ray Tracing va FSR: Ray Tracing texnologiyasi o‘yinlardagi yorug‘lik va soyalarni realistik tarzda taqdim etadi. FidelityFX Super Resolution (FSR) esa yuqori samaradorlikni ta’minlash uchun o‘yindagi tasvir sifatini yaxshilaydi.


5. O‘yinlarda yuqori samaradorlik: RX 6700 kartasi yuqori samaradorlikni ta’minlab, 4K o‘yinlarda ham yaxshi ishlash imkoniyatiga ega.



Qurilmalarda ishlatilishi:

RX 6700 kartasi yuqori darajadagi o‘yin kompyuterlari va grafik ishlov berish tizimlari uchun mo‘ljallangan. Bu karta yuqori sifatli o‘yinlar va videolarni tahrirlashda keng qo‘llaniladi.

AMD Radeon RX 6700 o‘rta va yuqori darajadagi o‘yinchilar, grafik dizaynerlar va kontent yaratuvchilar uchun mukammal tanlovdir. O‘yinlar uchun kuchli va yuqori samaradorlikni ta’minlashda yaxshi natijalar beradi.
                                
                                """,
                            R.drawable.amd_6700,
                            "91gJh8IbDGk"
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
                 ASUS ROG STRIX B550-F – yuqori sifatli va optimallikni ta’minlaydi.
Uning asosiy xususiyatlari quyidagilardan iborat:

Texnik xususiyatlari:
Protsessor qo‘llab-quvvatlash: AMD Ryzen 3000 va 5000 seriyali protsessorlari bilan mos.
Chipset: AMD B550.
PCIe: PCIe 4.0 qo‘llab-quvvatlaydi, bu esa tezkor grafik kartalar va SSD-lar uchun katta tezlikni ta'minlaydi.
RAM: 4 ta DDR4 sloti, 128GB gacha operativ xotira bilan ishlash imkoniyati, 4400 MHz va undan yuqoriga overclock qilish mumkin.
M.2 slotlari: Ikki dona M.2 NVMe SSD slotlari mavjud, ulardan biri PCIe 4.0 tezlikda ishlaydi.
Audio tizimi: SupremeFX S1220A audio kodek, yuqori sifatli ovoz tajribasini ta’minlaydi.
Tarmoq: 2.5Gb Ethernet va Wi-Fi 6 (Wi-Fi versiyasida mavjud).
Afzalliklari:
Yuqori sovutish tizimi: Ona plataning VRM va chipseti sovutish radiatorlari bilan jihozlangan.
RGB yoritgichlar: Aura Sync RGB yoritgichlar mavjud bo‘lib, boshqa ASUS qurilmalari bilan sinxronlashtirish mumkin.
O‘yin uchun moslashgan: Barqaror quvvat manbai va o‘yinlar uchun optimallashtirilgan BIOS.
Kamchiliklari:
Narxi: Byudjet platalarga qaraganda qimmatroq.
Wi-Fi: Wi-Fi modeli qo‘shimcha xarajat talab qiladi.
Ushbu ona plata o‘yin o‘ynash, og‘ir dasturlarni ishlatish va yuqori tezlikli qurilmalarni qo‘llash uchun ajoyib tanlovdir. Bundan tashqari, uning dizayni va RGB yoritgichlari uni jozibador qiluvchi qo‘shimcha afzalliklardir.
                    """,
                            R.drawable.asus_b550, "8946bgIfY9E"
                        ),
                        pc_model(
                            "ASUS TUF GAMING X570-PLUS", """
                ASUS TUF GAMING X570-PLUS – o‘yin o‘ynash va uzoq muddat foydalanish uchun barqarorlikni ta’minlovchi yuqori sifatli ona plata. AMD Ryzen protsessorlari uchun mo‘ljallangan ushbu plata o‘zining chidamliligi va yaxshi sovutish tizimi bilan ajralib turadi.

Texnik xususiyatlari:
Protsessor qo‘llab-quvvatlash: AMD Ryzen 2000, 3000, 4000 G, 5000 seriyali protsessorlari.
Chipset: AMD X570, yuqori darajadagi imkoniyatlarni ta'minlaydi.
PCIe: PCIe 4.0 qo‘llab-quvvatlanadi, bu grafik kartalar va tezkor SSD-lar uchun katta tezlik beradi.
RAM: 4 ta DDR4 RAM slotlari, 128 GB gacha operativ xotira bilan ishlash imkoniyati.
Storage:
2 ta M.2 sloti, ikkalasi ham NVMe SSD-lar uchun PCIe 4.0 tezlikni ta’minlaydi.
8 ta SATA porti mavjud.
Audio tizimi: Realtek S1200A audio kodek, yuqori sifatli ovoz tajribasi uchun optimallashtirilgan.
Tarmoq:
Gigabit Ethernet (Realtek L8200A).
Wi-Fi versiyasi ham mavjud (Wi-Fi modeli alohida sotiladi).
Portlar:
USB 3.2 Gen2 (Type-A va Type-C).
USB 3.2 Gen1 va USB 2.0.
Afzalliklari:
Barqarorlik va chidamlilik: TUF seriyasi yuqori sifatli komponentlardan foydalanadi va uzoq muddat ishlashga moslashtirilgan.
Yaxshi sovutish tizimi: Chipset uchun maxsus fan va keng radiatorlar tizimi o‘rnatilgan.
RGB yoritgichlar: Aura Sync bilan boshqa ASUS qurilmalari bilan sinxronlash mumkin.
O‘yin uchun mo‘ljallangan BIOS: O‘yinlarda tezkor sozlamalar va stabil quvvat ta’minoti.
Kamchiliklari:
Narxi: Byudjet platalarga nisbatan qimmatroq.
Wi-Fi: Barcha versiyalarida mavjud emas, alohida Wi-Fi modelini tanlash kerak.
                    """,
                            R.drawable.asus_x570, "_nrXujg0Ius"
                        )
                    )
                ),
                brand_model(
                    "MSI", arrayListOf(
                        pc_model(
                            "MSI MAG B550 TOMAHAWK", """
                  MSI MAG B550 TOMAHAWK – AMD Ryzen protsessorlari uchun mo‘ljallangan, yuqori samaradorlikka ega va sovutish tizimi bilan ajralib turuvchi o‘rta darajadagi premium ona plata. Bu model o‘yinlar va grafik ishlov berish uchun optimallashtirilgan.

Texnik xususiyatlari:
Protsessor qo‘llab-quvvatlash: AMD Ryzen 3000 va 5000 seriyali protsessorlari, shuningdek, Ryzen 4000 G seriyali APU-lari.
Chipset: AMD B550, bu yangi avlod PCIe 4.0 qo‘llab-quvvatlash imkoniyatini taqdim etadi.
PCIe:
PCIe 4.0 x16 (asosiy grafik kartasi sloti uchun).
PCIe 3.0 x16 (ikkinchi x16 sloti).
RAM:
4 ta DDR4 DIMM slotlari.
128 GB gacha RAM qo‘llab-quvvatlanadi.
4866 MHz va undan yuqori tezlikda overclock qilish imkoniyati.
Storage:
2 ta M.2 sloti: biri PCIe 4.0 (SSD uchun yuqori tezlik), ikkinchisi PCIe 3.0.
6 ta SATA III porti.
Audio tizimi:
Realtek ALC1200 kodek.
Studio sifatidagi ovoz bilan jihozlangan.
Tarmoq:
2.5Gb Realtek LAN.
Gigabit Ethernet (Intel LAN).
I/O portlar:
USB 3.2 Gen2 (Type-A va Type-C).
USB 3.2 Gen1 va USB 2.0 portlari.
HDMI 2.1 va DisplayPort chiqishlari.
Afzalliklari:
Barqarorlik va quvvat yetkazib berish: 10+2 fazali quvvat tizimi bilan yuqori yuklamalarda ham samarador ishlash.
Tezkor PCIe 4.0 qo‘llab-quvvatlash: Yangi avlod grafik kartalar va SSD-lar uchun maksimal tezlikni ta’minlaydi.
Sovutish tizimi:
Radiatorlar VRM va chipset uchun maxsus sovutishni ta’minlaydi.
M.2 slotlarida sovutish mexanizmlari mavjud.
Yoritish va dizayn:
MSI Mystic Light RGB tizimi bilan turli xil yoritish rejimlari mavjud.
Kengaytma imkoniyatlari:
Ikki Ethernet tarmoq kartasi bilan yuqori tezlikdagi ulanishlar.
Kamchiliklari:
Wi-Fi yo‘qligi: Ushbu model ichki Wi-Fi moduliga ega emas, alohida Wi-Fi adapter kerak bo‘ladi.
M.2 slot tezliklari: Ikkinchi M.2 slot faqat PCIe 3.0 tezlikda ishlaydi.
                    """,
                            R.drawable.msi_b550, "iPAGjosQejU"
                        ),

                        )
                ),
                brand_model(
                    "Gigabyte", arrayListOf(
                        pc_model(
                            "Gigabyte B550 AORUS ELITE", """
                Gigabyte B550 AORUS ELITE – AMD Ryzen protsessorlari uchun mo‘ljallangan byudjetga mos, yuqori samaradorlikka ega ona plata. U yuqori sifat, optimallashtirilgan komponentlar va foydalanuvchilar uchun kengaytma imkoniyatlarini taklif qiladi.

Texnik xususiyatlari:
Protsessor qo‘llab-quvvatlash:
AMD Ryzen 3000 va 5000 seriyali protsessorlari.
AMD Ryzen 4000 G seriyali APU-lari.
Chipset: AMD B550 – PCIe 4.0 qo‘llab-quvvatlaydi, o‘rta darajadagi tizimlar uchun mos.
PCIe:
PCIe 4.0 x16 (grafik kartalar uchun).
PCIe 3.0 x16 (ikkinchi kengaytma sloti).
RAM:
4 ta DDR4 DIMM slotlari.
Maksimal 128 GB hajmgacha qo‘llab-quvvatlaydi.
4733 MHz gacha tezlik bilan overclock qilish imkoniyati.
Storage:
2 ta M.2 sloti (biri PCIe 4.0, ikkinchisi PCIe 3.0).
6 ta SATA III porti.
Audio tizimi:
Realtek ALC1200 audio kodek.
Studio darajasidagi ovoz sifati uchun.
Tarmoq:
2.5Gb Ethernet (Realtek LAN).
RGB yoritgichlar:
RGB Fusion 2.0 qo‘llab-quvvatlashi bilan boshqa Gigabyte qurilmalari bilan sinxronlashtirish mumkin.
I/O portlar:
USB 3.2 Gen2 (Type-A va Type-C).
USB 3.2 Gen1 va USB 2.0 portlari.
HDMI va DisplayPort chiqishlari (APU-lar uchun).
Afzalliklari:
Byudjetga mos: Yaxshi narx-nisbati bilan o‘rta darajadagi foydalanuvchilar uchun ideal.
PCIe 4.0 qo‘llab-quvvatlash: Yangi avlod grafik kartalar va SSD-lar bilan ishlash imkonini beradi.
Kengaytma imkoniyatlari:
Ikki M.2 slot va 6 SATA III port bilan ko‘p saqlash qurilmalarini ulash imkoniyati.
Barqaror ishlash: 12+2 fazali VRM quvvat dizayni yuqori yuklamalarda ham samaradorlikni ta'minlaydi.
Yoritish: RGB Fusion 2.0 bilan estetik dizaynni moslashtirish imkoniyati.
Kamchiliklari:
Wi-Fi yo‘qligi: U ichki Wi-Fi moduliga ega emas.
Audio imkoniyatlari: Ovoz sifati yuqori, ammo premium modellardagi kabi qo‘shimcha imkoniyatlarni taklif qilmaydi.
                    """,
                            R.drawable.ic_gigabyte, "7OXCYFVDNdg"
                        ),
                        pc_model(
                            "Gigabyte Z590 AORUS MASTER", """
                    Gigabyte Z590 AORUS MASTER – Intel 11-avlod protsessorlari uchun
                    mo‘ljallangan, PCIe 4.0 va 3 ta M.2 slotini qo‘llab-quvvatlaydi.
                    """,
                            R.drawable.ic_gigabyte_z790, "pEzmD4tRIis"
                        )
                    )
                ),

                )
        )

        val memoryModels = main_model(
            "Memory (RAM)", arrayListOf(
                brand_model(
                    "Corsair", arrayListOf(
                        pc_model(
                            "Corsair Vengeance LPX 16GB", """
Corsair Vengeance LPX 16GB — bu yuqori samarali RAM moduli bo'lib, o'yinlar, video tahrirlash, va boshqa yuqori talablarga ega dasturlar uchun mo'ljallangan. Quyidagi asosiy xususiyatlarga ega:

Kapasite: 16GB (1 x 16GB yoki 2 x 8GB modullaridan iborat bo'lishi mumkin).
Tezlik: 2666 MHz dan 3600 MHz gacha bo'lgan tezlikda mavjud.
Form-factor: DDR4.
Voltage: 1.2V (ODT) — energiya samaradorligi uchun.
Xususiyatlar: Xotira yuqori chastotada ishlashi va stabil ishlashini ta'minlash uchun aniq sozlash imkoniyatlariga ega. LPX (Low Profile X) dizayni orqali qisqa kenglikda joylashadi, bu esa kichik korpuslarga o'rnatish uchun ideal.
Heatsink: Issiqlikni samarali chiqarish uchun anodlangan alyuminiy issiqlik tarqatuvchi, bu RAMning uzoq muddat davomida yuqori ishlashini ta'minlaydi.
Kompatibilite: Intel va AMD protsessorlari bilan mos keladi.
Agar o'yinlar yoki video tahrir dasturlari uchun ishlashni istasangiz, bu model samarali va ishonchli tanlov bo'lishi mumkin.                    """,
                            R.drawable.corasir_lpx_16gb, "zYE6hlzAvm8"
                        ),
                        pc_model(
                            "Corsair Dominator Platinum 32GB", """
Corsair Dominator Platinum 32GB — bu yuqori sifatli va yuqori samarali DDR4 RAM moduli bo'lib, o'yinlar, video tahrirlash va og'ir ish yuklari uchun mo'ljallangan. Quyidagi asosiy xususiyatlar bilan ajralib turadi:

Kapasite: 32GB (2 x 16GB yoki 4 x 8GB modullaridan iborat bo'lishi mumkin).
Tezlik: 3000 MHz dan 4800 MHz gacha bo'lgan tezlikda mavjud, shuningdek, XMP (Extreme Memory Profile) ni qo'llab-quvvatlaydi.
Form-factor: DDR4.
Voltage: 1.35V (ODT) — yuqori ishlash uchun yaxshi energiya ta'minoti.
Dizayn: Dominator Platinum seriyasi, shuningdek, zamonaviy va estetika jihatidan chiroyli dizaynga ega, metal qoplama va RGB yoritilishi bilan bezatilgan. Heatsink (issiqni tarqatish tizimi) juda samarali bo'lib, RAM modullarining uzoq muddat ishlashini ta'minlaydi.
Xususiyatlar:
Patented DHX (Dual-path Heat Exchange) technology: Bu texnologiya, RAMning sovutish tizimining samaradorligini oshiradi, yuqori chastotalarda ishlashda issiqlikni tezda chiqaradi.
Corsair iCUE software: RGB yoritilishining rangini va effektlarini sozlash imkonini beradi.
Kompatibilite: Intel va AMD protsessorlari bilan mos keladi.
Agar yuqori tezlik, o'zgaruvchan yoritish va yuqori ishonchlilikni istasangiz, Corsair Dominator Platinum 32GB yaxshi tanlovdir. Bu xotira moduli ayniqsa kuchli ish yuklari, o'yinlar va multitasking uchun ideal.                     """,
                            R.drawable.corsair_32gb, "5_l0aeypcqQ"
                        )
                    )
                ),
                brand_model(
                    "G.SKILL", arrayListOf(
                        pc_model(
                            "G.SKILL Ripjaws V 16GB", """
G.SKILL Ripjaws V 16GB — bu yuqori samarali va keng tarqalgan DDR4 RAM moduli bo'lib, o'yinlar, ish stantsiyalari va yuqori darajadagi ko'p vazifali ishlar uchun mo'ljallangan. Quyidagi asosiy xususiyatlar bilan ajralib turadi:

Kapasite: 16GB (1 x 16GB yoki 2 x 8GB modullaridan iborat bo'lishi mumkin).
Tezlik: 2133 MHz dan 4000 MHz gacha bo'lgan tezlikda mavjud. Shuningdek, XMP (Extreme Memory Profile) profillarini qo'llab-quvvatlaydi.
Form-factor: DDR4.
Voltage: 1.2V — energiya samaradorligi uchun.
Dizayn: Ripjaws V seriyasining modullari qora, qizil yoki boshqa ranglarda mavjud va ularning yuqori sifatli issiqlik tarqatuvchi tizimi modullarning optimal ishlashini ta'minlaydi.
Xususiyatlar:
XMP 2.0 Support: Oson va barqaror yuqori tezlikka erishish uchun XMP 2.0 profilini qo'llab-quvvatlaydi, bu avtomatik ravishda RAMning optimal parametrlarini sozlash imkonini beradi.
Heatsink dizayni: Yaxshi sovutish uchun yuqori sifatli alyuminiy issiqlik tarqatuvchi.
Kompatibilite: Intel va AMD protsessorlari bilan mos keladi.
G.SKILL Ripjaws V 16GB moduli ishonchli va yuqori tezlikdagi xotira moduli bo'lib, kundalik ishlar va o'yinlar uchun yaxshi tanlovdir. Agar siz yuqori ishlashni va barqarorlikni istasangiz, bu model juda mos keladi.                    """,
                            R.drawable.gsik_16gb, "CeKegSEZmUk"
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
Samsung 970 EVO Plus 1TB — bu yuqori samarali va tezkor NVMe M.2 SSD (Solid State Drive) bo'lib, kompyuter va boshqa qurilmalarda yuqori tezlikda ma'lumotlar o'qish va yozish operatsiyalarini amalga oshirish imkonini beradi. Quyidagi asosiy xususiyatlar bilan ajralib turadi:

Kapasite: 1TB (terabyte).
Interfeys: NVMe 1.3, M.2 2280 (keying interfeys — PCIe 3.0 x4).
Tezlik:
O'qish tezligi: 3500 MB/s (maksimal).
Yozish tezligi: 3300 MB/s (maksimal).
Kontroller: Samsung Phoenix Controller, bu tezlikni oshirish va ishonchlilikni ta'minlash uchun optimallashtirilgan.
NAND texnologiyasi: Samsung V-NAND (3D NAND).
TBW (Terabytes Written): 600 TBW — bu SSD ning maksimal yozish sig'imi, bu uzoq muddatli ishlash va yuqori samaradorlikni ta'minlaydi.
Sovutish: Heatsink mavjud emas, ammo Samsung Dynamic Thermal Guard texnologiyasi avtomatik ravishda haroratni boshqaradi va yuqori ish haroratlaridan himoya qiladi.
Xususiyatlar:
Samsung Magician Software: SSD holatini nazorat qilish, dasturiy ta'minotni yangilash va optimallashtirish uchun.
AES 256-bit Encryption: Ma'lumotlarni himoya qilish uchun apparat darajasidagi shifrlash.
Qo'llab-quvvatlanadigan operatsion tizimlar: Windows, Linux va boshqa mashhur tizimlar.
Samsung 970 EVO Plus 1TB — yuqori tezlik va ishonchlilikni ta'minlaydigan SSD bo'lib, o'yinlar, video tahrirlash, grafik dasturlari yoki umumiy foydalanish uchun juda mos keladi. Bu SSD kompyuteringizning ish tezligini sezilarli darajada oshiradi va o'rnatilishi oson.






                    """,
                            R.drawable.samsung_1t_970, "srxAES3Y5JQ"
                        ),
                        pc_model(
                            "Samsung 860 EVO 500GB", """
Samsung 860 EVO 500GB — bu yuqori sifatli va ishonchli SATA III SSD bo'lib, uni turli xil kompyuterlar va qurilmalarda ishlatish mumkin. Quyidagi asosiy xususiyatlar bilan ajralib turadi:

Kapasite: 500GB.
Interfeys: SATA III (6 Gb/s) — SSD ning eski SATA interfeyslari bilan ham mos keladi, ammo maksimal tezlik PCIe NVMe SSD'larga nisbatan pastroq bo'ladi.
Tezlik:
O'qish tezligi: 550 MB/s (maksimal).
Yozish tezligi: 520 MB/s (maksimal).
NAND texnologiyasi: Samsung 3D V-NAND (3D NAND Flash Memory), bu yuqori sig'im va yaxshi ishonchlilikni ta'minlaydi.
Kontroller: Samsung MJX Controller, bu SSD ning samarali ishlashini ta'minlaydi.
TBW (Terabytes Written): 300 TBW — bu SSD ning maksimal yozish sig'imi, uzoq muddatli foydalanish uchun yaxshi ko'rsatkich.
Sovutish: Heatsink mavjud emas, ammo Samsung Dynamic Thermal Guard texnologiyasi avtomatik ravishda haroratni boshqaradi.
Xususiyatlar:
AES 256-bit Encryption: Ma'lumotlarni himoya qilish uchun apparat darajasidagi shifrlash.
Samsung Magician Software: SSD holatini nazorat qilish, dasturiy ta'minotni yangilash va optimallashtirish imkoniyatlarini taqdim etadi.
Qo'llab-quvvatlanadigan operatsion tizimlar: Windows, Linux, macOS kabi keng tarqalgan tizimlar bilan mos keladi.
Samsung 860 EVO 500GB — bu yaxshi ishlash va ishonchlilikni ta'minlaydigan SSD, ayniqsa ko'pchilik uchun o'yinlar, umumiy kompyuter ishlari va ma'lumotlarni saqlash uchun yaxshi tanlovdir. SATA interfeysli bo'lishiga qaramay, tezlik va mustahkamlik jihatidan yuqori sifatni taqdim etadi.                    """,
                            R.drawable.ic_samsung_860, "PIWokeNts-A"
                        )
                    )
                ),
                brand_model(
                    "Western Digital", arrayListOf(
                        pc_model(
                            "WD Black SN850X 1TB", """
                  WD Black SN850X 1TB — bu o'yinchilar, kontent yaratish mutaxassislari va tezkor va ishonchli saqlashni talab qiladigan foydalanuvchilar uchun mo'ljallangan yuqori samarali SSD (Solid-State Drive). Western Digital kompaniyasining WD Black seriyasiga kiradi va o'yinlar, video tahrir qilish va boshqa ma'lumot talab qiladigan ishlar uchun mo'ljallangan tezkor va katta hajmli saqlash qurilmasidir.

Asosiy Xususiyatlar:
Interfeys:

PCIe Gen 4.0 x4 interfeysini ishlatadi, bu eski PCIe Gen 3.0 SSDlarga qaraganda tezroq ma'lumot uzatish tezligini ta'minlaydi. Bu interfeys yangilangan o'yin kompyuterlari, noutbuklar va konsollar bilan mos keladi.
Saqlash Hajmi:

1TB saqlash hajmi taqdim etadi, bu o'yinlar, videolar va boshqa katta fayllar uchun yetarli joy beradi. Bu hajm tezlik va narxning yaxshi muvozanatini ta'minlaydi.
O'qish va Yozish Tezliklari:

7300 MB/s o'qish tezligi va 6600 MB/s yozish tezligi bilan ajralib turadi. Ushbu tezliklar uni eng tezkor NVMe SSDlardan biriga aylantiradi, bu esa tezkor yuklash va fayl uzatishni ta'minlaydi.
Mustahkamlik:

SSD 600TBW (Terabytes Written) gacha yozish imkoniyatiga ega bo'lib, uzoq muddat ishlash uchun mo'ljallangan. Bu ko'p ma'lumot yozish vaqti davomida ishonchli ishlashni ta'minlaydi.
Issiqlikni boshqarish:

Qurilma issiqlikni boshqarish va heatsink bilan moslik (ba'zi konfiguratsiyalarda) imkoniyatlariga ega, bu esa intensiv ishlar davomida tezlikni saqlashga yordam beradi.
O'yin rejimi:

O'yin rejimi mavjud bo'lib, bu o'yinlar uchun ishlashni optimallashtiradi, kechikishni kamaytiradi va tezlikni oshiradi.
Dasturiy Ta'minot:

WD Black Dashboard dasturi bilan SSD holatini kuzatish, firmware yangilash va ishlashni optimallashtirish mumkin.
Orqaga moslik:

PCIe 4.0 qo'llab-quvvatlaydi, ammo PCIe 3.0 bilan ham mos keladi, bu eski tizimlarda ham yaxshi ishlashni ta'minlaydi.
Ishonchlilik:

WD Black seriyasiga xos bo'lgan 5 yil kafolat bilan ta'minlangan.
Foydalanish Sohalari:
O'yinlar:

WD Black SN850X o'yinlar uchun ideal variant bo'lib, tez yuklash vaqtlarini ta'minlaydi, o'yinlarni samarali ishlatishga imkon beradi va o'yinlar davomida samarali ishlashni ta'minlaydi.
Kontent Yaratish:

Video tahrirchilari, fotografiklar va boshqa kontent yaratish mutaxassislari uchun tezkor o'qish va yozish tezliklari ish jarayonini tezlashtiradi, bu esa fayllarni tezroq ko'chirish, tahrirlash va render qilish imkonini beradi.
Yuqori Samarali Kompyuterlar:

Bu SSD yuqori ishlov berish talab qiladigan dasturlar uchun ham yaxshi ishlaydi, masalan, dasturchilar, ma'lumotlar olimlari va katta ma'lumotlar bilan ishlaydigan foydalanuvchilar uchun.
Konsollarga Upgrade:

PlayStation 5 bilan mos keladi va konsol ishlashini yaxshilash uchun qo'shimcha saqlash maydoni sifatida ishlatilishi mumkin.
Afzalliklari:
Ajoyib tezlik: PCIe Gen 4.0 qo'llab-quvvatlashi tezlikni yuqori darajaga ko'taradi, bu esa yuqori ishlov berish talab qiladigan ishlar uchun ideal.
1TB hajm: Ma'lumotlar uchun yetarli joy va yaxshi narx.
O'yin rejimi: O'yinlar uchun optimallashtirilgan ishlash.
Ishtirok etuvchi issiqlikni boshqarish: Yuqori tezlikni saqlash uchun issiqlikni boshqarish texnologiyasi.
Ishonchli va uzoq muddatli ishlash: 5 yil kafolat va yuqori mustahkamlik.
Kamchiliklari:
Narxi: SSD arzonroq variantlarga qaraganda qimmatroq, ammo tezligi va ishlashiga mos keladi.
Oddiy foydalanuvchilar uchun ortiqcha: Agar siz yuqori tezlikni talab qilmagan oddiy ishlarni amalga oshirsangiz, bu SSD kerakli bo'lmasligi mumkin.
Xulosa:
WD Black SN850X 1TB o'yinchilar, kontent yaratish mutaxassislari va tezkor saqlashni talab qiladigan foydalanuvchilar uchun yuqori samarali va ishonchli SSD hisoblanadi. Uning tez o'qish va yozish tezliklari, katta hajmi va issiqlikni boshqarish imkoniyatlari uni har xil ishlov berish va o'yinlar uchun mukammal tanlovga aylantiradi. Agar siz yuqori tezlik va ishonchlilikni izlayotgan bo'lsangiz, bu SSD siz uchun ideal variant bo'lishi mumkin.






  """, R.drawable.wd_sn850, "t5yC1PlhHJE"
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
Corsair RM850x 850W bu yuqori sifatli, kuchli va ishonchli quvvat manba (PSU) bo‘lib, odatda yuqori talablar qo‘yilgan kompyuter tizimlari uchun mo‘ljallangan. Quyida uning asosiy xususiyatlari va foydali jihatlari keltirilgan:

Asosiy xususiyatlari:
Quvvat:

850 watt quvvat bilan ta'minlaydi, bu esa yuqori darajadagi GPU (grafik kartalar) va boshqa komponentlarga ega tizimlar uchun yetarli hisoblanadi.
Effektivlik:

80 PLUS Gold sertifikatiga ega, ya'ni energiya samaradorligi yuqori (90% dan ortiq). Bu kamroq elektr energiyasi isrof bo‘lishini va issiqlik hosil bo‘lishini ta'minlaydi.
Modulyar kabel tizimi:

To‘liq modulyar dizayn, ya'ni faqat kerakli kabellarni ulasangiz bo‘ladi. Bu kabelni boshqarishni osonlashtiradi va korpus ichida tartibni saqlaydi.
Fan tizimi:

Zero RPM Mode: Quvvat bloki past yuk ostida ishlaganda fani o‘chadi, bu esa mutlaqo sokin ishlashni ta'minlaydi.
Fani 135 mm diametrli, yuqori samaradorlikka ega va sovutishda qulay.
Kafolat:

10 yillik kafolat bilan birga keladi, bu Corsair mahsulotlarining ishonchliligini ko‘rsatadi.
Himoya tizimlari:

Haddan tashqari kuchlanish, qisqa tutashuv va boshqa elektr muammolardan himoya qilish uchun bir nechta xavfsizlik funksiyalari mavjud.
Moslik:

ATX12V 2.4 va EPS12V 2.92 standartlariga mos keladi. Zamonaviy va eski tizimlar uchun moslashuvchan.
Foydalanish uchun moslik:
Gamerlar va kontent yaratuvchilar: Yuqori darajadagi grafik kartalar (RTX 4090 kabi) va kuchli protsessorlar (Intel Core i9 yoki AMD Ryzen 9) bilan ishlaydigan tizimlar uchun ideal.
Ish stansiyalari: Ko‘p yadroli protsessorlar va bir nechta GPU ishlatiladigan tizimlar uchun.
Overklok qilish uchun: Barqaror energiya ta'minoti tufayli overklok qilish uchun qulay.
Afzalliklari:
Sokin ishlash.
Yoqimli dizayn va modulyarlik.
Ishonchli energiya ta'minoti.
Uzoq kafolat muddati.
Kamchiliklari:
Narxi nisbatan yuqoriroq bo‘lishi mumkin, lekin sifatga mos.
Fani yuqori yuklama ostida biroz shovqinli bo‘lishi mumkin.
Agar kuchli va barqaror tizim qurmoqchi bo‘lsangiz, Corsair RM850x 850W yaxshi tanlov bo‘ladi.                    """,
                            R.drawable.rm850x, "0ZbaQ9XAiWM"
                        ),
                        pc_model(
                            "Corsair TX650M 650W", """
Corsair TX650M 650W bu o‘rta darajadagi, yuqori sifatli yarim modulyar (semi-modular) quvvat manba (PSU) bo‘lib, samarali ishlash va ishonchlilikni ta’minlash uchun mo‘ljallangan. Ushbu model asosan o‘rta darajadagi kompyuter tizimlari uchun mos keladi. Quyida TX650M haqida batafsil ma'lumot berilgan:

Asosiy xususiyatlari:
Quvvat:

650 watt quvvat bilan ta’minlaydi, bu o‘rta darajadagi grafik kartalar (RTX 3060 yoki AMD RX 6700 XT kabi) va protsessorlarni ishlatish uchun yetarli.
Effektivlik:

80 PLUS Gold sertifikati: Bu yuqori samaradorlikni anglatadi (taxminan 87-90%). Bu tizimning samarali ishlashini va elektr energiyasini tejashni ta’minlaydi.
Yarim modulyar dizayn:

Faqat kerakli kabellarni ulash imkonini beradi, bu esa kabel tartibotini yaxshilaydi va korpus ichidagi havo aylanishini oshiradi. Ba’zi asosiy kabellar (masalan, anakart va protsessor quvvat kabellari) oldindan o‘rnatilgan.
Fan tizimi:

120 mm fani yuqori samaradorlikka ega va sokin ishlash uchun mo‘ljallangan.
Past yuklamada fani juda sokin ishlaydi, yuqori yuklamada esa samarali sovutish ta’minlanadi.
Himoya tizimlari:

Haddan tashqari kuchlanish (OVP), qisqa tutashuv (SCP), haddan tashqari quvvat (OPP) va haddan tashqari haroratdan (OTP) himoya qilish funksiyalari mavjud.
Kafolat:

7 yillik kafolat bilan keladi, bu ishonchlilik va uzoq muddat foydalanishni ta’minlaydi.
Moslik:

ATX12V v2.4 va EPS12V 2.92 standartlari bilan mos.
Zamonaviy komponentlar va platformalar bilan ishlashga moslashuvchan.
Foydalanish uchun moslik:
O‘rta darajadagi o‘yin tizimlari: RTX 3060, RX 6700 XT yoki undan past darajadagi grafik kartalar uchun ideal.
Ish stollari: Kundalik foydalanish yoki o‘rtacha darajadagi ish stansiyalari uchun.
Energiya samaradorligi: Elektr energiyasi tejashni istagan foydalanuvchilar uchun yaxshi tanlov.
Afzalliklari:
Yarim modulyar dizayn: Kabelni boshqarishni osonlashtiradi.
Sokin ishlash: Yuklamaga qarab fanning aylanma tezligi.
Ishonchlilik: Uzun kafolat muddati va yuqori sifatli komponentlar.
Narxi: 850W modelga nisbatan arzonroq.
Kamchiliklari:
To‘liq modulyar dizaynga ega emas, ya’ni oldindan o‘rnatilgan kabellar bo‘lishi mumkin.
Juda yuqori darajadagi tizimlar yoki ikki GPU konfiguratsiyalari uchun mos emas.                    """,
                            R.drawable.tx650m, "ZhSjL6FsBgw"
                        )
                    )

                ),

                )
        )

        val coolingModels = main_model(
            "Cooling Systems", arrayListOf(
                brand_model(
                    "NZXT", arrayListOf(
                        pc_model(
                            "NZXT Kraken X63 280mm", """
NZXT Kraken X63 280mm — bu yuqori darajadagi, suyuqlik yordamida sovutish tizimiga ega bo‘lgan CPU sovutgichi bo‘lib, samaradorlik va estetikani birlashtirgan. U yuqori darajadagi protsessorlarni samarali sovutish uchun mo‘ljallangan va o‘yin tizimlari hamda overklok qilishni maqsad qilgan foydalanuvchilar uchun ideal tanlovdir.

Asosiy xususiyatlari:
Radiator o‘lchami:

280 mm radiator (280 x 123 x 30 mm) katta sovutish yuzasiga ega, bu yuqori samaradorlik bilan issiqlikni tarqatadi.
Fanlar:

2 dona Aer P120 mm fanlari bilan jihozlangan. Ushbu fanlar yuqori bosim va yaxshi havo oqimini ta’minlash uchun maxsus ishlab chiqilgan.
Tezlik: 500-1800 RPM (±300 RPM).
Shovqin darajasi: 21-38 dBA, sokin ishlash uchun mo‘ljallangan.
Nasos:

Zamonaviy dizayn va RGB yoritish bilan jihozlangan.
Nasos tezligi: 800-2800 RPM.
Yoritish sozlash uchun NZXT CAM dasturi ishlatiladi, bu orqali siz RGB effektlarini boshqarishingiz va real vaqtda haroratni kuzatishingiz mumkin.
RGB yoritish:

Nasosdagi RGB yoritish ajoyib ko‘rinish beradi va shaxsiylashtirish imkonini beradi.
Infinity Mirror dizayni: yoritish chuqurlik hissi beradi.
Quvvat sarfi:

Nasos: 12V, 0.3A.
Fan: 12V, 0.32A.
Moslik:

Zamonaviy protsessorlar uchun keng qo‘llab-quvvatlash mavjud.
Intel soketlari: LGA 1151, LGA 1200, LGA 1700, va LGA 2066.
AMD soketlari: AM4 va AM5.
Quvvat ulanishi:

PWM konnektor orqali boshqariladi.
Suv nasosining ishlashi kuchlanish va haroratga qarab avtomatik sozlanadi.
Foydalanish uchun moslik:
Overklok qiluvchi foydalanuvchilar: Yuqori haroratda ishlaydigan protsessorlar uchun ideal.
O‘yin tizimlari: Yirik grafik kartalar va yuqori darajadagi CPU bilan ishlaydigan o‘yin tizimlari uchun.
Estetikani qadrlovchilar: RGB yoritilishi va zamonaviy dizayni tufayli chiroyli ko‘rinishni istagan foydalanuvchilar uchun.
Afzalliklari:
Yuqori sovutish samaradorligi: Haroratni past darajada ushlab turadi, hatto yuqori yuklamada ham.
Sokin ishlash: Past shovqin darajasi.
RGB sozlash: Yoritishni oson boshqarish imkoniyati.
Oson o‘rnatish: Yaxshi moslashuvchan o‘rnatish tizimi.
Kamchiliklari:
Narxi: Boshqa havo sovutgichlarga nisbatan qimmatroq.
Dasturiy ta’minotga bog‘liqlik: RGB va monitoring uchun NZXT CAM dasturidan foydalanish zarur.
Katta o‘lcham: Kichik korpuslarga mos kelmasligi mumkin.
Xulosa:
NZXT Kraken X63 280mm — yuqori sifatli sovutish tizimi bo‘lib, zamonaviy o‘yin va ish stansiyalari uchun mo‘ljallangan. Agar siz yuqori samaradorlik, sokin ishlash va chiroyli RGB yoritishni qadrlasangiz, bu model siz uchun ideal tanlovdir. Lekin tizimingizga mos kelishini tekshirish uchun korpusning radiator uchun joyiga e’tibor bering.                    """,
                            R.drawable.karaken_x63, "b0ui0cZLx5o"
                        ),
                        pc_model(
                            "NZXT Aer RGB 2 120mm", """
NZXT Aer RGB 2 120mm — bu yuqori sifatli RGB yoritishga ega bo‘lgan sovutish fani bo‘lib, estetik ko‘rinish va havo sovutish samaradorligini birlashtiradi. Ushbu fan, asosan, o‘yin tizimlari, RGB yoritishga ahamiyat beruvchi foydalanuvchilar va sovutish tizimini yaxshilashni istaganlar uchun mo‘ljallangan.

Asosiy xususiyatlari:
O‘lcham va dizayn:

Fan o‘lchami: 120 x 120 x 26 mm.
Dinamik va zamonaviy dizayn, RGB yoritish uchun maxsus ishlab chiqilgan.
RGB yoritish:

Dasturlashtiriladigan RGB LED-lar: 8 dona LED-lar yoritish effektlarini boshqarish imkonini beradi.
RGB effektlarini sozlash va boshqarish uchun NZXT CAM dasturi ishlatiladi.
Infinity Mirror RGB dizayni ajoyib ko‘rinish hosil qiladi.
Ishlash parametrlari:

Tezlik: 500-1500 RPM (±300 RPM).
Havo oqimi: Maksimal 17.48-52.44 CFM.
Statik bosim: 0.15-1.35 mm-H2O.
Shovqin darajasi: 22-33 dBA (nisbatan sokin ishlash).
Podshipnik turi:

Fluid Dynamic Bearing (FDB): Uzoq muddatli ishlashni va sokin harakatni ta'minlaydi.
Moslik:

NZXT RGB & Fan Controller bilan mos keladi.
NZXT Kraken suyuqlik sovutgichlari va boshqa NZXT komponentlari bilan yaxshi ishlaydi.
Ulanuvchi interfeys:

4-pin PWM konnektor (ventilyator uchun).
RGB ulanish uchun NZXT HUE 2 yoki NZXT RGB va Fan Controller talab qilinadi.
Foydalanish uchun moslik:
O‘yin tizimlari: RGB yoritishga ega bo‘lgan ajoyib ko‘rinish uchun.
Korpus ichini sovutish: Havo aylanishini yaxshilash uchun qo‘shimcha fan sifatida.
Estetikani qadrlovchilar: RGB yoritish bilan chiroyli ko‘rinishni xohlovchilar uchun.
Afzalliklari:
Chiroyli RGB yoritish: Infinity Mirror dizayn ajoyib RGB effektlarini taqdim etadi.
Sokin ishlash: Shovqin darajasi past va barqaror ishlashga ega.
Yuqori sifatli podshipnik: Uzoq muddatli ishlash va sokin harakatni ta’minlaydi.
O‘rnatish oson: Korpusning ko‘plab turlariga mos keladi.
Kamchiliklari:
RGB boshqaruvi uchun qo‘shimcha qurilmalar kerak bo‘lishi mumkin: HUE 2 yoki NZXT RGB & Fan Controller talab qilinadi.
Narxi: Oddiy fanlarga nisbatan qimmatroq.
RGB moslik: Faqat NZXT ekotizimiga yaxshi mos keladi.
Xulosa:
NZXT Aer RGB 2 120mm — sovutish va estetikani birlashtirgan premium darajadagi fan. Agar siz RGB yoritishga e’tibor beradigan o‘yin yoki ish stansiyasiga ega bo‘lsangiz va NZXT ekotizimiga ega bo‘lishni rejalashtirsangiz, bu fan yaxshi tanlov bo‘ladi. U chiroyli dizayn, sokin ishlash va yaxshi sovutish samaradorligini ta'minlaydi.
                    """,
                            R.drawable.nzxt_rgb, "MT86cUg__dE"
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
Creative Sound BlasterX AE-5 — bu yuqori sifatli ichki ovoz kartasi bo‘lib, o‘yin o‘ynash va audiofil darajadagi musiqa tinglash uchun mo‘ljallangan. U kuchli DAC (Digital-to-Analog Converter), moslashtiriladigan RGB yoritish va kengaytirilgan ovoz texnologiyalari bilan ajralib turadi.

Asosiy xususiyatlari:
Ovoz protsessorlari:

Sound Core3D: Audio qayta ishlash uchun to‘rt yadroli protsessor.
Xamp: Har bir quloqchin kanali uchun maxsus kuchaytiruvchi.
DAC (raqamdan analogga aylantiruvchi):

ESS Sabre32 Ultra Class 122dB DAC: 32-bit/384 kHz formatni qo‘llab-quvvatlaydi.
Studiya darajasidagi audio sifati bilan aniq va keng dinamik diapazonni ta’minlaydi.
Ovoz texnologiyalari:

Scout Mode: O‘yinlarda dushmanning qadam tovushlarini aniqlash uchun ovozlarni boshqacha eshittiradi.
5.1 va 7.1 Surround Sound: Simulyatsiya qilingan ko‘pkanalli ovoz.
SBX Pro Studio: Ovoz effektlarini sozlash imkonini beradi.
RGB yoritish:

Aurora Reactive Lighting System: 16.8 million rangli sozlanadigan yoritishga ega.
Moslashtiriladigan yoritish effektlari va sinxronlashtirish imkoniyati mavjud.
Quloqchinlar va dinamiklar uchun imkoniyatlar:

Yuqori impedansli (600Ω gacha) quloqchinlarni ishlatish imkoniyati.
Dinamik yoki quloqchin rejimiga avtomatik moslashadi.
Ulanuvchi interfeys:

PCIe x1 ulanish.
Optik (TOSLINK) chiqish va 3.5 mm analog chiqish portlari.
Ovoz sifati:

Signal-shovqin nisbati (SNR): 122 dB, bu juda past shovqinli audio eshittirishni ta’minlaydi.
Afzalliklari:
Yuqori sifatli audio: 32-bit/384 kHz format bilan studiya darajasidagi ovoz sifati.
Kuchli quloqchin kuchaytirgich: Yuqori impedansli quloqchinlarni ishlatish imkonini beradi.
RGB yoritish: Korpus ichida ajoyib vizual effektlar yaratadi.
Scout Mode: O‘yinlar uchun maxsus tovush optimallashtirish.
Moslashuvchanlik: Dinamiklar va quloqchinlar o‘rtasida avtomatik o‘tish.
Kamchiliklari:
Narxi: Oddiy foydalanuvchilar uchun nisbatan qimmat.
PCIe joylashuvi: Faqat ichki tizimlarga mos keladi, tashqi qurilma sifatida ishlatilmaydi.
RGB yoritish: Ayrim foydalanuvchilar uchun ortiqcha bo‘lishi mumkin.
Foydalanish uchun moslik:
O‘yin o‘ynovchilar: Maxsus Scout Mode va Surround Sound tajribasi bilan o‘yinlar uchun ideal.
Audiofillar: Yuqori sifatli ovoz va kuchli DAC tufayli musiqa tinglash uchun zo‘r tanlov.
Kreativ ishlar: Video yoki audio tahrirlash bilan shug‘ullanuvchilar uchun ham mos.
Xulosa:
Creative Sound BlasterX AE-5 — yuqori sifatli ovoz tajribasini taqdim etuvchi premium ichki ovoz kartasi. Agar siz o‘yinlar, musiqa yoki kreativ ishlarda yuqori darajadagi ovoz sifati va estetikani xohlasangiz, bu model ajoyib tanlovdir. RGB yoritish va Scout Mode kabi qo‘shimcha funksiyalar uni o‘yin ixlosmandlari uchun yanada jozibador qiladi.






                    """,
                            R.drawable.ae5, "M0mS0zniSvk"
                        ),
                        pc_model(
                            "Creative Sound Blaster Z", """
                    Creative Sound Blaster Z – a great mid-range sound card for immersive audio...
                    """,
                            R.drawable.zse, "PDg030fi22k"
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
TP-Link Archer T6E — bu yuqori tezlikdagi simsiz Wi-Fi adapter bo‘lib, stasionar kompyuterlarga Wi-Fi ulanishi qo‘shish yoki mavjud Wi-Fi ulanishini yaxshilash uchun ishlatiladi. U ikki diapazonli Wi-Fi-ni qo‘llab-quvvatlaydi va kompyuteringizni simsiz ulanish imkoniyatlari bilan ta’minlaydi.

Asosiy xususiyatlari:
Wi-Fi texnologiyasi:

AC1200 standarti: IEEE 802.11ac-ni qo‘llab-quvvatlaydi, bu avvalgi Wi-Fi texnologiyalariga nisbatan tezroq va samaraliroq.
Ikki diapazonli tarmoq:
2.4 GHz: 300 Mbps gacha tezlik.
5 GHz: 867 Mbps gacha tezlik, yuqori tezlikdagi ishlar (video uzatish, o‘yinlar) uchun mos.
Diapazon va qamrov:

Ikki antenna yordamida kengroq qamrov va signal barqarorligini ta’minlaydi.
Interface:

PCI Express (PCIe) interfeysi orqali oson o‘rnatiladi.
Sovutish tizimi:

Passiv radiator: Ovozsiz sovutish va uzoq muddatli ishlashni ta'minlaydi.
Shifrlash va xavfsizlik:

WPA/WPA2 shifrlash: Simsiz tarmoq xavfsizligini ta’minlaydi.
Operatsion tizim qo‘llab-quvvatlash:

Windows 7/8/8.1/10 (64-bit va 32-bit versiyalar).
Afzalliklari:
Tezlik: Yangi AC texnologiyasi tufayli yuqori tezlikdagi Wi-Fi ulanishi.
Ikki diapazon: Bir vaqtning o‘zida bir nechta qurilmalarga ulanish uchun moslashuvchanlik.
Oddiy o‘rnatish: PCIe interfeysi va oson drayver o‘rnatish jarayoni.
Barqaror signal: Ikki antenna yordamida kengroq qamrov.
Tinch ishlash: Passiv sovutish tizimi ovoz chiqarishni minimallashtiradi.
Kamchiliklari:
Faqat stasionar kompyuterlar uchun: Noutbuk yoki boshqa qurilmalarda ishlatish uchun mos emas.
Wi-Fi 6 yo‘qligi: Zamonaviy Wi-Fi 6 texnologiyasini qo‘llab-quvvatlamaydi.
MacOS yoki Linux qo‘llab-quvvatlanmaydi.
Foydalanish uchun moslik:
Uy va ofis: Oddiy internet ishlatish, video ko‘rish va tarmoqdagi fayllarga ulanish uchun ideal.
O‘yin o‘ynash: Past ping va yuqori tezlikni talab qiluvchi o‘yinlar uchun mos.
Video oqimlari: 4K video oqimlarini uzatish uchun yetarli tezlik.
Xulosa:
TP-Link Archer T6E — yuqori tezlikdagi va ikki diapazonli Wi-Fi ulanishi talab qilinadigan foydalanuvchilar uchun yaxshi tanlovdir. U AC1200 texnologiyasi yordamida barqaror va tezkor ulanishni ta’minlaydi. Agar siz stasionar kompyuteringizga simsiz tarmoq qo‘shishni xohlasangiz va zamonaviy imkoniyatlarga ega bo‘lishni istasangiz, ushbu adapter ajoyib variant hisoblanadi.






                    """,
                            R.drawable.archer_t6e, "1_ThSS0_IPI"
                        ),
                        pc_model(
                            "TP-Link TG-3468", """
TP-Link TG-3468 — bu gigabit tezlikdagi ichki tarmoq kartasi bo‘lib, stasionar kompyuterlarga yuqori tezlikdagi simli Ethernet ulanishini ta’minlash uchun mo‘ljallangan. U gigabit tarmoq infratuzilmasi bilan ishlashda tezlik va barqarorlikni oshiradi.

Asosiy xususiyatlari:
Gigabit Ethernet:

10/100/1000 Mbps tezlikni qo‘llab-quvvatlaydi, yuqori tezlikdagi internet ulanishi uchun ideal.
Interfeys:

PCI Express (PCIe): Zamonaviy stasionar kompyuterlar uchun tezkor va barqaror ulanishni ta’minlaydi.
Tarmoq standartlari:

IEEE 802.3, 802.3u, 802.3ab: 10Base-T, 100Base-TX, va 1000Base-T protokollarini qo‘llab-quvvatlaydi.
Qo‘shimcha funksiyalar:

Wake-on-LAN: Kompyuterni tarmoq orqali masofadan uyg‘otish imkoniyati.
Auto Negotiation: Tarmoq tezligini avtomatik ravishda moslashtirish.
Flow Control (802.3x): Tarmoqdagi ma’lumot oqimini boshqarish.
Drayver qo‘llab-quvvatlash:

Operatsion tizimlar: Windows 10/8.1/8/7/Vista/XP, Linux va boshqa operatsion tizimlar uchun mos.
Dizayn:

Kompakt va oddiy dizaynga ega, ko‘pchilik stasionar kompyuterlarda o‘rnatish uchun qulay.
Afzalliklari:
Yuqori tezlik: Gigabit Ethernet bilan katta hajmdagi ma’lumotlarni tezda uzatish imkoniyati.
Barqarorlik: Simli ulanish tufayli barqaror va ishonchli tarmoq sifati.
Keng qo‘llab-quvvatlash: Ko‘plab operatsion tizimlar uchun mos.
Oson o‘rnatish: PCIe interfeysi va avtomatik sozlash funksiyasi.
Arzon narx: Gigabit Ethernet imkoniyatlarini minimal xarajat bilan ta’minlaydi.
Kamchiliklari:
Faqat simli ulanish: Wi-Fi funksiyasi yo‘q, faqat Ethernet kabeli bilan ishlaydi.
Qo‘shimcha portlar yo‘qligi: Faqat bitta Ethernet porti mavjud.
Limited use case: Asosan yuqori tezlikdagi simli ulanish talab qiladigan foydalanuvchilar uchun.
Foydalanish uchun moslik:
Uy yoki ofis tarmog‘i: Kompyuterni gigabit tezlikdagi simli tarmoqqa ulash uchun.
Server yoki NAS qurilmalari: Ma’lumotlar uzatish tezligini oshirish uchun.
Gamerlar: Barqaror internet ulanish talab qiluvchi foydalanuvchilar uchun.
Korporativ muhit: Barqaror va tezkor tarmoq ulanishi kerak bo‘lgan ofislar uchun mos.
Xulosa:
TP-Link TG-3468 — bu oddiy, ishonchli va arzon gigabit Ethernet tarmoq kartasi. U yuqori tezlik, barqarorlik va keng moslashuvchanligi tufayli uy foydalanuvchilari, o‘yinchilar, va korporativ muhit uchun ideal tanlovdir. Agar siz simli tarmoq orqali yuqori tezlikdagi internet ulanishni ta’minlashni istasangiz, ushbu model juda yaxshi variant hisoblanadi.                    """,
                            R.drawable.tg3468, "XwY0KDNUOAg"
                        )
                    )
                )
            )
        )


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
            // Add other parts here
        )

        val monitorModels = main_model(
            "Monitor", arrayListOf(
                brand_model(
                    "Samsung", arrayListOf(
                        pc_model(
                            "Samsung Odyssey G7", """
                   Samsung Odyssey G7 — bu yuqori sifatli, o‘yin o‘ynash uchun mo‘ljallangan monitor bo‘lib, uning texnik ko‘rsatkichlari professional o‘yinchilar va grafik dizaynerlar uchun ideal. Monitor yuqori yangilanish tezligi, past kechikish va kavisli dizayni bilan ajralib turadi.

Asosiy xususiyatlari:
Ekran o‘lchami va turi:

27 yoki 32 dyuym: Katta ekran hajmi immersiv o‘yin tajribasi uchun.
Kavisli panel: 1000R egiluvchanligi inson ko‘zining tabiiy egiluvchanligiga moslashtirilgan bo‘lib, chuqurroq sho‘ng‘ish hissini beradi.
Matritsa va aniqlik:

QLED texnologiyasi: Ranglar aniq va jonli ko‘rinadi.
WQHD aniqlik: 2560 × 1440 piksel, Full HD’dan ikki baravar yuqori aniqlik.
Yangilanish tezligi:

240 Hz: Yuqori yangilanish tezligi silliq va burilishsiz o‘yin tajribasini ta’minlaydi.
1ms javob vaqti (GTG): Sekin harakatlanuvchi sahnalarda ham tiniq tasvir.
Adaptive Sync texnologiyasi:

NVIDIA G-SYNC va FreeSync Premium Pro: Tearing va stuttering muammolarini oldini olishga yordam beradi.
HDR:

HDR600: Yorqinlik va kontrast darajalari aniq va dinamik tasvirlarni yaratadi.
Dizayn va ulanish imkoniyatlari:

RGB yoritish: Monitorning orqa qismida sozlanadigan RGB yoritish mavjud.
Portlar: DisplayPort 1.4, HDMI 2.0, va USB 3.0 portlari bilan jihozlangan.
Ko‘zni himoya qilish texnologiyasi:

Flicker-Free: Ko‘z charchashini kamaytirish.
Eye Saver Mode: Ko‘k rangli nurlarni kamaytiradi.
Afzalliklari:
240 Hz va 1ms javob vaqti: Tezkor o‘yinlar uchun ideal.
1000R kavisli dizayn: Haqiqiy immersiv tajriba.
HDR600 va WQHD: Yuqori aniqlikdagi va yorqin tasvirlar.
G-SYNC va FreeSync: Silliq o‘yin tajribasi.
Modern dizayn: RGB yoritish va premium ko‘rinish.
Kamchiliklari:
Narxi: Bozordagi boshqa monitorlarga nisbatan qimmat.
HDMI cheklovi: HDMI orqali faqat 144 Hz qo‘llab-quvvatlanadi (240 Hz uchun DisplayPort talab qilinadi).
Katta hajmi: Har bir foydalanuvchi uchun mos bo‘lavermaydi.
Foydalanish uchun moslik:
O‘yin ixlosmandlari: Yuqori yangilanish tezligi va aniq tasvirlar sababli.
Grafik dizaynerlar va videomontajchilar: HDR va rang aniqligi tufayli.
Ko‘p vazifali ishlovchilar: Katta ekran hajmi bir vaqtning o‘zida bir nechta vazifalarni bajarishga imkon beradi.
Xulosa:
Samsung Odyssey G7 — bu o‘yin ixlosmandlari va grafik ishlar bilan shug‘ullanuvchilar uchun ideal yuqori sifatli monitor. U yuqori texnologiyalar, immersiv dizayn va mukammal ishlash ko‘rsatkichlari bilan ajralib turadi. Agar siz premium o‘yin tajribasini istasangiz yoki sifatli tasvirni qadrlasangiz, ushbu monitor juda yaxshi tanlov bo‘ladi.
    """,
                            R.drawable.odysseyg7, "oQ3doVZuPPk"
                        ),
                        pc_model(
                            "Samsung U28E590D", """
                  Samsung U28E590D — bu yuqori aniqlikdagi (4K) monitor bo‘lib, ish samaradorligini oshirish, o‘yin o‘ynash va multimedia kontenti bilan ishlash uchun mo‘ljallangan. Ushbu monitor o‘zining rang aniqligi, yuqori aniqligi va keng ko‘lamli foydalanish imkoniyatlari bilan ajralib turadi.

Asosiy xususiyatlari:
Ekran o‘lchami va aniqligi:

28 dyuym: Katta hajmdagi ish va o‘yin muhiti uchun.
4K UHD aniqlik: 3840 × 2160 piksel, yuqori aniqlikdagi tasvirlar va mayda detallarni aniq ko‘rsatadi.
Matritsa turi:

TN panel: Tez javob vaqti, lekin IPS panellarga qaraganda torroq ko‘rish burchaklari.
Rang aniqligi:

1 milliard rang: Ranglarni aniq va jonli ko‘rsatadi, grafik dizaynerlar va video tahrirchilari uchun mos.
10-bit rang chuqurligi: Sof va silliq rang o‘tishlarini ta’minlaydi.
Yangilanish tezligi va javob vaqti:

60 Hz yangilanish tezligi: Oddiy ofis ishi va multimedia uchun yetarli.
1ms javob vaqti (GTG): Tezkor harakatlanuvchi sahnalarda aniqlikni saqlaydi.
AMD FreeSync texnologiyasi:

O‘yinlarda tearing va stuttering muammolarini kamaytiradi.
Ulanish imkoniyatlari:

Portlar: 2 × HDMI 2.0, 1 × DisplayPort 1.2.
Bir nechta qurilmalarni ulash imkonini beradi.
Dizayn:

Minimalistik va zamonaviy dizayn, nozik ramkalar va mustahkam stend.
Qo‘shimcha funksiyalar:

Picture-by-Picture (PBP): Bir vaqtning o‘zida ikkita qurilma ekranini ko‘rsatish.
Picture-in-Picture (PIP): Bir qurilma ekranini kichikroq oynada ko‘rsatish.
Afzalliklari:
4K UHD aniqligi: Mayda detallarni tiniq va yuqori sifatda ko‘rsatadi.
1ms javob vaqti: Tez harakatlanuvchi tasvirlar uchun mos.
Rang aniqligi: 1 milliard rang va 10-bit rang chuqurligi tufayli ranglar realistik ko‘rinadi.
Ko‘p vazifa uchun mos: PBP va PIP funksiyalari bir vaqtning o‘zida bir nechta ishlarni bajarishga imkon beradi.
AMD FreeSync: O‘yin tajribasini silliq qiladi.
Kamchiliklari:
TN panel: IPS yoki VA panellarga qaraganda torroq ko‘rish burchaklari va rang ko‘rsatish qobiliyati pastroq.
60 Hz yangilanish tezligi: Professional o‘yin o‘ynash uchun pastroq bo‘lishi mumkin.
Ergonomik sozlashlar yo‘qligi: Stend faqat egilishni qo‘llab-quvvatlaydi (balandlik yoki aylanish sozlanmaydi).
Foydalanish uchun moslik:
Ofis ishi va ko‘p vazifali ishlovchilar: Katta ekran hajmi va PBP/PIP funksiyalari samaradorlikni oshiradi.
Multimedia kontenti: 4K aniqlik va rang aniqligi tufayli video tomosha qilish va tahrirlash uchun mos.
O‘yinlar: Casual o‘yinchilar uchun mos, lekin professional o‘yinchilar uchun yangilanish tezligi pastroq bo‘lishi mumkin.
Xulosa:
Samsung U28E590D — bu yuqori sifatli 4K monitor bo‘lib, rang aniqligi va mayda detallarni aniq ko‘rsatishi tufayli grafik ishlovchilar va multimedia foydalanuvchilari uchun ajoyib tanlovdir. O‘yin o‘ynash yoki ko‘p vazifali ishlov berish uchun mos bo‘lsa-da, yangilanish tezligi va TN panel cheklovlarini hisobga olish kerak. Agar siz byudjetga mos 4K monitor qidirayotgan bo‘lsangiz, ushbu model yaxshi variant bo‘lishi mumkin.    """,
                            R.drawable.u28e590d, "J4iEZSHkN00"
                        )
                    )
                ),
                brand_model(
                    "LG", arrayListOf(
                        pc_model(
                            "LG 27GN950-B", """
                LG 27GN950-B — bu yuqori sifatli, o‘yin o‘ynash va professional ishlash uchun mo‘ljallangan 27 dyuymli 4K UHD monitor. LG ning "Nano IPS" texnologiyasi, yuqori yangilanish tezligi, past kechikish va ranglarni aniq ko‘rsatish kabi xususiyatlari bilan ajralib turadi. Bu monitor yuqori darajadagi o‘yin tajribasini ta’minlashga mo‘ljallangan va o‘zining yuqori sifatli ekran texnologiyalari bilan ko‘plab foydalanuvchilarni qoniqtiradi.

Asosiy xususiyatlari:
Ekran o‘lchami va aniqligi:

27 dyuym: Katta ekran hajmi va 4K UHD (3840 × 2160) aniqlik bilan silliq va aniq tasvirlar.
Matritsa turi:

Nano IPS panel: Ranglar aniq, jonli va to‘liq qoplash bilan tasvirlar ko‘rsatiladi. IPS paneli keng ko‘rish burchaklari va yuqori rang aniqligi bilan ajralib turadi.
Yangilanish tezligi va javob vaqti:

144 Hz yangilanish tezligi: Yuqori yangilanish tezligi tez harakatlanuvchi sahnalarda silliq o‘yin tajribasini ta’minlaydi.
1ms javob vaqti (GTG): Tezkor harakatlarda tasvirni aniqlik bilan ko‘rsatadi.
Rang aniqligi:

98% DCI-P3 va 135% sRGB: Keng rang gammasi tufayli professional grafik dizayn va video tahrirlash uchun mos.
HDR10: Yuqori dinamik diapazon (HDR) va ranglarni yaxshilash uchun HDR10 qo‘llab-quvvatlanadi.
Adaptive Sync texnologiyasi:

NVIDIA G-SYNC uyumlashuvi: Tearing va stuttering muammolarini oldini olish uchun.
AMD FreeSync Premium Pro: Silliq o‘yin tajribasini ta’minlaydi.
Portlar va ulanish imkoniyatlari:

Portlar: 2 × HDMI 2.0, 1 × DisplayPort 1.4, 1 × USB 3.0.
Bir nechta qurilmani bir vaqtda ulash imkonini beradi.
Dizayn:

Slim bezels: Yaxshi vizual tajriba uchun minimal ramkalar.
Ergonomik sozlashlar: Balandlikni sozlash, egilish va burish imkoniyatlari bilan maksimal qulaylik.
Afzalliklari:
144 Hz yangilanish tezligi va 1ms javob vaqti: O‘yinlarda silliq va tezkor tajriba.
Nano IPS panel va HDR10: Yuqori rang aniqligi va jozibador tasvirlar.
Keng rang gammasi: Grafik dizayn va video tahrir qilish uchun yuqori sifatli ranglar.
G-SYNC va FreeSync: Silliq o‘yin tajribasi uchun uyumlashuv texnologiyalari.
Ergonomik dizayn: Balandlikni sozlash, burish va egilish imkoniyatlari.
Kamchiliklari:
Narxi: Bozordagi o‘xshash modellarga nisbatan yuqori narx.
HDR10 cheklovlari: HDR ko‘rsatilishi bo‘lsa-da, eng yuqori darajadagi HDR tajribasini taklif qilmaydi.
HDMI 2.0: 4K 144 Hz tezlikni faqat DisplayPort orqali qo‘llab-quvvatlaydi.
Foydalanish uchun moslik:
O‘yin ixlosmandlari: 144 Hz yangilanish tezligi va past kechikish tufayli yuqori darajadagi o‘yin tajribasi uchun mos.
Grafik dizaynerlar va videomontajchilar: Nano IPS paneli va yuqori rang aniqligi tufayli.
Keng ekranli monitorlar izlovchilari: Ultra aniqlik va keng ko‘rish burchaklari bilan ko‘p vazifali ishlovchilar uchun.
Xulosa:
LG 27GN950-B — bu yuqori sifatli 4K UHD o‘yin monitori, yuqori yangilanish tezligi, rang aniqligi va silliq o‘yin tajribasini ta’minlaydi. Nano IPS texnologiyasi va HDR10 qo‘llab-quvvatlashi tufayli u grafik dizayn va video tahrir qilish uchun ham mos keladi. Agar siz yuqori darajadagi o‘yin tajribasi yoki professional ishlov berish uchun monitor izlayotgan bo‘lsangiz, bu model juda yaxshi tanlov bo‘ladi.    """,
                            R.drawable.lg_27gn950, "_vhmFI8shAE"
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
                Logitech G Pro X Superlight — bu o‘yin uchun mo‘ljallangan simsiz sichqoncha bo‘lib, o‘yinchilarga yuqori aniqlik, tezkor javob va o‘yin davomida qulaylikni ta’minlashga qaratilgan. Logitech G Pro X Superlight engil vazni, yuqori sifatli sensori va professional o‘yinchilar uchun mos dizayni bilan ajralib turadi.

Asosiy xususiyatlari:
Simsiz ulanish:

Lightspeed simsiz texnologiyasi: Tezkor va ishonchli simsiz ulanishni ta’minlaydi, sezilarli kechikishsiz o‘yin tajribasini yaratadi.
Sensor:

Hero 25K sensor: 25,600 DPI gacha bo‘lgan yuqori aniqlikdagi sensor, o‘yinchilar uchun aniq harakatlarni va tezkor javobni ta’minlaydi.
0.5 DPI gacha o‘zgartirish imkoniyati: O‘yinchilarga sezgirlikni aniq sozlash imkonini beradi.
Vazn:

Superlight dizayn: 63 gramm vazn bilan dunyodagi eng engil o‘yin sichqonchalaridan biri. Bu uzoq vaqt davomida qulaylikni ta’minlaydi va tezkor harakatlarni osonlashtiradi.
Batareya va yuklash:

70 soatgacha batareya muddati: Uzoq o‘yin sessiyalari uchun qoniqarli batareya muddati.
Simsiz quvvatlanish: Yuqori darajadagi simsiz ishlash uchun qulay.
Dizayn va materiallar:

Ergonomik dizayn: Foydalanuvchining qo‘l shakliga mos ravishda ishlab chiqilgan va uzoq vaqt davomida qulay ishlashni ta’minlaydi.
Maxsus tugmalar: Tugmalar yuqori darajadagi ishonchlilikni ta’minlash uchun maxsus materiallardan ishlab chiqilgan.
Soflik va sozlash imkoniyatlari:

G HUB dasturi bilan sozlash: Logitech G HUB dasturi orqali sichqonchaning barcha sozlamalarini o‘zgartirish, tugmalarni dasturlash va DPI darajasini sozlash mumkin.
Tugmalar va tuzilish:

6 ta dasturlanadigan tugmalar: O‘yinchilar uchun o‘zgartiriladigan tugmalar mavjud, bu esa o‘yin oynashni moslashtirish imkonini beradi.
Afzalliklari:
Yengil vazn: Superlight dizayn yuqori tezlikda harakat qilishni osonlashtiradi va uzoq o‘yin sessiyalarida qo‘lni charchatmaydi.
Hero 25K sensor: Yuksak aniqlik va o‘yinlarda maksimal sezgirlik ta’minlanadi.
Simsiz ulanish: Lightspeed texnologiyasi yordamida simsiz ulanishda hech qanday kechikish yoki muammo yo‘q.
Uzoq batareya muddati: 70 soatgacha ishlash imkoniyati uzoq o‘yin sessiyalarini ta’minlaydi.
Kamchiliklari:
Narxi: Logitech G Pro X Superlight yuqori sifatli simsiz sichqoncha bo‘lib, narxi bozorning o‘rtacha narxidan yuqoriroq.
Kamroq tugmalar: Ba'zi o‘yinchilar ko‘proq dasturlanadigan tugmalarni afzal ko‘rishlari mumkin, ammo bu modelda faqat 6 ta mavjud.
Maxsus dizayn: Ba'zi foydalanuvchilar uchun dizayn va vazn juda yengil bo‘lishi mumkin, ularning qulaylik xususiyatlarini o‘zgarishi mumkin.
Foydalanish uchun moslik:
O‘yin ixlosmandlari: Yuqori aniqlik, tezkor javob va engil vazn tufayli professional o‘yinchilar va o‘yin tajribasini yaxshilashni xohlaganlar uchun ideal.
Keng qo‘llaniladigan: O‘yin o‘ynashdan tashqari, uzoq vaqt davomida ishlov beradigan foydalanuvchilar uchun ham qulay.
Xulosa:
Logitech G Pro X Superlight — bu yengil va yuqori darajadagi simsiz o‘yin sichqonchasi, o‘yinchilar uchun yuqori aniqlik, tezkor javob va uzoq batareya muddatini ta’minlaydi. Agar siz yengil, yuqori sifatli va aniq o‘yin sichqonchasini qidirsangiz, bu model juda yaxshi tanlov bo‘ladi.






       """,
                            R.drawable.logitech_gpro, "zDNO-haOjPg"
                        ),
                        pc_model(
                            "Logitech MX Master 3", """
                  Logitech MX Master 3 — bu yuqori darajadagi simli va simsiz ishlash imkoniyatiga ega bo‘lgan, ayniqsa ofis ishchilari, dizaynerlar va professional foydalanuvchilar uchun mo‘ljallangan sichqoncha. Logitech MX Master 3 yuqori aniqlik, qulaylik va moslashuvchanlikni ta’minlaydi, shuningdek, uzluksiz ishlash va tezkor ko‘p vazifali faoliyat uchun keng imkoniyatlarga ega.

Asosiy xususiyatlari:
Simsiz ulanish:

Bluetooth va Unifying Receiver: Har qanday qurilmada ishlash imkoniyatini beradi. Unifying Receiver orqali bir nechta Logitech qurilmalarni bir vaqtning o‘zida ulash mumkin.
Simsiz ulanish: O‘zgartirish uchun faqat bir tugma bosilishi bilan bir nechta qurilma bilan ishlash imkonini beradi.
Sensor:

Darkfield 4000 DPI sensor: Har qanday yuzada ishlash imkoniyatini beradi, jumladan oynalar va shisha yuzalar.
DPI o‘zgartirish: DPI darajasini maxsus tugma orqali o‘zgartirish mumkin, bu esa aniqlikni moslashtirish imkoniyatini beradi.
Batareya va quvvatlanish:

Rechargeable lithium battery: Bir marta to‘liq zaryadlanganda 70 kungacha ishlash imkoniyati.
USB-C quvvatlanish: Tez va qulay zaryadlash imkoniyati.
Ergonomik dizayn:

Ergonomik shakl: Qulay ushlash va uzoq vaqt davomida ishlash uchun moslashtirilgan.
Yumshoq naqshli materiallar: Qo‘llarga qulay va uzun vaqt davomida ishlash uchun mos.
Ko‘p vazifali tugmalar:

6 ta dasturlanadigan tugma: Qo‘shimcha funksiyalar uchun sozlanishi mumkin.
Scroll Wheel (Magnetic scrolling): Tez va aniq aylantirish uchun magnitli texnologiya, shuningdek, silliq va yumshoq skrolling imkonini beradi.
Multi-device Switch: 3 ta qurilmada bir vaqtda ishlash imkoniyatini beradi va o‘zgartirish uchun bir tugma bosish kifoya.

Afzalliklari:
Ergonomik dizayn: Qo‘lni charchatmasdan uzoq vaqt ishlash imkonini beradi.
4000 DPI Darkfield sensor: Har qanday yuzada ishlay oladi, ayniqsa professional foydalanuvchilar uchun, masalan, dizaynerlar va grafik ishlab chiquvchilar uchun.
Ko‘p qurilmali ishlash: Bir nechta qurilmada osonlik bilan ishlash imkoniyatini beradi, masalan, kompyuter, planshet va smartfon.
Tez zaryadlash va uzun batareya muddati: USB-C orqali tez zaryadlash va zaryadning uzoq davom etishi.
Dasturlash imkoniyatlari: Logitech Options dasturi yordamida tugmalarni o‘zgartirish va boshqa moslamalarni sozlash.
Kamchiliklari:
Narxi: Bozordagi boshqa sichqonchalarga nisbatan yuqoriroq narx.
Vazni: Ba'zi foydalanuvchilar uchun biroz og‘ir bo‘lishi mumkin.
Sizga kerak bo‘lmagan ko‘p funksiyalar: Ba'zi foydalanuvchilar uchun qo‘shimcha tugmalar va funksiyalar ortiqcha bo‘lishi mumkin.
Foydalanish uchun moslik:
Ofis ishchilari va professional foydalanuvchilar: Uzoq vaqt davomida ishlov berish uchun qulay, ergonomik dizayni va yuqori aniqligi tufayli.
Dizaynerlar va grafik ishlab chiquvchilar: Darkfield sensor va yuqori aniqlikdagi skrolling yordamida aniq va samarali ishlash uchun juda mos.
Ko‘p qurilmali foydalanuvchilar: Bir vaqtning o‘zida bir nechta qurilmada ishlashni istaganlar uchun ideal.
Xulosa:
Logitech MX Master 3 — bu yuqori darajada ergonomik, qulay va ko‘p vazifali ishlash imkoniyatlarini ta’minlaydigan premium sichqoncha. Agar siz ofis ishlari, dizayn yoki multitasking uchun yuqori sifatli sichqoncha qidirsangiz, bu model ajoyib tanlov bo‘ladi. Uning yuqori aniqligi, uzun batareya muddati va dasturlash imkoniyatlari professional foydalanuvchilar uchun ideal.






   """,
                            R.drawable.logitech_mx, "JDLKTUWVDbk"
                        )
                    )
                ),
                brand_model(
                    "Razer", arrayListOf(
                        pc_model(
                            "Razer DeathAdder V2", """
                   Razer DeathAdder V2 — bu o‘yin uchun mo‘ljallangan simsiz sichqoncha bo‘lib, o‘yinchilar uchun yuqori aniqlik, tezkor javob va qulaylikni ta’minlaydi. Razer DeathAdder V2 o‘zining aniq sensorlari, ergonomik dizayni va yuqori sifatli qurilishi bilan mashhur bo‘lib, professional o‘yinchilar va o‘yin ixlosmandlari tomonidan keng qo‘llaniladi.

Asosiy xususiyatlari:
Sensor:

Razer Focus+ Optical Sensor (20,000 DPI): 20,000 DPI gacha bo‘lgan yuqori aniqlikdagi optik sensor, o‘yinchilar uchun aniq va tezkor harakatlarni ta’minlaydi.
Optik to‘siqsiz sensor: Optik switch texnologiyasi bilan tezkor javob va sezgirlikni ta’minlaydi.
Tugmalar:

Razer Optical Mouse Switches: Tugmalarni bosish tezligi 0.2 millisekundani tashkil etadi, bu esa o‘yinlarda maksimal tezlikni ta’minlaydi.
7 ta dasturlanadigan tugma: O‘yinchilar uchun maxsus funksiyalarni sozlash imkoniyatini beradi.
Ergonomik dizayn:

Ergonomik shakl: Yuqori darajadagi qulaylik uchun qo‘l shakliga moslashtirilgan dizayn, uzoq vaqt davomida ishlash uchun ideal.
Yumshoq materiallar: Qo‘llarga qulay va uzoq vaqt ishlash uchun mos materiallar.
Simsiz ulanish:

Speedflex kabel: Kutilgan simli sichqonchalarga nisbatan yanada yengil va moslashuvchan simli kabel. Bu kabel sichqonchaning harakatini sezilarli darajada yengillashtiradi.
Razer Chroma RGB:

16.8 million rangli RGB yoritish: Razer Chroma yoritish tizimi yordamida sichqonchaning yoritilish rangini o‘zgartirish mumkin. Bu tizim o‘yinlar bilan moslashadi va o‘yin tajribasini yanada boyitadi.
Batareya va quvvatlanish:

USB 2.0 ulanishi: Tezkor ulanish va o‘yinlarda maksimal tezlikni ta’minlash uchun.
Afzalliklari:
20,000 DPI sensor: Yuqori aniqlik va sezgirlik, o‘yinlardagi harakatlar aniq va tezkor bo‘ladi.
Razer Optical Mouse Switches: Tugmalarning tezkor va aniq javobini ta’minlaydi.
Ergonomik dizayn: Qo‘llarga qulay va uzoq vaqt davomida ishlash uchun moslashtirilgan.
Razer Chroma RGB: Moslashuvchan yoritish tizimi o‘yin tajribasini yanada yaxshilaydi.
Speedflex kabel: Kabelning moslashuvchanligi simli sichqonchalar uchun yangi darajaga ko‘tariladi.
Kamchiliklari:
Narxi: Bozordagi boshqa o‘yin sichqonchalariga nisbatan yuqori narx.
Batareya muddati: Agar simsiz variant mavjud bo‘lsa, batareya muddati ba'zi foydalanuvchilar uchun kamroq bo‘lishi mumkin.
Foydalanish uchun qo‘shimcha dastur: Razer Synapse dasturi orqali sozlash kerak bo‘ladi, bu ba'zi foydalanuvchilar uchun qo‘shimcha qiyinchilik tug‘dirishi mumkin.
Foydalanish uchun moslik:
O‘yin ixlosmandlari: Yuqori aniqlik va tezkor javob imkoniyatlari tufayli o‘yinchilarga ideal.
Razer brendiga sodiq foydalanuvchilar: Razer ekotizimiga moslashadigan va Chroma yoritish tizimini afzal ko‘rganlar uchun.
Ergonomik dizaynni afzal ko‘radiganlar: Uzoq vaqt davomida ishlash yoki o‘ynashni xohlaganlar uchun qulay.
Xulosa:
Razer DeathAdder V2 — bu yuqori aniqlik, tezkor javob va qulaylikni ta’minlaydigan o‘yin sichqonchasi. Agar siz o‘yinlarda yuqori aniqlik, tezkor javob va qulay ergonomik dizaynni qidirsangiz, bu model juda yaxshi tanlov bo‘ladi. Razer Chroma RGB yoritish tizimi ham o‘yin tajribangizni boyitadi, shuningdek, o‘yinchilar uchun yuqori darajadagi imkoniyatlar taqdim etadi.






  """,
                            R.drawable.razer_death, "Ic-Y3osvnFk"
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
                 Corsair K95 RGB Platinum XT — bu yuqori darajadagi o‘yin klaviaturasi bo‘lib, o‘yinchilar va professional foydalanuvchilar uchun mo‘ljallangan. U yuqori sifatli materiallar, o‘zgartiriladigan RGB yoritish, yuqori tezlikdagi tugmalar va ko‘p funktsional imkoniyatlar bilan ajralib turadi. Corsair K95 RGB Platinum XT o‘yin tajribasini yaxshilash va yuqori darajadagi samaradorlikni ta’minlash uchun ishlab chiqilgan.

Asosiy xususiyatlari:
Tugmalar:

Cherry MX switchlar: Yuqori sifatli Cherry MX mexanik tugmalar, aniq va tezkor javob bilan.
6 ta dasturlanadigan makro tugmalari: O‘yinchilar uchun maxsus vazifalar va makro komandalarni tezkor bajarish uchun mo‘ljallangan.
Tugma qoplamalari: Keycaplar PBT materialidan ishlab chiqilgan, uzun muddatli foydalanish va chidamlilikni ta’minlaydi.
RGB yoritish:

Corsair iCUE yoritish tizimi: 16.8 million rangli RGB yoritish, foydalanuvchilarga klaviaturaning yoritilishini shaxsiylashtirish imkoniyatini beradi.
Dinamik yoritish effektlari: O‘yinlar va dasturlarda yoritish ta’siri bilan sinxronlashtirilgan yoritish effektlari.
Ergonomik dizayn:

Yumshoq qo‘llab-quvvatlovchi yostiq: Yostiq klaviatura foydalanish paytida qo‘llarni qulayroq qilish uchun mo‘ljallangan.
Aluminiy ramka: Mustahkam va yuqori sifatli aluminiy ramka dizayni, klaviaturani uzoq muddatli foydalanish uchun chidamli qiladi.
Batareya va quvvatlanish:

USB pass-through portlari: Tez va qulay ulanish uchun 2 ta USB porti mavjud, bu boshqa qurilmalarni ulash imkonini beradi.
Proffessional o‘yinlar uchun moslik:

100% anti-ghosting va N-key rollover: Tezkor va bir vaqtning o‘zida bir nechta tugmani bosinganda ham yuqori aniqlik.
Programmalash va sozlash imkoniyatlari: iCUE dasturi yordamida tugmalarni dasturlash, makrolar yaratish va yoritishni sozlash imkonini beradi.
Afzalliklari:
Cherry MX switchlar: O‘yinlarda va yozishda aniq va tezkor javob beradi, yuqori sifatli mexanik tugmalar uzoq muddatli foydalanishga mos.
RGB yoritish: 16.8 million rangli yoritish va dinamik effektlar bilan o‘zingizga moslashtirilgan yoritish imkoniyatlari.
Dasturlanadigan tugmalar: 6 ta makro tugmasi o‘yinda yoki ishlashda qo‘shimcha funksiyalarni tezkor bajarish imkonini beradi.
Mustahkam dizayn: Aluminiy ramka va chidamli materiallar uzoq muddatli foydalanish va bardoshlikni ta’minlaydi.
Qo‘llab-quvvatlovchi yostiq: Uzoq muddat davomida qulay foydalanish uchun qo‘llarni qulay yostiq yordamida qo‘llab-quvvatlaydi.
Kamchiliklari:
Narxi: Bozordagi boshqa klaviaturalarga nisbatan yuqori narx.
Vazni: Ba'zi foydalanuvchilar uchun klaviatura og‘ir bo‘lishi mumkin.
Barcha foydalanuvchilar uchun ortiqcha funktsiyalar: Ba'zi foydalanuvchilar uchun 6 ta makro tugmasi va RGB yoritish tizimi ortiqcha bo‘lishi mumkin.
Foydalanish uchun moslik:
O‘yin ixlosmandlari va professional o‘yinchilar: Yaxshi tezlik, aniq tugmalar va yuqori sifatli dizayn tufayli o‘yinchilar uchun ideal.
Dastur ishlab chiquvchilar va ofis foydalanuvchilari: Makro tugmalari va yuqori sifatli yoritish bilan ishlashni osonlashtiradi.
Ergonomik dizaynni afzal ko‘radiganlar: Uzoq vaqt davomida foydalanishni xohlagan foydalanuvchilar uchun qulay.
Xulosa:
Corsair K95 RGB Platinum XT — bu yuqori sifatli, o‘yinchilar va professional foydalanuvchilar uchun mo‘ljallangan mexanik klaviatura. Uning yuqori tezlikdagi Cherry MX switchlari, RGB yoritish tizimi va ko‘p funktsional tugmalari uzoq muddatli foydalanish va qulaylikni ta’minlaydi. Agar siz o‘yinlarda yuqori samaradorlikni va shaxsiylashtirilgan tajribani qidirsangiz, bu klaviatura juda yaxshi tanlov bo‘ladi.     """,
                            R.drawable.korsair_k95, "KcP3g6DQOIA"
                        ),
                        pc_model(
                            "Corsair K70 RGB MK.2", """
                  Corsair K70 RGB MK.2 — bu yuqori sifatli mexanik o‘yin klaviaturasi bo‘lib, professional o‘yinchilar va yuqori samaradorlikni talab qiladigan foydalanuvchilar uchun mo‘ljallangan. Corsair K70 RGB MK.2 o‘zining aniq va tezkor mexanik switchlari, shaxsiylashtirilgan RGB yoritish tizimi, qulay ergonomik dizayni va mustahkam qurilishi bilan mashhur.

Asosiy xususiyatlari:
Tugmalar:

Cherry MX switchlar: K70 RGB MK.2 Cherry MX switchlarining turli xil variantlari bilan mavjud (Red, Brown, Blue), o‘yinchilarga turli xil tugma bosish hislarini ta’minlaydi.
100% anti-ghosting va N-key rollover: Bir vaqtning o‘zida bir nechta tugmalarni bosish imkoniyatini ta’minlaydi, bu o‘yinlarda maksimal aniqlik va tezlikni ta’minlash uchun juda muhim.
RGB yoritish:

Corsair iCUE RGB yoritish tizimi: 16.8 million rangli RGB yoritish, foydalanuvchilarga klaviaturaning yoritilishini shaxsiylashtirish imkoniyatini beradi.
Dinamik yoritish effektlari: O‘yinlar va dasturlarda yoritish ta’siri bilan sinxronlashtirilgan yoritish effektlari, shuningdek, o‘yinlardagi harakatlar va holatlarni ko‘rsatish uchun maxsus yoritish.
Ergonomik dizayn:

Aluminiy ramka: Mustahkam va yuqori sifatli aluminiy ramka dizayni klaviaturani uzoq muddatli foydalanish uchun bardoshli qiladi.
Qo‘llab-quvvatlovchi yostiq: Yostiq klaviaturani uzoq vaqt davomida qulay ishlatish uchun qo‘llarni qo‘llab-quvvatlaydi.
Batareya va quvvatlanish:

USB pass-through port: Tez va qulay ulanish uchun USB porti mavjud, bu boshqa qurilmalarni ulash imkonini beradi.
Proffessional o‘yinlar uchun moslik:

Programmalash va sozlash imkoniyatlari: iCUE dasturi yordamida tugmalarni dasturlash, makrolar yaratish va yoritishni sozlash imkonini beradi.
Yuqori tezlikdagi javob: Tezkor va aniq tugma bosishlari uchun yuqori tezlikdagi mexanik switchlar.
Afzalliklari:
Cherry MX switchlar: Yuqori sifatli switchlar yordamida o‘yinlarda va yozishda aniq va tezkor javob beradi.
RGB yoritish: 16.8 million rangli RGB yoritish va dinamik effektlar, shaxsiylashtirish imkoniyatlari va o‘yin tajribasini yanada boyitadi.
Ergonomik dizayn: Aluminiy ramka va qulay yostiq uzoq muddatli foydalanish uchun qulaylik yaratadi.
Programmalash imkoniyatlari: Makro tugmalari va iCUE dasturi orqali sozlash imkoniyatlari.
Yuqori tezlik: 100% anti-ghosting va N-key rollover bilan yuqori tezlikdagi o‘yinlarni ta’minlaydi.
Kamchiliklari:
Narxi: Bozordagi boshqa klaviaturalarga nisbatan yuqori narx.
Vazni: Ba'zi foydalanuvchilar uchun klaviatura og‘ir bo‘lishi mumkin.
Foydalanish uchun qo‘shimcha dastur: iCUE dasturi orqali sozlash kerak bo‘ladi, bu ba'zi foydalanuvchilar uchun qo‘shimcha qiyinchilik tug‘dirishi mumkin.
Foydalanish uchun moslik:
O‘yin ixlosmandlari va professional o‘yinchilar: Yuqori tezlik, aniq tugmalar va yuqori sifatli dizayn tufayli o‘yinchilar uchun ideal.
Dastur ishlab chiquvchilar va ofis foydalanuvchilari: Makro tugmalari va yuqori sifatli yoritish bilan ishlashni osonlashtiradi.
Ergonomik dizaynni afzal ko‘radiganlar: Uzoq vaqt davomida foydalanishni xohlagan foydalanuvchilar uchun qulay.
Xulosa:
Corsair K70 RGB MK.2 — bu yuqori sifatli, o‘yinchilar va professional foydalanuvchilar uchun mo‘ljallangan mexanik klaviatura. Uning yuqori tezlikdagi Cherry MX switchlari, RGB yoritish tizimi va ko‘p funktsional tugmalari uzoq muddatli foydalanish va qulaylikni ta’minlaydi. Agar siz o‘yinlarda yuqori samaradorlikni va shaxsiylashtirilgan tajribani qidirsangiz, bu klaviatura juda yaxshi tanlov bo‘ladi.






    """,
                            R.drawable.korsair_mk, "uvfaXQSVCPM"
                        )
                    )
                ),
                brand_model(
                    "Razer", arrayListOf(
                        pc_model(
                            "Razer Huntsman Elite", """
                Razer Huntsman Elite — bu Razer kompaniyasining yuqori darajadagi mexanik o‘yin klaviaturasi bo‘lib, o‘yinchilarga mo‘ljallangan va premium funktsiyalar bilan jihozlangan. Klaviatura, o‘yinlarda yuqori samaradorlikni ta’minlash uchun ishlab chiqilgan bo‘lib, o‘zining Razer Opto-Mechanical switches, yuqori sifatli dizayn va yuqori darajadagi ergonomik qulayliklari bilan ajralib turadi.

Asosiy xususiyatlari:
Razer Opto-Mechanical Switches:

Optik sensorlar: Bu switchlar optik texnologiyani qo‘llaydi, bu esa tugma bosishining tezligini va aniqligini sezilarli darajada oshiradi. Opto-Mechanical switchlar juda tezkor va aniq javob beradi, bu o‘yinlarda yuqori samaradorlikni ta’minlaydi.
Tezkor javob va uzoq umr: Tugmalar 1.0 mm bosish harakati va 100 million bosish uchun mo‘ljallangan, bu uzoq muddatli foydalanishni ta’minlaydi.
RGB yoritish:

Razer Chroma RGB tizimi: 16.8 million rangli RGB yoritish, foydalanuvchilarga klaviaturaning yoritilishini shaxsiylashtirish imkoniyatini beradi. Razer Chroma tizimi o‘yinlar va dasturlarda yoritish ta’sirini sinxronlashtiradi, bu yanada dinamik va jonli tajriba yaratadi.
Ergonomik dizayn:

Qo‘llab-quvvatlovchi yostiq: Klaviatura ergonomik yostiq bilan jihozlangan, bu uzoq vaqt davomida qulay ishlashni ta’minlaydi.
Aluminiy ramka: Mustahkam va yuqori sifatli aluminiy ramka dizayni klaviaturani uzoq muddatli foydalanish uchun bardoshli qiladi.
Qo‘shimcha funktsiyalar:

Multimediya boshqaruvi: Klaviaturada maxsus multimediya boshqaruv tugmalari mavjud, shuningdek, media oynatish uchun maxsus g‘ildirak.
USB pass-through porti: Tez va qulay ulanish uchun USB porti mavjud.
Makro va dasturlash imkoniyatlari: Razer Synapse dasturi yordamida klaviaturadagi tugmalarni sozlash, makrolar yaratish va yoritishni shaxsiylashtirish imkoniyatlari mavjud.
Afzalliklari:
Razer Opto-Mechanical Switches: Optik texnologiya yordamida yuqori tezlik va aniqlik, o‘yinlarda maksimal samaradorlikni ta’minlaydi.
RGB yoritish: 16.8 million rangli RGB yoritish tizimi, shaxsiylashtirish va dinamik effektlar yaratish imkoniyatlarini beradi.
Ergonomik dizayn: Qo‘llab-quvvatlovchi yostiq va mustahkam aluminiy ramka uzoq muddatli foydalanish uchun qulaylikni ta’minlaydi.
Multimediya boshqaruvi: Multimediya tugmalari va g‘ildirak yordamida oson ovoz va media boshqaruvi.
Dasturlash imkoniyatlari: Razer Synapse dasturi orqali klaviaturani shaxsiylashtirish imkoniyati.
Kamchiliklari:
Narxi: Bozordagi boshqa klaviaturalarga nisbatan nisbatan yuqori narx.
Vazni: Klaviatura og‘ir bo‘lishi mumkin, ba'zi foydalanuvchilar uchun qo‘shimcha og‘irlik sezilishi mumkin.
Foydalanish uchun qo‘shimcha dastur: Razer Synapse dasturini o‘rnatish va sozlash kerak bo‘ladi, bu ba'zi foydalanuvchilar uchun qo‘shimcha qiyinchilik tug‘dirishi mumkin.
Foydalanish uchun moslik:
O‘yin ixlosmandlari va professional o‘yinchilar: Razer Opto-Mechanical switchlar va yuqori tezlik, aniq tugmalar yordamida o‘yinlarda maksimal samaradorlikni ta’minlaydi.
Dastur ishlab chiquvchilar va ofis foydalanuvchilari: Makrolar va dasturlash imkoniyatlari orqali ishlashni osonlashtiradi.
Ergonomik dizaynni afzal ko‘radiganlar: Uzoq vaqt davomida foydalanishni xohlagan foydalanuvchilar uchun qulay.
Xulosa:
Razer Huntsman Elite — bu yuqori sifatli, o‘yinchilar uchun mo‘ljallangan mexanik klaviatura. Uning Razer Opto-Mechanical switches, RGB yoritish tizimi va ergonomik dizayni uzoq muddatli foydalanishda qulaylikni ta’minlaydi. Agar siz o‘yinlarda yuqori samaradorlik va shaxsiylashtirilgan tajriba qidirsangiz, bu klaviatura juda yaxshi tanlov bo‘ladi.






   """,
                            R.drawable.razer_elite, "UJ9SvQTTRxc"
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
                    HP LaserJet Pro MFP M428fdw — bu yuqori sifatli, ko‘p funksiyali lazer printer bo‘lib, ofis va kichik bizneslar uchun mo‘ljallangan. U tez, samarali va oson ishlash imkoniyatlarini taklif etadi, shuningdek, yuqori sifatli bosma va ko‘p funksiyali operatsiyalarni ta'minlashga qodir.

Asosiy xususiyatlari:
Bosib chiqarish, nusxa ko‘chirish, skanerlash va faks qilish:

Ko‘p funksiyali: M428fdw printeri bosib chiqarish, nusxa ko‘chirish, skanerlash va faks funksiyalarini birlashtiradi, bu esa ofis jarayonlarini soddalashtiradi.
Avtomatik ikki tomonlama bosib chiqarish: Ikki tomonlama bosib chiqarish funktsiyasi vaqt va qog‘ozni tejashga yordam beradi.
Tezlik va samaradorlik:

Bosib chiqarish tezligi: 40 sahifagacha bir daqiqada (ppm), bu tez va samarali bosib chiqarishni ta’minlaydi.
Birlamchi chiqish tezligi: Birinchi sahifa chiqarilishi tezligi 6.3 soniyagacha bo‘lishi mumkin, bu bosib chiqarishni tezlashtiradi.
Konektivlik va ulanish:

Wi-Fi va Ethernet: Wi-Fi, Ethernet va USB ulanishlari yordamida tarmoq orqali yuqori tezlikda ishlash imkoniyatini ta’minlaydi.
Mobil bosib chiqarish imkoniyatlari: Apple AirPrint, Google Cloud Print, Mopria Print va HP Smart App kabi mobil bosib chiqarish imkoniyatlari mavjud.
Xavfsizlik va boshqaruv:

Xavfsizlik xususiyatlari: Printerda xavfsizlikni oshirish uchun ishlashni boshqarish va tarmoq xavfsizligini ta’minlash uchun bir qator funksiyalar mavjud, jumladan, parol bilan himoya qilish va foydalanuvchilarni nazorat qilish.
HP JetAdvantage Security Manager: Bu dastur orqali printer xavfsizligini boshqarish va zararli hujumlarga qarshi himoya qilish mumkin.
Ekologik jihatlar:

ENERGY STAR sertifikati: Bu model energiyani tejashga yordam beradi va ekologik jihatdan samarali ishlashni ta’minlaydi.
Qog‘ozni tejash: Ikki tomonlama bosib chiqarish va energiya tejamkor texnologiyalar yordamida qog‘oz va energiya sarfini kamaytiradi.
Skanerlash va nusxa ko‘chirish:

Skaner: 1200 x 1200 dpi skanerlash aniqligi bilan yuqori sifatli skanerlashni ta’minlaydi.
ADF (Avtomatik hujjat feedi): Avtomatik hujjat feederi bir vaqtning o‘zida 250 sahifagacha bo‘lgan hujjatlarni skanerlash imkoniyatini beradi.
Afzalliklari:
Ko‘p funksiyali: Bosib chiqarish, nusxa ko‘chirish, skanerlash va faks funksiyalari bir qurilmada mavjud.
Tezlik: Yuqori tezlikdagi bosib chiqarish (40 ppm) va tez birinchi sahifa chiqarish.
Mobil bosib chiqarish imkoniyatlari: Apple AirPrint, Google Cloud Print, Mopria Print kabi xizmatlar yordamida mobil qurilmalardan bosib chiqarish mumkin.
Xavfsizlik: Printerda xavfsizlikni ta’minlaydigan bir qator vositalar mavjud.
ENERGY STAR: Ekologik jihatdan samarali ishlash va energiya tejash.
Kamchiliklari:
Narxi: Boshqa printerlarga nisbatan narxi yuqori bo‘lishi mumkin.
Katta o‘lcham: Ofisda katta joyni egallashi mumkin.
Faks qilish: Faks funksiyasi zamonaviy ofislar uchun kamroq talab qilinadi, ammo u hali ham mavjud.
Boshqa opsiyalar: Bosib chiqarishdagi sifat yoki xususiyatlar ba'zi yuqori darajadagi printerlarga nisbatan oddiyroq bo‘lishi mumkin.
Foydalanish uchun moslik:
Ofis va kichik bizneslar: Ko‘p funksiyali printer yuqori tezlikda ishlab chiqarish va skanerlash zarur bo‘lgan muhitda foydalidir.
Uydagi foydalanuvchilar: Agar uyda ko‘p bosib chiqarish, skanerlash va nusxa ko‘chirish kerak bo‘lsa, bu model ham yaxshi tanlovdir.
Xavfsizlikni ta’minlashni xohlaganlar: Tarmoq xavfsizligi va hujjat xavfsizligini oshirishga e'tibor beradigan foydalanuvchilar uchun yaxshi variant.
Xulosa:
HP LaserJet Pro MFP M428fdw — bu yuqori tezlikda ishlaydigan va ko‘p funksiyali lazer printer bo‘lib, ofislar va kichik bizneslar uchun juda mos keladi. Tez bosib chiqarish, mobil bosib chiqarish imkoniyatlari, xavfsizlik va ekologik jihatdan samarali ishlash kabi xususiyatlari uni samarali va qulay ishlash uchun ideal qiladi. Agar siz ko‘p bosib chiqarish va skanerlashni talab qiladigan ishlar bilan shug‘ullanadigan bo‘lsangiz, bu model siz uchun yaxshi tanlov bo‘ladi.
                    """,
                            R.drawable.hp_laserjetmfp, "kevAPvG_PNE"
                        ),
                        pc_model(
                            "HP DeskJet 3755", """
                   HP DeskJet 3755 — bu kichik va ixcham dizaynga ega, ko‘p funksiyali inkjet printer bo‘lib, uyda yoki kichik ofislarda foydalanish uchun ideal variantdir. Arzon narxi va oson ishlash imkoniyatlari bilan mashhur bo‘lib, foydalanuvchilarga bosib chiqarish, nusxa ko‘chirish va skanerlashni bir qurilmada taqdim etadi.

Asosiy xususiyatlari:
Ko‘p funksiyali:

Bosib chiqarish, nusxa ko‘chirish va skanerlash: HP DeskJet 3755 bir qurilmada bosib chiqarish, nusxa ko‘chirish va skanerlash imkoniyatlarini ta’minlaydi, bu esa uni uyda yoki kichik ofisda ishlatish uchun qulay qiladi.
Kichik va ixcham dizayn:

Kichik o‘lchamlar: HP DeskJet 3755 juda ixcham va joyni tejaydigan dizaynga ega, bu uni kichik ish joylari uchun ideal qiladi.
Portativlik: Siz uni osonlik bilan boshqa joylarga ko‘chirish yoki saqlash imkoniyatiga egasiz.
Wi-Fi ulanish:

Wi-Fi ulanishi: Printer Wi-Fi orqali ulanishni qo‘llab-quvvatlaydi, bu esa mobil qurilmalardan yoki tarmoq orqali bosib chiqarish imkoniyatlarini yaratadi.
Mobil bosib chiqarish imkoniyatlari:

Apple AirPrint va Google Cloud Print: Bu printer mobil qurilmalardan bosib chiqarishni qo‘llab-quvvatlaydi, shuningdek, HP ePrint va Mopria Print kabi ilovalar yordamida bosib chiqarish imkoniyatlari mavjud.
Bosib chiqarish tezligi:

Tezlik: Bosib chiqarish tezligi bir daqiqada 7.5 sahifa (ppm) qora va oq va 5.5 sahifa (ppm) rangli bo‘lib, kundalik ofis ishlarini tez va samarali bajarish imkonini beradi.
Tug‘malar va boshqaruv:

Oson boshqaruv: Printerda minimal tugmalar mavjud, bu esa foydalanuvchilarga osonlik bilan sozlash va ishlatish imkoniyatini beradi.
Qog‘oz sig‘imi:

Qog‘oz sig‘imi: HP DeskJet 3755 60 varaq sig‘imiga ega qog‘oz qo‘llab-quvvatlashga ega.
Afzalliklari:
Kichik va ixcham dizayn: Uzoq vaqt davomida ishlatish uchun joyni tejashga yordam beradi.
Ko‘p funksiyali: Bosib chiqarish, nusxa ko‘chirish va skanerlashni bir qurilmada taqdim etadi.
Mobil bosib chiqarish: Apple AirPrint, Google Cloud Print va HP ePrint kabi imkoniyatlar yordamida mobil qurilmalardan tezda bosib chiqarish mumkin.
Arzon narx: Boshqa ko‘p funksiyali printerlarga nisbatan arzon narxga ega.
Wi-Fi ulanishi: Tarmoq ulanishi va mobil qurilmalardan bosib chiqarishni osonlashtiradi.
Kamchiliklari:
Bosib chiqarish tezligi: Tezlik bir necha sahifa bosib chiqarish uchun yetarli bo‘lishi mumkin, ammo yuqori hajmdagi bosib chiqarish ishlari uchun sekinroq bo‘lishi mumkin.
Qog‘oz sig‘imi: Qog‘oz sig‘imi 60 varaq bilan cheklangan, bu esa katta hajmdagi bosib chiqarish ishlari uchun yetarli bo‘lmasligi mumkin.
Xatoliklar va qiyinchiliklar: Ba’zan Wi-Fi ulanishida muammolar yuzaga kelishi mumkin, ayniqsa, yuklab olish va o‘rnatish jarayonida.
Foydalanish uchun moslik:
Uyda foydalanish: Uyda yoki kichik ofisda osonlik bilan ishlatish uchun juda mos keladi.
Kichik ofislar: Tez-tez bosib chiqarish va skanerlashni talab qilmaydigan kichik ofislar uchun ideal.
Mobil foydalanuvchilar: Mobil qurilmalardan bosib chiqarishni xohlaydigan foydalanuvchilar uchun yaxshi tanlov.
Arzon narxni qidirayotgan foydalanuvchilar: Arzon narxdagi ko‘p funksiyali printerni qidirayotgan foydalanuvchilar uchun yaxshi variant.
Xulosa:
HP DeskJet 3755 — kichik va ixcham dizaynga ega, arzon narxdagi ko‘p funksiyali printer bo‘lib, uyda yoki kichik ofisda foydalanish uchun juda mos keladi. Bosib chiqarish, nusxa ko‘chirish, skanerlash funksiyalari va mobil qurilmalardan bosib chiqarish imkoniyatlari uni qulay va samarali qiladi. Agar siz arzon narxga ega, kichik va ixcham printerni qidirsangiz, HP DeskJet 3755 yaxshi tanlov bo‘ladi.  """,
                            R.drawable.hp_deskjet3755, "_u68V4HQr8"
                        )
                    )
                ),
                brand_model(
                    "Canon", arrayListOf(
                        pc_model(
                            "Canon PIXMA TS9120", """
                  Canon PIXMA TS9120 — bu yuqori sifatli inkjet printer bo‘lib, uyda yoki kichik ofislarda foydalanish uchun juda mos keladi. U ko‘p funksiyali, yuqori sifatli bosib chiqarish imkoniyatlariga ega va mobil qurilmalardan bosib chiqarishni qo‘llab-quvvatlaydi.

Asosiy xususiyatlari:
Ko‘p funksiyali:

Bosib chiqarish, nusxa ko‘chirish va skanerlash: Canon PIXMA TS9120 bir qurilmada bosib chiqarish, nusxa ko‘chirish va skanerlash imkoniyatlarini taqdim etadi, bu esa uyda yoki kichik ofisda foydalanish uchun juda qulay.
Yuoqri sifatli bosib chiqarish:

Resolutsiya: 4800 x 1200 dpi gacha bo‘lgan yuqori bosib chiqarish aniqligi, bu matn va rasmlarning yuqori sifatli chiqishini ta’minlaydi.
Rangli bosib chiqarish: Rangli bosib chiqarish uchun 6 rangli tizim (CMYBK + Pigment Black) ishlatiladi, bu ranglarning to‘liq va aniq chiqishini ta’minlaydi.
Wi-Fi ulanish va mobil bosib chiqarish:

Wi-Fi ulanishi: Canon PIXMA TS9120 Wi-Fi orqali ulanadi, bu esa tarmoq orqali va mobil qurilmalardan bosib chiqarishni osonlashtiradi.
Mobil bosib chiqarish imkoniyatlari: Apple AirPrint, Google Cloud Print, Canon PRINT App va Mopria Print kabi imkoniyatlar yordamida mobil qurilmalardan bosib chiqarish mumkin.
Foydalanuvchiga qulay boshqaruv:

Tachli ekrani: 5 dyuymli to‘liq rangli ekran yordamida oson navigatsiya va sozlashlar amalga oshiriladi.
Sensorli boshqaruv: Printerda sensorli boshqaruv paneli mavjud bo‘lib, foydalanuvchilar uchun qulay navigatsiya va oson ishlash imkoniyatini ta’minlaydi.
Qog‘oz sig‘imi:

Qog‘oz qo‘llab-quvvatlash: Canon PIXMA TS9120da 100 varaq sig‘imli oldingi qog‘oz trayi va 20 varaq sig‘imli fotopapir trayi mavjud.
Qog‘oz turlari: A4, A5, B5, Letter, Legal, 4x6, 5x7, 8x10, Envelopes kabi qog‘oz o‘lchamlarini qo‘llab-quvvatlaydi.
Tezlik va samaradorlik:

Bosib chiqarish tezligi: Qora va oq bosib chiqarish tezligi 15 sahifa minutiga (ppm), rangli bosib chiqarish esa 10 sahifa minutiga (ppm).
Auto Duplex Printing: Avtomatik ikki tomonlama bosib chiqarish funktsiyasi mavjud, bu esa qog‘ozni tejashga yordam beradi.
Afzalliklari:
Yuqori sifatli bosib chiqarish: 4800 x 1200 dpi gacha bo‘lgan yuqori bosib chiqarish aniqligi va ranglarning aniq chiqishi.
Ko‘p funksiyali: Bosib chiqarish, nusxa ko‘chirish va skanerlashni bir qurilmada taqdim etadi.
Mobil bosib chiqarish: Apple AirPrint, Google Cloud Print va Canon PRINT App kabi mobil bosib chiqarish imkoniyatlari mavjud.
Wi-Fi ulanishi: Tarmoq orqali yoki mobil qurilmalardan bevosita bosib chiqarish mumkin.
Avtomatik ikki tomonlama bosib chiqarish: Qog‘ozni tejash uchun foydalidir.
Sensorli boshqaruv: Oson sozlash va navigatsiya imkoniyatlari bilan foydalanuvchi uchun qulay interfeys.
Kamchiliklari:
Narxi: Ba’zi foydalanuvchilar uchun yuqori narxi bo‘lishi mumkin, ayniqsa kam foydalaniladigan xususiyatlar bilan.
Tezlik: Bosib chiqarish tezligi juda yuqori bo‘lmasa-da, o‘rtacha tezlikni ta’minlaydi, ammo katta hajmdagi bosib chiqarish ishlarida sekinroq bo‘lishi mumkin.
Qog‘oz sig‘imi: Qog‘oz trayining sig‘imi cheklangan va ko‘p sahifali bosib chiqarish uchun ba’zan doimiy ravishda qo‘shib olish kerak bo‘ladi.
Foydalanish uchun moslik:
Uyda foydalanish: Uyda oson foydalanish uchun ideal variant, yuqori sifatli bosib chiqarish va ko‘p funksiyali imkoniyatlar bilan.
Kichik ofislar: Kichik ofislar uchun yaxshi tanlov, ular uchun yuqori sifatli bosib chiqarish va mobil bosib chiqarish imkoniyatlari muhimdir.
O‘qish yoki san’atni sevuvchilar: Yuqori sifatli rangli bosib chiqarish imkoniyatlari tufayli san’at va fotosuratlar ustida ishlash uchun foydalidir.
Xulosa:
Canon PIXMA TS9120 yuqori sifatli inkjet printer bo‘lib, uyda yoki kichik ofisda foydalanish uchun juda mos keladi. Uning yuqori bosib chiqarish aniqligi, mobil bosib chiqarish imkoniyatlari, va ko‘p funksiyali xususiyatlari uni foydalanuvchilar uchun qulay qiladi. Agar siz yuqori sifatli bosib chiqarish va rangli tasvirlarni chop etish imkoniyatlarini qidirsangiz, Canon PIXMA TS9120 yaxshi tanlov bo‘ladi.







  """,
                            R.drawable.canon_ts9120, "4yWDP4HLEWw"
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
                  Epson Perfection V600 — bu yuqori sifatli skaner bo‘lib, fotosuratlar, hujjatlar, slaydlar va filmni skanerlash imkoniyatlarini taqdim etadi. U kengaytirilgan rang va aniqlikni saqlab qolgan holda, tezkor va samarali skanerlashni ta’minlashga mo‘ljallangan.

Asosiy xususiyatlari:
Yuqori skanerlash aniqligi:

Resolutsiya: 6400 x 9600 dpi gacha bo‘lgan yuqori skanerlash aniqligi, bu juda kichik detallarga ham aniq e'tibor qaratadi.
Optik skanerlash aniqligi: 6400 dpi optik aniqlikda skanerlash, bu fotolarga va kichik tafsilotlarga yuqori aniqlik bilan aks etishini ta'minlaydi.
Film va slaydlarni skanerlash:

Film va slaydlarga moslashuvchanlik: Epson Perfection V600, 35mm film, slaydlar va diapozitivlarni skanerlash uchun maxsus tutqichlarga ega, bu esa professional darajadagi tasvirlarni olish imkonini beradi.
Tovushni pasaytirish texnologiyasi:

ICE (Digital Dust and Scratch Removal): Epsonning ICE texnologiyasi yordamida skanerlashdan keyin tasvirlardagi chang va chizilmalardan tozalash mumkin. Bu tasvirlarning sifatini yanada yaxshilaydi.
USB ulanishi:

USB 2.0 interfeysi: Epson Perfection V600 USB 2.0 orqali kompyuterga ulanadi, bu esa tezkor va oson ulanishni ta'minlaydi.
Foydalanuvchi uchun qulay dasturiy ta'minot:

Epson Scan software: Epson tomonidan taqdim etilgan skanerlash dasturiy ta’minoti yordamida foydalanuvchilar tezda yuqori sifatli skanerlashni amalga oshirishi mumkin.
Adobe Photoshop Elements: Tahrir qilish uchun bepul Adobe Photoshop Elements dasturi ham mavjud.
Tashqi dizayn:

Kompakt va qulay dizayn: Epson Perfection V600 juda kompaktdir va u turli ofis yoki uy sharoitlariga osongina moslashadi.
Afzalliklari:
Yuqori skanerlash aniqligi: 6400 x 9600 dpi gacha bo‘lgan optik aniqlik bilan yuqori sifatli skanerlashni ta’minlaydi.
Film va slaydlarni skanerlash imkoniyati: Film va slaydlarni skanerlash uchun maxsus tutqichlarga ega, bu esa professional sifatdagi skanerlarni olish imkonini beradi.
ICE texnologiyasi: Chang va chizilmalardan tozalash uchun ICE texnologiyasini qo‘llab-quvvatlaydi, bu esa tasvirlarning sifatini yaxshilaydi.
Oson dasturiy ta'minot: Epson Scan dasturi va Adobe Photoshop Elements dasturi yordamida qulay tahrir qilish va skanerlash imkoniyatlari.
Kompakt dizayn: Kompakt va oson joylashadigan dizayn, uy va kichik ofislar uchun mos.
Kamchiliklari:
Tezlik: Yuqori aniqlikda skanerlash jarayoni ba’zan sekin bo‘lishi mumkin, ayniqsa yuqori aniqlikda film yoki slaydlarda.
Yuqori narx: Kengaytirilgan xususiyatlar bilan ta'minlangan bo‘lsa-da, ba’zi foydalanuvchilar uchun narxi yuqori bo‘lishi mumkin.
USB faqat 2.0: Ba’zi foydalanuvchilar USB 3.0 yoki yuqori tezlikdagi interfeysni afzal ko‘rishi mumkin.
Foydalanish uchun moslik:
Fotosurat va san'atni sevuvchilar: Agar siz fotosuratlarni yoki san'at asarlarini skanerlashni xohlasangiz, Epson Perfection V600 yuqori aniqligi va ranglar aniqligi bilan yaxshi tanlov.
Kichik ofislar va uyda foydalanish: Film, slayd va hujjatlarni skanerlash uchun qulay va samarali skanerlash imkoniyatlarini taqdim etadi.
Professional tasvir tahlilchilari yoki dizaynerlar: Yuqori aniqlikdagi skanerlash va ICE texnologiyasi tufayli, professional sifatdagi ishlov berilgan tasvirlar uchun ideal.
Xulosa:
Epson Perfection V600 — bu yuqori aniqlikdagi skaner, asosan fotosuratlar, slaydlar va filmlarni skanerlash uchun juda mos keladi. Uning ICE texnologiyasi va yuqori skanerlash aniqligi professional sifatdagi tasvirlarni olishga imkon beradi. Agar siz yuqori sifatli skanerlash va tasvirlarni tahrirlash imkoniyatlarini qidirsangiz, Epson Perfection V600 yaxshi tanlov bo‘ladi.






    """,
                            R.drawable.epson_v600, "UgsDB5Dlw8Y"
                        )
                    )
                ),
                brand_model(
                    "Canon", arrayListOf(
                        pc_model(
                            "Canon CanoScan LiDE 400", """
                   Canon CanoScan LiDE 400 — bu yuqori sifatli, kompakt va engil skaner bo‘lib, uyda yoki kichik ofislarda foydalanish uchun juda mos keladi. Bu model skanerlashni oddiy va samarali qilish uchun ilg‘or texnologiyalarni taklif qiladi.

Asosiy xususiyatlari:
Yuqori skanerlash aniqligi:

Resolutsiya: 4800 x 4800 dpi gacha bo‘lgan yuqori skanerlash aniqligi, bu yuqori sifatli fotolar, hujjatlar va tasvirlarni olish imkonini beradi.
Optik skanerlash: Skanerlashda yuqori aniqlikni ta'minlaydi, ayniqsa matn va kichik tafsilotlarni aniqlik bilan aks ettiradi.
USB 3.0 ulanishi:

Tezkor ulanish: Canon CanoScan LiDE 400 USB 3.0 interfeysi yordamida tezkor va oson ulanishni ta'minlaydi, skanerlash tezligini oshiradi.
Kompakt dizayn:

Yengil va portativ: Kompakt va yengil dizayni tufayli, uni osonlik bilan ko‘chirish va saqlash mumkin. Bu uyda yoki kichik ofisda ishlatish uchun juda qulaydir.
Auto Scan funksiyasi:

Avtomatik sozlamalar: Auto Scan funksiyasi yordamida foydalanuvchi skanerlashni avtomatik tarzda boshlashi mumkin. Skaner maxsus aniq matn yoki rasmni aniqlaydi va kerakli parametrlarni avtomatik ravishda sozlaydi.
4 ta tezkor tugma:

Tezkor tugmalar: Tezkor tugmalar yordamida foydalanuvchilar bir necha bosish bilan skanerlash, nusxa ko‘chirish yoki PDF fayllarini yaratish imkoniyatiga ega bo‘ladilar.
Energiya tejash:

Energiya samaradorligi: Canon CanoScan LiDE 400 energiya samarali bo‘lib, USB orqali quvvatlanadi, ya'ni alohida quvvat manbai talab qilinmaydi.
Afzalliklari:
Yuoqri skanerlash aniqligi: 4800 x 4800 dpi gacha bo‘lgan optik aniqlik bilan yuqori sifatli skanerlash imkoniyatlari.
Kompakt va yengil dizayn: Bu skaner juda yengil va portativ, uni ko‘chirish va joylashtirish juda oson.
Tezkor USB 3.0 ulanishi: Skanerlash tezligini oshiradi va tez ulanish imkoniyatini beradi.
Auto Scan funksiyasi: Foydalanuvchi uchun avtomatik sozlamalar, aniq skanerlash uchun juda qulay.
Tezkor tugmalar: Skanerlash va boshqa funksiyalarni tez va oson bajarish imkonini beradi.
Kamchiliklari:
Skanerlash tezligi: Canon CanoScan LiDE 400 skanerlashda yuqori aniqlikni ta'minlasa-da, tezlik ba’zi foydalanuvchilar uchun sekin bo‘lishi mumkin, ayniqsa yuqori sifatli fotosuratlar skanerlashda.
Limited film va slayd qo‘llab-quvvatlash: Film va slaydlarni skanerlash uchun maxsus tutqichlar yoki qo‘llab-quvvatlash mavjud emas, bu professional film skanerlashni qilishni istaganlar uchun muammo bo‘lishi mumkin.
Foydalanish uchun dasturiy ta'minot talab qiladi: Ba'zi foydalanuvchilar uchun yuqori darajadagi skanerlash va tahrir qilishni amalga oshirish uchun qo‘shimcha dasturiy ta'minot kerak bo‘lishi mumkin.
Foydalanish uchun moslik:
Uyda foydalanish: Kompakt va yengil dizayn tufayli, uyda foydalanish uchun ideal. Yuqori sifatli matn va hujjatlarni skanerlash uchun juda mos keladi.
Kichik ofislar: Kichik ofislarda tez-tez skanerlash kerak bo‘ladigan holatlarda, Canon CanoScan LiDE 400 samarali va qulay variant bo‘lishi mumkin.
Fotosuratlar va hujjatlar: Hujjatlar, rasmlar yoki boshqa kichik tafsilotlarni skanerlash uchun ideal.
Xulosa:
Canon CanoScan LiDE 400 yuqori sifatli, kompaktdir va uyda yoki kichik ofisda foydalanish uchun juda qulaydir. Uning yuqori skanerlash aniqligi, USB 3.0 ulanishi va avtomatik skanerlash funksiyalari uni oddiy va samarali ishlash imkonini ta'minlaydi. Agar siz yuqori sifatli matn va rasmlar skanerlashni xohlasangiz, Canon CanoScan LiDE 400 juda yaxshi tanlov bo‘ladi. """,
                            R.drawable.canon_ldie, "DRztRpCemKo"
                        )
                    )
                )
            )
        )

        val projectionModels = main_model(

            "Projector", arrayListOf(

                brand_model(
                    "Epson",
                    arrayListOf(

                        pc_model(
                            "Epson 3LCD",
                            "Epson 3LCD texnologiyasi Epson tomonidan ishlab chiqilgan va foydalaniladigan mashhur proyeksiya texnologiyalaridan biridir. Ushbu texnologiya ranglarni aniqroq va yorqinroq aks ettirish uchun uchta alohida LCD (Liquid Crystal Display) chipidan foydalanadi. Epson 3LCD texnologiyasi bilan ishlaydigan proyektorlar quyidagi asosiy xususiyatlarga ega:\n" + "\n" + "3LCD texnologiyasining afzalliklari:\n" + "Yorqin ranglar:\n" + "Rangli yorug'lik chiqishi (Color Light Output, CLO) yuqori bo'lib, bu proyektor tasvirlarini yorqinroq va jonliroq qiladi.\n" + "Tabiiy tasvir sifati:\n" + "Ranglar aniqligiga katta e'tibor qaratilgan, bu esa ranglarni tabiiy va aniq aks ettirishni ta'minlaydi.\n" + "Ko'zga qulay:\n" + "Rang balansidagi barqarorlik ko'zlarni charchatmaydi.\n" + "Energiya tejovchi:\n" + "Kamroq energiya sarfi bilan yuqori tasvir sifati ta'minlanadi.\n" + "Mashhur Epson 3LCD proyektor modellari:\n" + "Epson EH-TW7100\n" + "\n" + "Resolutsiya: 4K PRO-UHD\n" + "Yorug'lik chiqishi: 3,000 lumen\n" + "Rangli chiqish: 3,000 lumen\n" + "Uy kinoteatri uchun mo'ljallangan.\n" + "Epson EB-X41\n" + "\n" + "Resolutsiya: XGA (1024x768)\n" + "Yorug'lik chiqishi: 3,600 lumen\n" + "Mobillik va oson boshqarish uchun yengil dizayn.\n" + "Epson EB-L200F\n" + "\n" + "Resolutsiya: Full HD (1920x1080)\n" + "Yorug'lik chiqishi: 4,500 lumen\n" + "Lazerni proyeksiya texnologiyasi bilan ishlaydi.\n" + "Epson BrightLink 1485Fi\n" + "\n" + "Resolutsiya: WUXGA (1920x1200)\n" + "Yorug'lik chiqishi: 5,000 lumen\n" + "Interaktiv va ta'lim muhitlari uchun mo'ljallangan.\n" + "Epson PowerLite 1781W\n" + "\n" + "Resolutsiya: WXGA (1280x800)\n" + "Yorug'lik chiqishi: 3,200 lumen\n" + "Ko'chma foydalanish uchun ultra yupqa dizayn.\n" + "Epson proyektorlarining qo'llanishi:\n" + "Uy kinoteatrlari: Uyda yuqori sifatli kinofilm tomosha qilish uchun.\n" + "Ta'lim: Sinflar va dars xonalarida interaktiv darslar o'tkazish.\n" + "Biznes: Prezentatsiyalar va yig'ilishlar uchun.\n" + "Ko'ngilochar tadbirlar: Ochiq havoda kinoseanslar yoki sport o'yinlarini tomosha qilish.\n" + "Epson 3LCD texnologiyasi ko'p foydalanuvchilar tomonidan yuqori sifat va ishonchliligi uchun qadrlanadi.\n" + "\n" + "\n" + "\n" + "\n" + "\n" + "\n",
                            R.drawable.epson3lcd,
                            "J72DUYNsBEI"
                        ),

                        pc_model(
                            "Epson EB-2065 5500",
                            """Epson EB-2065 5500 modeli — bu yuqori sifatli tasvir va funksionallikni taklif etadigan proyektor. U asosan ta'lim, biznes uchrashuvlari va katta yig'ilishlar uchun mo'ljallangan. Ushbu model Epson’ning 3LCD texnologiyasi bilan jihozlangan bo'lib, yorqin va aniq ranglarni taqdim etadi.

Texnik xususiyatlari:
Texnologiya: Epson 3LCD
Yorug'lik chiqishi: 5500 lumen (oq va rangli yorug'lik uchun)
Resolutsiya: XGA (1024 x 768 piksel)
Kontrast nisbati: 15,000:1
Lampa muddati:
Oddiy rejim: ~5,000 soat
Eko rejim: ~10,000 soat
Proyeksiya hajmi: 30" dan 300" gacha
Ko'rish masofasi: 0.76 m ~ 7.62 m
Tilayverish nisbati: 1.38:1 - 2.24:1 (zoom funksiyasi bilan)
Lampa quvvati: 300W
Rang reproduktsiyasi: 16,77 million rang.
Ulanish imkoniyatlari:
HDMI (HDMI x 2)
VGA (kompyuter va boshqa qurilmalar uchun)
USB A va USB B portlari
RCA video (kompozit)
RJ-45 (Ethernet) va Wi-Fi (opsion) orqali tarmoq ulanishi
Audio kirish va chiqish.
Afzalliklari:
Yuqori yorug'lik: Yorqin sharoitlarda ham aniq va o'qilishi oson tasvirlarni taqdim etadi.
Keng proyeksiya hajmi: Kichik xonalardan tortib katta auditoriyalarga qadar moslashadi.
Oson sozlash: Keyston korreksiyasi, avtomatik yuklanish va Wi-Fi opsiyalari bilan moslashuvchanlik.
Energiya tejamkorlik: Eko rejimida lampa muddati va quvvat sarfi optimallashtirilgan.
Qo'llanilishi:
Korporativ prezentatsiyalar: Keng ekran hajmi va aniq tasvir bilan biznes yig'ilishlarida foydalanish uchun ideal.
Ta'lim: Sinflarda katta hajmdagi ma'lumotlarni ko'rsatish uchun mos.
Tadbirlar va ko'ngilochar dasturlar: Film tomosha qilish yoki sport o'yinlarini katta ekranda namoyish qilish imkoniyati.
Umumiy baho:
Epson EB-2065 yuqori darajadagi funksionallik va ishlash qobiliyati bilan o'z sinfidagi eng yaxshi proyektorlardan biri hisoblanadi. U katta auditoriyalar va yorug' xonalar uchun mukammal yechim hisoblanadi.""",
                            R.drawable.epson_2065,
                            "flVYqt2XerU"
                        ),

                        pc_model(
                            "Epson EB-536 ", """
Epson EB-536 modeli kichik va o'rta hajmdagi xonalar uchun mo'ljallangan proyektor bo'lib, qisqa masofadan sifatli tasvirni taqdim etadi. Ushbu model ta'lim va biznes maqsadlarida ishlatiladi va Epson 3LCD texnologiyasi bilan jihozlangan, bu esa yorqin va tabiiy ranglarni ta'minlaydi.

Texnik xususiyatlari:
Texnologiya: Epson 3LCD
Resolutsiya: XGA (1024 x 768 piksel)
Yorug'lik chiqishi: 3400 lumen (oq va rangli yorug'lik uchun)
Kontrast nisbati: 16,000:1
Lampa muddati:
Oddiy rejim: ~5,000 soat
Eko rejim: ~10,000 soat
Proyeksiya hajmi: 53" - 116" (asosiy masofada)
Proyeksiya masofasi: 0.5 m - 1.2 m (qisqa masofa)
Tilayverish nisbati: 0.55:1
Lampa quvvati: 210W
Rang reproduktsiyasi: 1.07 milliard rang.
Ulanish imkoniyatlari:
HDMI (bitta port)
VGA (kompyuter ulash uchun)
USB-A va USB-B
RCA video kirish
RS-232C (boshqaruv uchun)
Audio kirish va chiqish.
Afzalliklari:
Qisqa masofadan proyeksiya: Kichik xonalar uchun mos, ya'ni proyektor devordan yaqin masofada joylashtirilsa ham katta tasvirni taqdim etadi.
Yuqori yorqinlik: Yorug' xonalarda ham aniq va ravshan tasvirni ko'rsatadi.
Keyston korreksiyasi: Tasvirni avtomatik ravishda tekislash funksiyasi mavjud.
Tejamkorlik: Eko rejimda energiya tejash va lampa muddati uzaytirilgan.
Ovoz imkoniyati: Ichki karnay orqali ovoz chiqishi, qo'shimcha karnay ulash imkoniyati.
Qo'llanilishi:
Ta'lim muhitlari: Dars xonalarida interaktiv ta'lim uchun ideal.
Biznes foydalanishi: Prezentatsiya va yig'ilishlar uchun moslashuvchanlik.
Uy foydalanishi: Film tomosha qilish yoki kichik tadbirlar uchun qulay.
Umumiy baho:
Epson EB-536 modeli o'zining qisqa masofadan aniq tasvir berish qobiliyati, yuqori sifatli ranglarni taqdim etishi va foydalanish qulayligi bilan ajralib turadi. Kichik xonalar va yorug' sharoitlar uchun ajoyib tanlovdir.

""", R.drawable.epson_eb536, "63H2vdVqa3M"
                        ),

                        ),
                ),
                brand_model(
                    "Optoma",
                    arrayListOf(
                        pc_model(
                            "Optoma HD28e",
                            """Optoma HD28e modeli - bu yuqori sifatli DLP (Digital Light Processing) texnologiyasiga asoslangan uy kinoteatrlari va boshqa ko'ngilochar tadbirlar uchun mo'ljallangan proyektor. Ushbu proyektor yuqori yorqinlik, aniqlik va jonli ranglarni taqdim etadi, bu esa uni turli sharoitlarda foydalanish uchun mos qiladi.

Texnik xususiyatlari:
Texnologiya: DLP
Yorug'lik chiqishi: 3800 lumen
Resolutsiya: Full HD (1920 x 1080 piksel)
Kontrast nisbati: 30,000:1
Proyeksiya hajmi: 28" dan 305" gacha
Tilayverish nisbati: 1.47:1 - 1.62:1
Proyeksiya masofasi: 1.2 m - 10 m
Rang reproduktsiyasi: 1.07 milliard rang
Lampa muddati:
Oddiy rejim: ~6,000 soat
Eko rejim: ~10,000 soat
Dynamic rejim: ~15,000 soat
3D qo'llab-quvvatlashi: Ha (Full 3D)
Ulanish imkoniyatlari:
HDMI (HDMI 2.0, 2 ta port)
USB (quvvatlash uchun)
Audio chiqish (3.5 mm port)
RS-232C port (boshqaruv uchun)
Afzalliklari:
Yuqori aniqlik: Full HD tasvirlar va videolarni yuqori sifatda ko'rsatadi.
Yorqin tasvir: 3800 lumen yorqinlik yorug' xonada ham aniq ko'rish imkonini beradi.
Katta ekran tajribasi: Katta proyeksiya hajmi uni uy kinoteatri yoki katta ko'ngilochar tadbirlar uchun ideal qiladi.
Uzoq muddatli lampa: Dynamic rejimda lampaning uzoq umr ko'rishi.
3D qo'llab-quvvatlashi: 3D kontentni to'liq qo'llab-quvvatlaydi.
Keyston korreksiyasi: Tasvirni to'g'rilash uchun qulaylik beradi.
Qo'llanilishi:
Uy kinoteatrlari: Oila va do'stlar bilan kinolarni katta ekranda tomosha qilish uchun.
O'yinlar: O'yin konsollarini ulash va katta ekranda zavqlanish.
Ko'ngilochar tadbirlar: Tadbirlar va sport o'yinlarini namoyish qilish uchun qulay.
Biznes foydalanishi: Katta va yorqin prezentatsiyalar uchun ham ishlatilishi mumkin.
Umumiy baho:
Optoma HD28e modeli sifat va narx nisbati bo'yicha yuqori baholanadi. Yorqinligi, yuqori aniqligi va katta ekran imkoniyatlari bilan o'zini oqlaydi. Uy kinoteatri yoki ko'ngilochar foydalanish uchun juda yaxshi tanlovdir.






""",
                            R.drawable.optoma_hd28e,
                            "ZA1Uryklu8o"
                        ), pc_model(
                            "Optoma HD36UST ",
                            """Optoma HD36UST — bu ultra qisqa masofadan yuqori sifatli tasvirni taqdim etadigan DLP texnologiyasiga ega proyektor. U uy kinoteatrlari, ta'lim va biznes maqsadlari uchun mo'ljallangan bo'lib, katta ekranli tajribani kichik makonda taqdim etadi.

Texnik xususiyatlari:
Texnologiya: DLP
Resolutsiya: Full HD (1920 x 1080 piksel)
Yorug'lik chiqishi: 3600 lumen
Kontrast nisbati: 25,000:1
Proyeksiya hajmi: 85" dan 100" gacha
Proyeksiya masofasi: 0.4 m - 0.6 m (ultra qisqa masofa)
Tilayverish nisbati: ~0.25:1
Lampa muddati:
Oddiy rejim: ~4,000 soat
Eko rejim: ~6,000 soat
3D qo'llab-quvvatlashi: To'liq 3D (Full 3D)
Ranglar: 1.07 milliard rang.
Ulanish imkoniyatlari:
2x HDMI (HDMI 1.4a)
USB (quvvatlash uchun yoki multimedia ulanish)
VGA (kompyuter ulanishi uchun)
Audio kirish/chiqish (3.5 mm port)
RJ-45 (Ethernet)
RS-232C (boshqaruv uchun).
Afzalliklari:
Ultra qisqa masofa: Juda yaqin masofada katta tasvirni proyeksiya qilish imkonini beradi, bu esa kichik xonalar uchun ideal.
Yuqori yorqinlik: 3600 lumen yorug' sharoitda ham aniq tasvir taqdim etadi.
Full HD tasvir: Yuqori sifatli va ravon tasvirlar bilan uy kinoteatri tajribasi.
3D qo'llab-quvvatlashi: 3D kontentni yuqori sifatda aks ettirish imkoniyati.
Energiya tejamkorlik: Eko rejimi tufayli lampaning uzoq umr ko'rishi va quvvatni tejash.
Ovoz integratsiyasi: Ichki dinamiklar yoki tashqi audio tizim bilan ishlash.
Qo'llanilishi:
Uy kinoteatri: Katta ekranli kinolar va sport o'yinlarini tomosha qilish uchun ideal.
Ta'lim: Dars xonalarida qisqa masofadan interaktiv foydalanish imkoniyati.
Biznes: Prezentatsiyalar va yig'ilishlar uchun mos.
Ko'ngilochar tadbirlar: Film tomosha qilish yoki o'yin o'ynash uchun qulay.
Umumiy baho:
Optoma HD36UST ultra qisqa masofali proyektorlar orasida o'zining yuqori sifatli tasviri, yorqinligi va foydalanish qulayligi bilan ajralib turadi. Bu model kichik joylarda katta ekran tajribasi yaratmoqchi bo'lgan foydalanuvchilar uchun mukammal tanlov hisoblanadi.







""",
                            R.drawable.optoma_hd36,
                            "aoDETyuI9o"
                        ), pc_model(
                            "Optoma ML1050STi",
                            """Optoma ML1050STi modeli — bu ultra portativ proyektor bo'lib, qisqa masofadan yuqori sifatli tasvirni taqdim etadi. U ta'lim, biznes va ko'chma foydalanish uchun mo'ljallangan. Ushbu proyektor LED texnologiyasidan foydalanib, uzoq umr ko'rish va yuqori rang aniqligini ta'minlaydi.

Texnik xususiyatlari:
Texnologiya: DLP LED
Resolutsiya: WXGA (1280 x 800 piksel)
Yorug'lik chiqishi: 1,000 lumen
Kontrast nisbati: 20,000:1
Proyeksiya hajmi: 17" dan 100" gacha
Proyeksiya masofasi: ~0.43 m - 3.5 m
Tilayverish nisbati: 0.8:1 (qisqa masofa)
Lampa muddati: ~30,000 soat (LED lampasi)
Og'irligi: ~420 gram
Rang reproduktsiyasi: 1.07 milliard rang.
Ulanish imkoniyatlari:
HDMI (MHL qo'llab-quvvatlovi bilan)
USB port (multimedia va quvvatlash uchun)
microSD karta uyasi (maksimal 32GB gacha)
Wi-Fi (integratsiyalashgan yoki qo'shimcha donador bilan)
Audio chiqish (3.5 mm port).
Afzalliklari:
Portativlik: Yengil va kichik o'lchamli, ko'chma foydalanish uchun juda qulay.
Qisqa masofali proyeksiya: Yaqin masofadan katta ekran hosil qilish imkoniyati.
LED texnologiyasi: Uzoq lampa muddati va kam texnik xizmat talab qiladi.
Multimedia qo'llab-quvvatlovi: USB va microSD orqali to'g'ridan-to'g'ri kontent ijrosi.
Wi-Fi ulanishi: Simsiz uzatish imkoniyati.
Tez ishga tushish: LED lampasi tufayli proyektor tezda ishga tayyor bo'ladi.
Qo'llanilishi:
Biznes: Yig'ilishlar va taqdimotlar uchun juda mos.
Ta'lim: Kichik dars xonalarida foydalanish uchun qulay.
Sayohat: Ko'chma foydalanish uchun ideal.
Uy foydalanishi: Kichik hajmdagi kinoteatr yoki o'yin uchun.
Umumiy baho:
Optoma ML1050STi modeli o'zining ixcham dizayni, qisqa masofadan proyeksiya qilish imkoniyati va uzoq umr ko'ruvchi LED lampasi bilan ajralib turadi. Bu model tez-tez harakatlanadigan yoki ko'chma proyektor talab qiladigan foydalanuvchilar uchun mukammal tanlov hisoblanadi.






""",
                            R.drawable.optoma_ml1050,
                            "bVIHGh99xoc"
                        )
                    ),

                    ),

                )

        )
        var speakersModels = main_model(
            "Speakers", arrayListOf(
                brand_model(
                    "JBL", arrayListOf(
                        pc_model(
                            "JBL Flip 5",
                            """JBL Flip 5 — bu portativ Bluetooth karnay bo'lib, suvga chidamli dizayni, yuqori sifatli ovozi va uzoq batareya quvvati bilan ajralib turadi. Quvvatli karnaylar seriyasiga kiradi va tashqi foydalanish uchun juda mos keladi.

Texnik xususiyatlari:
Bluetooth versiyasi: 4.2
Ovoz chiqishi: Mono (bitta speaker)
Yorug'lik chiqishi (maksimal): 20W
Batareya quvvati: 4800mAh
Batareya ishlash vaqti: 12 soat (o'rtacha ovoz balandligi bilan)
Suvga chidamlilik: IPX7 (1m chuqurlikda 30 daqiqa davomida suvga chidamli)
Kenglik: 18.4 cm
Og'irlik: 0.54 kg
Ulanish: Bluetooth, USB-C porti (quvvatlash uchun)
Ranglar: Qora, ko'k, yashil, qizil, oq va boshqalar
Afzalliklari:
Suvga chidamlilik: IPX7 sertifikati bilan, bu karnay suvga to'liq chidamli bo'lib, tashqi sharoitlarda foydalanishga juda mos.
Portativlik: Yengil va kichik o'lchamli, ko'chma foydalanish uchun qulay.
Qo'shimcha bass: JBL Bass Radiator texnologiyasi bilan kuchli va chuqur bass ovozini taqdim etadi.
Batareya quvvati: 12 soatgacha ishlash vaqti.
USB-C quvvatlash: Tez quvvatlanish imkoniyati.
Narxi: ${'$'}120 atrofida (do'konga va mamlakatga qarab o'zgarishi mumkin).
JBL Flip 5 — bu o'zining yuqori sifatli ovozi, kuchli bassi, uzoq batareya quvvati va suvga chidamliligi bilan ko'chma va tashqi foydalanish uchun juda mos keladi.






""",
                            R.drawable.jbl_flib,
                            "WtXnSiPeskc"
                        ), pc_model(
                            "JBL Charge 5",
                            """JBL Charge 5 — bu yuqori sifatli portativ Bluetooth karnay bo'lib, kuchli ovoz, ekstra bass va uzoq batareya ishlash vaqti bilan ajralib turadi. Suvga chidamli dizayni va mustahkam tuzilishi bilan tashqi sharoitlarda foydalanish uchun ideal.

Texnik xususiyatlari:
Bluetooth versiyasi: 5.1
Ovoz chiqishi: Mono (bitta speaker)
Yorug'lik chiqishi (maksimal): 30W
Batareya quvvati: 7500mAh
Batareya ishlash vaqti: 20 soat (o'rtacha ovoz balandligi bilan)
Suvga chidamlilik: IP67 (chang va suvga chidamli, 1m chuqurlikda 30 daqiqa davomida suvga chidamli)
Kenglik: 22 cm
Og'irlik: 0.96 kg
Ulanish: Bluetooth 5.1, USB-C porti (quvvatlash uchun)
Ranglar: Qora, ko'k, yashil, qizil va boshqalar
Afzalliklari:
Suv va changga chidamli: IP67 sertifikati bilan, JBL Charge 5 suv va changga to'liq chidamli, tashqi sharoitlarda foydalanish uchun mukammal.
Kuchli ovoz va bass: JBL Bass Radiator texnologiyasi va kuchli ovoz chiqishi bilan eng yaxshi musiqalarni tinglash imkoniyati.
Batareya quvvati: 20 soatgacha ishlash vaqti, katta quvvatli 7500mAh batareya bilan.
Powerbank funksiyasi: USB-A porti orqali boshqa qurilmalarga quvvat berish imkoniyati.
Tez quvvatlash: USB-C porti orqali tez quvvatlanish va 4 soatda to'liq quvvatlanish.
Narxi: ${'$'}180 atrofida (do'konga va mamlakatga qarab o'zgarishi mumkin).
JBL Charge 5 — bu tashqi sharoitlarda foydalanish uchun ideal bo'lgan portativ karnay, kuchli ovoz, uzoq batareya ishlash va suvga chidamliligi bilan ajralib turadi.






""",
                            R.drawable.jbl_charge5,
                            "b4aof_EKA78"
                        )
                    )
                ),
                brand_model(
                    "Sony", arrayListOf(
                        pc_model(
                            "Sony SRS-XB43",
                            """Sony SRS-XB43 — bu portativ Bluetooth karnay, ekstra bass funksiyasi, uzoq batareya quvvati va suvga chidamli dizayni bilan ajralib turadi. Bu model ayniqsa o'yinlar, partiyalar va tashqi sharoitlar uchun mos bo'lib, kuchli ovoz va bassni taqdim etadi.

Texnik xususiyatlari:
Bluetooth versiyasi: 5.0
Ovoz chiqishi: Mono (bitta speaker)
Yorug'lik chiqishi (maksimal): 50W
Batareya quvvati: 4800mAh
Batareya ishlash vaqti: 24 soat (o'rtacha ovoz balandligi bilan)
Suvga chidamlilik: IP67 (suv va changga chidamli, 1m chuqurlikda 30 daqiqa davomida suvga chidamli)
Kenglik: 68.4 cm
Og'irlik: 2.9 kg
Ulanish: Bluetooth 5.0, USB-C porti (quvvatlash uchun)
Ranglar: Qora, ko'k, qizil
Afzalliklari:
Ekstra bass funksiyasi: Sony Extra Bass texnologiyasi bilan kuchli bass va ovoz chiqarishni taqdim etadi, bu musiqani yanada jonli qiladi.
Suv va changga chidamli: IP67 sertifikati bilan, bu karnay suvga va changga to'liq chidamli, tashqi sharoitlarda foydalanish uchun juda mos.
Kuchli ovoz va yorug'lik: Eng katta ovoz va yorug'lik effektlari bilan, partiyalar va tashqi tadbirlarga mos keladi.
Batareya quvvati: 24 soatgacha ishlash vaqti, uzoq davom etadigan batareya bilan.
Party Connect: Bir nechta Sony karnaylarini birlashtirib, katta hajmli ovoz tizimini yaratish imkoniyati.
Narxi: ${'$'}250 atrofida (do'konga va mamlakatga qarab o'zgarishi mumkin).
Sony SRS-XB43 — bu o'yinlar, partiyalar va tashqi sharoitlarda foydalanish uchun ideal bo'lgan portativ karnay, kuchli bass, uzoq batareya ishlash va suvga chidamliligi bilan ajralib turadi.""",
                            R.drawable.sonysrs,
                            "HRpW0OrdeTQ"
                        ), pc_model(
                            "Sony SRS-D4",
                            """Sony SRS-D4 — bu kompyuter va multimedia uchun mo‘ljallangan yuqori sifatli 2.1 audio tizim bo‘lib, kuchli ovoz va bassni ta’minlaydi. Ushbu model kichik hajmda ham mukammal audio tajribasini taqdim etadi va o‘yin, filmlar, va musiqa tinglash uchun mos keladi.

Texnik xususiyatlari:
Ovoz tizimi: 2.1 (2 ta satellite speaker va 1 ta subwoofer)
Chiqish quvvati: 27W (subwoofer: 14W, satellite speakerlar: 2x6.5W)
Chastota diapazoni: 40 Hz – 20 kHz
Ulanish: 3.5 mm audio jack
Ovoz sozlamalari: Bass va ovoz balandligini boshqarish
Material: Plastmassa korpus
Og'irlik: 3.5 kg (umumiy)
O'lchamlari:
Subwoofer: 25.5 cm x 17.5 cm x 26 cm
Satellite speakerlar: 9 cm x 16 cm x 8.5 cm
Quvvat manbai: Elektr tarmog‘i orqali
Ranglar: Qora
Afzalliklari:
Kuchli bass: Subwoofer kuchli va aniq bassni ta’minlab, musiqani yanada jonli qiladi.
Ovoz balansi: Satellite speakerlar orqali yuqori va o‘rta chastotalar aniq chiqariladi.
Oddiy ulanish: 3.5 mm audio jack orqali kompyuter, noutbuk yoki boshqa qurilmalar bilan oson ulanadi.
Sozlanish imkoniyatlari: Ovoz va bassni oson boshqarish uchun tugmalar mavjud.
Kichik va qulay dizayn: Stol ustiga o‘rnatish uchun mos hajm.
Narxi: ${'$'}180 atrofida (do'konga va mamlakatga qarab farq qilishi mumkin).
Sony SRS-D4 — bu kompyuter foydalanuvchilari va multimedia ixlosmandlari uchun mo‘ljallangan qulay va sifatli ovoz tizimi bo‘lib, filmlar, musiqa va o‘yinlarda yuqori audio tajribasini ta’minlaydi.






""",
                            R.drawable.sony_mijik,
                            "fHZ1z1LOd1I",
                        )
                    )
                ),
                brand_model(
                    "Logitech", arrayListOf(
                        pc_model(
                            "Logitech Z623",
                            """Logitech Z623 — bu yuqori sifatli 2.1 audio tizim bo‘lib, kuchli bass, aniqlik, va THX sertifikatlangan ovoz bilan ajralib turadi. Ushbu model o‘yinlar, filmlar, va musiqa tinglash uchun juda mos bo‘lib, uyda foydalanish uchun ideal hisoblanadi.

Texnik xususiyatlari:
Ovoz tizimi: 2.1 (2 ta satellite speaker va 1 ta subwoofer)
Chiqish quvvati:
Umumiy quvvat: 200W RMS
Subwoofer: 130W RMS
Satellite speakerlar: 2x35W RMS
Chastota diapazoni: 35 Hz – 20 kHz
Sertifikat: THX (yuqori sifatli ovoz standartiga mos)
Ulanish:
3.5 mm audio jack
RCA kirish porti
Ovoz boshqaruvlari: Bass va ovoz balandligi uchun alohida boshqaruv tugmalari
Subwoofer o‘lchamlari: 28.4 cm x 30.5 cm x 26.4 cm
Satellite speaker o‘lchamlari: 11.6 cm x 19.6 cm x 12.4 cm
Og‘irlik: 7 kg (umumiy)
Quvvat manbai: Elektr tarmog‘i orqali
Rang: Qora
Afzalliklari:
Kuchli va aniq ovoz: 200W quvvat bilan filmlar, o‘yinlar va musiqalarda immersiv audio tajribani ta’minlaydi.
THX sertifikati: Yuqori sifatli ovoz standartlari asosida ishlab chiqarilgan.
Bass boshqaruvi: Subwoofer orqali chuqur bass darajasini sozlash imkoniyati.
Ko‘p ulanish imkoniyatlari: 3.5 mm jack va RCA kirishlari yordamida bir nechta qurilmalarga ulanish qulayligi.
Qulay boshqaruv: Ovoz balandligi va bassni sozlash uchun tugmalar satellite speakerlaridan birida joylashgan.
Narxi: ${'$'}160 atrofida (do'konga va mamlakatga qarab farq qilishi mumkin).
Logitech Z623 — bu o‘yin ixlosmandlari va multimedia foydalanuvchilari uchun mukammal tanlov bo‘lib, kuchli ovoz, chuqur bass, va qulay boshqaruv bilan uyda immersiv audio tajribasini ta’minlaydi.







""",
                            R.drawable.logitech_z636,
                            "8h5W_fjxvNY"
                        ), pc_model(
                            "Logitech Z906",
                            """Logitech Z906 — bu yuqori sifatli 5.1 kanalli audio tizim bo‘lib, THX sertifikati, kuchli ovoz chiqishi va ko‘p turdagi ulanish imkoniyatlari bilan ajralib turadi. Ushbu model filmlar, o‘yinlar va musiqalarni teatr darajasidagi audio tajribada tinglash uchun ideal tanlovdir.

Texnik xususiyatlari:
Ovoz tizimi: 5.1 (4 ta satellite speaker, 1 ta markaziy speaker va 1 ta subwoofer)
Chiqish quvvati:
Umumiy quvvat: 500W RMS
Subwoofer: 165W RMS
Satellite speakerlar: 4x67W RMS
Markaziy speaker: 67W RMS
Sertifikat: THX, Dolby Digital, DTS
Chastota diapazoni: 35 Hz – 20 kHz
Ulanish:
3.5 mm audio jack
RCA kirish portlari
Optik kirish
Koaksial kirish
6-kanalli to‘g‘ridan-to‘g‘ri ulanish
Boshqaruv paneli: Kichik displeyli boshqaruv blok
Fokus rejimi: Stereo, 4.1 va 5.1 holatlariga o‘tish imkoniyati
O‘lchamlari:
Subwoofer: 29.3 cm x 28.1 cm x 31.9 cm
Satellite speakerlar: 10 cm x 16.6 cm x 9.4 cm
Markaziy speaker: 16.6 cm x 10 cm x 9.4 cm
Og‘irlik: 15 kg (umumiy)
Quvvat manbai: Elektr tarmog‘i orqali
Rang: Qora
Afzalliklari:
Kuchli ovoz chiqishi: 500W umumiy quvvat bilan immersiv audio tajriba.
Sertifikatlar: THX, Dolby Digital, va DTS qo‘llab-quvvatlovi yuqori sifatli audio standartlarini ta’minlaydi.
Ko‘p ulanish imkoniyatlari: 3.5 mm jack, RCA, optik, va koaksial kirishlar bilan bir nechta qurilmalarga ulanish imkoniyati.
Surround ovoz: 5.1 kanalli tizim kinoteatr darajasidagi audio taqdim etadi.
Boshqaruv qulayligi: Alohida boshqaruv paneli va masofadan boshqarish pulti bilan oson boshqarish.
Narxi: ${'$'}300–${'$'}400 atrofida (do‘konga va mamlakatga qarab farq qilishi mumkin).
Logitech Z906 — bu uy kinoteatri va o‘yin ixlosmandlari uchun mukammal tanlov bo‘lib, kuchli ovoz, chuqur bass, va ko‘p turdagi ulanish imkoniyatlari bilan yuqori darajadagi audio tajribani ta’minlaydi.
""",
                            R.drawable.logitech_z905,
                            "9jxSFcMgwX0"
                        )
                    )
                ),

                )
        )
        var webcamModels = main_model(
            "Web Cameras", arrayListOf(

                brand_model(
                    "Logitech", arrayListOf(
                        pc_model(
                            "Logitech C920", """Asosiy Texnik Xususiyatlar:
Video Aniqligi: Full HD 1080p (1920 x 1080 piksel).
Ovoz: Ikkita stereo mikrofon (har ikki tomonda) yuqori sifatli ovoz yozishni ta'minlaydi.
Avtofokus: Ha, avtofokus texnologiyasi mavjud, bu esa har qanday masofada aniq tasvir olish imkonini beradi.
Obyektiv: 78° ko'rish burchagi bilan shisha obyektiv.
Yoritish Muvozanati: Avtomatik yorug'likni sozlash imkoniyati mavjud (RightLight 2 texnologiyasi).
Ulanish: USB 2.0 port orqali ulanish.
Qo'llanilishi:
Video Qo'ng'iroqlar: Zoom, Microsoft Teams, Google Meet kabi platformalarda yuqori sifatli video qo'ng'iroqlar uchun mos.
Streaming: Twitch yoki YouTube kabi platformalarda jonli efirlar uchun juda qulay.
Video Yozuvlar: Full HD formatda yuqori sifatli video yozish imkoniyatini beradi.
Qo'shimcha Funktsiyalar:
Plug-and-Play: Drayver talab qilmaydi, oson sozlanadi.
Tripod Ilgagi: Tripodga o'rnatish uchun maxsus ilgak bilan jihozlangan.
Ilova Qo'llab-quvvatlovi: Logitech Capture ilovasidan foydalanib, sozlashlar va turli effektlarni qo'shish mumkin.
Narxi:
O'rtacha narx: ${'$'}70 - ${'$'}100 (do'konlar va hududga qarab o'zgarishi mumkin).
Afzalliklari:
Yuqori sifatli video va audio.
Professional ko'rinishdagi video yozuv va efirlarni ta'minlaydi.
Kompaniya va uy sharoitida foydalanish uchun ideal.
Kamchiliklari:
4K video qo'llab-quvvatlanmaydi.
USB-C ulanishi yo'q (faqat USB 2.0 mavjud).
Umumiy Baho:
Logitech C920 modeli o'zining narx va sifat nisbati bo'yicha eng mashhur web-kameralardan biri hisoblanadi. U yuqori aniqlikdagi video va ovoz sifati bilan ajralib turadi, bu esa uni professional va shaxsiy foydalanish uchun ajoyib tanlovga aylantiradi.






""", R.drawable.logiotech_c920, "gU4035dDN2s"
                        ), pc_model(
                            "Logitech StreamCam", """Asosiy Texnik Xususiyatlar:
Video Aniqligi: Full HD 1080p (1920 x 1080 piksel) 60fps tezlikda.
Ovoz: Ikkita ichki stereo mikrofon yuqori sifatli ovoz yozishni ta'minlaydi.
Avtofokus va Ekspozitsiya: Yuqori aniqlikdagi avtofokus va aqlli ekspozitsiya.
Obyektiv: Shisha obyektiv, 78° ko'rish burchagi bilan.
Orientatsiya: Gorizontal yoki vertikal rejimda suratga olish uchun aylantiriluvchi dizayn.
Ulanish: USB-C port orqali tezkor va ishonchli ulanish.
Qo'llanilishi:
Streaming: Twitch va YouTube kabi platformalarda 1080p/60fps sifatda jonli efirlar uchun mos.
Kontent Yaratuvchilar Uchun: Vertikal video uchun optimallashtirilgan, Instagram va TikTok kabi platformalar uchun juda qulay.
Video Qo'ng'iroqlar: Microsoft Teams, Zoom, Google Meet kabi platformalarda yuqori sifatli video qo'ng'iroqlar uchun.
Qo'shimcha Funktsiyalar:
Logitech Capture Ilovasi: Tasvirni sozlash, kadrga olish va filtrlarni qo'llash imkoniyati.
Yoritish Moslashuvi: Yorug'lik sharoitlariga mos keladigan aqlli sozlash (RightLight 3 texnologiyasi).
Tripod Mosligi: Tripodga o'rnatish uchun maxsus ilgak mavjud.
Narxi:
O'rtacha narx: ${'$'}150 - ${'$'}170 (do'konlar va hududga qarab o'zgarishi mumkin).
Afzalliklari:
60fps tezlikda silliq video oqimi.
USB-C ulanishi orqali tez va barqaror signal.
Kontent yaratish uchun vertikal rejim qo'llab-quvvatlanadi.
Yoritilgan sharoitlarda avtomatik moslashuv.
Kamchiliklari:
4K video qo'llab-quvvatlanmaydi.
USB-C portga ega bo'lmagan qurilmalar uchun adapter talab qilinishi mumkin.
Umumiy Baho:
Logitech StreamCam modeli ayniqsa kontent yaratuvchilar va streamerlar uchun mo'ljallangan. Uning yuqori aniqlikdagi video sifati va moslashuvchan dizayni uni TikTok va Instagram kabi platformalar uchun ideal qiladi. Shuningdek, professional video konferensiyalar uchun ham juda mos keladi.






""", R.drawable.logitech_stream_cam, "xjZh2wtW5pg"
                        ), pc_model(
                            "Logitech BRIO", """Asosiy Texnik Xususiyatlar:
Video Aniqligi:
4K Ultra HD (4096 x 2160 piksel)
Full HD 1080p (1920 x 1080 piksel)
HD 720p (1280 x 720 piksel)
Ovoz:
Ikkita stereo mikrofon yuqori sifatli audio yozish imkonini beradi.
HDR Qo'llab-quvvatlovi: Yorqinroq ranglar va aniqlik uchun HDR texnologiyasi.
Ko‘rish Burchagi: Uchta sozlanadigan rejim: 65°, 78°, va 90°.
Ulanish: USB 3.0 port orqali tezkor va yuqori sifatli ulanish.
Windows Hello Qo'llab-quvvatlovi: Yuzni tanish orqali xavfsiz kirish imkoniyati.
Qo'llanilishi:
Professional Foydalanish: Yuqori sifatli video konferensiyalar, webinarlar va stremlar uchun ideal.
Ochilish Yozuvlari: Video yozuvlar va kontent yaratish uchun mos.
Yuzni Tanish: Xavfsizlikni ta'minlash uchun Windows Hello texnologiyasini ishlatadi.
Qo'shimcha Funktsiyalar:
Background Replacement: Logi Tune yoki uchinchi tomon dasturlari yordamida fonni o'zgartirish imkoniyati.
RightLight 3 Texnologiyasi: Har qanday yorug'lik sharoitida aniq video olish uchun avtomatik yorug'lik sozlash.
Plug-and-Play: Hech qanday murakkab o'rnatishsiz ishlaydi.
Narxi:
O'rtacha narx: ${'$'}180 - ${'$'}200 (do'konlar va hududga qarab o'zgarishi mumkin).
Afzalliklari:
4K Video Aniqligi: Yuqori aniqlikdagi tasvir va video sifati.
Windows Hello: Xavfsiz kirish uchun yuzni aniqlash imkoniyati.
Professional Ko'rinish: HDR va keng ko'rish burchagi bilan aniq va sifatli tasvir olish.
Moslashuvchan Foydalanish: Uch xil ko'rish burchagi va keng ko'lamli dasturlar bilan moslashuvchan.
Kamchiliklari:
Narxi nisbatan qimmat.
USB 3.0 port talab qiladi, bu esa eski qurilmalarda muammo bo'lishi mumkin.
Umumiy Baho:
Logitech BRIO modeli professional darajadagi video va audio sifati bilan ajralib turadi. U konferensiyalar, striming va xavfsiz kirish uchun ideal tanlovdir. Agar siz yuqori aniqlik va funksionallikka ega web-kamera qidirayotgan bo'lsangiz, Logitech BRIO siz uchun ajoyib variant.






""", R.drawable.logitech_brio, "v6YzDgcLkzM"
                        )
                    )
                ),

                brand_model(
                    "Razer", arrayListOf(
                        pc_model(
                            "Razer Kiyo",
                            """Asosiy Texnik Xususiyatlar:
Video Aniqligi:
1080p (1920 x 1080 piksel) da 30fps.
720p (1280 x 720 piksel) da 60fps.
Mikrofon: Yuqori sifatli ichki mikrofon.
Halqa Yoritgich: O'rnatilgan LED halqa yoritgich uch darajada sozlanadi (pastdan yuqoriga).
Obyektiv: Avtofokus bilan yuqori sifatli shisha obyektiv.
Ulanish: USB 2.0 port orqali ulanish.
Qo'llanilishi:
Streaming: Twitch, YouTube kabi platformalarda sifatli strimlar uchun mos.
Video Qo'ng'iroqlar: Zoom, Microsoft Teams kabi platformalarda aniq va ravshan tasvir.
Kontent Yaratish: Kameraning o'rnatilgan yoritgichi yorug' sharoitlarni ta'minlaydi, bu esa blog yoki boshqa kontent yaratish uchun qulay.
Qo'shimcha Funktsiyalar:
Plug-and-Play: Oson sozlanadi va hech qanday murakkab o'rnatish talab etmaydi.
Halqa Yoritgich Sozlamasi: Yorug'lik sharoitlari yomon bo'lsa, yoritgich juda qulay.
Silliq Video: 720p da 60fps strimerlar uchun silliq videolarni ta'minlaydi.
Narxi:
O'rtacha narx: ${'$'}80 - ${'$'}100 (do'konlar va hududga qarab o'zgarishi mumkin).
Afzalliklari:
O'rnatilgan Yoritgich: Qo'shimcha yorug'lik kerak bo'lmasligi uchun LED halqa.
Silliq Video: 60fps tezlikda silliq video oqimi.
Portativlik: Kichik va engil, har qanday joyga o'rnatish oson.
Avtofokus: Har qanday masofada aniq tasvir.
Kamchiliklari:
4K Qo'llab-quvvatlanmaydi: Faqat 1080p va 720p uchun mo'ljallangan.
USB 2.0: USB 3.0 ning afzalliklarini taklif qilmaydi.
Umumiy Baho:
Razer Kiyo modeli streamerlarga va kontent yaratuvchilarga mo'ljallangan kamera bo'lib, o'rnatilgan yoritgich va yuqori sifatli video bilan ajralib turadi. Bu yuqori sifatli strimlar va video konferensiyalar uchun qulay va arzon narxdagi tanlovdir.






""",
                            R.drawable.razer_ki0, "O4yvNVdA-MA",
                        ), pc_model(
                            "Razer Kiyo Pro",
                            """Asosiy Texnik Xususiyatlar:
Video Aniqligi:
Full HD 1080p (1920 x 1080 piksel) 60fps tezlikda.
HDR rejimida 1080p 30fps tezlikda.
Ovoz:
Ichki mikrofon yuqori sifatli audio yozishni ta'minlaydi.
Obyektiv:
Ultra-hassas shisha obyektiv.
Dinamik avtofokus funksiyasi.
Ko‘rish Burchagi:
Uch darajada sozlanadi: 103°, 90°, va 80°.
Ulanish:
USB 3.0 port orqali ulanish.
Qo'llanilishi:
Professional Streaming: Twitch, YouTube kabi platformalarda yuqori sifatli jonli efirlar uchun mos.
Video Qo'ng'iroqlar: Zoom, Google Meet kabi platformalarda aniq va yorqin video.
Kontent Yaratuvchilar Uchun: HDR rejimi tasvir sifatini oshiradi va qulaylikni ta'minlaydi.
Qo'shimcha Funktsiyalar:
HDR Texnologiyasi: Yorqinlik va kontrastni avtomatik ravishda sozlaydi, tasvir sifatini yaxshilaydi.
Keng Ko‘rish Burchagi: Ko‘rish burchagini vaziyatga moslashtirish imkoniyati.
Plug-and-Play: Oson va tez sozlanadi.
Dinamik Avtofokus: Harakatga mos ravishda obyektiv fokusini avtomatik sozlaydi.
Narxi:
O'rtacha narx: ${'$'}150 - ${'$'}200 (do'konlar va hududga qarab o'zgarishi mumkin).
Afzalliklari:
HDR Qo'llab-quvvatlovi: Yorug'lik sharoitlariga moslashib, tasvir sifatini yaxshilaydi.
Keng Ko'rish Burchagi: Guruh qo'ng'iroqlari yoki kengroq kadrlar uchun ideal.
Avtofokus Texnologiyasi: Harakatga mos ravishda fokusni avtomatik sozlash.
USB 3.0 Ulash: Tez va barqaror ulanish imkonini beradi.
Kamchiliklari:
4K Video Aniqligi Yo'q: Faqat 1080p qo'llab-quvvatlanadi.
Narxi Qimmatroq: Oddiy foydalanuvchilar uchun qimmat variant bo'lishi mumkin.
Umumiy Baho:
Razer Kiyo Pro modeli strimerlar va kontent yaratuvchilar uchun yuqori sifatli web-kamera bo'lib, uning HDR rejimi va keng ko‘rish burchagi uni professional foydalanish uchun juda mos qiladi. Agar siz yuqori aniqlikdagi video oqimi va yuqori darajadagi funksionallikni talab qilsangiz, bu kamera ideal tanlovdir.
""",
                            R.drawable.razer_pro,
                            "wJ3yUkBpgW0",
                        )
                    )
                ),

                brand_model(
                    "Microsoft", arrayListOf(
                        pc_model(
                            "Microsoft LifeCam HD-3000",
                            """Asosiy Texnik Xususiyatlar:
Video Aniqligi:
720p HD video (1280 x 720 piksel) 30fps tezlikda.
Ovoz:
Ikkita ichki mikrofon yuqori sifatli ovoz yozishni ta'minlaydi.
Obyektiv:
Avtofokus texnologiyasi bilan aniq tasvirlar.
Ulanish:
USB 2.0 port orqali ulanish.
Ko‘rish Burchagi:
68.5° keng ko'rish burchagi.
Qo'llanilishi:
Video Qo'ng'iroqlar: Zoom, Microsoft Teams, Skype kabi platformalarda aniq va silliq video qo'ng'iroqlar.
Streaming: Twitch yoki YouTube kabi platformalarda oddiy darajada striming qilish uchun mos.
Kontent Yaratuvchilar: Asosiy video yozuvlar va oddiy kontent yaratish uchun juda qulay.
Qo'shimcha Funktsiyalar:
TrueColor Texnologiyasi: Yoritish sharoitlariga mos ravishda ranglarni avtomatik ravishda sozlash.
Plug-and-Play: Oson o'rnatish va sozlash, hech qanday dasturiy ta'minot talab qilinmaydi.
Avtofokus: Harakatda bo'lgan tasvirlarni aniq ushlab turish uchun avtofokus imkoniyati.
Narxi:
O'rtacha narx: ${'$'}40 - ${'$'}60 (do'konlar va hududga qarab o'zgarishi mumkin).
Afzalliklari:
Arzon Narx: Yuqori sifatli video va audio uchun juda arzon.
HD Video: 720p HD sifatida aniq va toza tasvirlar.
Yorug'likni Moslashtirish: TrueColor texnologiyasi yordamida yorug'lik sharoitlariga moslashish.
Yengil va Portativ: Oson olib yurish va har qanday kompyuterga o'rnatish.
Kamchiliklari:
Faqat 720p: 1080p yoki 4K videolarni qo'llab-quvvatlamaydi.
USB 2.0: USB 3.0 ning tezkor ulanish imkoniyatlari yo'q.
Umumiy Baho:
Microsoft LifeCam HD-3000 modeli arzon narxdagi yuqori sifatli web-kamera bo'lib, oddiy video qo'ng'iroqlar va striminglar uchun ideal tanlovdir. Agar siz yuqori sifatli video qo'ng'iroqlarni yoki oddiy strimlarni boshlashni istasangiz, bu kamera siz uchun yaxshi variant bo'lishi mumkin.






""", R.drawable.windows_lifecam,
                            "bxyqLY6b_-c"
                        ), pc_model(
                            "Microsoft LifeCam Studio",
                            """Asosiy Texnik Xususiyatlar:
Video Aniqligi:
1080p Full HD video (1920 x 1080 piksel) 30fps tezlikda.
Ovoz:
Ichki mikrofon, ovozli aniqlikni ta'minlaydi.
Obyektiv:
360° aylanishga imkon beruvchi sozlanadigan shisha obyektiv.
Avtofokus texnologiyasi bilan aniq va aniqlangan tasvirlar.
Ulanish:
USB 2.0 port orqali ulanish.
Ko‘rish Burchagi:
75° keng ko'rish burchagi.
Qo'llanilishi:
Video Qo'ng'iroqlar: Skype, Zoom kabi platformalarda yuqori sifatli video qo'ng'iroqlar uchun ideal.
Streaming: Yaxshi video sifatini ta'minlaydi, shuningdek, YouTube yoki Twitch platformalarida oson striming qilish mumkin.
Kontent Yaratuvchilar: Yaxshi tasvir va ovoz sifati bilan videolar yaratish va o'z kontentlarini ishlab chiqish uchun qulay.
Qo'shimcha Funktsiyalar:
TrueColor Texnologiyasi: Yorug'lik sharoitlariga mos ravishda ranglarni avtomatik ravishda sozlash va to'g'ri tasvir olish imkonini beradi.
360° Aylanish: Kamerani har qanday yo'nalishga o'zgartirish imkoniyati.
Avtofokus: Harakatda bo'lgan tasvirlarni aniq va aniq ushlab turish uchun avtofokus.
Plug-and-Play: O'rnatish va ishlatish juda oson, hech qanday murakkab dasturiy ta'minot talab qilinmaydi.
Narxi:
O'rtacha narx: ${'$'}80 - ${'$'}100 (do'konlar va hududga qarab o'zgarishi mumkin).
Afzalliklari:
Full HD Video: Yuqori sifatli 1080p video va aniq tasvirlar.
Keng Ko'rish Burchagi: Keng burchakdagi tasvirni ta'minlash, guruh qo'ng'iroqlari uchun juda qulay.
360° Aylanish: Kamerani istalgan yo'nalishga sozlash imkoniyati.
TrueColor Texnologiyasi: Yorug'lik sharoitlariga moslashish, har qanday muhitda sifatli tasvir olish.
Kamchiliklari:
USB 2.0: USB 3.0 ning tezkor ulanish imkoniyatlari yo'q.
Avtofokusning ba'zi cheklovlari: Ba'zida tez va aniqlikda fokuslashda kichik muammolar bo'lishi mumkin.
Umumiy Baho:
Microsoft LifeCam Studio modeli yuqori sifatli video va ovoz uchun ajoyib tanlovdir. Ushbu kamera asosan video qo'ng'iroqlar va kontent yaratish uchun mo'ljallangan, 360° aylanish, TrueColor texnologiyasi va yuqori sifatli 1080p video bilan ajralib turadi. Agar siz sifatli video qo'ng'iroqlarni yoki strimlarni qilishni istasangiz, bu kamera juda yaxshi variant bo'lishi mumkin.













""", R.drawable.mifrosoft_lifecam,
                            "XQtq2fPMSek"
                        ), pc_model("Microsoft Modern Webcam" ,
                            """Asosiy Texnik Xususiyatlar:
Video Aniqligi:
1080p Full HD video (1920 x 1080 piksel) 30fps tezlikda.
Ovoz:
Ichki mikrofon, yuqori sifatli ovoz yozishni ta'minlaydi.
Obyektiv:
78° keng ko'rish burchagi.
Yaxshi aniqlik va sifatni ta'minlovchi obyektiv.
Ulanish:
USB 2.0 port orqali ulanish.
Yoritish:
Autolight, yorug'lik sharoitlariga moslashadi.
Qo'llanilishi:
Video Qo'ng'iroqlar: Skype, Zoom, Microsoft Teams kabi platformalarda aniq va ravshan video qo'ng'iroqlar.
Streaming: Oddiy darajadagi striminglar uchun mos, YouTube yoki Twitch platformalarida.
Kontent Yaratuvchilar: Oson video yozuvlar va kontent yaratish uchun mos.
Qo'shimcha Funktsiyalar:
Autolight: Kamera avtomatik ravishda yoritish sharoitlariga moslashadi, bu esa har qanday muhitda aniq tasvir olishni ta'minlaydi.
Plug-and-Play: O'rnatish va ishlatish juda oson, dasturiy ta'minot talab qilinmaydi.
Avtofokus: Harakatda bo'lgan tasvirlarni aniq ushlab turish uchun avtofokus.
Narxi:
O'rtacha narx: ${'$'}50 - ${'$'}70 (do'konlar va hududga qarab o'zgarishi mumkin).
Afzalliklari:
Full HD Video: 1080p video sifatida aniq va toza tasvirlar.
Autolight Texnologiyasi: Yorug'lik sharoitlariga avtomatik moslashish.
Plug-and-Play: Tez va oson o'rnatish, hech qanday murakkab dasturiy ta'minot talab etilmaydi.
Keng Ko'rish Burchagi: 78° keng ko'rish burchagi, ko'plab odamlar uchun mos.
Kamchiliklari:
USB 2.0: USB 3.0 ning tezkor ulanish imkoniyatlari yo'q.
Yuqori Fps Qo'llab-quvvatlanmaydi: 30fps maksimal tezlikda video oqimi mavjud.
Umumiy Baho:
Microsoft Modern Webcam odatiy video qo'ng'iroqlar va kontent yaratish uchun ajoyib tanlovdir. 1080p video sifatida aniq tasvirlar, avtomatik yorug'lik moslashuvi va o'rnatishning soddaligi uni yaxshi variantga aylantiradi. Agar siz o'rta darajadagi kamera izlayotgan bo'lsangiz, bu model siz uchun qulay bo'lishi mumkin.







""",
                            R.drawable.microsoft_pro,
                            "vQkagXK9L58"
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
            projectionModels,
            speakersModels,
            webcamModels,
            )


        if (data == "1") {
            var adapter = PcPartsAdapter(this, baza2, object : PcPartsAdapter.ItemSelectListener {
                override fun onClick(date: main_model) {
                    var intent = Intent(this@SelectActivity, BrandActivity::class.java)
                    intent.putExtra("data2", date)
                    intent.putExtra("title2", date.hardware_name)
                    startActivity(intent)


                }
            })

            binding.recycler.adapter = adapter

            val animation =
                AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation_fall_down)
            binding.recycler.layoutAnimation = animation
        }
        if (data == "2") {
            var adapter = PcPartsAdapter(this, baza, object : PcPartsAdapter.ItemSelectListener {
                override fun onClick(date: main_model) {
                    var intent = Intent(this@SelectActivity, BrandActivity::class.java)
                    intent.putExtra("data2", date)
                    intent.putExtra("title2", date.hardware_name)
                    startActivity(intent)
                }
            })
            binding.recycler.adapter = adapter

            val animation =
                AnimationUtils.loadLayoutAnimation(this, R.anim.layout_animation_fall_down)
            binding.recycler.layoutAnimation = animation
        }

    }
}