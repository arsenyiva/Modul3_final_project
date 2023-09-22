package com.quest;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet(name = "stepzero", value = "/stepzero")
public class StepZeroServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");

        String username = req.getParameter("username");
        HttpSession session = req.getSession();
        session.setAttribute("username", username);

        Integer launchCount = (Integer) session.getAttribute("launchCount");
        if (launchCount == null) {
            launchCount = 1;
        }

        String referringPage = req.getHeader("Referer");
        if (referringPage != null && referringPage.endsWith("/restart")) {
            launchCount++;
        }
        session.setAttribute("launchCount", launchCount);

        // Forward the request to the welcome.jsp page
        req.getRequestDispatcher("/WEB-INF/stepZero.jsp").forward(req, resp);
    }
}

