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


