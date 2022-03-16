fun main(){
    println(multiply(arrayOf(10,20,30,40,50)))
    println(group(arrayOf(1,2.96,0.345,"Nadine",true,"b")))
    println(vowels(arrayOf('s','a','n','g','w','a','z','e','y','i')))

}
fun multiply(numbers:Array<Int>):Int{
    var product = 1
    numbers.forEach { num->
     product*= num
    }
    return product
}
fun group(number:Array<Any>):Double{
    var sum = 0.0
    number.forEach { numb->
        if (numb is Float || numb is Double){
            sum+=numb.toString().toDouble()
        }
    }
    return sum
}
fun vowels(words:Array<Char>):Int{
    var sum = 0
    words.forEach { nad->
        if (nad =='a' || nad =='e' || nad =='i' || nad =='o' || nad =='u'){
            sum++
        }
    }
    return sum
}