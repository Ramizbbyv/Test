/*fun main(args: Array<String>) {
var box = Box<Int>()
    box.add(4)
    box.get()
var x = Myclass<SecondClass>()
    x.myFunc(SecondClass())
    val integer:Int = 1
    val number:Number = integer
    println(number)
}
class Box<T> {
    var s:T? = null
    fun add(s:T){
        this.s = s
    }
    fun get():T? = this.s
}
open class FirstClass{
    fun first(){ }
}
class SecondClass:FirstClass(){
    fun second(){ }
}
class ThirdClass:FirstClass(){
    fun third(){ }
}
class Myclass<T:FirstClass>{
    fun myFunc(t:T){}
}
class Producer<out T>(val value:T){
    fun get(): T = value
}
class Consumer<in S>{
    fun toString(value: S):String{
        return value.toString()
    }
}
/*GENERICS

 */
 */
fun main() {
    println("Ramiz" + returnSth(" Babayev"))
}
fun<T>returnSth(a:T):T{
    return a
}