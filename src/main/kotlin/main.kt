package ru.netology



fun main() {
    val mount = arrayOf(1045, 500, 650, 10001, 5000)
    val meloman = arrayOf(true, false, false, true, true)
    val discount1001 : Double = 100.0
    val discountStart1 = 1001
    val discount10001 = 0.95
    val discountStart2 = 10001
    val discountMeloman = 0.99
    var finalMount : Double = 0.0
    for(i in 0..4) {
        if(mount[i] > discountStart2 && meloman[i] == true) {
            finalMount = mount[i] * discount10001
            finalMount *= discountMeloman
            println(finalMount)
        }   else if (mount[i] > discountStart2 && meloman[i] == false) {
                finalMount = mount[i] * discount10001
                println(finalMount)
            }   else if (mount[i] > discountStart1 && meloman[i] == true) {
                    finalMount = mount[i] - discount1001
                    finalMount *= discountMeloman
                    println(finalMount)
                }   else if (mount[i] > discountStart1 && meloman[i] == false) {
                        finalMount = mount[i] - discount1001
                        println(finalMount)
                    }   else if (mount[i] < discountStart1 && meloman[i] == true) {
                            finalMount = mount[i] * discountMeloman
                            println(finalMount)
                        }   else {
                                finalMount = mount[i].toDouble()
                                println(finalMount)
                            }

    }

}