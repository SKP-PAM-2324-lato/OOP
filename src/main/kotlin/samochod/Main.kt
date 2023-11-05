package samochod

fun main() {
    /*
    val silnik = Silnik("benzyna", 1500)
    val samochod = Samochod("Renault", "Clio", 2020,
        silnik)
    /*
    samochod.marka = "Renault"
    samochod.model = "Clio"
    samochod.rokProdukcji = 2020
     */


    samochod.rokProdukcji = 2001
    println(samochod.przedstawSie())
    samochod.jedz()
   // samochod.typSilnika = "diesel"
    samochod.jedz()
   // samochod.typSilnika = "hybryda"
   // println(samochod.typSilnika)

    //zagazuj silnik
    silnik.czyNaGaz = true
    samochod.jedz()

     */

    // transport samochodow z Niemiec
    val transport = mutableListOf<Samochod>()

    val s1 = Silnik("beznyzna", 1200)
    val s2 = Silnik("benzyna", 1500)

    transport.add(Samochod("Peugeot", "208", 2016, s1))
    transport.add(Samochod("Audi", "A1", 2010, s2))
    transport.add(Samochod("Volvo", "V40", 2008, s2))

    s2.czyNaGaz = true

    for(samochod in transport){
        println(samochod.przedstawSie())
    }

    for (samochod in transport ){
        samochod.jedz()
    }
}