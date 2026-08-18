package ders6.siniflar

class KullaniciHesabi {
    var sifre: String = "123456"
        set(value) {
            if (value.length >= 6) {
                field = value
                println("Şifreniz başarıyla güncellendi.")
            } else {
                println("HATA: Şifreniz 6'dan fazla karaktere sahip olmalıdır, eski şifreniz korunuyor.")
            }
        }
}