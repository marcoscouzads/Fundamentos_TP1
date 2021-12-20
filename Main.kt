fun main() {
    println("Realização do TP1")
    println("Considere os elementos da lista abaixo nas questões 2,3,4 e 6")

    val triangulo = listOf(1, 2, 3, 4, 5, 4, 3, 2, 1, 0)
    val fibonacci = listOf(1, 1, 2, 3, 5, 8, 13, 21, 34)
    val numeros = (1..100).toList()
    val palavra = "abacaxi"
    val vazio = listOf<Int>()
    
}

//Inverter palavras
fun qt2(element: List<Int>) {
    println("Questão 2\n")

    val name = "INFNET"
    if (element.first() < element.last())
        println(name)
    else
        println(name.reversed())
}

//Maior na lista
fun qt3(element: List<Int>) {
    println("questão 3\n")

    var x = 0

    for (i in element) {
        when {
            i > x -> {
                x = i
                println("elemento $i e o maior agora é $x")
            }
            else -> {
                println("elemento $i e o maior continua $x")
            }
        }
    }

}

//Somar pares e Multiplicar impares
fun qt4(element: List<Int>) {
    var soma = 0
    var produto = 1

    for (i in element) {
        if (i % 2 == 0) {
            println("Este numero é par $i")
            soma += i
            println("a soma é $soma")
        } else {
            println("Este numero é impar $i")
            produto *= i
            println("a produto é $produto")

        }
    }
}

//Calculadora de fatorial
fun qt5(n: Int) {
    var fatorial = n
    var total = 1
    var listFatorial = mutableListOf<Int>()

    while (fatorial > 1) {
        listFatorial.add(fatorial)
        total *= fatorial
        fatorial--
        println(" $total * $fatorial = ${total * fatorial}")
    }
    println("to $listFatorial !")
    println("o fatorial de $n é ${total}")


}

//listar primos
fun qt6(element: List<Int>) {
    //Crivo de Eratóstenes
    var listaPrimos = mutableListOf<Int>()
    var listaPrimos1 = mutableListOf<Int>()
    var listaPrimos2 = mutableListOf<Int>()

    for (i in element) {

        if (ehPrimo(i)) {
            listaPrimos.add(1)
            listaPrimos1.add(i)
        } else {
            listaPrimos.add(0)
            listaPrimos2.add(i)

        }

    }
    println("Lista de primos: $listaPrimos")
    println("lista d numeros: $element")
    println("Lista de todos os primos: $listaPrimos1")
    println("Lista de todos os  não primos: $listaPrimos2")

}

fun ehPrimo(n: Int): Boolean {
    if (n % 2 == 0 && n != 2) {
        println("não é primo $n")
        return false
    } else if (n == 1) {
        println("não é primo $n")
        return false
    } else if (n % 3 == 0 && n != 3) {
        println("não é primo $n")
        return false
    } else if (n % 5 == 0 && n != 5) {
        println("não é primo $n")
        return false
    } else if (n % 7 == 0 && n != 7) {
        println("não é primo $n")
        return false
    } else if (n % 9 == 0 && n != 9) {
        println("não é primo $n")
        return false
    }
    println("é primo $n")
    return true
}

//
fun qt7(palavra: String): Int {

    var total = 0
    val alfa = "abcdefghijklmnopqrstuvwxyz"
    val alfabeto = ('a'..'z').toList()

    var indice = 0
    for (i in palavra) {
        indice++

        var posicao = 0
        for (p in alfa) {
            posicao++
            if (i === p) {
                total += indice * posicao
                println("$i - $posicao * $indice = ${indice * posicao}")
                break
            }
        }
    }
    println("$palavra = $total")

    return total

}


