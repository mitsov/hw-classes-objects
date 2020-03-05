package hiearchy.view

open class TextView (text: String): View() {


    open var text = text;
}

/*
val text = TextView("Some Text")
text.click() // вызывается метод из `View`
println(text.text) // Some Text
text.text = "Something bad happened"
println(text.text) // Something bad happened

 */