package com.example.snackbardemo1

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // SnackBar without the action Short
        val shortTimeSnackBarBtn : Button = findViewById(R.id.shortTimeSnackBarBtn)

        shortTimeSnackBarBtn.setOnClickListener {
            val snackbar = Snackbar.make(
                it,
                "Short Time Show SnackBar after automatic Snackbar dismiss.",
                Snackbar.LENGTH_SHORT
            )
            snackbar.show();
        }

        // SnackBar with the action short
        val shortTimeSnackBarActionBtn : Button = findViewById(R.id.shortTimeSnackBarActionBtn)

        shortTimeSnackBarActionBtn.setOnClickListener {
            val snackbar = Snackbar.make(
                it,
                "Short Time Show SnackBar with Own Action after Snackbar dismiss",
                Snackbar.LENGTH_SHORT
            )
            snackbar.setAction("Action"){
                // code to undo the possible user mistake
                Toast.makeText(this, "It is a Action", Toast.LENGTH_SHORT).show()
            }
            snackbar.show();
        }

        // SnackBar without the action Long
        val longTimeSnackBarBtn : Button = findViewById(R.id.longTimeSnackBarBtn)

        longTimeSnackBarBtn.setOnClickListener {
            val snackbar = Snackbar.make(
                it,
                "Long Time Show SnackBar after automatic Snackbar dismiss.",
                Snackbar.LENGTH_LONG
            )

            snackbar.show();
        }

        // SnackBar with the action Long
        val longTimeSnackBarActionBtn : Button = findViewById(R.id.longTimeSnackBarActionBtn)

        longTimeSnackBarActionBtn.setOnClickListener {
            val snackbar = Snackbar.make(
                it,
                "Long Time Show SnackBar with Own Action after Snackbar dismiss",
                Snackbar.LENGTH_LONG
            )
            snackbar.setAction("Action"){
                // code to undo the possible user mistake
                Toast.makeText(this, "It is a Action", Toast.LENGTH_LONG).show()
            }
            snackbar.show();
        }
        // SnackBar without the action indefinite
        val indefiniteTimeSnackBarBtn : Button = findViewById(R.id.indefiniteTimeSnackBarBtn)

        indefiniteTimeSnackBarBtn.setOnClickListener {
            val snackbar = Snackbar.make(
                it,
                "Indefinite Time Show SnackBar.",
                Snackbar.LENGTH_INDEFINITE
            )
            snackbar.show();
        }


        // indefinite has no Snackbar dismiss
        // SnackBar with the action indefinite
        val indefiniteTimeSnackBarActionBtn : Button = findViewById(R.id.indefiniteTimeSnackBarActionBtn)

        indefiniteTimeSnackBarActionBtn.setOnClickListener {
            val snackbar = Snackbar.make(
                it,
                "Indefinite Time Show SnackBar with Own Action.",
                Snackbar.LENGTH_INDEFINITE
            )
            snackbar.setAction("Action"){
                // code to undo the possible user mistake
                Toast.makeText(this, "It is a Action", Toast.LENGTH_LONG).show()
            }
                .setActionTextColor(Color.RED);

            var snackView : View = snackbar.getView();
            var textView : TextView = snackView.findViewById(com.google.android.material.R.id.snackbar_text)
            textView.setTextColor(Color.YELLOW)

            snackbar.show();
        }

    }
}
