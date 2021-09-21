fun shippingCost(amount: Double, international: Boolean): Double {
				var total = 0.0
    if (international) {
        total = amount * 0.15 
        if (total > 50.0) 
           total = 50.0
    } 
    else {
        if (amount > 75.0) 
            total = 0.0
        else 
            total = amount * 0.1
    }
    return total
}
fun main(args: Array<String>) {
    val total = readLine()!!.toDouble()
    val international = readLine()!!.toBoolean()    
    println(shippingCost(total, international))
}
