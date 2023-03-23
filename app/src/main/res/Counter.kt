import androidx.lifecycle.ViewModel

class Counter: ViewModel() {
    var value: Int = 0
    fun add(){
        value++
    }

}