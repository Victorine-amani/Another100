fun main() {
    println(loops(arrayOf (35,22,15,27,12)))
    println(forloop(arrayOf(23,34,35,44,26)))
}

fun loops(age:Array<Int>) {
    var i= 0
    while(i <= age.size){
        println( age[i]*2 )
        ++i
    }
}
//while loop
fun forloop(num:Array<Int>) {
    for(i in num){
        println( i % 3)
    }
}