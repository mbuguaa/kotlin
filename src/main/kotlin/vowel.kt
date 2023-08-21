import java.util.Scanner
fun main(){
    var reader=Scanner(System.`in`)

    println("Enter an alphabet: ")
    var letter= reader.next().single()

    if (letter in listOf('a','e','i','o','u'))
        println("It is a vowel")
    else{
        println("It is a consonant")
    }

}