var nilai = 80


fun main() {
        //Condition NOT
        println("Condition NOT")
        val kkm = 75
        val tuntas = nilai >= kkm

        if(!tuntas){
                println("Anda $nilai, Selamat!!")
        }else{
                println("Nilai anda $nilai, Silahkan remidi")
        }
/*
    println()
    if (nilai > 90){
        println("Nilai anda A")
    }else if (nilai > 80){
        println("Nilai anda B")
    }else if (nilai > 70){
        println("Nilai anda C")
    }else if (nilai > 60){
        println("Nilai anda D")
    }else{
        println("Nilai anda E")
    }
*/
        DenganBoolean()
}

fun DenganBoolean(){
        println("Dengan Boolean")
        val a = nilai > 90
        val b = nilai > 80
        val c = nilai > 70
        val d = nilai > 60
        val e = nilai<=50
        if (a){
                println("Nilai anda A")
        }else if (b){
                println("Nilai anda B")
        }else if (c){
                println("Nilai anda C")
        }else if (d){
                println("Nilai anda D")
        }else {
                println("Nilai anda E")
        }
}
