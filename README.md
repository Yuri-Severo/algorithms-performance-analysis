# Análise de Algoritmos de Ordenação

O **TestSort** é um programa Java desenvolvido para medir e comparar o desempenho de diferentes algoritmos de ordenação sob cenários variados. Ele avalia quatro algoritmos de ordenação em arrays de diferentes tamanhos e estruturas de dados, fornecendo tempos de execução para cada tentativa.

---

## 🚀 Algoritmos de Ordenação Disponíveis
1. **Bubble Sort**  
2. **Merge Sort**  
3. **Quick Sort**  
4. **Shell Sort**  

---

## 📊 Cenários Testados
O programa executa os algoritmos em quatro cenários distintos:  

1. **Array em Ordem Crescente**  
2. **Array em Ordem Decrescente**  
3. **Array Aleatório de Inteiros**  
4. **Array Aleatório de Strings**  

---

## 📏 Tamanhos de Arrays
Os tamanhos de arrays analisados são:  

- **10.000 elementos**  
- **100.000 elementos**  
- **500.000 elementos**

---

## 🔁 Repetições
Cada combinação de algoritmo, cenário e tamanho de array é executada **15 vezes** para obter uma média mais precisa.

---

## ⚙️ Como Funciona
1. **Seleção do Algoritmo**: O usuário escolhe o algoritmo desejado.  
2. **Teste em Diferentes Cenários**: O programa cria arrays específicos para cada cenário.  
3. **Medição de Desempenho**: O tempo de execução de cada tentativa é medido e exibido em milissegundos.  
4. **Resultados**: Os resultados são impressos no console.

---

## 🛠️ Estrutura do Código
- **Método `getAlgorithmName(int choice)`**: Retorna o nome do algoritmo com base na escolha do usuário.  
- **Método `generateStringArray(int size)`**: Gera arrays de strings aleatórias com letras minúsculas.  
- **Método `generateIntArray(int size, boolean ascending)`**: Gera arrays de inteiros ordenados (crescente ou decrescente).  
- **Método `generateIntArray(int size)`**: Gera arrays de inteiros aleatórios.  
- **Método `measureTime(Runnable task)`**: Mede o tempo de execução de uma tarefa.  

---

## 💻 Como Executar
1. Certifique-se de ter o Java instalado no computador.  
2. Compile o programa usando o comando:
   ```bash
   javac TestSort.java
   java TestSort
