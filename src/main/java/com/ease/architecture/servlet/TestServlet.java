package com.ease.architecture.servlet;

import com.ease.architecture.entity.Clazz;
import com.ease.architecture.service.ClazzService;
import com.ease.architecture.utils.ResponseUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class TestServlet extends HttpServlet {
    private ClazzService clazzService = new ClazzService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        HttpSession httpSession = req.getSession();
//        System.out.println(httpSession.getAttribute("a"));
//        userService.findUserById()
        int start = Integer.parseInt(req.getParameter("start"));
        int size = Integer.parseInt(req.getParameter("size"));
        List<Clazz> clazzList = clazzService.findClazzByPage(start * size, size);
//        List<String> list = new ArrayList<>();
//        list.add("a");
//        list.add("b");
//        list.add("c");
//        list.add("d");
        ResponseUtil.returnWrapper(resp, clazzList);
    }
}
