package ders6.siniflar

class BankaHesabiA3 {
    private var bakiye: Double = 0.0

    fun bakiyeSorgula(): Double {
        return bakiye
    }

    fun paraYatir(miktar: Double) {
        if (miktar > 0) {
            bakiye += miktar
            println("Başarılı: $miktar TL yatırıldı.")
        } else {
            println("Yatırılan tutar 0'dan büyük olmalıdır.")
        }
    }

    fun paraCek(miktar: Double) {
        if (miktar <= 0) {
            println("Hata: Çekilecek tutar 0'dan büyük olmalıdır!")
        } else if (miktar > bakiye) {
            println("Yetersiz bakiye! Mevcut bakiyeniz: $bakiye TL")
        } else {
            bakiye -= miktar
            println("İşlem başarılı $miktar TL")
        }
    }
}