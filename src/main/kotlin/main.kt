fun main() {
    using_Var_Val()
    typeInference()
    typeNumbers() //Another's operators: +, -, /, *, %, ++. --
    typeBooleans()
    typeCharacters()
    typeStrings()
    typeArrays()
    typeConversions()
}

fun using_Var_Val() {

    /*
    You can declare a variable in Kotlin using var and val keywords.
    */
    val name = "Luis Fernando Machado"
    //name = "Satoshi Nakamoto"	// Error: Val cannot be reassigned
    println("Hello world! $name")

    var country = "USA"
    country = "India"    // Works
    println(country)
}

fun typeInference() {
    val greeting = "Hello, World"  // type inferred as `String`
    val year = 2018                // type inferred as `Int`

    // Explicitly defining the type of variables
    val greeting_2: String = "Hello, World"
    val year_2: Int = 2018

    /*
    In Kotlin the type inference is a practice recommended
    */
}

fun typeNumbers() {
    // Kotlin Numeric Types Examples
    val myByte: Byte = 10
    val myShort: Short = 125

    val myInt = 1000
    val myLong = 1000L	// The suffix 'L' is used to specify a long value

    val myFloat = 126.78f   // The suffix 'f' or 'F' represents a Float
    val myDouble = 325.49

    // You can also use underscore in numeric values to make them more readable
    val hundredThousand = 100_000
    val oneMillion = 1_000_000
    println(oneMillion)

    val myHexa = 0x0A0F  // Hexadecimal values are prefixed with '0x' or '0X'
    val myBinary = 0b1110  // Binary values are prefixed with '0b' or '0B'
    println(myBinary)
}

fun typeBooleans() {
    val myBoolean = true
    val anotherBoolean = false

    if (anotherBoolean)
        println("anotherBoolean is true")
    else
        println("anotherBoolean is false")
}

fun typeCharacters() {
    val letterChar = 'A'
    val digitChar = '9'
}

fun typeStrings() {
    var myStr = "Hello, Kotlin"

    // You can access the character at a particular index in a String using str[index]. The index starts from zero
    var name = "John"
    var firstCharInName = name[0]  // 'J'
    var lastCharInName = name[name.length - 1]  // 'n'
    println(name + ", " + firstCharInName + " (" + lastCharInName + ")")

    // Escaped String and Raw String
    // Strings declared in double quotes can have escaped characters like ‘\n’ (new line), ‘\t’ (tab) etc
    var myEscapedString = "Hello Reader,\nWelcome to my Blog"
    println(myEscapedString)

    // In Kotlin, you also have an option to declare raw strings. These Strings have no escaping and can span multiple lines
    var myMultilineRawString = """
        The Quick Brown Fox
    Jumped Over a Lazy Dog.
    """
    println(myMultilineRawString)
}

fun typeArrays() {
    var numbers = arrayOf(1, 2, 3, 4, 5)
    var animals = arrayOf("Cat", "Dog", "Lion", "Tiger")
    var mixedArray = arrayOf(1, true, 3, "Hello", 'A')	// Works and creates an array of Objects
    // var numArray = arrayOf<Int>(1, 2, 3, 4, "Hello")  // Compiler Error, because has a String element

    // Accessing the elements of an array by their index
    val myDoubleArray = arrayOf(4.0, 6.9, 1.7, 12.3, 5.4)
    val firstElement = myDoubleArray[0]
    val lastElement = myDoubleArray[myDoubleArray.size - 1]
    println(firstElement)

    // You can also modify the array element at an index like this
    val a = arrayOf(4, 5, 7)  // [4, 5, 7]
    a[1] = 10		          // [4, 10, 7]
    println(a[1])

    // Primitive Arrays
    val myCharArray = charArrayOf('K', 'O', 'T')  // CharArray (corresponds to Java 'char[]')
    val myIntArray = intArrayOf(1, 3, 5, 7)		// IntArray (corresponds to Java 'int[]')

    var mySquareArray = Array(5, {i -> i * i})	// [0, 1, 4, 9, 16]
}

fun typeConversions() {
    // Unlike Java, Kotlin doesn’t support implicit conversion from smaller types to larger types. For example, Int cannot be assigned to Long or Double.
    var myInt = 100
    //var myLong: Long = myInt // Compiler Error

    /*
        // Following helper functions are supported for type conversion between numeric types
        toByte()
        toShort()
        toInt()
        toLong()
        toFLoat()
        toDouble()
        toChar()
    */
    val myInt_2 = 100
    val myLong = myInt_2.toLong()   // Explicitly converting 'Int' to 'Long'

    // You can also convert larger types to smaller types
    val doubleValue = 176.80
    val intValue = doubleValue.toInt()  // 176

    // Every type in Kotlin, not just numeric type, supports a helper function called toString() to convert it to String.
    val myInt_3 = 1000
    myInt_3.toString()  // "1000"

    // You can also convert a String to a numeric type like so
    val strValue = "1000"
    val intValue_2 = strValue.toInt()
    println(intValue_2)
}