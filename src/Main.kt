fun main() {
    val str = "Добрый день Руслан"
    println(str.getLastIndex())
}

fun String.getLastIndex(): Int{
    return this.length - 1
}