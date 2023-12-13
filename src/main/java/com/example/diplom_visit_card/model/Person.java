package com.example.diplom_visit_card.model;

import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import java.util.Scanner;

@Component
public class Person {
    private String fio = "Фамилия Имя Отчество";
    private byte age = 99;
    private String city = "Местопроживанск";
    private String phone = "+78888888888";
    private String photo = "photo.jpg";
    private String github = "https://github.com/";
    private String socialNetwork = "https://vk.com/";
    private String resume = "Суперкомпания, \nСупердолжность, \nСуперпроект, \nСуперобязанности\n";

    public Person() {
        fileToPerson();
    }

    private void fileToPerson(){
        File file = new File("Person.txt");
        if(file.canRead()) {
            try (Scanner scanner = new Scanner(file)) {
                fio = scanner.nextLine();
                age = Byte.parseByte(scanner.nextLine());
                city = scanner.nextLine();
                phone = scanner.nextLine();
                photo = scanner.nextLine();
                github = scanner.nextLine();
                socialNetwork = scanner.nextLine();
                resume = "";
                while (scanner.hasNextLine())
                    resume += scanner.nextLine() + "\n";
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void personToFile(){
        File file = new File("Person.txt");
        try (FileWriter writer = new FileWriter(file)) {
            writer.append(fio + "\n");
            writer.append(age + "\n");
            writer.append(city + "\n");
            writer.append(phone + "\n");
            writer.append(photo + "\n");
            writer.append(github + "\n");
            writer.append(socialNetwork + "\n");
            writer.append(resume + "\n");
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getSocialNetwork() {
        return socialNetwork;
    }

    public void setSocialNetwork(String socialNetwork) {
        this.socialNetwork = socialNetwork;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
