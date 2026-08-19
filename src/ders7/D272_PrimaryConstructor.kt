package ders7

import ders7.siniflar.Araba

fun main() {
    val araba1 = Araba("Alfa Romeo", "Gri", 2018)
    val araba2 = Araba("Togg", uretimYili = 2026)
    val araba3 = Araba("Renault", "Mavi", 2015)
    araba3.hiz = 100
    araba3.motorCalisiyor = true

    araba1.hiz = 50
    araba1.motorCalisiyor = true

    println(araba1.marka)
    println(araba1.renk)
    println(araba1.uretimYili)

    println(araba2.marka)
    println(araba2.renk)
    println(araba2.uretimYili)
}