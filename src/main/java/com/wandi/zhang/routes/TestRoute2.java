package com.wandi.zhang.routes;



import spark.Request;
import spark.Response;
import spark.Route;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/testing")
public class TestRoute2 implements Route {

    @GET
    public Object handle(Request req, Response res) throws Exception {

        return "GET handled like a boss!";
    }
}
