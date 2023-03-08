package com.example.posterapp;

public class ItemModel {
    String nama, year;
    int poster;

    public ItemModel(String nama, String year, int poster) {
        this.nama = nama;
        this.year = year;
        this.poster = poster;
    }

    public String getNama() {
        return nama;
    }

    public String getYear() {
        return year;
    }

    public int getPoster() {
        return poster;
    }
}
