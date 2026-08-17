package ders6

class Kitap {
    var kitapAdi: String = ""
    var sayfaSayisi: Int = 0
    var okunanSayfa: Int = 0

    fun sayfaOku(okunacakAdet: Int) {
        okunanSayfa += okunacakAdet

        if (okunanSayfa >= sayfaSayisi) {
            println("Tebrikler, $kitapAdi adlı kitabı bitirdiniz!")
            okunanSayfa = sayfaSayisi
            println("Toplam okunan sayfa sayısı: $okunanSayfa")
        } else {
            println("Toplam okunan sayfa sayısı: $okunanSayfa")
        }
    }
}