fun main(args: Array<String>) {
callme { println("hello") }
}
fun callme(func:()->Unit){
    func()
    sayHello("Ramiz", { println(it)})
}
fun sayHello(name:String,body:(String)->Unit){
    body("Hello $name")
}