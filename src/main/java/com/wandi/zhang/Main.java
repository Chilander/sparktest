package com.wandi.zhang;

import com.wandi.zhang.routes.TestRoute;
import spark.Route;

import static com.wandi.zhang.utils.JsonUtil.json;
import static spark.Spark.*;

public class Main
{
    public static void RegisterRoute()
    {

    }

    public static void main(String[] args) {
        port(8080);
        int count = 0;
        Route r = (req, res) -> { return "test" + count;};

        get("/hello", (req, res) -> "Hello World");
        get("/hello/:name", (req, res) -> "Hello " + req.params(":name"));
        get("/hello/test/:name", r);
        post("/hello/Say", new TestRoute(), json());
    }
}
