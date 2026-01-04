/*************** Estrutura de dados *************************
* 1- Array
* 2- List
* 3- Linked List
* 4- Hash Table 
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

    /************************ 4- Hash Table *****************************
    * Uma tabela hash é uma estrutura de dados que armazena pares chave → valor e permite acesso extremamente rápido.
    * Você passa uma chave, essa chave passa por uma função hash que gera um índice, o valor é armazenado ou recuperado diretamente nesse índice
    * Complexidade: para inserções, pesquisa e etc normalmente é  O(1), mas se houverem muitas colisões (raro se usar tabelas do Kotlin) é O(n).
    * Complexidade de espaço é O(n)
    * Usar: Busca rápida por chave, verificar existência de elemento, mapear dados, contadores, cache, indices, dicionários
    * Evitar: Precisa de ordem, Precisa percorrer dados ordenados, Precisa do menor / maior elemento, Precisa de range queries, 
    * Quer previsibilidade absoluta de performance (sistemas hard real-time)
    * Diminuindo colisões: ter baixo fator de carga; boa função hash (valores estão dispersos na tabela, e não amontoados em um unico indice.
    * Fator de carga = qtd items / qtd tot espaços
    */
  
    val map = HashMap<String, Int>()
    
    map["banana"] = 3
    map["maçã"] = 5
    
    println(map["banana"]) // 3

    
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
