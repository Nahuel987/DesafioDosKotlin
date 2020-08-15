package com.example.desafiodoskotlin
//Crear clase libros
data class Libros (var nombreLibro:String,
                   var ISBN:String,
                   var anioPublicacion:Int,
                   var editorial:String,
                   var cantidadPaginas:Int,
                   var precio:Int,
                   var autorLibro:String,
                   var tipoLibro:Char) {

    //Funcion que retorne precio del libro con signo $

    fun imprimePrecio(): String {
        return "\$${this.precio}"

    }

    //Funcion que imprime la info del libro

    fun imprimeInfo(){

        val info= "NOMBRE DEL LIBRO= $nombreLibro \nISBN= $ISBN \nAÑO PUBLICACION= $anioPublicacion \nEDITORIAL= $editorial \nCANTIDAD DE PAGINAS= $cantidadPaginas \nPRECIO= $precio \nAUTOR= $autorLibro \nTIPO LIBRO= $tipoLibro"

        println(info)

    }


}

