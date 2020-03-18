package hiearchy.widget

import hiearchy.view.TextView

class Button(text: String) : TextView(text){

    override fun toString(): String = text

    override fun click() = println("Button clicked")
}