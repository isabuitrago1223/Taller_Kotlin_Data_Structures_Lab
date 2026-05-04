fun reto1() {
    val gastos = arrayOf(
        12000.0, 45000.0, 8500.0, 32000.0, 15000.0,
        27000.0, 5000.0, 19000.0, 41000.0, 11000.0,
        33000.0, 7000.0, 28000.0, 16000.0, 22000.0
    )

    var total = 0.0
    for (gasto in gastos) {
        total = total + gasto
    }

    val promedio = total / gastos.size

    var maximo = gastos[0]
    for (gasto in gastos) {
        if (gasto > maximo) maximo = gasto
    }

    var minimo = gastos[0]
    for (gasto in gastos) {
        if (gasto < minimo) minimo = gasto
    }

    println("Total: $$total")
    println("Promedio: $$promedio")
    println("Máximo: $$maximo")
    println("Mínimo: $$minimo")
}

fun reto2() {
    val empleados = listOf(
        Pair("Ana", 25),
        Pair("Carlos", 35),
        Pair("Maria", 42),
        Pair("Luis", 28),
        Pair("Sofia", 31)
    )

    val senior = mutableListOf<String>()
    for (empleado in empleados) {
        if (empleado.second > 30) {
            senior.add(empleado.first.uppercase())
        }
    }

    println(senior)
}

fun reto3() {
    val contactos = listOf(
        3001234567, 3009876543, 3001234567,
        3112345678, 3009876543, 3187654321,
        3001234567, 3112345678, 3205551234,
        3187654321, 3001112233, 3009876543,
        3205551234, 3001112233, 3009998877,
        3112345678, 3001234567, 3009998877,
        3187654321, 3001112233
    )

    val unicos = contactos.toSet()
    val ordenados = unicos.sorted()

    println(ordenados)
}

fun reto4() {
    val carrito = listOf("manzana", "leche", "manzana", "pan", "leche", "manzana")

    val conteo = mutableMapOf<String, Int>()
    for (producto in carrito) {
        if (conteo.containsKey(producto)) {
            conteo[producto] = conteo[producto]!! + 1
        } else {
            conteo[producto] = 1
        }
    }

    println(conteo)
}

fun reto5() {
    val historial = arrayOf(
        "google.com", "youtube.com", "instagram.com",
        "twitter.com", "github.com"
    )

    val invertido = arrayOf("", "", "", "", "")
    var j = historial.size - 1
    for (i in historial.indices) {
        invertido[i] = historial[j]
        j--
    }

    println(invertido.toList())
}

fun reto6() {
    val persona1 = setOf("fútbol", "música", "viajes", "cocina", "lectura")
    val persona2 = setOf("música", "viajes", "gaming", "lectura", "senderismo")

    val enComun = mutableSetOf<String>()
    val exclusivos = mutableSetOf<String>()

    for (interes in persona1) {
        if (persona2.contains(interes)) {
            enComun.add(interes)
        } else {
            exclusivos.add(interes)
        }
    }

    println("En común: $enComun")
    println("Exclusivos de persona1: $exclusivos")
}

fun reto7() {
    val despensa = mutableMapOf(
        "arroz" to 5,
        "leche" to 2,
        "huevos" to 12,
        "pan" to 1,
        "aceite" to 3
    )

    despensa["leche"] = despensa["leche"]!! - 1
    despensa["pan"] = despensa["pan"]!! - 1

    val agotados = mutableListOf<String>()
    for (producto in despensa) {
        if (producto.value <= 0) {
            agotados.add(producto.key)
        }
    }

    for (producto in agotados) {
        despensa.remove(producto)
        println(" $producto se agotó y fue eliminado")
    }

    println(despensa)
}