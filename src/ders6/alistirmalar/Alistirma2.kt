package ders6.alistirmalar

import ders6.alistirmalar.siniflar.Ogrenci

fun main() {

    val ogrenci = Ogrenci()

    print("Öğrencinin adını giriniz: ")
    val ogrenciAdi = readln().trim()

    for (i in 1..3) {
        print("$i. sınav notunu giriniz: ")
        val sinavNot = readln().toIntOrNull() ?: 0
        ogrenci.notEkle(sinavNot)
        println()
    }

    val ortalama = ogrenci.ortalamaHesapla()
    println("Öğrenci Adı: $ogrenciAdi")
    println("Notlar: ${ogrenci.notlar}")
    println("Ortalama: ${"%.2f".format(ortalama)}")
}