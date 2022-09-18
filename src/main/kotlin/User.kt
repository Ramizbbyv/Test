/*import kotlin.coroutines.coroutineContext

class User(override var name:String, override var surname:String):Kisi() {
    override fun islem_yap() {
        println("Islem Yapiliyor")
    }

}

fun main(args: Array<String>) {
   /* var m = User("Ramiz","Babayev")
    m.islem_yap()
    m.ekrana_bastir()*/
   // val b=8.Topla(3).Topla(5).Topla(88)
    //println(b)
    val k = "Ramiz".Add(" Babayev")
    println(k)
}
fun Int.Topla(a:Int):Int{
    return this+a
}
fun String.Add(c:String):String{//Bunu infix kullanmaklada tyapa biliriz
    return this+c
}


fun main(args: Array<String>) {
    val str = "good morning"
    val result = str.countwowevls()
    println("Number of vowels = $result")
}
fun String.countwowevls():Int{
    var vowels = 0
    for (i in 0..this.length-1){
        val ch = this[i]
        if (ch== 'a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
            ++vowels
        }
    }
    return vowels
}


fun main(args: Array<String>) {
    println("Aeee"+A.show())
}
class A{
    companion object{
        fun show():String{
         return "You are learning Kotlin"
        }
    }
}
 */
class Temperature(var celsius: Float)

fun main(args: Array<String>) {
    val t = Temperature(40f)
    println(t.fahrenheit)

    t.fahrenheit = 85f
    println(t.celsius)
}
var Temperature.fahrenheit: Float
    get() = (celsius * 9 / 5) + 32
    set(value) {
        celsius = (value - 32) * 5 / 9
    }