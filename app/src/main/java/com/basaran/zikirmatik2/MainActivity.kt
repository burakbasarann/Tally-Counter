package com.basaran.zikirmatik2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var txtsayac=findViewById(R.id.textView) as TextView
        var txtkaydet=findViewById(R.id.textkaydet) as TextView
        var txtson=findViewById(R.id.txtsonkayit) as TextView
        var btnarttir=findViewById(R.id.btnarttir) as Button
        var btnreset=findViewById(R.id.btnreset) as Button
        var btnasreset=findViewById(R.id.btnsifirla) as Button
        var sayi=0
        var kaydet=0
        val toast= Toast.makeText(applicationContext,R.string.total,Toast.LENGTH_LONG)

        btnarttir.setOnClickListener{
            sayi++
            txtsayac.setText(sayi.toString())

        }
        btnreset.setOnClickListener{
            txtson.setText("Son Kaydedilen = $sayi")
            kaydet=sayi+kaydet
            txtkaydet.setText("Toplam = $kaydet")
            sayi=0
            txtsayac.setText(sayi.toString())
            toast.show()
        }
        btnasreset.setOnClickListener{
            sayi=0
            kaydet=0
            txtson.setText("Son Kaydedilen = $sayi")
            txtkaydet.setText("Toplam = $kaydet")
            txtsayac.setText(sayi.toString())

        }

    }
}