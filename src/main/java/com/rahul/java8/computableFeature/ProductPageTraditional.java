package com.rahul.java8.computableFeature;
public class ProductPageTraditional {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // ⏱️ start time

        String product = getProductDetails();
        String reviews = getReviews();
        String recommendations = getRecommendations();

        long end = System.currentTimeMillis(); // ⏱️ end time
        long totalTime = end - start;

        System.out.println("✅ Product Page Loaded (Traditional)");
        System.out.println("Product: " + product);
        System.out.println("Reviews: " + reviews);
        System.out.println("Recommendations: " + recommendations);
        System.out.println("⏱️ Total Time Taken: " + totalTime + " ms");
    }

    static String getProductDetails() {
        sleep(1000);
        return "Product: iPhone 15 Pro";
    }

    static String getReviews() {
        sleep(2000);
        return "Reviews: ★★★★☆ (4.5/5)";
    }

    static String getRecommendations() {
        sleep(1500);
        return "Recommendations: iPhone Case, AirPods Pro";
    }

    static void sleep(int ms) {
        try { Thread.sleep(ms); } catch (InterruptedException e) {}
    }
}
