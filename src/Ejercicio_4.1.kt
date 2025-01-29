class Rectangulo(val base: Double, val altura: Double){

    init {
        require(base>0.0){"La base no puede ser menor a 0.0"}
        require(altura>0.0){"La altura no puede ser menor a 0.0"}
    }

    fun area(): Double{

        val area = base * altura
        println("El área del rectángulo con base $base y altura $altura, es: $area")

        return area
    }

    fun perimetro(): Double{

        val perimetro = (base*2)+(altura*2)
        println("El perímetro del rectángulo con base $base y altura $altura, es: $perimetro")

        return perimetro
    }

    override fun toString(): String{
        return "Rectángulo cuenta con una base de $base y altura de $altura," +
                "perímetro de ${perimetro()} y área de ${area()}"
    }
}


fun main(){

    val rectangulo1 = try {

        Rectangulo(2.4, 3.5)

    } catch (e: Exception){ println("ERROR: ${e.message}")
        null
    }


    val rectangulo2 = try{

        Rectangulo(-2.4, 3.5)

    } catch (e: Exception){println("ERROR: ${e.message}")
        null
    }

    println(rectangulo1?.area())
    println(rectangulo2)

}