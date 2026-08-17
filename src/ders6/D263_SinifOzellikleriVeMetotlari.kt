package ders6

fun main() {
    val benimArabam = Araba()
    val seninAraban = Araba()

    benimArabam.renk = "Kırmızı"
    benimArabam.hiz = 100

    benimArabam.gazaBas()
    benimArabam.frenYap()


    println(
        """
        |Benim Arabamın Özellikleri:
        |Renk: ${benimArabam.renk}
        |Hız: ${benimArabam.hiz}
        |Marka: ${benimArabam.marka}
    """.trimIndent()
    )

    println("--------------------------------")

    seninAraban.gazaBas()
    seninAraban.gazaBas()
    seninAraban.gazaBas()

    println(
        """
        |Senin Arabamın Özellikleri:
        |Renk: ${seninAraban.renk}
        |Hız: ${seninAraban.hiz}
        |Marka: ${seninAraban.marka}
    """.trimIndent()
    )

    println("--------------------------------")


}