package enumspackage

enum class BandMember2(val instrument:String) {

    JERRY("Lead Guitar"){
        override fun sings(): String {
           return "Plaintively"
        }},

    BOBBY("Rhythm Guitar"){
        override fun sings(): String {
            return "Hoarsely"
        }
                          },

    PHIL("Bass");

    open fun sings() = "Occasionally"

}