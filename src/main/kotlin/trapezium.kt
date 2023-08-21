import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter height: ")
    var height=reader.nextDouble()

    println("Enter a: ")
    var a=reader.nextDouble()

    println("Enter b: ")
    var b=reader.nextDouble()

    var Area=(a+b)/2*height
    println("The area of the trapezium is $Area")

}