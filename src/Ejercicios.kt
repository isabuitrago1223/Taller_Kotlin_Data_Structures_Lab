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

fun reto8() {
    val notas = listOf(
        Pair(4.5, 0.3),
        Pair(3.8, 0.2),
        Pair(4.0, 0.25),
        Pair(3.5, 0.25)
    )

    var notaFinal = 0.0
    for (nota in notas) {
        notaFinal = notaFinal + (nota.first * nota.second)
    }

    println("Nota final: $notaFinal")
}

fun reto9() {
    val paises = mapOf(
        "CO" to "Colombia",
        "US" to "Estados Unidos",
        "MX" to "México",
        "AR" to "Argentina",
        "ES" to "España"
    )

    for (entrada in paises) {
        println("El código [${entrada.key}] pertenece a [${entrada.value}]")
    }
}

fun reto10() {
    val empleados = mutableListOf(
        "Ana", "Carlos", "Maria", "Luis", "Sofia", "Pedro", "Laura"
    )

    val k = 2
    repeat(k) {
        val primero = empleados[0]
        empleados.removeAt(0)
        empleados.add(primero)
    }

    println(empleados)
}

fun reto11() {
    val objetos = listOf(
        Pair("camisa", 1),
        Pair("laptop", 3),
        Pair("zapatos", 2),
        Pair("libro", 1),
        Pair("chaqueta", 2),
        Pair("cargador", 1),
        Pair("pantalon", 2)
    )

    val maleta = mutableMapOf<Int, MutableList<String>>()

    for (objeto in objetos) {
        val peso = objeto.second
        if (!maleta.containsKey(peso)) {
            maleta[peso] = mutableListOf()
        }
        maleta[peso]!!.add(objeto.first)
    }

    println(maleta)
}

fun reto12() {
    val ruta = listOf(1, 2, 3, 4, 3, 2, 1)

    var esPalindromo = true
    for (i in ruta.indices) {
        if (ruta[i] != ruta[ruta.size - 1 - i]) {
            esPalindromo = false
        }
    }

    if (esPalindromo) {
        println("La ruta ES espejo ")
    } else {
        println("La ruta NO es espejo ")
    }
}

fun reto13() {
    val paquetes = mutableListOf<Int>()
    for (i in 1..50) {
        paquetes.add(i)
    }

    val camiones = mutableListOf<List<Int>>()
    var i = 0
    while (i < paquetes.size) {
        val lote = mutableListOf<Int>()
        for (j in i until minOf(i + 10, paquetes.size)) {
            lote.add(paquetes[j])
        }
        camiones.add(lote)
        i += 10
    }

    for (index in camiones.indices) {
        println("Camión ${index + 1}: ${camiones[index]}")
    }
}

fun reto14() {
    val tickets = listOf(
        "ERR001", "ERR002", "ERR001", "ERR003",
        "ERR002", "ERR004", "ERR003", "ERR001",
        "ERR005", "ERR002", "ERR004", "ERR006"
    )

    val conteo = mutableMapOf<String, Int>()
    for (ticket in tickets) {
        if (conteo.containsKey(ticket)) {
            conteo[ticket] = conteo[ticket]!! + 1
        } else {
            conteo[ticket] = 1
        }
    }

    var ticketUnico = ""
    for (entrada in conteo) {
        if (entrada.value == 1) {
            ticketUnico = entrada.key
        }
    }

    println("Ticket único: $ticketUnico")
}

fun reto15() {
    val precios = mapOf(
        "leche" to 3000.0,
        "televisor" to 80000.0,
        "pan" to 2000.0,
        "celular" to 120000.0,
        "arroz" to 4000.0,
        "nevera" to 95000.0
    )

    val conIva = mutableMapOf<String, Double>()
    for (producto in precios) {
        if (producto.value > 50000) {
            conIva[producto.key] = producto.value * 1.19
        }
    }

    println(conIva)
}

