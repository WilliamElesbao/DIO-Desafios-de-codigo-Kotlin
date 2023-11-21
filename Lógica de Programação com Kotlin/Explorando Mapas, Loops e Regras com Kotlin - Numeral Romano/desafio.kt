fun main() {
    val numeroRomano: String? = readLine()

    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    var resultado = 0 // Variável mutável para armazenar o resultado

    for (i in numeroRomano!!.indices) {
        val atual = numerosRomanos.getValue(numeroRomano[i])
        val proximo = if (i + 1 < numeroRomano.length) numerosRomanos.getValue(numeroRomano[i + 1]) else 0

        if (atual < proximo) {
            resultado -= atual
        } else {
            resultado += atual
        }
    }

    println(resultado)
}
