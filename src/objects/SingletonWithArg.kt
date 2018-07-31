package objects

/**
 *
 *   T.also(block: (T) → Unit): T
 *
 * */
class SingletonWithArg {

    companion object {

        @Volatile //Important
        private var INSTANCE: SingletonWithArg? = null

        fun getInstance(dbName: String): SingletonWithArg =
                INSTANCE ?: synchronized(this) {
                    INSTANCE ?: buildDatabase(dbName).also { INSTANCE = SingletonWithArg() }
                }

        private fun buildDatabase(dbName: String) = SingletonWithArg()
    }


}