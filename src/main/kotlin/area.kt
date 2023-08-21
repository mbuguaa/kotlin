import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter length: ")
    var Length=reader.nextDouble()

    println("Enter width: ")
    var Width=reader.nextDouble()

    var Area=Length*Width
    println("The area of the rectangle is $Area")




}