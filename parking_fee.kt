fun main(args: Array<String>) {
    var hours = readLine()!!.toInt()
    var total: Double = 0.0
    var days: Double = 0.0
    var extra: Int = 0
    
    if (hours <= 5) 
    	total = hours * 1.0
    else if (hours > 5 && hours < 24)
     	total = 5 + (hours-5)*0.5
    else if (hours >= 24)
    {
        days = Math.floor(hours/24.0)
        extra = hours % 24
        total = extra*0.5 + days*15.0
    }
    println(total)  
}
