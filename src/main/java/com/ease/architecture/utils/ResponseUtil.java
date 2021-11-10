package com.ease.architecture.utils;

import com.google.gson.Gson;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ResponseUtil {

    public static <T> void returnWrapper(HttpServletResponse response, T returnObject) throws IOException {
         response.getWriter().write(new Gson().toJson(returnObject));
         response.getWriter().flush();
         response.getWriter().close();
    }
}
