package uz.falconmobile.pc.ui

import android.annotation.SuppressLint
import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.ProgressBar
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.google.android.material.button.MaterialButton
import uz.falconmobile.pc.R
import uz.falconmobile.pc.databinding.ActivityQuectionsBinding

class QuectionsActivity : AppCompatActivity() {

    private lateinit var questionText: TextView
    private lateinit var progressBar: ProgressBar
    private lateinit var answer1: MaterialButton
    private lateinit var answer2: MaterialButton
    private lateinit var answer3: MaterialButton
    var score=0

    private var currentQuestionIndex :Int= 0
    private val questions = listOf(
        "Kompyuterning markaziy ishlov berish qurilmasi nima deb ataladi?" to listOf("RAM", "CPU", "HDD"),
        "Operativ xotira (RAM) nimani ifodalaydi?" to listOf("Doimiy xotira", "Vaqtinchalik xotira", "Grafik protsessor"),
        "Qaysi qurilma ma’lumotlarni doimiy saqlash uchun ishlatiladi?" to listOf("RAM", "SSD", "GPU"),
        "BIOS qanday vazifani bajaradi?" to listOf("Operatsion tizimni yuklaydi", "Xotira hajmini oshiradi", "Tarmoq ulanishini o‘rnatadi"),
        "Qaysi qurilma ma’lumotlarni kiritish uchun ishlatiladi?" to listOf("Monitor", "Klaviatura", "Printer"),
        "SSD va HDD o‘rtasidagi asosiy farq nima?" to listOf("Narxi", "Tezligi", "O‘lchami"),
        "Qaysi qurilma tasvirlarni monitor ekraniga uzatadi?" to listOf("CPU", "CCD", "GPU"),
        "Kompyuterning asosiy platasini nima deb atashadi?" to listOf("Motherboard", "Power Supply", "Sound Card"),
        "UPS qanday qurilma?" to listOf("Elektr quvvati zaxirasi uchun ishlatiladi", "Operatsion tizimni yuklash uchun ishlatiladi", "Tarmoq ulanishini yaxshilash uchun ishlatiladi"),
        "Qaysi qurilma ma’lumotlarni bosib chiqaradi?" to listOf("Monitor", "Printer", "Router"),
        "Protsessorning tezligi qaysi birlikda o‘lchanadi?" to listOf("Gigabayt", "Gigagerts", "Megapiksel"),
        "Tarmoqni ulash uchun ishlatiladigan qurilma nima?" to listOf("Router", "Klaviatura", "Protsessor"),
        "Kompyuter qaysi qismisiz ishga tushmaydi?" to listOf("Motherboard", "Printer", "Projektor"),
        "Qaysi qurilma tovushlarni chiqarish uchun ishlatiladi?" to listOf("Mikrofon", "Router", "Dinamik"),
        "Qaysi qurilma tashqi ma’lumotlarni o‘qish va yozish uchun ishlatiladi?" to listOf("USB fleshka", "Protsessor", "BIOS"),
        "Kompyuter quvvatini ta’minlaydigan blok nima deb ataladi?" to listOf("GPU", "PSU", "CPU"),
        "Grafik protsessor (GPU) qaysi maqsadda ishlatiladi?" to listOf("Grafiklarni qayta ishlash", "Ma’lumotlarni saqlash", "Quvvat ta’minoti"),
        "CD/DVD disklarni o‘qish va yozish uchun qaysi qurilma kerak?" to listOf("Optical Drive", "Hard Drive", "USB Drive"),
        "Klaviatura qanday qurilma turiga kiradi?" to listOf("Kiritish qurilmasi", "Chiqarish qurilmasi", "Saqlash qurilmasi"),
        "Kompyuterning ish tezligini oshirish uchun qanday xotira ishlatiladi?" to listOf("ROM", "RAM", "SSD")
    )
    private val correctAnswers = listOf(
        "CPU", "Vaqtinchalik xotira", "SSD", "Operatsion tizimni yuklaydi", "Klaviatura", "Tezligi",
        "GPU", "Motherboard", "Elektr quvvati zaxirasi uchun ishlatiladi", "Printer", "Gigagerts",
        "Router", "Motherboard", "Dinamik", "USB fleshka", "PSU", "Grafiklarni qayta ishlash",
        "Optical Drive", "Kiritish qurilmasi", "RAM"
    )



    private lateinit var binding: ActivityQuectionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuectionsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        questionText = binding.questionText
        progressBar = binding.progressBar
        answer1 = binding.answer1
        answer2 = binding.answer2
        answer3 = binding.answer3

        updateQuestion(0)

        answer1.setOnClickListener { checkAnswer( answer1) }
        answer2.setOnClickListener { checkAnswer( answer2) }
        answer3.setOnClickListener { checkAnswer( answer3) }
    }

    private fun updateQuestion(score:Int) {
        if (currentQuestionIndex < questions.size) {
            binding.tvCount.text="${currentQuestionIndex+1}/20"

            val (question, answers) = questions[currentQuestionIndex]
            questionText.text = question
            answer1.text = answers[0]
            answer2.text = answers[1]
            answer3.text = answers[2]

            progressBar.progress = ((currentQuestionIndex + 1) * 100) / questions.size
        } else {
            Toast.makeText(this, "Test tugallandi!", Toast.LENGTH_LONG).show()
            showResultDialog(score,questions.size)
        }
    }

    @SuppressLint("ResourceType")
    private fun checkAnswer(selectedButton:MaterialButton,) {
        val correctAnswer = correctAnswers[currentQuestionIndex]
        if (selectedButton.text == correctAnswer) {
            score++
            selectedButton.backgroundTintList = ColorStateList.valueOf(resources.getColor(R.color.green, theme))
            Toast.makeText(this, "Javobingiz to'g'ri!", Toast.LENGTH_SHORT).show()
        } else {
            selectedButton.backgroundTintList = ColorStateList.valueOf(resources.getColor(R.color.red, theme))
            Toast.makeText(this, "Javobingiz afsuski noto'g'ri!", Toast.LENGTH_SHORT).show()
        }

        // Reset button color and move to next question
        selectedButton.postDelayed({
            selectedButton.backgroundTintList = ColorStateList.valueOf(resources.getColor(R.color.primary, theme))
            currentQuestionIndex++
            updateQuestion(score)
        }, 2000)



    }

    private fun showResultDialog(score: Int, totalQuestions: Int) {
        val dialogView = LayoutInflater.from(this).inflate(R.layout.dialog_result, null)
        val resultTitle = dialogView.findViewById<TextView>(R.id.resultTitle)
        val resultMessage = dialogView.findViewById<TextView>(R.id.resultMessage)
        val closeButton = dialogView.findViewById<Button>(R.id.closeButton)

        resultMessage.text = "Sizning to'g'ri javoblaringiz : $score ta "

        val alertDialog = AlertDialog.Builder(this)
            .setView(dialogView)
            .setCancelable(false)
            .create()
        alertDialog.window?.decorView?.setBackgroundResource(R.drawable.dialog_background) // setting the background

        closeButton.setOnClickListener {
            alertDialog.dismiss()
            finish() // Ends the activity
        }

        alertDialog.show()
    }

}
