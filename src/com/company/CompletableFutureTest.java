package com.company;

import com.sun.deploy.uitoolkit.impl.awt.AWTAppletAdapter;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/**
 * @Author CoveyLiu, covey@liukedun.com
 * @Date 2019-06-20 10:20
 */

public class CompletableFutureTest {

    private static CompletableFutureTest completableFutureTest = new CompletableFutureTest();
    private static CompletableFuture completableFuture;

    private CompletableFutureTest() {

    }

    public static CompletableFutureTest getInstance() {
        return completableFutureTest;
    }

    public CompletableFuture run() {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                // sleep 3s
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } return  "hello from CompletableFuture";
        });

        return completableFuture;
    }

    public String get() {

        String ret = null;

        try {
            ret = (String) completableFuture.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        return ret;
    }

}
