package samochod

class Samochod(markaK:String, modelK:String, rokProdukcjiK: Int,
    private val silnik: Silnik) {

    var marka: String = markaK
        get() = field.uppercase()
    var model: String = modelK
        get() = field.uppercase()

    var rokProdukcji: Int = rokProdukcjiK
        set(value) {
            field = if (value < 2000){
                200
            }else{
                value
            }
        }


    fun jedz(){
        silnik.jedz()
    }

    fun przedstawSie(): String{
        return "marka: $marka, model: $model, rok produkcji: $rokProdukcji"
    }
}