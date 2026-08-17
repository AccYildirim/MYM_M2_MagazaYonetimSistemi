package ders6

fun main() {
    val kitap = Kitap()
    kitap.kitapAdi = "Kotlin'in Maceraları"
    kitap.sayfaSayisi = 160

    kitap.sayfaOku(50)
    kitap.sayfaOku(50)
    kitap.sayfaOku(50)
    kitap.sayfaOku(50)
}