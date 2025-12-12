
<h1>Project Java 4IIR</h1>
<h3>Ilyas Ait maina </h3>
<img 
    width="907" 
    height="549" 
    alt="10-class-diagram-for-hotel-management-system" 
    src="https://github.com/Ilyas0236/JavaStream1111/blob/main/Projet/LOM_base_schema.svg.png" 
/>


<h2>Description</h2>



## Objectif général

Ce projet a pour objectif de développer une application web de gestion de ressources éducatives basée sur le standard LOM (Learning Object Metadata). L’application permet de décrire, stocker, rechercher et exploiter des objets d’apprentissage (cours, TD, vidéos, supports PDF, etc.) à partir de leurs métadonnées normalisées. Elle vise à faciliter la réutilisation des contenus pédagogiques, leur partage entre enseignants et leur intégration dans des plateformes d’e‑learning.

## Gestion des ressources éducatives

L’application offre une interface permettant de créer, consulter, modifier et supprimer des ressources éducatives. Lors de la création d’une ressource, l’utilisateur associe un fichier (ou une URL) et remplit les métadonnées LOM correspondantes. Chaque ressource est liée à l’ensemble des catégories du schéma (General, Lifecycle, Technical, Educational, Rights, etc.), ce qui garantit une description complète et cohérente.

## Saisie des métadonnées LOM

Pour chaque ressource, l’utilisateur dispose de formulaires organisés par catégories LOM :

- **General** : titre, langue, description, mots‑clés, couverture, niveau d’agrégation.
- **Lifecycle** : version, statut de la ressource, contributions (auteur, rôle, date).
- **Meta‑Metadata** : informations sur le schéma de métadonnées, identifiants.
- **Technical** : format, taille, emplacement, exigences et durée.
- **Educational** : type d’interactivité, niveau, difficulté, temps d’apprentissage, rôle de l’utilisateur visé, contexte pédagogique.
- **Rights** : coût, droits d’auteur, restrictions d’utilisation.
- **Relation** : liens entre objets (version précédente, ressource associée, etc.).
- **Annotation** : commentaires, remarques, retours d’expérience d’enseignants ou d’étudiants.
- **Classification** : insertion de la ressource dans une taxonomie (domaine, chapitre, thématique).

Cette structuration permet de respecter le diagramme de classes et de rendre les données exploitables par d’autres systèmes.

## Recherche et filtrage avancés

Le système propose un moteur de recherche multicritère basé sur les métadonnées. L’utilisateur peut retrouver des ressources par titre, mots‑clés, langue, niveau d’étude, durée estimée, type de support ou domaine de classification. Des filtres combinés (ex. ressources en français, de niveau “Licence”, dans le domaine “Informatique”) permettent aux enseignants et étudiants de trouver rapidement le contenu adapté à leurs besoins.

## Gestion des relations et de la versioning

Grâce aux catégories Relation et Lifecycle, l’application gère les liens entre différentes versions d’un même objet d’apprentissage. Une ressource peut être associée à une version antérieure ou à des ressources complémentaires (pré‑requis, exercices associés, corrigés, etc.). Cela offre une vision claire de l’évolution du contenu et aide à organiser les parcours pédagogiques.

## Annotation et collaboration

La fonctionnalité d’annotation permet aux utilisateurs autorisés (par exemple les enseignants) d’ajouter des commentaires pédagogiques sur une ressource. Ces annotations peuvent contenir des remarques sur la qualité, les conditions d’utilisation, les adaptations possibles ou des conseils d’exploitation en classe. Cela favorise la collaboration et la mutualisation d’expérience autour des mêmes objets d’apprentissage.

## Gestion des droits et accès

La catégorie Rights est exploitée pour préciser les conditions d’utilisation des ressources (libre accès, réservé aux étudiants d’un établissement, sous licence spécifique, etc.). En fonction de ces informations, le système peut adapter l’affichage ou restreindre certaines opérations (téléchargement, modification). Cela garantit le respect des droits d’auteur et des licences associées aux contenus.

## Interface web et architecture technique

Sur le plan technique, le backend Spring Boot expose des services pour la gestion des entités LOM (Resource, General, Technical, Educational, etc.) et leur persistance dans une base de données relationnelle. Le frontend, réalisé avec Thymeleaf, propose des pages pour la navigation, la saisie des formulaires de métadonnées, la consultation détaillée d’une ressource et les fonctionnalités de recherche. L’ensemble constitue une application structurée en couches (présentation, service, accès aux données) fidèle au diagramme de classes LOM et adaptée à une intégration future dans un environnement e‑learning plus large.


