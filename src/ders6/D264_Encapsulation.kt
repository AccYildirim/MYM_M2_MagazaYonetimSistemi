package ders6

import ders6.siniflar.BankaHesabi

fun main() {
    val musteriHesabi = BankaHesabi()
    musteriHesabi.bakiyeSorgula()
    musteriHesabi.paraYatir(1000.0)
    musteriHesabi.bakiyeSorgula()
}
