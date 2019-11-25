
---


---

<h1 id="neplix">Neplix</h1>
<blockquote>
<p>Carlos Mario Gomez Gelvez<br>
1151523<br>
Programacion Orientada a objetos</p>
</blockquote>
<h1 id="documento-de-requerimientos-de-software">Documento de requerimientos de software</h1>
<blockquote>
<p>Netflix<br>
Fecha :  26/08/2019</p>
</blockquote>
<h2 id="section"></h2>
<h1 id="tabla-de-contenido">Tabla de contenido</h1>
<ul>
<li>Historial de version</li>
<li>Informacion de proyecto</li>
<li>Aprobaciones</li>
</ul>
<ol>
<li>Proposito.</li>
<li>Alcance del producto/software.</li>
<li>Referencia.</li>
<li>Funcionalidades del producto</li>
<li>Clases y caracteristicas de usuario</li>
<li>Entorno Operativo</li>
<li>Requerimientos funcionales</li>
<li>Regla de negocio</li>
<li>Requerimientos de interfaces externas</li>
<li>Requerimientos no funcionales</li>
<li>Otros requerimientos</li>
<li>Glosario</li>
</ol>
<h1 id="historial-de-version">Historial de version</h1>

<table>
<thead>
<tr>
<th>Fecha</th>
<th>Version</th>
<th>Autor</th>
<th>Organizacion</th>
<th>Descripcion</th>
</tr>
</thead>
<tbody>
<tr>
<td>23/08/19</td>
<td>1.0</td>
<td>Carlos Gomez</td>
<td>UFPS</td>
<td>Aplicacion de series</td>
</tr>
</tbody>
</table><h1 id="informacion-de-proyecto">Informacion de proyecto</h1>

<table>
<thead>
<tr>
<th>Empresa/Organizacion</th>
<th>UFPS</th>
</tr>
</thead>
<tbody></tbody>
</table>
<table>
<thead>
<tr>
<th>Proyecto</th>
<th>Neplix</th>
</tr>
</thead>
<tbody></tbody>
</table>
<table>
<thead>
<tr>
<th>Fecha de preparacion</th>
<th>23/08/19</th>
</tr>
</thead>
<tbody></tbody>
</table>
<table>
<thead>
<tr>
<th>Cliente</th>
<th>None</th>
</tr>
</thead>
<tbody></tbody>
</table>
<table>
<thead>
<tr>
<th>Patrocinador principal</th>
<th>None</th>
</tr>
</thead>
<tbody></tbody>
</table>
<table>
<thead>
<tr>
<th>Gerente/Lider de proyecto</th>
<th>Profesora</th>
</tr>
</thead>
<tbody></tbody>
</table>
<table>
<thead>
<tr>
<th>Gerente/lider de analisis <br>de negocios y requerimientos</th>
<th>Carlos Gomez</th>
</tr>
</thead>
<tbody></tbody>
</table><h1 id="aprobaciones">Aprobaciones</h1>

