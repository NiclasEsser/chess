# Dokumentation von Schach

Dieses Java-Projekt ist eine Implementierung des Brettspiels Schach.

## Ziel

Das allgemeine Ziel ist es, den beteiligten Studenten grundlegenden Prinzipen der objektorientierten Programmierung (OOP) in Java näher zu bringen.

Das Projektziel ist die Programmierung eines Schachspiels unter Berücksichtigung der folgenden Aspekte:

* Abstraktion des Spielablaufs durch klassenbasierte Programmierung
* Umsetzung verschiedener Eigenschaften der OOP (z.B. Polymorphie)
* Erfahrung mit der Programmiersprache Java und einer zugehörigen integrierten Entwicklungsumgebung (IDE)
* Eine graphische Oberfläche (GUI) zur Interaktion zwischen dem Spielbrett und den Spielern
* Zugvalidierung der einzelnen Figuren

## Vorgehensweise

Bei der OOP ist es besonders wichtig, vor der Programmierung eine genaue Struktur für die Implementierung anzufertigen. 
Dies umfasst nicht nur den Programmcode und die Klassenstruktur, sondern auch die Wahl geeigneter Softwares und die Aufteilung der Arbeitspakete.

### Wahl geeigneter Softwares

#### Versionskontrolle

Für die Programmierarbeit in einem Team, ist die Versionskontrolle des Programmcodes nicht mehr wegzudenken. 
Eine moderne Software, die Programmcode einer Versionskontrolle unterzieht, ist Git. 
Es gibt verschiedene Plattformen, die Server zur Verfügung stellen, auf denen der Kunde seine eigenen Git-Repositorys erstellen kann. 
Eine Plattform ist GitHub, welches in der Open-Source Community sehr beliebt ist. 
Öffentliche Repositorys laden die Community zur Mitentwicklung an Projekten gerade zu ein. Deshalb haben wir uns für [*GitHub*](http://github.com) und der zugehörigen Oberfläche *GitHub Desktop* entschieden.

#### Konzeptionierung als UML Diagramm 

In der Abstraktionsphase wurden die Funktionen eines realen Schachspiels auf Funktionsblöcke zurückgeführt, die in der Umsetzungsphase 
Klassen entsprechen. Für die Planung und Darstellung wurde das freie UML Werkzeug [StarUML](http://staruml.io/) verwendet, da es einen großen
Funktionsumfang (Round-Trip-Engineering, Java Unterstützung) bietet und unter einer gemeinfreien Lizenz steht.

#### IDE
Unter den vielen Java-IDEs auf dem Markt, fällt es schwer die richtige Wahl zu treffen. 
Viele IDEs (z.B. [Eclipse](https://www.eclipse.org/) ) bieten umfangreiche Funktionen und Erweiterungen (Plug-Ins) an, was den Umgang mit der IDE häufig erschwert. 
Da unser Team bisher kaum Erfahrungen mit Java gesammelt hat, war es uns wichtig eine möglichst einsteigerfreundliche IDE zu finden. Aus diesem Grund haben wir uns für [*BlueJ*](https://www.bluej.org/) entschieden.

#### Klassenstruktur / Statik

Die Klassenstruktur des Schachspiels zeigt nachstehende Abbildung aus der Projektübersicht der IDE BlueJ
![Visuelle repräsentation der Klassenstruktur von Schach](https://github.com/NiclasEsser/chess/blob/master/doc/UML.PNG)

##### UML Diagramm

### Arbeitspakete

* 1.) Erstellen eines Grundkonzepts (Klassen, Attribute, Set- und Get-Methoden)
* 2.) Visualisierung von Spielbrett und Figuren
* 3.) Validierung der Züge einzelner Figuren
* 4.) Interaktion der Spieler durch MouseListener-Klasse
* 5.) Entwicklung einer Testautomation
* 6.) Erweiterung des Regelwerks (Schach, Patt, Rochade, spezielle Bauernregel)
* 7.) Weitere visuelle Aspekte (Anzahl Züge, Zeit) (optional)
* 8.) Erstellung einer ausführbaren Datei, die das Schachspiel startet (optional)

