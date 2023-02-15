fun main(){

    val schoolName="akirachix"
    println(schoolName[0])
    println(schoolName[2])
    println(schoolName[3])
 var y=sentence("Juliet",23)
    println(y)


    val name1 = "Jane"
    val name2 = "Jane"
    if(name1==name2){
        println("That's Me")
    }
else {
        println("i don't know who that us")
    }
    var z=text("our class door",35)
    println(z)
}
fun sentence(name:String,age:Int):String{
    var sentence1= "Hi, my name is $name and i am $age years old"
    return sentence1
}
val length=(20)
fun text(sentence:String,length:Int):String{
    var text="our class door is $length"
    return text

}

