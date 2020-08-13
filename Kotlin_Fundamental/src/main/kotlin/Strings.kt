fun main(args: Array<String>) {
    val worldOne = "Modern"
    val worldTwo = "Concise"
    val worldThree = "Paragrgmatic"
    val worldfour = "Save"

    //print("Kotlin is " + worldOne + "\nKotlin is " + worldTwo + "\nKotlin is "+ worldThree + "\nKotlin is " + worldfour )

    val row ="""
        Kollin is $worldOne
        Kotlin is $worldTwo
        Kotlin is $worldThree
        kotlin is $worldfour
    """.trimIndent()

    print(row)
}