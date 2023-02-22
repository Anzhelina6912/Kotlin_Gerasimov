package com.example.kotlin_gerasimov


import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    //Obyavlenie peremennih
    private var number: Byte = 0 //-128...127. 1 byte
    private var number1: Short = 32 //-32 768..32 767 2 bytes
    private var number2: Int = 0 //-2 147 483 648.. 2 147 483 4 bytes
    private var number3: Long = 0 // -9 223 372 836 854 775 888.. 9 223 372 836 854 755 807 8 byte
    private var number4: Float = 0.0f // Drobnoe chislo 4 bytes
    private var number5: Double = 0.0 // Drobnoe chislo 8 byte

    // u kajdogoo elemetn has been svoi nomer kotoriy na4inaetsa from 0
    private var text: String = "tesfaefg aefegfoieggw eg"

    private var ch: Char = '5' //symvol
    private val ch1: Char = '5' //infinite
    private var tvTextView: TextView? = null
    private var clayout: ConstraintLayout? = null
    private var counter: Int = 0
    private var start: Boolean = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // This is another types, because it's not Verno  number2 = number1 + ch
        //  number2 = number1+ch.digitToInt( )
        //  ch1=number+number3
        // this is constanta, can't be change
        clayout = findViewById(R.id.clayout)


        tvTextView = findViewById(R.id.tvTextView)
        tvTextView?.setText(number2.toString())

        Thread {
            start = true //4tobi rabotal poton thred
            while (start) {
                Thread.sleep(1000)
                runOnUiThread{
                if (counter == 5)
                    clayout?.setBackgroundColor(Color.MAGENTA)
                    tvTextView?.setText(counter.toString())
                    counter++

                }
            }
        }.start()

    }

    override fun onDestroy() {
        super.onDestroy()
        start = false
    }
}

