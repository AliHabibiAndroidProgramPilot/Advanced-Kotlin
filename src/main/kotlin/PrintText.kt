import kotlin.properties.Delegates

class PrintText() {
    var age by Delegates.observable(20) { _, oldValue, newValue ->
        println("Old Value: $oldValue")
        println("New Value: $newValue")
    }
}