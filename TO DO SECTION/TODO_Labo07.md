## TODO LABO 07  

### 1. ¿Qué ventajas tiene el utilizar LiveData? 

LiveData nos proporciona un contenedor de datos observable que puede contener cualquier tipo de dato. Los observadores (como una actividad, fragmento o ViewModel) pueden suscribirse a LiveData y recibir notificaciones cuando se produce un cambio en los datos contenidos dentro de ella. Esto permite que la interfaz de usuario refleje automáticamente los cambios en los datos, sin tener que realizar actualizaciones manuales.

### 2. ¿Qué patrón de diseño utiliza LiveData?  

LiveData sigue el patrón de diseño observer.

### 3. Menciona que se debe agregar al Gradle para poder implementar DataBinding  

~~~
dataBinding{
        enabled true
    }
~~~

### 4. ¿Qué es DataBinding? Menciona sus ventajas frente a findViewById  

DataBinding es una función de Android que permite vincular los elementos de la interfaz de usuario (UI) de una aplicación directamente a los datos de la aplicación, lo que significa que no es necesario realizar actualizaciones manuales para que la interfaz refleje los cambios en los datos. 

-  En lugar de tener que actualizar manualmente los elementos de la UI en el código, DataBinding permite que la UI se actualice automáticamente a medida que los datos cambian en la aplicación. Esto significa que es posible  centrarse en la lógica de la aplicación en lugar de preocuparse por la sincronización de los datos y la UI. 
-  Además, DataBinding proporciona una mayor eficiencia y rendimiento, ya que reduce la necesidad de hacer referencia a los elementos de la interfaz de usuario en el código y también disminuye la cantidad de código repetitivo necesario para mantener la sincronización de los datos y la UI.



