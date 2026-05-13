# Application Assurance IARD

Application de gestion d'assurance IARD (Incendie, Accidents et Risques Divers) basée sur une architecture microservices.

## Architecture

Le projet est composé de :

- **assurance-front** : Application frontend Angular
- **ins-client-service** : Service de gestion des clients (Spring Boot + PostgreSQL)
- **ins-policy-service** : Service de gestion des contrats (Spring Boot + PostgreSQL)
- **ins-claim-service** : Service de gestion des sinistres (Spring Boot + PostgreSQL)

## Prérequis

- Docker
- Docker Compose

## Démarrage

Lancer l'ensemble des services :

```bash
docker-compose up -d
```

## Services

| Service | Port | Description |
|---------|------|-------------|
| Frontend | 4200 | Interface utilisateur |
| Clients | 8081 | API gestion clients |
| Contrats | 8082 | API gestion contrats |
| Sinistres | 8083 | API gestion sinistres |
| PostgreSQL | 5433 | Base de données relationnelle |
| MongoDB | 27017 | Base de données NoSQL |
| Elasticsearch | 9200 | Moteur de recherche |

## Arrêt

```bash
docker-compose down
```

Pour supprimer également les volumes de données :

```bash
docker-compose down -v
```
