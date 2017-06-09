package com.wandi.zhang.routes;

import spark.Request;
import spark.Response;
import spark.Route;

public class TestRoute implements Route {

    private static int counter = 0;

    private int objectCounter = 0;

    public Object handle(Request req, Response res) throws Exception {
        System.out.println("handling::" + counter + "::" + objectCounter + "::" + Thread.currentThread().getId());
        counter++;
        objectCounter++;
        Thread.sleep(5000);
        res.body("Testing");
        res.status(400);
        return "testing_" + counter + "_" + objectCounter + "_" + Thread.currentThread().getId();
    }
}
