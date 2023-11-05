package samochod

class Silnik(typ: String, pojemnosc: Int) {

    var typSilnika = typ
        set(value) {
           field =  if(value == "benzyna"){
               "benzyna"
           }else{
               "diesel"
           }
        }
    val pojemnosc = pojemnosc

    var czyNaGaz = false
        set(value){
           field = (value && typSilnika == "benzyna")

        }

    fun jedz(){
        if(typSilnika == "diesel"){
            println("kle kle")
        }else if(czyNaGaz){
            println("brum brum wrrr")
        }
        else{
            println("Brum brum")
        }

    }

}