package lampa

class Lampa {

    // właściowość, pole klasy
    private var czyWlaczona: Boolean = false
    //var czyWlaczona: Boolean = false

    // metody
    fun wlacz(){
        czyWlaczona = true
    }

    fun wylacz(){
        czyWlaczona = false
    }

    fun wyswietlStan(){
        println("Czy świecę? $czyWlaczona")
    }

}