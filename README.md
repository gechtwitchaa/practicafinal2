# practicafinal2
https://github.com/gechtwitchaa/practicafinal2.git


 Explicación de los Paquetes del Proyecto

 1. Paquete de Interfaz de Usuario (ui)

Propósito:
- Manejar la interacción del usuario con la aplicación.
- Crear y gestionar la interfaz gráfica usando Swing.

Clases Principales:
- `ExperimentUI`: Clase principal que configura y muestra la ventana principal de la aplicación. Contiene componentes de la interfaz como botones, menús, y paneles para la visualización y control de los experimentos y simulaciones.

Funcionalidades:
- Crear un nuevo experimento.
- Abrir un archivo de experimento existente.
- Guardar y guardar como un experimento.
- Visualizar y gestionar poblaciones de bacterias.
- Mostrar resultados de la simulación en una matriz de colores.

 2. Paquete de Lógica de Negocio (logic)

Propósito:
- Implementar la lógica central y las reglas del negocio relacionadas con los experimentos y bacterias.
- Realizar las simulaciones del comportamiento de las bacterias.

Clases Principales:
- `Experiment`: Clase que gestiona el estado del experimento, incluyendo las poblaciones de bacterias y las simulaciones diarias.
- `Bacteria`: Clase que representa una población de bacterias y define su comportamiento, incluyendo el consumo de comida, movimiento, reproducción, y muerte.

Funcionalidades:
- Añadir y eliminar poblaciones de bacterias.
- Ejecutar la simulación de Montecarlo para modelar el comportamiento de las bacterias.
- Mantener el estado diario del experimento, como el número de bacterias y la comida restante en cada celda.

3. Paquete de Gestión de Datos (data)

Propósito:
- Cargar y guardar datos de los experimentos en el disco duro.
- Manejar la persistencia de la información relacionada con los experimentos.

Clases Principales:
- `DataManager`: Clase responsable de leer y escribir archivos de texto que contienen los datos del experimento.

Funcionalidades:
- Abrir un archivo de experimento y cargar sus datos en la aplicación.
- Guardar el estado actual del experimento en un archivo.
- Asegurar que los datos se guardan y cargan correctamente, preservando la estructura y detalles del experimento.

Cada paquete está diseñado para separar las responsabilidades, facilitando la organización y el mantenimiento del código, así como la implementación de nuevas funcionalidades.
