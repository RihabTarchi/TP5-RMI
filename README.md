# TP5 : Invocation de méthodes sur des objets distants avec Java RMI

**Activité 5-1 : Service de conversion de devise**

- Étudiante : Rihab Tarchi
- Matière : Développement d'applications réparties
- Faculté des Sciences de Sfax, LSI 3, 2026-2027

## Objectif

Concevoir une application répartie qui convertit un montant en euros vers le dinar tunisien avec Java RMI.

## Étape 1 : Développement du serveur

Projet `RMIConversion_Server` contenant :
- `rmiService/IConversion` : interface distante
- `rmiService/ConversionImpl` : implémentation du service
- `rmiServer/ConversionServer` : démarre le registre RMI et publie l'objet

![Structure du serveur](captures/1.png)
![Code du serveur](captures/2.png)
![Code du serveur](captures/3.png)
![Code du serveur](captures/4.png)

## Étape 2 : Développement du client

Génération de `conversionClient.jar` (interface seulement), ajout au classpath, puis création de `rmiClient/ConversionClient`.

![Création du JAR](captures/6.png)

![Code du client](captures/5.png)

## Étape 3 : Exécution

Lancement du serveur, puis du client.

![Exécution du serveur](captures/7.png)
![Exécution du client](captures/8.png)

## Synthèse

RMI permet au client d'appeler une méthode d'un objet situé sur une autre JVM comme s'il était local, grâce au stub. Le cycle de vie d'un service distant comprend : la définition de l'interface (`IConversion`), l'implémentation (`ConversionImpl`), l'enregistrement dans le RMIRegistry (`rebind`) et l'invocation par le client (`lookup` puis appel de `convertirMontant`). Le client ne connaît que l'interface, pas l'implémentation.
