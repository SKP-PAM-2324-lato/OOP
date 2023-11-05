package prostokat

class Prostokat(val a:Int, val b:Int) {

    fun obliczPole(): Int{
        return a*b
    }

    fun rysuj(){
        for(i in 1..a){
            for(j in 1..b){
                print("* ")
            }
            println()
        }
    }
}