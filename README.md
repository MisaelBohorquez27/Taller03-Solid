# Taller03-Solid
 
<ol>

<li>No cumple el primer principio y es por eso que se crea la clase padre
<li> La clase OperacionesAderezo no cumple con el princpio de Inversión de dependencias ya que era mejor emplear los metodos a sus respectivas clases a que solo crear una clase para aquellos métodos
<li> No cumplía con el principio Single responsibility porque habían métodos en la clase Postre que practicamente hacian cosas distintas por lo que se creó otra clase llamada ManejoDePrecio y se puso los métodos ManejadorDePrecio y showPrecioFinal.
<li> La clase de Aderezos no cumplia con el principio SOLID Open-Closed, ya que en caso de que se quisiera anadir un nuevo tipo de aderezo, habria que modificar la clase. Esto se resolvio transformandola a una clase abstracta con su metodo abstracto, setNombre(), que seria implementado por cada nuevo aderezo que se quiera anadir como clase nueva.
<li> No cumple con el primer principio de SOLID que es principio de responsabilidad única

</ol>
