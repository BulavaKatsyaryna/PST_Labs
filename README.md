# PST_Labs

## Test Task | Java developer

ТЗ:
Написать приложение, которое будет представлять из себя REST API. В нем должно быть:
1. несколько сущностей с реализацией всех трех типов связи между ними;
2. REST API с CRUD операциями (в том числе с использованием Pageable);
3. вся схема данных описана в SQL файле, с помощью которого будет работать Flyway (по желанию);
4. доступен Swagger UI;
5. настроена сборка проекта в war архив и деплой на внешний Tomcat (по файловому пути);
6. 500 записей в каждой таблице;
7. соблюдение первых трёх нормальных форм базы данных.

Идея проекта может быть любой, как и сущности, и логика.
Проект должен быть залит на Git в общий доступ (в ветку master), с предоставлением ссылки для возможности просмотра, выгрузки и запуска. 
Код должен быть рабочий, запускаться без дополнительных манипуляций и настроек.


Стек:
1. Java 8+
2. Embedded DB (H2)
2. Spring (Boot, Web, Data JPA)
3. Swagger UI
4. Flyway
5. Maven
6. Git

По желанию так же можно добавить:
1. Spring Security
2. Lombok
3. Покрытие кода тестами
4. Какую-то дополнительную логику/решения
