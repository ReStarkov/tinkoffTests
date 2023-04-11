## Проект по автоматизации тестирования (Web UI)
### Веб сайт <a target="_blank" href="https://www.tinkoff.ru/gorod/">Тинькофф Город</a>

<p align="center">
<img title="Тинькофф Город" src="images/screens/cover.jpg">
</p>

## :round_pushpin: Содержание:

- Технологии и инструменты
- Список проверок, реализованных в тестах
- Запуск тестов (сборка в Jenkins)
- Allure-отчет
- Интеграция с Allure TestOps
- Интеграция с Atlassian Jira
- Уведомление в Telegram о результатах прогона тестов
- Видео локального прогона тестов
- Видео прогона тестов в selenoid



## :round_pushpin: Технологии и инструменты

<p align="center">
<a href="https://www.jetbrains.com/idea/"><img src="images/logo/Idea.svg" width="50" height="50"  alt="IDEA"/></a>
<a href="https://www.java.com/"><img src="images/logo/Java.svg" width="50" height="50"  alt="Java"/></a>
<a href="https://github.com/"><img src="images/logo/GitHub.svg" width="50" height="50"  alt="Github"/></a>
<a href="https://junit.org/junit5/"><img src="images/logo/Junit5.svg" width="50" height="50"  alt="JUnit 5"/></a>
<a href="https://gradle.org/"><img src="images/logo/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>
<a href="https://selenide.org/"><img src="images/logo/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>
<a href="https://aerokube.com/selenoid/"><img src="images/logo/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>
<a href="https://github.com/allure-framework/allure2"><img src="images/logo/Allure.svg" width="50" height="50"  alt="Allure"/></a>
<a href="https://qameta.io/"><img src="images/logo/Allure_TO.svg" width="50" height="50"  alt="Allure TestOps"/></a>
<a href="https://www.atlassian.com/ru/software/jira"><img src="images/logo/jira-logo.svg" width="50" height="50"  alt="Atlassian Jira"/></a>
<a href="https://www.jenkins.io/"><img src="images/logo/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>
</p>

## :round_pushpin:  Список проверок, реализованных в автотестах

- [x] Открытие страницы 'Тинькофф Город'. Проверка наличия элементов на странице.
- [x] Проверка блока афишы на наличие элементов
- [x] Проверка отображения элементов на карточке 'Кино'. Переход из карточки к разделу бронирования
- [x] Проверка отображения элементов на карточке 'Концерты'. Переход из карточки к разделу бронирования
- [x] Проверка отображения элементов на карточке 'Театр'. Переход из карточки к разделу бронирования
- [x] Проверка отображения блока мобильного приложения на странице 'Топливо'.
- [x] Проверка отображения блока мобильного приложения на странице 'Театры'.
- [x] Проверка отображения блока мобильного приложения на странице 'Кино'.
- [x] Заполнение формы заявки на получение банковской карты.





## :round_pushpin:  Список проверок, реализованных в ручных тестах

- [x] В разделе 'Тинькофф Город' отображается блок 'Сервис ежедневных покупок'

###  Локальный запуск :
Пример командной строки:
```bash
gradle clean test -Denv=local
```
Получение отчёта:
```bash
allure serve build/allure-results
```

###  :round_pushpin:  Удаленный запуск (в Jenkins):
1. Открыть <a target="_blank" href="https://jenkins.autotests.cloud/job/17-RomanStarkov-project14//">проект</a>

![This is an image](/images/screens/8.jpg)

2. Выбрать пункт **Собрать с параметрами**
3. В случае необходимости изменить параметры, выбрав значения из выпадающих списков
4. Нажать **Собрать**
5. Результат запуска сборки можно посмотреть в отчёте Allure

![This is an image](/images/screens/12.jpg)

## <img src="images/logo/Allure.svg" width="25" height="25"  alt="Allure"/></a> Отчет в <a target="_blank" href="https://jenkins.autotests.cloud/job/17-RomanStarkov-project14/7/allure/">Allure report</a>

![This is an image](/images/screens/13.jpg)

###  Тесты

<p align="center">
<img title="Allure Tests" src="images/screens/14.jpg">
</p>

## Интеграция с Allure TestOps

![This is an image](/images/screens/15.jpg)

![This is an image](/images/screens/10.jpg)


## Интеграция с Atlassian Jira

![This is an image](/images/screens/9.jpg)

## Получение отчетов о прохождении тестов в telegram

![This is an image](/images/screens/1.jpg)

## Локальный запуск тестов

![This is an image](/images/screens/local.gif)

## Запуск тестов в selenoid

![This is an image](/images/screens/selenoid.gif)











