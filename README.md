## Juego de Adivinanza de Palabras

Este es un juego de adivinanzas de palabras simple implementado en Java. El juego pasa una lista de palabras 
al programa y pide al usuario que las adivine. Además, indica cuántas palabras ha adivinado correctamente.

### Funcionamiento

El juego funciona de la siguiente manera:

1. Se crea una lista de palabras que el usuario debe adivinar.
2. El usuario ingresa palabras y el programa verifica si están en la lista.
3. Si la palabra está en la lista, se elimina de esta y se incrementa el contador de palabras adivinadas.
4. El juego continúa hasta que el usuario adivine todas las palabras de la lista.

### Estructura del Código

El código consta de dos clases principales:

1. **JuegoDeAdivinanza.java**: Esta clase contiene la lógica del juego. Define un HashSet de palabras y métodos para jugar y verificar las respuestas del usuario.

2. **Main.java**: Este archivo contiene el método `main`, que inicializa el juego con un conjunto de palabras predefinidas y llama al método para iniciar el juego.

## Autor

Angel Chung Zhang
