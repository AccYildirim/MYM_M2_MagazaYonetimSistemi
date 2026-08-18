package ders6.alistirmalar

import ders6.siniflar.BankaHesabiA3

fun main() {
    val hesap = BankaHesabiA3()

    println("Yatırmak istediğiniz tutar: ")
    val yatirilan = readln().toDoubleOrNull() ?: 0.0
    hesap.paraYatir(yatirilan)

    println("Çekmek istediğiniz tutar: ")
    val cekilen = readln().toDoubleOrNull() ?: 0.0
    hesap.paraCek(cekilen)

    println("Güncel bakiye: ${hesap.bakiyeSorgula()} TL")
}