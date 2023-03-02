package com.example.pomadoroTogether.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.Random;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        imageGrabber("https://www.google.com");
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/food")//this is the address to reach "favFood", i.e. http://localhost:8080/food
    public String favFood(@RequestParam(value = "food", defaultValue = "Plain Bread") String food)//format: http://localhost:8080/food?=<insert value here>
    {
        return ("Your favorite food is : " + food);
    }

    @GetMapping("/dice")//this is the address to roll a dice, i.e. http://localhost:8080/dice
    public String dice() {
        Random random = new Random();
        int num = random.nextInt(6) + 1;
        return ("You rolled a " + String.valueOf(num) + ".");
    }

    public static void imageGrabber(String website)
    {
        Document doc;
        try {

            //get all images
            doc = Jsoup.connect(website).get();
            Elements images = doc.select("img[src~=(?i)\\.(png|jpe?g|gif)]");
            for (Element image : images) {

                System.out.println("\nsrc : " + image.attr("src"));
                System.out.println("height : " + image.attr("height"));
                System.out.println("width : " + image.attr("width"));
                System.out.println("alt : " + image.attr("alt"));

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

