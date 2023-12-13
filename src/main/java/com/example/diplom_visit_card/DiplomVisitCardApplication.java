package com.example.diplom_visit_card;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*Дипломная работа

Задание Web-приложение Визитка
Создать Spring-приложение Визитка, которое хранит информацию о вас. Данные будут храниться в текстовом файле.
Приложение должно позволять добавлять, редактировать и удалять места работы, навыки и ссылки на страницы.
Также должна быть возможность добавлять фото.  Требуется создать возможность авторизации в закрытую
часть приложения для редактирования информации. Корневая страница должна выводить для чтения, без возможности
редактирования.
Портфолио должно содержать следующую информацию:
Статическая информация: ФИО, возраст, город проживания, телефон, фото.
Динамическая информация: ссылки на github, социальные сети, предыдущие места работы с информацией о компании,
должности, реализуемых проекта и должностных обязанностях.
Заполнение страницы возможно тестовыми данными.
*/
@SpringBootApplication

public class DiplomVisitCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(DiplomVisitCardApplication.class, args);
    }

}
