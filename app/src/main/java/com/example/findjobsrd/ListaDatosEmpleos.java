package com.example.findjobsrd;

public class ListaDatosEmpleos {
    private int id;
    private String title;
    private String shortdesc;
    private String rating;
    private String price;
    private int image;

    public ListaDatosEmpleos(int id, String title, String shortdesc, String rating, String price, int image) {
        this.id = id;
        this.title = title;
        this.shortdesc = shortdesc;
        this.rating = rating;
        this.price = price;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getShortdesc() {
        return shortdesc;
    }

    public String getRating() {
        return rating;
    }

    public String getPrice() {
        return price;
    }

    public int getImage() {
        return image;
    }
}
