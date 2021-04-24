fun main(){
    println(isEveno(2))
    println(isEveno(3))
   var products=Products("Vegetables",100,300.00,"groceries")
    var products2=Products("Toothpaste",50,500.00,"hygiene")
   var products3=Products("books",12,50.00,"stationary")
    products.items()
    products2.items()
    products3.items()
   println(any("Sharon"))
 println(lengthNames(arrayOf("sarah","sharon","Mary","Annastacia","Kevin","Consta")))

}
fun isEveno(num:Int):Boolean{
    if(num%2==0){
        return true
    }else{
        return false

    }}
data class Products(var name:String,var weight:Int,var price:Double,var categories:String){

fun items() {

    var grocery = mutableListOf<String>()
    var hygiene= mutableListOf<String>()

    when (categories) {
        "groceries" -> println(mutableListOf("$name","$categories"))
        "hygiene" -> println(mutableListOf("$name","$categories"))
        else -> println("other categories")
}
}
}
fun any(name:String):String{
    var stringEven=""
    for(char in name) {
        if (name.indexOf(char) % 2 == 0) {
            stringEven+=char
        }

    }
return  stringEven
}
fun lengthNames(names:Array<String>):MutableList<String>{
    var evenNamesList=mutableListOf<String>()
    for(evenLengthNames in names){
        if (evenLengthNames.length %2==0){
            evenNamesList.add(evenLengthNames)
        }
    }
    return evenNamesList
 }











