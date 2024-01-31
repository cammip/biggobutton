package edu.uw.ischool.cammip.biggobutton
//import edu.uw.ischool.cammip.biggobutton.R
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    private var count = 0
    lateinit var myButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myButton = findViewById(R.id.myButton)
        myButton.setBackgroundColor(Color.GREEN)
        myButton.setTextColor(Color.RED)

        myButton.setOnClickListener {
            count++

            val randomBgColor = Color.rgb((0..255).random(), (0..255).random(), (0..255).random())
            myButton.setBackgroundColor(randomBgColor)

            val randomTextColor = Color.rgb((0..255).random(), (0..255).random(), (0..255).random())
            myButton.setTextColor(randomTextColor)

            if (count > 0) {
                if (count == 1) {
                    myButton.setText("You have pushed me 1 time!")
                } else {
                    myButton.setText("You have pushed me " + count + " times!")
                }
            }

        }
    }
}