# Dokumentation von Schach

Dieses Java-Projekt ist eine Implementierung des Brettspiels Schach.

## Ziel

Das allgemeine Ziel ist es, den beteiligten Studenten grundlegende Prinzpien der objektorientierten Programmierung (OOP) in Java näher zu bringen.

Das Projektziel ist die Umsetzung eines Schachspiels unter Berücksichtigung der folgenden Aspekte:

* Abstraktion des Spielablaufs durch klassenbasierte Programmierung
* Umsetzung verschiedener Eigenschaften der OOP (z.B. Polymorphie)
* Erfahrung mit der Programmiersprache Java und einer zugehörigen integrierten Entwicklungsumgebung (IDE)
* Eine graphische Oberfläche (GUI) zur Interaktion zwischen dem Spielbrett und den Spielern
* Zugvalidierung der einzelnen Figuren

## Vorgehensweise

Bei der OOP ist es besonders wichtig, vor der Programmierung eine genaue Struktur für die Implementierung anzufertigen. Dies umfasst nicht nur den Programmcode und die Klassenstruktur, sondern auch die Wahl geeigneter Software und die Aufteilung der Arbeitspakete.


### Wahl geeigneter Software

Für die Programmierarbeit in einem Team, ist die Versionskontrolle des Programmcodes nicht mehr wegzudenken. Eine moderne Software, die Programmcode einer Versionskontrolle unterzieht, ist Git. Es gibt verschiedene Plattformen, die Server zur Verfügung stellen, auf denen der Kunde seine eigenen Git-Repositorys erstellen kann. Eine Plattform ist GitHub, welches in der Open-Source Community sehr beliebt ist. Öffentliche Repositorys laden die Community zur Mitentwicklung an Projekten gerade zu ein. Deshalb haben wir uns für *GitHub* und der zugehörigen Oberfläche *GitHub Desktop* entschieden.

Unter den vielen Java-IDEs auf dem Markt, fällt es schwer die richtige Wahl zu treffen. Viele IDEs (z.B. Eclipse) bieten umfangreiche Funktionen und Erweiterungen (Plug-Ins) an, was den Umgang mit der IDE häufig erschwert. Da unser Team bisher kaum Erfahrungen mit Java gesammelt hat, war es uns wichtig eine möglichst einsteigerfreundliche IDE zu finden. Aus diesem Grund haben wir uns für *BlueJ* entschieden.

### Klassenstruktur

Die Klassenstruktur des Schachspiels zeigt nachstehnde Abbildung
![alt text](https://github.com/NiclasEsser/chess/blob/master/doc/UML.PNG)

### Arbeitspakete

* 1.) Erstellen eines Grundkonzepts (Klassen, Attribute, Set- und Get-Methoden)
* 2.) Visualsierung von Spielbrett und Figuren
* 3.) Validierung der Züge einzelner Figuren
* 4.) Interaktion der Spieler durch MouseListener-Klasse
* 5.) Entwicklung einer Testautomation
* 6.) Erweiterung des Regelwerks (Schach, Patt, Rochade, spezielle Bauernregel)
* 7.) Weitere visuelle Aspekte (Anzahl Züge, Zeit) (optional)
* 8.) Erstellung einer ausührbaren Datei, die das Schachspiel startet (optional)

## Verwendete Java-Bibliotheken aus dem Java SE Development Kit (JDK)

## To Do's
Das Schachspiel wurde bis Arbeitspaket (4) erfolgreich programmiert, sodass die Bewegung einzelner Figuren möglich ist. Allerdings sind die Züge noch unabhängig von der Player-Klasse und das Regelwerk ist ebenfalls noch nicht implementiert. Ein problemloser Spielablauf ist daher noch nicht möglch. In den nächsten Schritten sind diese Aspekte noch umzusetzten. Zusätzlich muss auch eine Testautomation programmiert werden, die einzelne Klassen testet und auf Fehler überprüft. Im Anschluss können optionale Arbeitspakete programmiert werden, um die Spielumgebung anwenderfreundlicher zu gestalten.

## Spiel starten



## Fazit

Das Team konnte verschiedene Prinzipien der OOP erlernen und umsetzen, wie die Polymorphie durch die Umsetzung der abstrakten UI- und Figure-Klasse. Auch das Geheimnisprinzip einzelner Klassen wurde durch die verwendung von ``private type attribute``  eingehalten, sodass der Zugriff auf Attribute nur durch Get- und Set-Methoden möglich ist. Probleme traten bei der Kapselung zwischen der Board- und Boardfield-Klasse durch den EventHandler auf. Beide Klassen wiesen Abhängigkeiten beim Ausführen der Züge auf. Im Punkte Lesbarkeit gibt es ebenfalls Kritikpunkte, da im Quelltext ein englisch-deutsch Mix enstanden ist. Dieser rührt daher, dass verschiedene Personen mit unterschiedlichen Programmierstilen an dem Projekt beteiligt waren. Bei der Projektstrukturierung wurde der Aspekt der Lesbarkeit zu unrecht nicht geklärt.

Der Austausch über Git in einer Teamarbeit, war für das alle eine neue Erfahrung, die zukunftsweisend ist. Außerdem konnte jeder neue Programmiererfahrung mit Java lernen.


## Authors

* **Stephan Wahlen** - *Initial work and Figure validation* - [Metalheim](https://github.com/metalheim)
* **Benjamin Horn** - *Documenation and management* - [PurpleBooth](https://github.com/PurpleBooth)
* **Niclas Esser** - *Figure validation and EventHandler* - [Niclas Esser](https://github.com/NiclasEsser)