fun reto16() {
    val sensores = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15)

    val aEliminar = mutableListOf<Int>()
    for (sensor in sensores) {
        if (sensor % 3 == 0) {
            aEliminar.add(sensor)
        }
    }

    for (sensor in aEliminar) {
        sensores.remove(sensor)
    }

    println(sensores)
}

fun reto17() {
    val almacen = arrayOf(
        arrayOf(3, 7, 2, 1),
        arrayOf(5, 4, 8, 6),
        arrayOf(9, 2, 5, 3),
        arrayOf(1, 6, 4, 7)
    )

    var diagonal principal = 0
    var diagonalSecundaria = 0

    for (i in almacen.indices) {
        diagonalPrincipal += almacen[i][i]
        diagonalSecundaria += almacen[i][almacen.size - 1 - i]
    }

    println("Diagonal principal: $diagonalPrincipal")
    println("Diagonal secundaria: $diagonalSecundaria")
}

fun reto18() {
    val chef1 = mapOf(
        "harina" to 2.0,
        "azucar" to 1.5,
        "mantequilla" to 0.5,
        "leche" to 1.0
    )

    val chef2 = mapOf(
        "harina" to 1.0,
        "azucar" to 0.5,
        "huevos" to 3.0,
        "leche" to 0.5
    )

    val compras = mutableMapOf<String, Double>()

    for (ingrediente in chef1) {
        compras[ingrediente.key] = ingrediente.value
    }

    for (ingrediente in chef2) {
        if (compras.containsKey(ingrediente.key)) {
            compras[ingrediente.key] = compras[ingrediente.key]!! + ingrediente.value
        } else {
            compras[ingrediente.key] = ingrediente.value
        }
    }

    println(compras)
}

fun reto19() {
    val apps = mutableListOf(
        Pair("Instagram", 4.5),
        Pair("TikTok", 4.8),
        Pair("Twitter", 3.9),
        Pair("Spotify", 4.7),
        Pair("YouTube", 4.6),
        Pair("WhatsApp", 4.3),
        Pair("Netflix", 4.4),
        Pair("Uber", 3.8),
        Pair("Gmail", 4.1),
        Pair("Maps", 4.2),
        Pair("Duolingo", 4.9),
        Pair("Discord", 4.0)
    )

    for (i in apps.indices) {
        for (j in 0 until apps.size - 1 - i) {
            if (apps[j].second < apps[j + 1].second) {
                val temp = apps[j]
                apps[j] = apps[j + 1]
                apps[j + 1] = temp
            }
        }
    }

    val top10 = apps.subList(0, 10)
    for (index in top10.indices) {
        println("${index + 1}. ${top10[index].first} - ${top10[index].second}⭐")
    }
}

fun reto20() {
    val agenda1 = listOf("Ana", "Carlos", "Luis", "Maria", "Sofia")
    val agenda2 = listOf("Diego", "Juan", "Maria", "Pedro", "Sofia")

    val combinada = mutableListOf<String>()

    for (nombre in agenda1) combinada.add(nombre)
    for (nombre in agenda2) {
        if (!combinada.contains(nombre)) {
            combinada.add(nombre)
        }
    }

    var i = 0
    while (i < combinada.size - 1) {
        if (combinada[i] > combinada[i + 1]) {
            val temp = combinada[i]
            combinada[i] = combinada[i + 1]
            combinada[i + 1] = temp
            i = 0
        } else {
            i++
        }
    }

    println(combinada)
}

fun reto21() {
    val marcas = Array(101) { false }

    for (piso in 2..100) {
        var esPrimo = true
        for (i in 2 until piso) {
            if (piso % i == 0) {
                esPrimo = false
            }
        }
        if (esPrimo) {
            marcas[piso] = true
        }
    }

    val pisosPrimos = mutableListOf<Int>()
    for (piso in 2..100) {
        if (marcas[piso]) {
            pisosPrimos.add(piso)
        }
    }

    println(pisosPrimos)
}