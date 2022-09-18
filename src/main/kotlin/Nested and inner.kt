/*Nested---> Classin icinde classlarin yaradilmasidir
Applikasiya yuklenen kimi classlar yuklenir classin daxilinde olanlarda classla birlikde yuklenir
Inner -- class statik deyil. Yaratmaq ucun classin evveline inner yazmaq lazimdir
Obyekti yaradandan sora inner classi yarada bilirik lakin nested class app yuklenen kimi yuklenir
--->Bezi classlar olacaqki ancaq classin icindeki obyekt ucun isdifade edeceyik bu zaman inner
classlardan sidifade olunur
---THIS <----- bizde obyekti bildirir ve obyekt yaranandan  sora movcud olur.Obyekti yaratmadan this isdifade
ede bilmerik
--->Protect<---classda ve ondan inheritance eden classlarin daxilinde isdifade ede bilerik
---->Private <--- Yalniz classsin daxiline isdifade ede bilerik
--->Internal<---- yalniz eyni modullar icinde caqira bilirik

 */
class Example{
    //nested and inner
    class Nested{
        class Sth{

        }
    }
    inner class MyInner{

    }
}
val x1 = Example()
val x2 = Example.Nested()
val x3 = Example.Nested.Sth()
val myInnerObject = Example(/*bu bize obyekt qaytarir*/).MyInner()
