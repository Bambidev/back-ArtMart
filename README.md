# Configuración para Utilizar la Base de Datos

Este proyecto utiliza un archivo de propiedades para configurar la conexión a la base de datos. Si deseas modificar las credenciales de usuario y contraseña para la base de datos, sigue estos pasos:

## Paso 1: Descarga e Instala MySQL

Descarga e instala MySQL desde el sitio web oficial de MySQL: [MySQL Downloads](https://dev.mysql.com/downloads/)

Sigue las instrucciones de instalación adecuadas para tu sistema operativo.

## Paso 2: Descarga e Instala MySQL Workbench

Descarga e instala MySQL Workbench desde el sitio web oficial de MySQL: [MySQL Workbench Downloads](https://dev.mysql.com/downloads/workbench/)

Sigue las instrucciones de instalación adecuadas para tu sistema operativo.

## Paso 3: Crea una Base de Datos

Abre MySQL Workbench y conéctate a tu servidor MySQL local.

Haz clic en el botón "Create a new schema" (Crear un nuevo esquema) y proporciona un nombre para tu base de datos. Por ejemplo, puedes llamarla c17-53-n-java`.

## Paso 4: Accede al Archivo de Propiedades

El archivo de propiedades se encuentra en la siguiente ruta dentro del proyecto:
```
src/main/resources/application.properties
```

## Paso 5: Modifica las Credenciales

Abre el archivo `application.properties` y busca las siguientes líneas:

```
properties
spring.datasource.username=root
spring.datasource.password=2004
```

Modifica el valor de spring.datasource.username y spring.datasource.password con las credenciales de usuario y contraseña de tu base de datos MySQL.


Por ejemplo:

```
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña

```

## Paso 6: Guarda los Cambios
Guarda los cambios realizados en el archivo application.properties.

##  Paso 7: Ejecuta la Aplicación
Ahora puedes ejecutar tu aplicación con las nuevas credenciales de la base de datos.

¡Y eso es todo! Ahora tu aplicación utilizará las credenciales de usuario y contraseña que has especificado en el archivo de propiedades y estará conectada a tu base de datos MySQL local llamada c17-53-n-java.


![Texto alternativo](https://media2.giphy.com/media/v1.Y2lkPTc5MGI3NjExcjBxYzY1eDNmZ2huejZhenhqdWxjNXpwcWFiYTJ6bzQweWV2b3FlaiZlcD12MV9pbnRlcm5hbF9naWZfYnlfaWQmY3Q9Zw/Q2aN4iiaibCus/giphy.gif)


