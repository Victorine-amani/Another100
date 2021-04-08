fun main(){
    multiply(arrayOf(1,2,3,4,5,6,7,8,9,10))
}

//While loop
fun multiply(nums:Array<Int>){
    var i= 0
    while(i<= nums.size){
        println(nums[i]*12)
        ++i
        if(i==10){
            break
        }
    }
}