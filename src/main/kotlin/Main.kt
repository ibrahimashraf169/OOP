abstract class Car(val model: String, val color: String, private var speed: Int){
    abstract fun getFuelType(): String
}

class BMW(model: String, color: String, speed: Int) : car(model, color, speed){
    override fun getFuelType(): String {
        return "Petrol"
    }


}

class Tesla(model: String, color: String, speed: Int) : car(model, color, speed){
    override fun getFuelType(): String {
        return "Electric"
    }
}