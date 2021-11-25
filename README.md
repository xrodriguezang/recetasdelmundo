Base de dades:

create role recetasdelmundo with login encrypted password 'recetasdelmundo';
grant all privileges on database recetasdelmundo to recetasdelmundo;

Pas -1:

Crear in directori el més a l'arrel possible

Pas 0:

Executar blade init -v 7.4

Pas 1:

Modifcar el gradle.properties per afegir la darrera versió del Liferay
Modificar el settings.grapdle per afegir la darrera versió de Liferay

Pas 2:

blade gw initBundle

es descarga a :

./liferay/bundles

-- Arrancar el servidor:
blade server start

-- Parar el servidor:
blade server stop

--

La base de dades:

portal-ext.properties
#
# MySQL
#
#jdbc.default.driverClassName=com.mysql.cj.jdbc.Driver
#jdbc.default.url=jdbc:mysql://localhost/lportal?useUnicode=true&characterEncoding=UTF-8&useFastDateParsing=false
#jdbc.default.username=root
#jdbc.default.password=

Per tornar a crear la connexió a la esborrar:

portal-setup-wizard.properties dins bundle

// Aquest fitxer és important per si es mou el bundle:

liferay.home=C:/Liferay/bundles

Modificar el fitxer /tomcat_home/bin/setenv.sh per posar:
......
