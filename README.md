# PR_LAB4_PROGRAMACION2_REMOVELISTS
**Autor:** Luis Bravo  
**Curso:** 2017–2018  
**Asignatura:** Programación II — Laboratorio 4

## Descripción
Implementación del método genérico **`removeAllSubList`** en la clase `RemoveLists<E>` para eliminar **todas las ocurrencias consecutivas** de una sublista `subList` dentro de una lista `list`, usando las estructuras `PositionList` de la librería docente.

El proyecto incluye el tester oficial y la **guía** en `docs/guia.pdf`.

## Estructura
```
src/
 ├─ main/java/aed/removelists/
 │   └─ RemoveLists.java
 └─ test/java/aed/removelists/
     └─ Tester.java
docs/
 └─ guia.pdf
libs/
 └─ aedlibraries.jar   # ⚠️ Añadir manualmente (se referencia vía systemPath)
```

## Uso
```bash
# 1) Copia aedlibraries.jar a la carpeta libs/
# 2) Compila y ejecuta los tests
mvn -q -DskipTests=false test
```

## Notas de implementación (según la guía)
- Recorrer `list` **de izquierda a derecha** buscando coincidencias de `subList`.
- Si se encuentra una aparición, **eliminar en bloque** y continuar desde la posición siguiente a la eliminación.
- No modificar `subList`. Manejar correctamente listas vacías o `null`.

— *Luis Bravo*