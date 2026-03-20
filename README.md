# *Investigación: Uso de estructuras repetitivas en Java aplicadas a un Cajero Automático*

### Rolando Enrique Mayorga Mena
### Mauro Engelbert Delgado Saenz
### Dylan Andrés Mora Castillo
### Aris Marcel Gavarrete Alegría

## *1. Introducción*

Las estructuras repetitivas en programación permiten ejecutar un conjunto de instrucciones varias veces sin necesidad de escribirlas repetidamente. En el lenguaje Java, estas estructuras son fundamentales para desarrollar sistemas interactivos que requieren repetir procesos, como menús, validaciones y operaciones continuas.

En el desarrollo de un sistema que simula un cajero automático, el uso de estructuras repetitivas resulta esencial, ya que permite mantener activo el sistema mientras el usuario realiza diferentes operaciones. Este tipo de sistema utiliza clases como *Cuenta* y *Cajero*, donde se organiza la lógica del programa y se facilita la interacción con el usuario mediante un menú repetitivo.

---

## *2. Concepto de estructuras repetitivas*

Las estructuras repetitivas, también conocidas como ciclos o bucles, son herramientas que permiten repetir un bloque de código dependiendo de una condición o de un número determinado de veces. Su principal objetivo es optimizar el desarrollo del programa y facilitar la automatización de tareas.

Estas estructuras son importantes porque permiten reducir la redundancia en el código, mejorar la organización lógica y hacer más eficiente la ejecución de procesos. Además, son esenciales para validar datos ingresados por el usuario y mantener el control de flujo dentro de un sistema interactivo.

En Java, las principales estructuras repetitivas son: *for*, *while* y *do while*, cada una con características específicas que determinan su uso según la situación.

---

## *3. Estructura repetitiva for*

La estructura *for* se utiliza cuando se conoce previamente la cantidad de veces que se desea repetir una acción. Es especialmente útil en situaciones donde se requiere un control exacto del número de iteraciones.

Esta estructura combina en una sola línea la inicialización de la variable de control, la condición que determina la repetición y la actualización de dicha variable. Esto la convierte en una opción clara y organizada para procesos que siguen un patrón definido.

En el contexto de un cajero automático, esta estructura puede aplicarse en casos donde se necesita limitar el número de intentos de una operación, o cuando se requiere realizar repeticiones controladas dentro del sistema.

---

## *4. Estructura repetitiva while*

La estructura *while* permite ejecutar un bloque de instrucciones mientras se cumpla una condición específica. A diferencia del *for*, esta estructura no depende de un número fijo de repeticiones, sino de una condición que puede cambiar durante la ejecución del programa.

Una de sus principales características es que evalúa la condición antes de ejecutar el bloque de código. Esto significa que, si la condición es falsa desde el inicio, el bloque no se ejecutará en ningún momento.

En un sistema de cajero automático, esta estructura es útil para mantener activo el sistema mientras el usuario no decida salir, así como para validar datos ingresados, repitiendo el proceso hasta que la información sea correcta.

---

## *5. Estructura repetitiva do while*

La estructura *do while* es similar a *while*, pero con una diferencia importante: primero ejecuta el bloque de instrucciones y luego evalúa la condición. Esto garantiza que el código se ejecute al menos una vez, independientemente de si la condición es verdadera o falsa.

Esta característica la hace especialmente útil en programas donde se necesita mostrar información inicial obligatoriamente, como un menú principal.

En el caso del cajero automático, el *do while* se utiliza comúnmente para mostrar el menú de opciones, asegurando que el usuario pueda interactuar con el sistema al menos una vez antes de decidir si continúa o finaliza la sesión.

---

## *6. Diferencias entre las estructuras repetitivas*

Aunque las estructuras *for*, *while* y *do while* cumplen la misma función general de repetir instrucciones, su uso depende del contexto en el que se apliquen.

El *for* es ideal cuando se conoce el número exacto de repeticiones. El *while* es más flexible y se utiliza cuando la repetición depende de una condición que puede cambiar durante la ejecución. Por su parte, el *do while* garantiza al menos una ejecución, lo que lo hace adecuado para menús e interacciones iniciales.

Comprender estas diferencias permite seleccionar la estructura más adecuada y mejorar la eficiencia del programa.

---

## *7. Aplicación en el sistema de cajero automático*

El sistema de cajero automático se desarrolla utilizando el enfoque de programación orientada a objetos, lo que permite organizar el código en clases que representan entidades del mundo real.

La clase *Cuenta* se encarga de gestionar la información del usuario, como el saldo y las operaciones disponibles. Por otro lado, la clase *Cajero* controla la interacción con el usuario, mostrando el menú y ejecutando las acciones correspondientes.

Las estructuras repetitivas permiten que el sistema funcione de manera continua, dando al usuario la posibilidad de realizar múltiples operaciones sin necesidad de reiniciar el programa.

---

## *8. Lógica general del sistema*

El funcionamiento del sistema sigue una secuencia lógica donde se inicializa una cuenta, se presenta un menú de opciones y se permite al usuario seleccionar la operación que desea realizar.

Una vez seleccionada la opción, el sistema valida la información ingresada y ejecuta la acción correspondiente. Posteriormente, el menú se vuelve a mostrar, repitiendo el proceso hasta que el usuario decide finalizar la sesión.

Al concluir, el sistema puede presentar un resumen del estado final de la cuenta, mostrando los resultados de las operaciones realizadas.

---

## *9. Validaciones dentro del sistema*

Las validaciones son un aspecto fundamental en el desarrollo de este tipo de sistemas, ya que garantizan el correcto funcionamiento y evitan errores.

Entre las principales validaciones se encuentran la verificación de montos válidos, la comprobación de fondos suficientes para realizar retiros y la validación de opciones ingresadas en el menú.

Las estructuras repetitivas permiten que estas validaciones se realicen de manera continua, solicitando nuevamente la información al usuario en caso de que sea incorrecta.

---

## *10. Conclusión*

Las estructuras repetitivas en Java son herramientas esenciales para el desarrollo de programas interactivos y dinámicos. Su aplicación en un sistema de cajero automático demuestra cómo permiten controlar el flujo del programa, repetir procesos y validar información de manera eficiente.

El uso adecuado de *for*, *while* y *do while*, junto con la organización del código en clases, facilita la creación de sistemas funcionales y cercanos a situaciones reales. Esto no solo mejora la calidad del programa, sino que también fortalece la comprensión de la lógica de programación.
