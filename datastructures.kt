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
    *
    */
  
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
