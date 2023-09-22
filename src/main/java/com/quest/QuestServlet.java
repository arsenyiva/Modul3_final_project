package com.quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;


@WebServlet(name = "quest", value = "/quest")
public class QuestServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String answer = req.getParameter("answer");
        if ("yes1".equals(answer)) {
            req.getRequestDispatcher("/WEB-INF/stepOne.jsp").forward(req, resp);
        }
        if ("yes2".equals(answer)) {
            req.getRequestDispatcher("/WEB-INF/stepTwo.jsp").forward(req, resp);
        }
        if ("yes3".equals(answer)) {
            req.getRequestDispatcher("/WEB-INF/stepThree.jsp").forward(req, resp);
        }
        if ("yes4".equals(answer)) {
            req.getRequestDispatcher("/WEB-INF/goodEnding.jsp").forward(req, resp);
        }
    }
}
