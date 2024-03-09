Forward to the Past
Énoncé
Note avant de commencer : la solution doit être faite comme si elle était réalisée pour un client et doit poser les bonnes bases de travail de votre future équipe. Elle doit être exemplaire.

L'équipe de production de Back to the Future voudrait remettre au goût du jour sa saga avec une technique marketing imparable :

revenir dans le passé, en 2000 ! Et passer un deal super smart avec une boutique de vente de DVDs (vous vous rappelez encore ce que c'est on espère...) avec une promo qui déchire :

le dvd d'un volet de la saga vaut 15€
pour l'achat de 2 volets DIFFÉRENTS de la saga, on applique une réduction de 10% sur l'ensemble des DVDs "Back to the Future" achetés
pour l'achat de 3 volets DIFFÉRENTS de la saga, on applique une réduction de 20% sur l'ensemble des DVDs "Back to the Future" achetés
La boutique de DVDs vend également d'autres films qui coûtent chacun 20€.

Portant la lourde responsabilité de réparer les failles temporelle, l'équipe de production vous charge d'écrire un programme qui aura le comportement suivant :

En entrée, un panier sous forme de texte, séparé par des retours à la ligne qui contient le nom des films achetés
En sortie, le nombre représentant le prix
Vous êtes libre de montrer le résultat de la manière qui vous convient et cela peut rester très minimaliste, tant qu'il est clair que le programme sait lire le format d'entrée et qu'il suit bien les règles spécifiées. Néanmoins, comme indiqué en début d’énoncé, ce code devra être traité comme si vous l’initiiez pour votre future équipe.

Vous pourrez choisir le langage qui vous paraîtra le plus pertinent (dans lequel vous êtes à l'aise, c'est mieux), et qui devra pouvoir s'exécuter sur une JVM ou en Python. Vous vous assurerez que le livrable permette à quelqu'un ayant le SDK adéquat de lancer, utiliser et maintenir votre programme aisément. En résumé, le code doit être de très bonne qualité.

Lors de l’éventuel entretien, venez avec votre code sur votre PC (pour vous permettre d’avoir un support sur lequel vous avez la main).

Quelques exemples d’entrées et sortie
Exemple n°1

input :

Back to the Future 1

Back to the Future 2

Back to the Future 3

Output :

36

Exemple n°2

input :

Back to the Future 1

Back to the Future 3

Output :

27

Exemple n°3 :

Input :

Back to the Future 1

Output :

15

Exemple n°4 :

Input :

Back to the Future 1

Back to the Future 2

Back to the Future 3

Back to the Future 2

Output :

48

Explication :

((15*4)*0.8) = 48

Exemple n°5

Input :

Back to the Future 1

Back to the Future 2

Back to the Future 3

La chèvre

Output :

56

Explication :

((15*3)*0.8)+20 = 56
