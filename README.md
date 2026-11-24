# Identificação

* Nome: 
* Email (@ccc): 
* Matrícula: 

# Prova Prática 4

## O template

> Não altere o arquivo build.gradle

> O código java estará (ou você terá que colocar) no diretório **/src/main/java/**

> Os testes estarão na classe Asserts no diretório **/src/main/java/**

> Não mude nenhuma assinatura de método, nome de classe ou localização dos arquivos. Mas você pode/deve criar outros métodos e classes, desde que passem nos testes.


## A Prova

## Conta menores

Implementar o método `contaMenores(int k)` que conta os valores menores do que k em uma BST.

Veja os testes para ter clareza da definição. 
Pode considerar que não há elementos repetidos na BST.
Você **não** pode considerar que k é um valor presente na BST.

## heapify

Implemente o método `heapify(int i)` da classe Heap.

O método deve assumir que as subárvores enraizadas em `left(i)` e `right(i)` já satisfazem a propriedade de max-heap, mas o elemento na posição `i` pode violar essa propriedade (ou seja, pode ser menor que um de seus filhos). Sua tarefa é "afundar" o elemento na posição `i` — trocando-o com o maior de seus filhos quando necessário — até restaurar a propriedade de max-heap em toda a subárvore enraizada em `i`.

Você pode usar os métodos auxiliares já implementados na classe Heap (como `left`, `right`, `parent`, `isValidIndex`, `isLeaf` e `swap`), ou criar os seus próprios, desde que a solução passe nos testes.

## Entregando a prova

> ⚠️ **Importante:** Todos os comandos abaixo devem ser executados no **diretório pai** do projeto, ou seja, no diretório que **contém** o diretótio `pp4-20262/`. 

---

### Passo 1: Gerar o arquivo compactado da sua solução

Execute o comando abaixo **no diretório pai** do projeto (o diretório que contém `pp4-20262/`):

```bash
tar zcvf nome-sobrenome-matricula.tar.gz pp4-20262/
```
---

### Passo 2: Submeter sua solução

Execute o comando abaixo **no mesmo diretório do Passo 1**:

```bash
bash pp4-20262/submit-answer.sh pp4 nome-sobrenome-matricula.tar.gz
```

Importante: a senha é `leda`

## Importante

* A correção da prova não é automática. Os testes que são executados quando você faz push são apenas testes de sanidade.

* Vou considerar sempre a última submissão antes do deadline final. 

* A nota será dada pelos testes no servidor e depois da correção que eu efetuar. Sempre tento corrigir o mais rápido possível. Portanto, tenha paciência.

* A nota será calculada a partir dos testes e análise manual do código. Essa análise manual vai considerar se a solução é eficiente, se não tem loops desnecessários etc.

* Só serão corrigidas as provas dos alunos que assinaram a lista de presença física no laboratório.
