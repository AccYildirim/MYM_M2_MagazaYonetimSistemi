package ders7.siniflar

class Oyuncu(var isim: String, can: Int) {
    var can: Int = can
        set(value) {
            if (value !in 0..100) {
                println("HATA: Can değeri 0 ile 100 arasında olmalıdır.")
                field = 100
            }
        }

    init {
        println("Yeni bir oyuncu katıldı. Hoş geldin $isim!")
        this.can = can
    }
}