<table>
<thead>
<tr>
<th>Nombre y apellido</th>
<th>Cargo</th>
<th>Departamento y organizacion</th>
<th>Fecha</th>
<th>Firma</th>
</tr>
</thead>
<tbody>
<tr>
<td>Claudia G.</td>
<td>Docente</td>
<td>UFPS</td>
<td>27-08-19</td>
<td>–</td>
</tr>
</tbody>
</table><h1 id="proposito">Proposito</h1>
<p>Neplix 1.0 Beta, es una aplicacion para ver series el cual es amigable con el usuario pues le permite puntear, dar un comentario, agregar a favoritos y var todo el historial de series que a visto</p>
<h1 id="alcance-del-productosoftware">Alcance del producto/software</h1>
<p>el proyecto sera capaz de almacenar, organizar y mostrar todas las series posibles</p>
<ul>
<li><strong>Modulo de usuario</strong> : El usuario tendra su propio espacio de control y opciones</li>
<li><strong>Modulo de series</strong> : aqui se podran ver el listado de series</li>
<li><strong>Modulo de reproduccion</strong> : El usuario podra ver la serie que escogio</li>
<li><strong>Modulo de categoria</strong> : El usuario podra ordenar por categorias</li>
<li><strong>Modulo de puntuacion</strong> : El usuario podra puntear las series vistas</li>
<li><strong>Modulo de comentarios</strong> : El usuario podra dejar un comentario para otros usuarios</li>
<li><strong>Modulo de historia</strong> : El historial permitira ver cuantas series a visto el usuario y cuales esta viendo</li>
<li><strong>Modulo de subtitulo</strong> : El usuario puede elegir el idioma de la serie y su subtitulacion</li>
<li><strong>Modulo de inicio de sesion</strong> : Todo usuario debe tener una cuenta</li>
<li><strong>Modulo de registro</strong> : El usuario debe registrarse para acceder a la aplicacion</li>
<li><strong>Modulo de administrador</strong> : El administrador va poder verificar los movimientos realizados por el usuario</li>
<li><strong>Modulo de recuperacion de usuario</strong> : El usuario puede recuperar su acceso</li>
</ul>
<h1 id="funcionalidades-del-producto">Funcionalidades del producto</h1>
<p><strong>F1</strong> : Gestionar el registro de usuario<br>
<strong>F2</strong> : Gestionar un perfil para cada usuario<br>
<strong>F3</strong> : Categorizar todos las series disponibles<br>
<strong>F4</strong> : Organizar las series dependiendo el usuario<br>
<strong>F5</strong> : Administracion de los comentarios y puntuacion de las series<br>
<strong>F6</strong> : Administrar cada movimiento en los usuarios<br>
<strong>F7</strong> : Guardar un historial por usuario de las series<br>
<strong>F8</strong> : Recuperar contraseña del acceso a la aplicacion</p>
<p><strong>Administrador :</strong> Realizar tareas tales como</p>
<ul>
<li>Verificar las series disponibles en la aplicacion</li>
<li>ver los movimientos realizados por los usuarios</li>
<li>Registrar y quitar series en la aplicacion</li>
<li></li>
</ul>
<p><strong>Usuario :</strong> Realizara tareas tales como</p>
<ul>
<li>Puntear las series vistas y por ver</li>
<li>Hacer comentario de cada serie</li>
<li>Agregar series como favoritas o cancelarlas</li>
<li>Categorizar las series por genero</li>
<li>Elegir el idioma de la serie</li>
<li>Cambiar la contraseña de acceso</li>
</ul>
<h1 id="entorno-operativo">Entorno Operativo</h1>
<p><strong>IDE</strong> : Netbeans - Intellij<br>
<strong>Lenguaje</strong> : Java<br>
<strong>S.O</strong> : Linux<br>
<strong>BD</strong> : Mysql</p>
<h1 id="requerimientos-funcionales">Requerimientos Funcionales</h1>
<p><strong>REQ1</strong> : El sistema debe permitir registrar a cada usuario con su respectiva informacion<br>
<strong>REQ2</strong> : El sistema debe permitir ver al usuario todas las series disponibles en la aplicacion<br>
<strong>REQ3</strong> : El sistema debe permitir ingresar al usuario una vez este registrado con su nombre de usuario o correo y contraseña<br>
<strong>REQ4</strong> : El sistema debe permitir que en el inicio de sesion identificar que tipo de usuario es, administrador o usuario<br>
<strong>REQ5</strong> : El sistema debe permitir que el usuario puede buscar la serie por categorias<br>
<strong>REQ6</strong> : El sistema debe permitir que el administrador ingrese ingrese las series por categoria<br>
<strong>REQ7</strong> : El sistema debe permitir que cada pelicula tenga categoria<br>
<strong>REQ8</strong> : El sistema debe permitir llevar un registro de todas las peliculas vistas por el usuario<br>
<strong>REQ9</strong> : El sistema debe permitir que el usuario pueda cancelar la serie si el lo desea<br>
<strong>REQ10</strong> : El sistema debe permitir que el usuario de una puntuacion de cada serie de 1 a 10<br>
<strong>REQ11</strong> : El sistema debe permitir hacer comentario de cada serie por usuario<br>
<strong>REQ12</strong> : El sistema debe permitir que el administrador puede ver las series mejor punteadas<br>
<strong>REQ13</strong> : El sistema debe permitir que el administrador pueda leer cada comentario de cada serie el igual que el usuario<br>
<strong>REQ14</strong> : El administrador podra ver las series que un usuario esta viendo<br>
<strong>REQ15</strong> : El sistema debe permitir al usuario cancelar una serie que este viendo<br>
<strong>REQ16</strong> : El administrador podra agregar las series<br>
<strong>REQ17</strong> : El sistema debe permitir llevar un historial  de las series vistas por usuario<br>
<strong>REQ18</strong> : El sistema debe permitir un conteo de las series mas vistas<br>
<strong>REQ19</strong> : el sistema debe permitir al usuario  recuperar su cuenta en caso de perderla u olvidarla</p>
<h1 id="reglas-de-negocio">Reglas de negocio</h1>
<p>El administrador sera encargado de elimentar la base de datos de esta aplicacion, los usuarios tendran su registro y podran ver, categorizar, puntear y dejar comentarios sobre todos las series, ellos pueden cancelar las series que esten viendo<br>
El administrador podra agregar otros administradores<br>
El usuario si o si debe estar regitrado de la contrario no podra acceder a la aplicacion y el administrador llevara una vista general de los movimientos de le usuario</p>
<h1 id="requerimientos-de-interfaces-externas">Requerimientos de interfaces externas</h1>
<img src="https://raw.githubusercontent.com/gelvezz23/Neplix/master/src/folder-img-github/1.png">
<img src="https://raw.githubusercontent.com/gelvezz23/Neplix/master/src/folder-img-github/2.png">
<img src="https://raw.githubusercontent.com/gelvezz23/Neplix/master/src/folder-img-github/3.png">
<img src="https://raw.githubusercontent.com/gelvezz23/Neplix/master/src/folder-img-github/4.png">
<img src="https://raw.githubusercontent.com/gelvezz23/Neplix/master/src/folder-img-github/5.png">
<img src="https://raw.githubusercontent.com/gelvezz23/Neplix/master/src/folder-img-github/6.png">
<img src="https://raw.githubusercontent.com/gelvezz23/Neplix/master/src/folder-img-github/7.png">
<h1 id="diagrama-uml">Diagrama UML</h1>
<img src="https://raw.githubusercontent.com/gelvezz23/Neplix/master/src/folder-img-github/8.png">
