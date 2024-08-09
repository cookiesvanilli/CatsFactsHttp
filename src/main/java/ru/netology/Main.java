package ru.netology;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient();
        try {
            HttpClient.httpStart();
        } catch (IOException e) {
        }
    }
}