package com.example.desafiodoskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //D = LIBRO DIGITAL,  I=LIBRO IMPRESO

        //Declarar 4 variables de libro. 3 mutables  1 inmutable

        val libroUno:Libros=
            Libros("LA CASA DE PAPEL","01010101",2017,"PLANETA",300,16500,"ZOYLA PAZ",'I')
        //Log.d("LIBRO-UNO",libroUno.toString())

        var libroDos:Libros=
            Libros("EL SECRETO","0202020",2005,"ANTARTICA",2005,15000,"AQUILES BAEZA",'I')
        //Log.d("LIBRO-DOS",libroDos.toString())

        var libroTres:Libros=
            Libros("COCINA DE RATAS","03030303",1999,"RATATUI",20,1500000,"CHEFCITO",'D')
        //Log.d("LIBRO-TRES",libroTres.toString())

        var libroCuatro:Libros= Libros("KOTLIN","0404040404",2020,"ACAD",9000,10005000,"IO",'D')
        //Log.d("LIBRO-CUATRO",libroCuatro.toString())

        println(libroCuatro.imprimePrecio())

        libroUno.imprimeInfo()

        libroDos.imprimeInfo()

        libroTres.imprimeInfo()

        libroCuatro.imprimeInfo()

    }//onCreate


}//class
