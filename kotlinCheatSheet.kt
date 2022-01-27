
fun main() {            

    println("Section 0 - Variables, Values, and Types -----------------------------------")
    
    println(" 0.1) Variables (var) are _mutable_, values (val) are _immutable_");
    var myMutableVar = 10 
    val myImmutableVal = 10
    println("\tmyMutableVar = ${myMutableVar}")
    println("\tmyImmutableVal = ${myImmutableVal}")

    println(" 0.2) Types can be explicitly declared or inferred ")
    val myInferredInt = 100
    val myExplicitDouble: Double = 100.0
    val myExplicitByte: Byte = 0x0F.toByte()
    println("\tmyInferredInt = ${myInferredInt}, and is of type ${myInferredInt.javaClass.kotlin}")
    println("\tmyExplicitDouble = ${myExplicitDouble}, and is of type ${myExplicitDouble.javaClass.kotlin}")
    println("\tmyExplicitByte = ${myExplicitByte}, and is of type ${myExplicitByte.javaClass.kotli}")

    println("----------------------------------------------------------------------------")


    println("Section 1 - For Loops ------------------------------------------------------")
    println("----------------------------------------------------------------------------")


    println("Section 2 - While and Do-While Loops ---------------------------------------")
    println("----------------------------------------------------------------------------")


    println("Section 3 - If/Else Statements ---------------------------------------------")
    println("----------------------------------------------------------------------------")


    println("Section 4 - Which Statements -----------------------------------------------")
    println("----------------------------------------------------------------------------")



    
}