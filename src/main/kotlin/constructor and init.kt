class Pc/*burda constructor yaza bilerik yazmasaqdaolar*/( mark:String,renk:String){
    var renkA:String
    var markA:String
    init {
        this.renkA = renk
        this.markA = mark
        println("Nesne olusturuldu ve $renkA renginde , $markA markasinda")
    }

    fun deger_bastir(){
        val properties:String = "Marka = $markA \n" +
                                 "Renk = $renkA"
        println(properties)
    }
}

fun main(args: Array<String>) {
    //val p1 = Pc("A","Black")
    //p1.deger_bastir()
    var q1:Yapici = Yapici('A')
    q1.deger_bas()
}
class Yapici{
    var karakter:Char = 'A'
    var sayi: Int  = 0
    constructor(karakter:Char){
        this.karakter = karakter
    }
    constructor(karakter: Char,sayi:Int){
        this.karakter = karakter
        this.sayi = sayi
    }
    fun deger_bas(){
        var ozellikler:String = "$karakter markasinda \n" +
                                 "$sayi sayisinda  nesne olusturuldu"
        println(ozellikler)
    }
}
