import enumspackage.BandMember
import enumspackage.BandMember2

fun main(args:Array<String>){

    val selectedBandMember:BandMember = BandMember.BOBBY

    println("BandMember is $selectedBandMember")

    var selectedMember2:BandMember2 = BandMember2.PHIL

    println("$selectedMember2 plays the ${selectedMember2.instrument}")

    println("$selectedMember2 sings ${selectedMember2.sings()}")


    selectedMember2 = BandMember2.PHIL

    println("$selectedMember2 plays the ${selectedMember2.instrument}")

    println("$selectedMember2 sings ${selectedMember2.sings()}")

}