### Verwendete Java-Bibliotheken aus dem Java SE Development Kit (JDK)

Für die Einbindung einer graphischen Benutzeroberfläche (GUI) und eines EventHandlers zur Eingabe von Nutzerdaten
wurden Bibliotheken aus dem JDK benutzt. Dazu wurde auf das [Abstract Window Toolkit (AWT)](https://de.wikipedia.org/wiki/Abstract_Window_Toolkit)
zurückgegriffen. AWT stellt das so genannte Heavyweight-Framework zur Darstellung von Steuerelementen dar. 
Das bedeutet, dass AWT die nativen GUI-Komponenten des jeweiligen Betriebssystems zur Darstellung verwendet und damit Plattform-unabhängig ein 
natives Benutzererlebnis bietet.

Es wurden insbesondere folgende Elemente aus dem AWT verwendet:

#### Darstellung 

Für die Darstellung wurden die Funktionen aus *java.awt.Canvas* verwendet, mit Hilfe dessen einfache graphische Strukturen (Kreise, Rechtecke, Text etc.)
auf einen Bereich des Bildschirms gerendert werden können. Jedes Element (Figuren, Brett, Brett-Felder) erweitern die Klasse UI, die wiederum die Classe 
Canvas aus dem AW-Toolkit erweitert.

#### Event Handling

Um Benutzereingaben in der GUI abzufangen und auszuwerten wurden die Event-Handling Funktionen der Klasse *java.awt.event* verwendet.
Dadurch ist u.a. der Zugriff auf bestimmte Mausgesten (z.B. Doppelklick) möglich, sowie die Positionsabfrage des Mauszeigers.

## To Do's
Das Schachspiel wurde bis Arbeitspaket (4) erfolgreich programmiert, sodass die Bewegung einzelner Figuren möglich ist. Allerdings sind die Züge noch unabhängig von der Player-Klasse und das Regelwerk ist ebenfalls noch nicht implementiert. Ein problemloser Spielablauf ist daher noch nicht möglich. In den nächsten Schritten sind diese Aspekte noch umzusetzen. Zusätzlich muss auch eine Testautomation programmiert werden, die einzelne Klassen testet und auf Fehler überprüft. Im Anschluss können optionale Arbeitspakete programmiert werden, um die Spielumgebung anwenderfreundlicher zu gestalten.

## Spiel starten



## Fazit

Das Team konnte verschiedene Prinzipien der OOP erlernen und umsetzen, wie die Polymorphie durch die Umsetzung der abstrakten UI- und Figure-Klasse. Auch das Geheimnisprinzip einzelner Klassen wurde durch die Verwendung von ``private type attribute``  eingehalten, sodass der Zugriff auf Attribute nur durch Get- und Set-Methoden möglich ist. Probleme traten bei der Kapselung zwischen der Board- und Boardfield-Klasse durch den EventHandler auf. Beide Klassen wiesen Abhängigkeiten beim Ausführen der Züge auf.

Im Punkte Lesbarkeit gibt es ebenfalls Kritikpunkte, da im Quelltext ein englisch-deutsch Mix entstanden ist. Dieser rührt daher, dass verschiedene Personen mit unterschiedlichen Programmierstilen an dem Projekt beteiligt waren. Bei der Projektstrukturierung wurde der Aspekt der Lesbarkeit zu Unrecht nicht geklärt.

Der Austausch über Git in einer Teamarbeit, war für alle eine neue Erfahrung, die zukunftsweisend ist. Außerdem konnte jeder neue Programmiererfahrung mit Java lernen.


## Authors

* **Stephan Wahlen** - *Initial work and Figure validation* - [Metalheim](https://github.com/metalheim)
* **Benjamin Horn** - *Documenation and management* - [PurpleBooth](https://github.com/PurpleBooth)
* **Niclas Esser** - *Documenation, Figure validation and EventHandler* - [Niclas Esser](https://github.com/NiclasEsser)
