# Requisitos

En este documento se registran las distintas Historias de Usuario redactadas en el proceso de análisis y comprensión del dominio del problema (o enunciado). En nuestro caso hemos decidido ordenarlas en 6 secciones distintas. Estas secciones representan, a grandes rasgos, los diferentes apartados y funcionalidades del programa.

## Índice

| ID | Historia |
|----|----------|
| **Gestión de gastos** | |
| [1.1](#hu-11--registrar-un-gasto) | Registrar un gasto |
| [1.2](#hu-12--usar-categorías-predefinidas) | Usar categorías predefinidas |
| [1.3](#hu-13--crear-categorías-propias) | Crear categorías propias |
| [1.4](#hu-14--editar-un-gasto) | Editar un gasto |
| [1.5](#hu-15--borrar-un-gasto) | Borrar un gasto |
| [1.6](#hu-16--gestionar-gastos-desde-la-línea-de-comandos) | Gestionar gastos desde la línea de comandos |
| **Visualización** | |
| [2.1](#hu-21--consultar-gastos-en-tabla) | Consultar gastos en tabla |
| [2.2](#hu-22--ver-gastos-por-categoría-en-gráfico-de-barras) | Ver gastos por categoría en gráfico de barras |
| [2.3](#hu-23--ver-gastos-por-categoría-en-gráfico-circular) | Ver gastos por categoría en gráfico circular |
| [2.4](#hu-24--ver-gastos-en-un-calendario) | Ver gastos en un calendario |
| **Filtrado** | |
| [3.1](#hu-31--filtrar-por-meses) | Filtrar por meses |
| [3.2](#hu-32--filtrar-por-intervalo-de-fechas) | Filtrar por intervalo de fechas |
| [3.3](#hu-33--filtrar-por-categorías) | Filtrar por categorías |
| [3.4](#hu-34--combinar-filtros) | Combinar filtros |
| **Alertas y notificaciones** | |
| [4.1](#hu-41--crear-una-alerta-semanal-o-mensual) | Crear una alerta semanal o mensual |
| [4.2](#hu-42--vincular-una-alerta-a-una-categoría) | Vincular una alerta a una categoría |
| [4.3](#hu-43--recibir-una-notificación-al-superar-el-límite) | Recibir una notificación al superar el límite |
| [4.4](#hu-44--consultar-el-historial-de-notificaciones) | Consultar el historial de notificaciones |
| **Cuentas compartidas** | |
| [5.1](#hu-51--crear-una-cuenta-compartida) | Crear una cuenta compartida |
| [5.2](#hu-52--registrar-un-gasto-en-una-cuenta-compartida) | Registrar un gasto en una cuenta compartida |
| [5.3](#hu-53--consultar-los-saldos-de-la-cuenta) | Consultar los saldos de la cuenta |
| [5.4](#hu-54--repartir-por-porcentajes) | Repartir por porcentajes |
| **Importación** | |
| [6.1](#hu-61--importar-gastos-desde-un-fichero-bancario) | Importar gastos desde un fichero bancario |
| [6.2](#hu-62--importar-ficheros-de-distintos-formatos) | Importar ficheros de distintos formatos |
| **Otros** | |
| [RT / NFR](#requisitos-técnicos-y-no-funcionales) | Requisitos técnicos y no funcionales |

---

## Gestión de gastos

### HU 1.1 – Registrar un gasto

> **Como** usuario,<br>
> **quiero** registrar un gasto indicando su cantidad, su fecha y su categoría,<br>
> **para** saber en qué y cuándo gasto mi dinero.

**Criterios de aceptación**

1. **Dado** que estoy en la ventana de nuevo gasto, **cuando** introduzco una cantidad mayor que 0, una fecha y una categoría y pulso "Guardar", **entonces** el gasto aparece en la lista de gastos.
2. **Dado** que la cantidad está vacía, es 0 o es negativa, **cuando** pulso "Guardar", **entonces** el sistema muestra un error y no registra el gasto.
3. **Dado** que he registrado un gasto, **cuando** cierro y vuelvo a abrir la aplicación, **entonces** el gasto sigue ahí.

---

### HU 1.2 – Usar categorías predefinidas

> **Como** usuario,<br>
> **quiero** clasificar mis gastos en categorías que ya vengan creadas,<br>
> **para** organizarlos desde el primer día sin configurar nada.

**Criterios de aceptación**

1. **Dado** que abro la aplicación por primera vez, **cuando** registro un gasto, **entonces** puedo elegir al menos las categorías Alimentación, Transporte y Entretenimiento.

---

### HU 1.3 – Crear categorías propias

> **Como** usuario,<br>
> **quiero** crear categorías nuevas,<br>
> **para** clasificar gastos que no encajan en las predefinidas.

**Criterios de aceptación**

1. **Dado** que escribo un nombre de categoría que no existe, **cuando** pulso "Crear", **entonces** la categoría queda disponible al registrar o editar gastos.
2. **Dado** que escribo un nombre vacío o el de una categoría existente, **cuando** pulso "Crear", **entonces** el sistema muestra un error y no crea la categoría.

---

### HU 1.4 – Editar un gasto

> **Como** usuario,<br>
> **quiero** modificar la cantidad, la fecha o la categoría de un gasto ya registrado,<br>
> **para** corregir errores sin tener que borrarlo y crearlo de nuevo.

**Criterios de aceptación**

1. **Dado** un gasto seleccionado en la lista, **cuando** cambio sus datos y guardo, **entonces** la lista, los gráficos y los totales muestran los nuevos valores.
2. **Dado** que introduzco datos no válidos, **cuando** guardo, **entonces** se aplican las mismas validaciones que en la HU 1.1 y el gasto no cambia.

---

### HU 1.5 – Borrar un gasto

> **Como** usuario,<br>
> **quiero** eliminar un gasto,<br>
> **para** quitar los que registré por error.

**Criterios de aceptación**

1. **Dado** un gasto seleccionado, **cuando** pulso "Borrar" y confirmo, **entonces** el gasto desaparece de la lista y de los gráficos.
2. **Dado** que se muestra la confirmación, **cuando** cancelo, **entonces** el gasto no se borra.

---

### HU 1.6 – Gestionar gastos desde la línea de comandos

> **Como** usuario,<br>
> **quiero** registrar, modificar y borrar gastos escribiendo comandos,<br>
> **para** hacerlo rápido sin abrir la interfaz gráfica.

**Criterios de aceptación**

1. **Dado** que ejecuto la aplicación en modo consola, **cuando** escribo el comando de registro con cantidad, fecha y categoría, **entonces** el gasto se guarda y aparece también en la interfaz gráfica.
2. **Dado** un comando mal escrito o con datos no válidos, **cuando** lo ejecuto, **entonces** el sistema muestra un mensaje de error y la sintaxis correcta.
3. **Dado** el identificador de un gasto existente, **cuando** ejecuto el comando de modificar o borrar, **entonces** el gasto se actualiza o se elimina.

---

## Visualización

### HU 2.1 – Consultar gastos en tabla

> **Como** usuario,<br>
> **quiero** ver mis gastos en una tabla con su fecha, categoría y cantidad,<br>
> **para** revisarlos uno a uno.

**Criterios de aceptación**

1. **Dado** que tengo gastos registrados, **cuando** abro la vista de tabla, **entonces** veo una fila por gasto con fecha, categoría y cantidad, ordenada por fecha de más reciente a más antigua.
2. **Dado** que no tengo gastos, **cuando** abro la vista, **entonces** se muestra un mensaje indicando que no hay gastos.

---

### HU 2.2 – Ver gastos por categoría en gráfico de barras

> **Como** usuario,<br>
> **quiero** ver un gráfico de barras con el total gastado en cada categoría,<br>
> **para** comparar de un vistazo en qué gasto más.

**Criterios de aceptación**

1. **Dado** que tengo gastos en varias categorías, **cuando** abro el gráfico de barras, **entonces** se muestra una barra por categoría con la suma de sus gastos.
2. **Dado** que he aplicado un filtro (ver [Filtrado](#filtrado)), **cuando** abro el gráfico, **entonces** solo se tienen en cuenta los gastos filtrados.

---

### HU 2.3 – Ver gastos por categoría en gráfico circular

> **Como** usuario,<br>
> **quiero** ver un gráfico circular con el porcentaje que representa cada categoría,<br>
> **para** entender qué parte de mi gasto total se lleva cada una.

**Criterios de aceptación**

1. **Dado** que tengo gastos registrados, **cuando** abro el gráfico circular, **entonces** cada categoría aparece como un sector con su porcentaje sobre el total.

---

### HU 2.4 – Ver gastos en un calendario

> **Como** usuario,<br>
> **quiero** ver mis gastos colocados en un calendario,<br>
> **para** identificar los días en los que más gasto.

**Criterios de aceptación**

1. **Dado** que tengo gastos registrados, **cuando** abro la vista de calendario (CalendarFX), **entonces** cada gasto aparece en su día con su categoría y cantidad.

---

## Filtrado

### HU 3.1 – Filtrar por meses

> **Como** usuario,<br>
> **quiero** filtrar mis gastos eligiendo uno o varios meses,<br>
> **para** analizar periodos concretos como el verano o las Navidades.

**Criterios de aceptación**

1. **Dado** que selecciono julio y agosto, **cuando** aplico el filtro, **entonces** solo se muestran los gastos con fecha en esos dos meses.

---

### HU 3.2 – Filtrar por intervalo de fechas

> **Como** usuario,<br>
> **quiero** filtrar mis gastos entre una fecha de inicio y una de fin,<br>
> **para** revisar periodos que no coinciden con meses completos.

**Criterios de aceptación**

1. **Dado** que indico del 10/03 al 25/03, **cuando** aplico el filtro, **entonces** solo se muestran los gastos de ese intervalo, ambos días incluidos.
2. **Dado** que la fecha de inicio es posterior a la de fin, **cuando** aplico el filtro, **entonces** el sistema muestra un error.

---

### HU 3.3 – Filtrar por categorías

> **Como** usuario,<br>
> **quiero** filtrar mis gastos eligiendo una o varias categorías,<br>
> **para** ver cuánto gasto en ellas.

**Criterios de aceptación**

1. **Dado** que selecciono Transporte y Alimentación, **cuando** aplico el filtro, **entonces** solo se muestran los gastos de esas categorías.

---

### HU 3.4 – Combinar filtros

> **Como** usuario,<br>
> **quiero** aplicar a la vez filtros de meses, fechas y categorías,<br>
> **para** responder preguntas concretas como "cuánto gasté en transporte en julio y agosto".

**Criterios de aceptación**

1. **Dado** que selecciono la categoría Transporte y los meses julio y agosto, **cuando** aplico los filtros, **entonces** solo se muestran los gastos que cumplen todas las condiciones.
2. **Dado** que hay filtros aplicados, **cuando** pulso "Quitar filtros", **entonces** vuelven a mostrarse todos los gastos.

---

## Alertas y notificaciones

### HU 4.1 – Crear una alerta semanal o mensual

> **Como** usuario,<br>
> **quiero** definir un límite de gasto semanal o mensual,<br>
> **para** no gastar más de lo que me he propuesto en cada periodo.

**Criterios de aceptación**

1. **Dado** que estoy en la ventana de alertas, **cuando** introduzco un importe mayor que 0, elijo "semanal" o "mensual" y guardo, **entonces** la alerta aparece en la lista de alertas activas.
2. **Dado** un importe vacío, 0 o negativo, o sin periodo elegido, **cuando** guardo, **entonces** el sistema muestra un error y no crea la alerta.
3. **Dado** una alerta existente, **cuando** la borro, **entonces** deja de generar notificaciones.

---

### HU 4.2 – Vincular una alerta a una categoría

> **Como** usuario,<br>
> **quiero** asociar opcionalmente una alerta a una categoría,<br>
> **para** controlar categorías concretas, como "no más de 100 € al mes en videojuegos".

**Criterios de aceptación**

1. **Dado** una alerta mensual de 100 € vinculada a Videojuegos, **cuando** registro gastos, **entonces** solo cuentan para esa alerta los gastos de la categoría Videojuegos.
2. **Dado** una alerta sin categoría, **cuando** registro gastos, **entonces** cuentan los gastos de todas las categorías.

---

### HU 4.3 – Recibir una notificación al superar el límite

> **Como** usuario,<br>
> **quiero** recibir una notificación en cuanto supero el límite de una alerta,<br>
> **para** darme cuenta a tiempo y ajustar mis gastos.

**Criterios de aceptación**

1. **Dado** una alerta semanal de 500 € y 480 € gastados esta semana, **cuando** registro un gasto de 30 €, **entonces** el sistema genera una notificación que indica la alerta, el límite y el total gastado (510 €).
2. **Dado** que ya se ha generado la notificación de esa alerta en el periodo actual, **cuando** registro más gastos en el mismo periodo, **entonces** no se genera otra notificación repetida.
3. **Dado** que hay notificaciones nuevas, **cuando** abro una, **entonces** queda marcada como leída.

---

### HU 4.4 – Consultar el historial de notificaciones

> **Como** usuario,<br>
> **quiero** consultar en cualquier momento las notificaciones pasadas,<br>
> **para** ver en qué periodos y categorías me he pasado de presupuesto.

**Criterios de aceptación**

1. **Dado** que se han generado notificaciones, **cuando** abro el historial, **entonces** veo todas, leídas y no leídas, ordenadas de más reciente a más antigua y con su fecha.
2. **Dado** que cierro y vuelvo a abrir la aplicación, **cuando** abro el historial, **entonces** las notificaciones anteriores siguen ahí.

---

## Cuentas compartidas

### HU 5.1 – Crear una cuenta compartida

> **Como** usuario,<br>
> **quiero** crear una cuenta de gasto con los nombres de las personas que la comparten,<br>
> **para** llevar juntos los gastos de un viaje, un piso o una actividad común.

**Criterios de aceptación**

1. **Dado** que indico un nombre de cuenta y al menos dos personas, **cuando** guardo, **entonces** la cuenta se crea con el saldo de todas las personas a 0 €.
2. **Dado** una cuenta ya creada, **cuando** intento añadir o quitar personas, **entonces** el sistema no lo permite.
3. **Dado** que repito un nombre de persona o dejo uno vacío, **cuando** guardo, **entonces** el sistema muestra un error.

---

### HU 5.2 – Registrar un gasto en una cuenta compartida

> **Como** usuario,<br>
> **quiero** registrar un gasto de la cuenta indicando qué persona lo ha pagado,<br>
> **para** que el importe se reparta entre todos.

**Criterios de aceptación**

1. **Dado** una cuenta equitativa con Raquel, Luis y María con saldos a 0, **cuando** registro un gasto de 30 € pagado por Raquel, **entonces** los saldos pasan a Raquel +20 €, Luis −10 € y María −10 €.
2. **Dado** ese estado, **cuando** registro un gasto de 9 € pagado por Luis, **entonces** los saldos pasan a Raquel +17 €, Luis −4 € y María −13 €.
3. **Dado** cualquier cuenta, **cuando** registro un gasto, **entonces** la suma de todos los saldos sigue siendo 0 €.

> **Nota:** el enunciado da a Luis un saldo de −7 € tras su gasto de 9 €, pero con ese valor los saldos sumarían −3 €. Lo correcto es −10 + 9 − 3 = −4 €, que es el valor que se usa en el criterio 2.

---

### HU 5.3 – Consultar los saldos de la cuenta

> **Como** usuario,<br>
> **quiero** ver el saldo pendiente de cada persona de la cuenta,<br>
> **para** saber quién debe dinero y a quién le deben.

**Criterios de aceptación**

1. **Dado** una cuenta con gastos, **cuando** la abro, **entonces** veo cada persona con su saldo: positivo si le deben y negativo si debe.
2. **Dado** una cuenta, **cuando** la abro, **entonces** veo también la lista de sus gastos con el importe y la persona que pagó cada uno.

---

### HU 5.4 – Repartir por porcentajes

> **Como** usuario,<br>
> **quiero** crear una cuenta compartida indicando el porcentaje que asume cada persona,<br>
> **para** repartir gastos cuando no todos pagan lo mismo.

**Criterios de aceptación**

1. **Dado** que creo una cuenta sin indicar porcentajes, **cuando** guardo, **entonces** el reparto es a partes iguales.
2. **Dado** porcentajes que no suman 100 %, **cuando** guardo, **entonces** el sistema muestra un error y no crea la cuenta.
3. **Dado** una cuenta con Raquel 40 %, Luis 30 % y María 30 % y saldos a 0, **cuando** registro un gasto de 30 € pagado por Raquel, **entonces** los saldos pasan a Raquel +18 €, Luis −9 € y María −9 €.

---

## Importación

### HU 6.1 – Importar gastos desde un fichero bancario

> **Como** usuario,<br>
> **quiero** importar un fichero de texto con los gastos exportados de mi banco,<br>
> **para** no tener que registrarlos uno a uno.

**Criterios de aceptación**

1. **Dado** el fichero de ejemplo de AulaVirtual, **cuando** lo selecciono y pulso "Importar", **entonces** todos sus gastos aparecen en la lista con su cantidad, fecha y categoría.
2. **Dado** un fichero con líneas mal formadas, **cuando** lo importo, **entonces** se importan las líneas válidas y el sistema indica cuántas líneas se han descartado.
3. **Dado** que la importación termina, **cuando** consulto alertas y gráficos, **entonces** los gastos importados cuentan igual que los registrados a mano.

---

### HU 6.2 – Importar ficheros de distintos formatos

> **Como** usuario,<br>
> **quiero** importar ficheros de distintos bancos o formatos,<br>
> **para** usar la aplicación aunque cambie de banco o tenga varios.

**Criterios de aceptación**

1. **Dado** que voy a importar, **cuando** elijo el formato del fichero (o el sistema lo reconoce), **entonces** el fichero se interpreta con el lector de ese formato.
2. **Dado** un formato que el sistema no soporta, **cuando** intento importarlo, **entonces** el sistema muestra un error y no importa nada.

> **Nota de diseño:** esta historia justifica los patrones Adaptador y Método Factoría que exige el enunciado. Añadir un formato nuevo no debería obligar a modificar el resto del importador.

---

## Requisitos técnicos y no funcionales

Estos requisitos no describen algo que el usuario hace, sino cómo debe construirse el sistema.

| ID | Tipo | Requisito |
|----|------|-----------|
| RT-01 | Técnico | La interfaz gráfica se implementa con JavaFX. |
| RT-02 | Técnico | Toda la información (gastos, categorías, alertas, notificaciones, cuentas compartidas) se persiste con JDBC. |
| RT-03 | Técnico | El acceso a datos se desacopla del resto de la aplicación con el patrón Repositorio. |
| RT-04 | Técnico | Las dependencias se gestionan con Maven y el código con Git en un repositorio de GitHub compartido con el profesor. |
| RT-05 | Técnico | Se aplican los patrones Estrategia (alertas), Adaptador y Método Factoría (importador) y Singleton donde haga falta una única instancia global. |
| RT-06 | Técnico | La interfaz gráfica y la línea de comandos comparten la misma lógica de negocio y los mismos datos. |
| NFR-01 | Fiabilidad | Los datos se conservan entre ejecuciones; un cierre normal de la aplicación no pierde ningún gasto. |
| NFR-02 | Usabilidad | Todos los campos de entrada se validan y cada error muestra un mensaje que explica cómo corregirlo. |
| NFR-03 | Usabilidad | Las acciones destructivas (borrar un gasto, una categoría o una alerta) piden confirmación. |
| NFR-05 | Mantenibilidad | Se puede añadir un formato de importación o un tipo de alerta nuevos sin modificar las clases existentes. |
| NFR-06 | Portabilidad | La aplicación funciona en Windows, macOS y Linux. |