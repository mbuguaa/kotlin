import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter first number: ")
    var fnumber=reader.nextInt()

    println("Enter second number: ")
    var snumber=reader.nextInt()

    var quotient=fnumber/snumber
    var modulus=fnumber%snumber
    println("The quotient of the two numbers is $quotient. The remainder of the two numbers is $modulus")

    
}


