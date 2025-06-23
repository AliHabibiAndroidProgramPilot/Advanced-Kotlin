class PrintText private constructor() {
    companion object {
        /*var instance: PrintText? = null
        fun getPrintTextInstance(): PrintText {
            if (instance == null) instance = PrintText()
            return instance!!
        }*/
        val instance: PrintText by lazy(LazyThreadSafetyMode.SYNCHRONIZED) {
            PrintText()
        }
    }

    fun log() {
        println("Hello From Print Class")
    }

}