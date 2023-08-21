import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter first number: ")
    var fnumber=reader.nextDouble()

    println("Enter second number: ")
    var snumber=reader.nextDouble()

    println("Enter operation(+,-,*,/): ")
    var operator= readln()

    var answer=when(operator){
        "+"->fnumber+snumber
        "-"->fnumber-snumber
        "*"->fnumber*snumber
        "/"->fnumber/snumber

        else -> "invalid operation"
    }
    println("Answer = $answer")
}


