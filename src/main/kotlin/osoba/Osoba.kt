package osoba


open class Osoba {

     var imie: String = ""
        get() = field
        set(value) {
            field = value.uppercase()
        }
     var nazwisko: String = ""
        get() = field
        set(value) {
            field = value.uppercase()
        }
     var wiek: Int = 0
        get() = field
        set(value) {
            if(value > 18){
                field = value
            }else{
                field = 18
            }

        }

    fun przedstawSie(){
        println("Cześć mam na imię $imie $nazwisko i mam $wiek lat")
    }

}


/*
class Osoba(private var imie:String, private var nazwisko: String,
            private val wiek:Int) {

    init {
        imie = imie.uppercase()
        nazwisko = nazwisko.uppercase()
    }

     val imieOsoby: String
         get() = imie



    fun przedstawSie(){
        println("Cześć mam na imię $imie $nazwisko i mam $wiek lat")
    }

}
 */