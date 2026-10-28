# Gestión de Gastos

## Descripción del proyecto

**Gestión de Gastos** es una aplicación desarrollada en Java que tiene como objetivo facilitar la gestión y el control de los gastos. El proyecto está organizado como un proyecto Maven y permite trabajar de forma colaborativa en el desarrollo y mantenimiento de la herramienta.

## Miembros del grupo de trabajo

| Nombre | Mail | Subgrupo de Prácticas |
|:---|:---|:---|
| Daniel Soto Pellicer | d.sotopellicer@um.es | 2.3 |
| Pablo García Zapata | p.garciazapata@um.es | 2.2 |
| Daniel Pascual Guardiola | d.pascualguardiola@um.es | 2.3 |

## Requisitos

- **JDK 21**
- **Eclipse** con soporte para Maven (m2e, incluido en las versiones habituales).
- **Git**

Si tienes otra versión del JDK, instala el JDK 21 y regístralo en:

`Window → Preferences → Java → Installed JREs`

## Cómo abrir el proyecto en Eclipse

El repositorio no incluye los archivos de configuración de Eclipse (`.project`, `.classpath`, `.settings/`), ya que dependen de la configuración de cada máquina. Eclipse puede generarlos automáticamente a partir del archivo `pom.xml`.

Hay dos opciones para importar el proyecto.

### Opción A: todo desde Eclipse

1. Ve a **File → Import → Git → Projects from Git (with smart import)**.
2. Selecciona **Clone URI** y pega la URL del repositorio.
3. Sigue los pasos del asistente hasta finalizar. Eclipse detectará el archivo `pom.xml` e importará el proyecto como un proyecto Maven.

> **Importante:** utiliza la opción **Projects from Git (with smart import)**. La opción «Projects from Git» sin *smart import* puede no funcionar porque busca un archivo `.project` que no está incluido en el repositorio.

### Opción B: clonar e importar manualmente

1. Clona el repositorio fuera de la carpeta del workspace de Eclipse:

   ```bash
   git clone https://github.com/danisoto11/Gestion-Gastos.git
   ```

2. En Eclipse, ve a **File → Import → Maven → Existing Maven Projects**.
3. Pulsa **Browse**, selecciona la carpeta clonada y pulsa **Finish**.

## Estructura del proyecto

```text
docs/                 Documentación
src/main/java/        Código fuente
src/main/resources/   Recursos de la aplicación
src/test/java/        Tests
src/test/resources/   Recursos para los tests
pom.xml               Configuración de Maven
```

## Problemas habituales

- **Errores de JRE o *compiler compliance*:** comprueba que tienes el JDK 21 registrado en Eclipse y haz clic derecho sobre el proyecto → **Maven → Update Project...** (`Alt + F5`).
- **Problemas de codificación (*encoding*):** haz clic derecho sobre el proyecto → **Properties → Resource → Text file encoding** y selecciona **UTF-8**.
