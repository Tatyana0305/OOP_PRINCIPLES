package ru.netology;

public class Main {

    public static void main(String[]args){
        FormDate form = new FormDate();
        form.day = 13;
        form.month = 6;
        form.year = 1999;

        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

    }
  }
