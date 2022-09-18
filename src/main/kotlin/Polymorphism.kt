/*Bir tipi basqa tipe cevirmek CASTING adlanir iki novu var UP CASTING(AUTOMATICLY)ve DOWN CASTING
* (MANUALLY) */
fun main() {

}
open class Animal{
    open fun speak(){
        println("I am an animal")
    }
}
class Cat:Animal(){
    override fun speak() {
        println("I am aa cat")
    }
}
class Dog:Animal(){
    override fun speak() {
        println("I am a dog")
    }
}