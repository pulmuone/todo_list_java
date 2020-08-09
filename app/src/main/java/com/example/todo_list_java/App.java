package com.example.todo_list_java;

import android.app.Application;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App  extends Application {
    private static int NUMBER_OF_CORES = Runtime.getRuntime().availableProcessors();
    ExecutorService executorService = Executors.newFixedThreadPool(NUMBER_OF_CORES);
}
