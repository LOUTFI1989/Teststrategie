# Projet Robot

## Vue d'ensemble

Ce projet représente un robot avec un nom et une stratégie de déplacement. Le robot peut être initialisé avec un nom et une stratégie par défaut ou avec une stratégie spécifique.

## Structure du projet

```mermaid
classDiagram
    class Robot {
        -String nom
        -IBehaviour strategie
        +Robot()
        +Robot(String nom)
        +Robot(Robot r)
        +void move()
        +String getNom()
        +void setNom(String nom)
        +IBehaviour getStrategie()
        +void setStrategie(IBehaviour strategie)
    }

    class IBehaviour {
        +int moveCommand()
    }

    class DefaultBehaviour {
        +int moveCommand()
    }

    Robot --> IBehaviour
    DefaultBehaviour --> IBehaviour
```
