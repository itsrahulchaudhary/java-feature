package com.rahul.java8.computableFeature;

import com.rahul.java8.dto.Employee;

import java.util.concurrent.*;
import java.util.stream.Collectors;

public class EmployeeReminderService {

    public static CompletableFuture<Void> sendReminderToEmployee() {
        ExecutorService executor = Executors.newFixedThreadPool(8);
        CompletableFuture<Void> voidCompletableFuture = CompletableFuture.supplyAsync(() -> {
                    System.out.println("fetch Employee : " + Thread.currentThread().getName());
                    return EmployeeDatabase.fetchEmployees();
                }
        ,executor).thenApplyAsync(employees -> {
            System.out.println("filter new joiner employee : " + Thread.currentThread().getName());
            return employees.stream().filter(employee -> "TRUE".equals(employee.getNewJoiner()))
                    .collect(Collectors.toList());
        },executor).thenApplyAsync(employees -> {
            System.out.println("filter traning not completed : " + Thread.currentThread().getName());
            return employees.stream().filter(employee -> "TRUE".equals(employee.getLearningPending()))
                    .collect(Collectors.toList());
        },executor).thenApplyAsync(employees -> {
            System.out.println("get Email : " + Thread.currentThread().getName());
            return employees.stream().map(Employee::getEmail)
                    .collect(Collectors.toList());
        },executor).thenAcceptAsync((employees -> {
            System.out.println("send Email : "+Thread.currentThread().getName());
            employees.forEach(EmployeeReminderService::sendMail);
        }));
        return voidCompletableFuture;
    }

    public static void sendMail(String email) {
        System.out.println("Email send successfully : " + email);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        sendReminderToEmployee().get();
    }
}
