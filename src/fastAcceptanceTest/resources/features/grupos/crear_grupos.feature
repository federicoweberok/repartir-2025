# language: es

Característica: Crear Grupo para repartir gastos

  Regla: Los grupos están compuestos por al menos dos miembros

    Escenario: No puedo crear un grupo con un único miembro
      Cuando el usuario intenta crear un grupo indicando un único miembro
      Entonces no debería crear el grupo con un único miembro

  Regla: Los grupos pueden incluir miembros con nombres iguales

    Escenario: Crear un grupo con dos personas que tienen el mismo nombre
      Dado que el usuario quiere crear un grupo
      Cuando ingresa dos miembros con el nombre "Juan"
      Entonces el grupo deberia crearse con ambos miembros

    Escenario: Crear un grupo con múltiples miembros, incluyendo nombres iguales
      Dado que el usuario quiere crear un grupo
      Cuando ingresa los miembros "Juan", "Ana", "Juan" y "Pedro"
      Entonces el grupo deberia crearse incluyendo a todos los miembros