package ders6.alistirmalar

import ders6.alistirmalar.siniflar.KullaniciHesabi

fun main() {
    val profil = KullaniciHesabi()

    println("Yeni şifrenizi belirleyin: ")
    val kullaniciSifre = readln()
    profil.sifre = kullaniciSifre
    println("Şifrenizin son hali ${profil.sifre} mailinize gönderilmiştir.")
}