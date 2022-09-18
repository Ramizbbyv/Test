
/*List ---> Immutable listeler yaratmaq ucun [listOf ve listOfNotnull}] komutlarindan isdifade olunur
collectionlar dinamik yapidadir, Collectionlar Arraydan  farkli olarak her tipde veri depolar
 */
/*fun main(args: Array<String>) {/*
   /* val mylist = listOf(1,2,"Ramiz",null,true,'a')
    //println(mylist)
    //listOf ----> is immutable collection
    //mylist.add(54524)---> immutable oldugu icin deger add edemiyoruz
    //println(mylist.get(2))
    for (i in mylist){
        println(i)
    }
    println(mylist.get(2))
    var a:Int = mylist[0] as Int
    var b: Int = mylist[1]as Int
    println(a+b )*/
    val x = Collection()
    x.deger_bastir()*/
    val p = C1()
    p.d_b()

}
val ListA = listOf(false,"RamizBabayev",2,null,0,'q')
class Collection{
    fun deger_bastir(){
        for (i in 0..ListA.size-1){
            println(ListA[i])
        }
    }
}
//listOfNotnull metodu listOf dan farkli olarak null degeri depolamaz
//listOfNotnull metoduda immutable metoddur
var myListnull = listOfNotNull(12,34,null,"apple")
class C1{
    fun d_b(){
        for (i in 0..myListnull.size-1){
            println("---->>"+myListnull[i])
        }
    }
}
/*areraylistOf ----> muatable bir metoddur
mutabllistOf----> mutable bir metodddur
bunlar arasinda derin bir fark yokdur
 */

 /*fun main(args: Array<String>) {
    var listA = mutableListOf<Int>()
    //listA.remove(0)

    var a =0
    while(a<=10) {
        var sayi = (1..100).random()
        listA.add(sayi)
        a++
    }
        for (i in 0..listA.size-1){
            println(listA[i])
        }
}*/
/*Set---->>>setOf--- immutable metoddur
mutablesetOf--->> mutable metoddur
---->>Set-- de ayni  degiskenler yalniz bir kez depolanabilir
 */



fun main(args: Array<String>) {
    val myset = setOf(1,2,1,'a',"Ramiz","Ramiz")
    for (i in myset){
        println("---->>"+i)
    }
}*/
/*Map--->. Collectionu mmiras almamis lakin collection olarak kabul edilir
K<V deyer alir
Ayni key birden fazla kez kullanilamaz
Map dada immutable ve mutable yapilar vardir
--Mapda bir keyin olub olmadigini yoxlamaq ucun .containskey() komutu use olunur.
--Mutale Maplara --- hashmapOf ve mutable map aidir
deger atamak icin ---put()---- metodudan da use dede bilerik

 */
fun main(args: Array<String>) {
  /* val myMAp = mapOf<Int,String>(1 to "Ramiz",2 to " Babayev",3 to "MAA")
    for (i in myMAp){
        println("---->>>"+i.value)

    }*/
    val mymap = mutableMapOf<Int,String>(1 to "Ramiz", 2 to "Maa" , 3 to "Babayev")
    for (i in mymap){
        println(i)
    }
}
