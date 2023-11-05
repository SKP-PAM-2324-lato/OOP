package osoba

fun main() {

    /*
    val osoba1 = Osoba()
    val osoba2 = Osoba()

    osoba1.imie = "Jan"
    osoba1.nazwisko = "Kowalski"
    osoba1.wiek = 45
    osoba1.przedstawSie()

    println()

    osoba2.imie = "Jan"
    osoba2.nazwisko = "Nowak"
    osoba2.przedstawSie()

    println(osoba1.wiek)
    osoba1.wiek = 14
    osoba2.wiek = 40
    osoba1.przedstawSie()
    osoba2.przedstawSie()
*/

    /*
    val osoba1 = Osoba("Jan", "Nowak", 30)
    val osoba2 = Osoba("Jan", "Kowalski", 45)

    println(osoba1.imieOsoby)
    osoba1.imieOsoby = "Karol"
    osoba1.przedstawSie()
    osoba2.przedstawSie()
     */

    val programista = Programista()
    programista.imie = "Aleksnadra"
    programista.nazwisko = "Testowa"
    programista.wiek = 30
    programista.przedstawSie()
    programista.piszKod()

    val nauczyciel = Nauczyciel()
    nauczyciel.imie = "Paulina"
    nauczyciel.nazwisko = "Pilna"
    nauczyciel.przedstawSie()
    nauczyciel.ucz()

    val listOsob = listOf(nauczyciel, programista)

    for(osoba in listOsob){
        osoba.przedstawSie()
    }
}
