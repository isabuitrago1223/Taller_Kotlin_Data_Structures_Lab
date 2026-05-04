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