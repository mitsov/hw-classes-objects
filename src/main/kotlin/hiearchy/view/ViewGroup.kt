package hiearchy.view

class ViewGroup(): View() {
    lateinit var view: View
    fun addView(view: View) {
        this.view = View()
        }
    }
