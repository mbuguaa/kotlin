class Person{
    //Properties/Variables/Data members/Attributes
    var name:String="Joy"
    var skintone="Lightskin"
    var age=19

    //Methods/Functions
    fun eat(){
        println("Eating")
    }
    fun walk(){
        println("Walking")
    }
}
fun main(){
    var teacher=Person()
    teacher.eat()
    println(teacher.name)

    println(teacher.name+" "+teacher.age.toString()+" "+teacher.skintone.toString())
}