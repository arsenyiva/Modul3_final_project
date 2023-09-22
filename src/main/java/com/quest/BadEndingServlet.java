package com.quest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "bad_ending", value = "/bad_ending")
public class BadEndingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String answer = req.getParameter("answer");
        if ("no".equals(answer)) {
            req.getRequestDispatcher("/WEB-INF/badEnding.jsp").forward(req, resp);
        } else if ("yes".equals(answer)) {
            req.getRequestDispatcher("/WEB-INF/badEnding.jsp").forward(req, resp);
        }
    }
}
