package ders6.alistirmalar

import ders6.alistirmalar.siniflar.AkilliTelefon

fun main() {
    val cihazim = AkilliTelefon()

    println("=== Akıllı Telefon Yönetim Paneli ===")

    while (true) {
        print("\nİşlem seçiniz: \n1: Aç\n2: Oyun Oyna \n3: Çıkış \n")
        val secim = readln().trim()

        when (secim) {
            "1" -> cihazim.telefonuAc()
            "2" -> cihazim.oyunOyna()
            "3" -> {
                println("Panel Kapatılıyor...")
                cihazim.acikMi = false
                break
            }

            else -> println("Geçersiz seçim...")
        }
    }
}