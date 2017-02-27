

#FRAMEWORK

Aquesta aplicació tracta de registrar usuaris mitjançant l'entrada de dades.
Al executar l'aplicació es mostra el primer menu on es selecciona el tipus d'usuari (Administrador, Client, Normal i Opcions).

**Usuaris**
------

+ **Administrador**:
un usuari administrador fa referència a aquell que pot accedir a la caixa blanca del programa.
+ **Client**:
un ususari client es aquell que es registra al sistema, te descomptes i privilegis que no te un usuari normal i s'ha de registrar mitjançant el correu electrònic però no pot accedir a la caixa blanca del programa.
+ **Normal**:
un usuari normal introdueix les seues dades per accedir al sistema però no arriba a registrar-se mitjançant un correu electrònic i per tant no pot accedir a descomptes i beneficis.

**CRUD**
------

Al seleccionar un tipus d'usuari, entrem en un altre menú que anomenem CRUD. Les opcions d'aquest menú són:
+ **Crear**: el programa va preguntant-nos les dades i nosaltres anem introduint-les manualment.Cada usuari té una serie de dades comunes per als tres tipus i altres de diferents.
+ **Read**: en aquesta opció podem veure la informació de tots els usuaris del tipus on ens trobem que hem creat anteriorment o seleccionar mitjançant el nom i el dni un usuari en concret per a que el programa ens el mostre.
+ **Update**: amb aquesta opció podem canviar qualsevol dels camps d'un usuari creat anteriorment
+ **Delete**: poderem borrar un usuari que seleccionarem mitjançant un desplegable amb tots els noms i DNI dels usuaris registrats del tipus en el que ens trobem





**Opcions**
------------

Les opcions fan referència als ajusts del programa que es poden modificar segons les preferències de l'usuari.Una vegada modifiquem les opcions i eixim del menú, aquestes es guarden com a predeterminades per a la pròxima vegada que obrim el programa, fins que les tornem a modificar.
Les opcions que trobem son: 
+ **Format** de la data: podem seleccionar un format determinat a l'hora d'introduir la data de naixement i contractació i a més serà el format predeterminat quan llegim les dades introduides d'un usuari registrat.
+ **Moneda**: podem selecionar entre euro, lliura i dolar com a moneda predeterminada a l'hora de calcular el salari de l'usuari administrador.
+ **Nombre de decimals**: podem seleccionar un, dos o tres decimals que observarem al llegir el salari de l'usuari administrador.
+ **Idioma**: podem seleccionar valencià, castellà o anglès com a idioma de tota l'aplicació.
+ **Dummies**: aquesta opció ens permet crear usuaris de qualsevol dels tres tipus omplint els camps amb dades aleatories de manera que no hem d'introduir tots els camps manualment, 
	sinó que sols caldrà fer click sobre la opció crear de qualsevol usuari i automàticament registrarà 5 usuaris d'aquest tipus. Es tracta d'una manera ràpida de veure el registre d'usuaris i poder-los llegir posteriorment.
	A l'opció update dels dummies, els camps que volem canviar també es canvien automàticament de manera aleatòria.
+ **Seleccionar fitxer**: podem seleccionar un tipus de fitxer, xml o txt. Una vegada seleccionat un format, els ususaris que creem es registraran amb aquest de manera que es guardaran a un tipus o altre de fitxer. 
	Ocorre el mateix a l'hora de llegir els ususaris registrats, només podrem llegir els usuaris que s'hagin guardat en el format seleccionat en els ajusts.
+ **Tema**: es tracta de la part visual de l'aplicació, podem seleccionar entre diferents apariències.
	

