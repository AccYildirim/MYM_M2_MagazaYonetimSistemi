package ders6.alistirmalar.siniflar

class AkilliTelefon {
    val marka: String = "LeaderPhone"
    var pilYuzdesi: Int = 100
    var acikMi: Boolean = false

    fun telefonuAc() {
        if (acikMi) {
            println("Uyarı: Telefon zaten açık!")
        } else {
            acikMi = true
            println("Sistem: $marka açıldı. Ekrana hoş geldiniz.")
        }
    }

    fun oyunOyna() {
        if (!acikMi) {
            println("Hata: Önce telefonu açmalısın!")
        } else if (pilYuzdesi > 10) {
            pilYuzdesi -= 10
            println("Sistem: Oyun oynanıyor... Yeni pil yüzdesi: %$pilYuzdesi")
        } else {
            println("Uyarı: Şarj bitiyor! Pil yüzdesi çok düşük, oyun açılamaz.")
        }
    }
}