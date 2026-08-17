package ders6.siniflar

class BankaHesabi {
    private var bakiye: Double = 0.0

    fun bakiyeSorgula() {
        println("Bakiyeniz: $bakiye TL")
    }

    fun paraYatir(miktar: Double) {
        if (miktar > 0) {
            bakiye += miktar
            println("Hesabınıza $miktar TL yatırılmıştır.")
            println("Yeni bakiyeniz: $bakiye TL.")
        } else {
            println("HATA: Yatırılan para miktarı sıfırdan büyük olmalıdır.")
        }
    }
}