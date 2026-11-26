# Modelado

En este apartado se describen y explican las decisiones y actividades llevadas a cabo durante la etapa de modelado del proyecto.

Para representar el modelo de clases del dominio, hemos elegido **Mermaid**, una herramienta que permite crear diagramas mediante una sintaxis basada en texto. En concreto, utilizaremos su funcionalidad de diagramas de clases, que permite representar los elementos del dominio, sus atributos, operaciones y las relaciones existentes entre ellos.

Una de las principales ventajas de Mermaid es su sencillez y flexibilidad, ya que permite definir los diagramas directamente en archivos Markdown, sin necesidad de generar ni almacenar imágenes externas. Además, es compatible con **GitHub**, que puede representar automáticamente los diagramas **Mermaid** incluidos en los archivos Markdown, facilitando así su visualización.

El diagrama inicial del que partimos se muestra a continuación. En esta primera versión se presenta una estructura básica que contiene pocos elementos, esto es algo esperado en las primeras fases del desarrollo. A medida que avancemos en el proyecto,  iremos incorporando y refinando las clases, atributos y relaciones necesarias.

A continuación, se muestra el diagrama inicial de clases del dominio, que tomaremos como punto de partida para las siguientes versiones del modelado.

```mermaid
classDiagram
    direction TB

    class Gasto {
        <<abstract>>
        +BigDecimal cantidad
        +LocalDate fecha
        +String descripcion
    }
    class GastoIndividual
    class GastoCompartido

    class Categoria {
        +String nombre
    }

    class Alerta {
        +BigDecimal limite
    }

    class EstrategiaPeriodo {
        <<interface>>
    }
    class PeriodoSemanal
    class PeriodoMensual

    class Notificacion {
        +LocalDate fecha
        +String mensaje
        +boolean leida
    }

    class CuentaCompartida {
        +String nombre
    }

    class Persona {
        +String nombre
        +BigDecimal porcentaje
    }

    Gasto <|-- GastoIndividual
    Gasto <|-- GastoCompartido
    EstrategiaPeriodo <|.. PeriodoSemanal
    EstrategiaPeriodo <|.. PeriodoMensual

    Categoria "1" <-- "0..*" Gasto : categoria
    Categoria "0..1" <-- "0..*" Alerta : categoria
    Alerta "0..*" --> "1" EstrategiaPeriodo : periodo
    Notificacion "0..*" --> "0..1" Alerta : origen

    CuentaCompartida "1" *-- "2..*" Persona : participantes
    CuentaCompartida "1" *-- "0..*" GastoCompartido : gastos
    GastoCompartido "0..*" --> "1" Persona : pagador
```