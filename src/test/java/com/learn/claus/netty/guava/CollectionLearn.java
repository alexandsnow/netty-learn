package com.learn.claus.netty.guava;

import com.google.common.base.Supplier;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * collection learn
 *
 * @author GaoYang
 */
public class CollectionLearn {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(() -> System.out.println("void"));
        System.out.println(completableFuture.get());
        CompletableFuture<Integer> completableFutureReturn = CompletableFuture.supplyAsync((Supplier<Integer>) () -> 20);
        System.out.println(completableFutureReturn.get());


    }
}
