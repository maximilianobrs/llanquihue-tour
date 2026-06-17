# ☕ Evaluacion Semana 5 - Desarrollo Orientado a Objetos I

---------------------------------------------
## 👋 Autor del proyecto

- Nombre: Maximiliano Briones
- Seccion: Desarrollo Orientado a Objetos I
- Carrera: Analista programador computacional
- Sede: Campus Virtual DuocUC

------------------------------------------

## 📚 Descripción general del sistema

Sistema desarrollado para la agencia “Llanquihue Tour”, el cual permite gestionar información de tours turísticos mediante lectura de archivos externos (.txt).

Los datos son procesados y almacenados en estructuras dinámicas (ArrayList), aplicando principios de Programación Orientada a Objetos como encapsulación, composición y separación por capas.

El sistema está organizado en capas:
- model: clases de dominio (Tour, Guia)
- data: lectura de archivos
- service: lógica de negocio
- util: validaciones
- ui: interacción con el usuario
- app: punto de entrada del sistema


-------------------------------------------
## 📁 Estructura del proyecto

```bash
llanquihue-tour/
├── src/
│   ├── app/
│   │   └── Main.java
│   ├── ui/
│   │   └── TourUI.java
│   ├── service/
│   │   └── AgenciaService.java
│   ├── data/
│   │   └── GestorDatos.java
│   ├── model/
│   │   ├── Tour.java
│   │   └── Guia.java
│   └── util/
│       └── ValidadorUtil.java
├── resources/
│   └── tours.txt
└── README.md
```
--------------------------
## 🚀 Cómo ejecutar
1. Clonar o descargar el repositorio.
2. Abrir el proyecto en Intellij IDEA o cualquier IDE compatible con Java.
4. Ejecutar la clase `Main`.
5. Observar los resultados en la consola.
