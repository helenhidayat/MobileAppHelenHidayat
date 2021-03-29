package com.example.midprojecthelenhidayat;

import java.util.ArrayList;

public class HomePage_Data2 {


    private String[] CarsName = {
            "Convertible",
            "Coupe",
            "Hatchback",
            "MPV",
            "SUV",
    };

    private String[] CarsDesc = {
            "Mobil Convertible biasanya memiliki bentuk yang kecil dengan bagian atap yang dapat",
            "Mobil Coupe ini merupakan mobil yang memiliki ukuran kecil dengan jumlah pintu dan jok penumpang berjumlah dua.",
            "Mobil Hatchback adalah mobil yang bagian kabinnya menyatu dengan ruang bagasi mobil.",
            "Mobil MVP memang didesain untuk keluarga karena dapat menampung penumpang lebih banyak.",
            "Mobil SUV (Sport Utility Vehicle) merupakan jenis mobil yang memadupadankan antara mobil sedan dengan mobil jeep",

    };

    private Integer[] CarsImage = {

            R.drawable.convertible,
            R.drawable.coupe,
            R.drawable.hatchback,
            R.drawable.mpv,
            R.drawable.suv,

    };

    public ArrayList<HomePage_Data> getHomePage() {
        ArrayList<HomePage_Data> homePages = new ArrayList<>();
        for (int i = 0; i < CarsName.length ; i++) {
            HomePage_Data homepage = new HomePage_Data();
            homepage.setImage(CarsImage[i]);
            homepage.setName(CarsName[i]);
            homepage.setDesc(CarsDesc[i]);

            homePages.add(homepage);
        }
        return homePages;
    }

}
