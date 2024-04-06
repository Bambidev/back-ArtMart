# Configuración para Utilizar la Base de Datos

Este proyecto utiliza un archivo de propiedades para configurar la conexión a la base de datos. Si deseas modificar las credenciales de usuario y contraseña para la base de datos, sigue estos pasos:

## Paso 1: Accede al Archivo de Propiedades

El archivo de propiedades se encuentra en la siguiente ruta dentro del proyecto:

```
src/main/resources/application.properties
```

## Paso 2: Modifica las Credenciales

Abre el archivo `application.properties` y busca las siguientes líneas:

```
properties
spring.datasource.username=root
spring.datasource.password=2004
```

Modifica el valor de spring.datasource.username y spring.datasource.password con las credenciales de usuario y contraseña de tu base de datos.

Por ejemplo:
```
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
```


## Paso 3: Guarda los Cambios
Guarda los cambios realizados en el archivo application.properties.

## Paso 4: Ejecuta la Aplicación
Ahora puedes ejecutar tu aplicación con las nuevas credenciales de base de datos.
Dale al boton play de tu ide

🚀 ¡Y eso es todo! Ahora tu aplicación utilizará las credenciales de usuario y contraseña que has especificado en el archivo de propiedades. 🚀
