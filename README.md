# Backend-chapter Coding Game

Este ejercicio cuenta con una solución realizada de manera convencional, con procesos no optimizados y poco efectivos. La idea es mejorar su performance
en todo lo posible, mediante el uso de **Interfaces Funcionales** y, de ser posible, **Funciones Lambda**. A lo largo del código existen varios bloques y
sentencias que pueden ser reemplazadas por dichas funcionalidades.

## Problema

A gang of R foolish robbers decides to heist a bank. In the bank there are V vaults (indexed from 0 to V - 1). The robbers have managed to extract some information from the bank's director:
- The combination of a vault is composed of C characters (digits/vowels).
- The first N characters consist of digits from 0 to 9.
- The remaining characters consist of vowels (A, E, I, O, U).
- C and N may be the same or different for different vaults.

All the robbers work at the same time. A robber can work on one vault at a time, and a vault can be worked on by only one robber. Robbers deal with the different vaults in increasing order.

A robber tries the combinations at the speed of 1 combination per second. He tries all the possible combinations, i.e. he continues to try the untried combinations even after he has found the correct combination. Once he finishes one vault, he moves on to the next available vault, that is the vault with the smallest index among all the vaults that have not been worked on yet. The heist is finished when the robbers have worked on all the vaults.

Assume it takes no time to move from one vault to another.

You have to output the total time the heist takes.

**Input**

* Line 1: An integer R for the number of robbers.
* Line 2: An integer V for the number of vaults.
* Next V lines: For each vault, one line of two space-separated integers C and N for the total number of characters (C) and the total number of digits (N) in the vault's combination. The vaults are ordered by their index.

**Output**

* Line 1: An integer for the total time the heist takes in seconds.

**Constraints**

- 1 ≤ R ≤ 5
- 1 ≤ V ≤ 20
- 3 ≤ C ≤ 8
- 0 ≤ N ≤ C

**Example**

**Input**

> 1

> 1

> 3 1

**Output**

> 250

**Solution**

The number of combinations a code of length _C_ can form if the first _N_ characters can be made of 10 digits, followed by 5 vowels is
```math
10^N ⋅ 5^(C−N) = 5^N ⋅ 2^N ⋅ 5^C ⋅ 5^(−N) = 2^N ⋅ 5^C = 5^C << N
```



## Reglas del juego

* **No cambiar los tests**, se puede cambiar cualquier parte del código, incluyendo la estructura del proyecto, excepto los test.
* Después de cambiar el código, todos los tests deben aprobar.
* Refactorizar, de ser posible
