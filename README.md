# Java Practice 2026 — Road to Middle AQA

![Java](https://img.shields.io/badge/Java-21-007396?logo=openjdk&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-8.x-02303A?logo=gradle&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit-5-25A162?logo=junit5&logoColor=white)
![AssertJ](https://img.shields.io/badge/AssertJ-3.27-4A90E2?logo=java&logoColor=white)

**Репозиторий для восстановления и прокачки навыков Java до уровня Middle AQA Engineer.**

Я решаю задачи на [Exercism.io (Java Track)](https://exercism.org/tracks/java) + планирую добавлять LeetCode.

---

## 🎯 Цель

Достичь уверенного уровня **Middle AQA Java** к концу 2026 года через:
- Глубокое понимание Java 21 (Records, Sealed Classes, Pattern Matching и др.)
- Качественное unit-тестирование (JUnit 5 + AssertJ)
- Чистый код и профессиональные Git-практики

---

## 📁 Структура проекта

```bash
src/
├── main/java/com/practice/exercism/
│   ├── easy/          # Базовые задачи
│   ├── medium/        # Средний уровень (OOP, коллекции, строки)
│   └── hard/          # Продвинутый уровень (concurrency, generics, design patterns)
└── test/java/com/practice/exercism/
    ├── easy/
    ├── medium/
    └── hard/
    
```
---


## 🛠 Технологии

- **Java 21** (Records, Sealed Classes, Pattern Matching)
- **Gradle 8**
- **JUnit 5** + **AssertJ**
- **Git** + Conventional Commits
- IntelliJ IDEA

---

## 📊 Прогресс

| Уровень   | Решено | Всего | Прогресс     |
|-----------|--------|-------|--------------|
| Easy      | 1      | 20    | ▓░░░░ 5%     |
| Medium    | 0      | 25    | ░░░░░ 0%     |
| Hard      | 0      | 15    | ░░░░░ 0%     |

**Общий прогресс: ~2%**

---

## 🚀 Как запустить тесты

```bash
# Все тесты
./gradlew test

# Только easy задачи
./gradlew test --tests "com.practice.exercism.easy.*"

# Конкретная задача
./gradlew test --tests "*HelloWorld*"
```

---

## 📌 Workflow

- Работаю через **feature-ветки** (`easy/leap`, `medium/bank-account` и т.д.)
- Делаю **Pull Requests** для саморевью
- Использую **Conventional Commits**
- Стремлюсь к хорошему покрытию тестами

---

## 📬 Контакты

- GitHub: [Shuddery](https://github.com/Shuddery)

---

> *"The only way to learn is to build and break things."*

*Последнее обновление: 17 июня 2026*
