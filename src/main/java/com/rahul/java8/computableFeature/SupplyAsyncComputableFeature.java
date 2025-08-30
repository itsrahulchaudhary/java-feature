package com.rahul.java8.computableFeature;
import java.util.concurrent.*;

public class SupplyAsyncComputableFeature {
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();

        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Call Product Service
        CompletableFuture<String> productFuture =
                CompletableFuture.supplyAsync(() -> getProductDetails(), executor);

        // Call Review Service
        CompletableFuture<String> reviewFuture =
                CompletableFuture.supplyAsync(() -> getReviews(), executor);

        // Call Recommendation Service
        CompletableFuture<String> recommendationFuture =
                CompletableFuture.supplyAsync(() -> getRecommendations(), executor);

        // Combine all results
        CompletableFuture<Void> allOf = CompletableFuture.allOf(productFuture, reviewFuture, recommendationFuture);

        allOf.thenRun(() -> {
            try {
                String product = productFuture.get();
                String reviews = reviewFuture.get();
                String recommendations = recommendationFuture.get();
                long end = System.currentTimeMillis();
                long totalTime = end - start;

                System.out.println("✅ Product Page Loaded");
                System.out.println("Product: " + product);
                System.out.println("Reviews: " + reviews);
                System.out.println("Recommendations: " + recommendations);
                System.out.println("⏱️ Total Time Taken: " + totalTime + " ms");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).join();

        executor.shutdown();
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
