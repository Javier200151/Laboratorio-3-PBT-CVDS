#LAB03 PBT-CVDS
En este repositorio se realizó el laboratorio que incluye los ejercicios 
- **Registraduría**: En este se incluye el servicio de la registradiría que permitirá registrar personas que sean votantes. \
de este ejercicio se incluyen pruebas JUnit
- **Descuento de tarifas**: En este se incluyó una libreria llamada *aerodescuentos.jar* al repositorio local de maven \
de este ejercicio se incluyen pruebas JUnit

##Clases de equivalencia

1. Dead:Se debe validar que este parametro sea false,
,si el valor de este parametro es true la persona no podra hacer la inscripción porque su estado es fallecido

2. UnderAge:Se debe validar si la persona es un menor de edad,\ si este es menor de edad no podra ser registrado

3. INVALID_AGE: se debe validar que la edad de la persona no pueda ser negativa e igual a 0 y
el valor maximo de la edad pueda ser menor o igual a 122

4. Valid:Valid es el ultimo de los casos despues de validar los anteriores se añade la persona al arreglo de personas existosamente

5. Duplicated:Se debe validar que en un arreglo de personas si la persona a añadir
ya existe no pueda ser añadida

