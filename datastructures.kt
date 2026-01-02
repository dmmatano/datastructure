/*************** Estrutura de dados *************************
* 1- Array
* 2- List
* 3- Linked List
* 4- Map 
*/

fun main() {
    /************************ 1- Array *****************************
    * Elementos do mesmo tipo de dado, tamanho fixo
    * Usar quando: acesso rápido por índice; sabe o tamanho; dados simples e estáveis
    * Evitar: precisa add ou remover muito frequentemente
    * .plus() ou outras operações similares criam um novo array
    */
    val numbersArray = intArrayOf(1,2,3,4,5)
    val namesArray: Array<String> = arrayOf("David","John", "Stephano","Dona Jonathan", "Senhora Jeffersa")
    namesArray.first()
    namesArray.last()
    namesArray.contains("John")
  
    /************************ 2- List *****************************
    * uma coleção ordenada de elementos
    * 
    */
  
    /************************ 3- Linked List *****************************
    * consiste em pares de "valor" e "posição" da próximo "par"
    * Usar quando: muitas inserções e remoções no meio da estrutura; tamanho muda muito
    * Evitar: quando precisa d emuitas buscas
    */
    class Node<T>(
        var value: T,
        var next: Node<T>? = null
    )
    class LinkedList<T> {
        private var head: Node<T>? = null

        // Inserir no final
        fun add(value: T) {
            val newNode = Node(value)

            if (head == null) {
                head = newNode
                return
            }

            var current = head
            while (current?.next != null) {
                current = current.next
            }

            current?.next = newNode
        }

        // Inserir no início
        fun addFirst(value: T) {
            val newNode = Node(value, head)
            head = newNode
        }
    
        // Remover o primeiro elemento
        fun removeFirst() {
            head = head?.next
        }
    
        // Buscar um valor
        fun contains(value: T): Boolean {
            var current = head
            while (current != null) {
                if (current.value == value) return true
                current = current.next
            }
            return false
        }
    }

    /************************ 4- Map *****************************
    * consiste em pares de "valor" e "posição" da próximo "par"
    *
    */
  
    val mapExample = mapOf(
      "221" to "Aligator",
      "245" to "Dog",
      "266" to "Dino"
    )
    
    /************************ 5 - Set *****************************
    * garante que não tenha valores dupplicados
    * operacoes legais como uniao, interseccao, diferenca, etc
    */
  
    val setExample = setOf("maca","pera","uva","uva")
    val setExample2 = setOf("Sao Paulo","Santa Catarina","Pernanbuco")
    println("$setExample ... ${setExample.union(setExample2)}")
  
    /************************ 6 - Stack *****************************
    * LIFO
    * Push - inclui
    * Pop - retira
    * Peek/Top - retorna valor do topo sem retirar
    */
  
    /************************ 7 - Queue *****************************
    * FIFO
    * Front - valor da extrema direita
    * Rear/Tail - valor da extrema esquerda
    * Enqueue - adiciona valor no final da fila, identifica como tail e desloca itens
    * Dequeue - remove primeiro item da fila e desloca todos
    * 
    */
    
  }
