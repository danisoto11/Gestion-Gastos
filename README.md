# Gestion-Gastos

Proyecto Maven de gestión de gastos.

## Requisitos

- JDK 21
- Eclipse con soporte Maven (m2e, incluido en las versiones habituales)
- Git

Si tienes otro JDK, instala el 21 y regístralo en
**Window → Preferences → Java → Installed JREs**.

## Cómo abrir el proyecto en Eclipse

El repositorio no incluye los archivos de Eclipse (`.project`, `.classpath`,
`.settings/`), ya que dependen de la configuración de cada máquina. Eclipse los
genera automáticamente a partir del `pom.xml`. Hay dos opciones:

### Opción A: todo desde Eclipse

1. **File → Import → Git → Projects from Git (with smart import)**
2. Selecciona **Clone URI** y pega la URL del repositorio.
3. Sigue el asistente hasta el final. Eclipse detectará el `pom.xml` e
   importará el proyecto como proyecto Maven.

> Usa la variante **with smart import**. La opción "Projects from Git" a secas
> no funcionará, porque busca un `.project` que no está en el repositorio.

### Opción B: clonar a mano e importar

1. Clona el repositorio fuera de la carpeta del workspace de Eclipse:

```
   https://github.com/danisoto11/Gestion-Gastos.git
```

2. En Eclipse: **File → Import → Maven → Existing Maven Projects**
3. Pulsa **Browse**, selecciona la carpeta clonada y pulsa **Finish**.

## Estructura del proyecto

```
docs/                Documentación
src/main/java        Código fuente
src/main/resources   Recursos
src/test/java        Tests
src/test/resources   Recursos para los tests
pom.xml              Configuración de Maven
```

## Problemas habituales

- **Errores de JRE / compiler compliance:** comprueba que tienes el JDK 21
  registrado en Eclipse y haz clic derecho en el proyecto →
  **Maven → Update Project...** (`Alt+F5`).
- **Falta codificación (encoding):** clic derecho en el proyecto →
  Properties → Resource → Text file encoding → UTF-8.