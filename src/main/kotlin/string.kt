fun main(){
    var text="Hello World"
    var school="eMobilis"
    var day="It's a 'Saturday'"

    println(text + " "+school)
    println(text.plus(school))
    println(text+"I study at"+school)
    println("I study at $school") //string interpolation

    println(text[0]) //Accessing an element
    println(text[10])
    println(text.indexOf('H'))
    println(text.indexOf("World"))

    println(text.toUpperCase())
}