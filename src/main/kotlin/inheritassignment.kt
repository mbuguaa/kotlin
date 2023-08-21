//Parent class
open class shape {
    fun area(){
        println(54)
    }
    fun circumference(){
        println(21)
    }
}

//Child class
class rectangle:shape(){
    var length=7
    var breath=8
    fun getlength(){
        println(length)
    }
    fun getbreath(){
        println(breath)
    }
}
class Circle:shape(){
    var radius=6
    fun getradius(){
        println(radius)
    }
}

fun main(){
    var r=rectangle()
    r.area()

    var c=Circle()
    c.circumference()
}