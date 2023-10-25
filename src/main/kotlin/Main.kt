fun main(){
    val goods = readln().replace(",","").split(' ').chunked(2)
    val shop = readln().split(" ")
    println(goods.map{it[0] to it[1].toInt()}.filter{(key) -> key in shop}.map{ it.second }.fold(0){x,y -> x+y})
}