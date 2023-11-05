package lampa

import lampa.Lampa

fun main(args: Array<String>) {

    val lampa1 = Lampa()
    val lampa2 = Lampa()

    lampa1.wlacz()
    lampa1.wyswietlStan()

    lampa2.wyswietlStan()

    lampa1.wylacz()
    lampa1.wyswietlStan()

   // lampa1.czyWlaczona = true

}