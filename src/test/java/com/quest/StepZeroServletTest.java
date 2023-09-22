package com.quest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

public class StepZeroServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private HttpSession session;
    @Mock
    private RequestDispatcher requestDispatcher;
    private StepZeroServlet servlet;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        servlet = new StepZeroServlet();
    }

    @Test
    void testDoPost() throws ServletException, IOException {
        Mockito.when(request.getParameter("username")).thenReturn("testUser");
        Mockito.when(request.getSession()).thenReturn(session);
        Mockito.when(request.getRequestDispatcher("/WEB-INF/stepZero.jsp")).thenReturn(requestDispatcher);
        servlet.doPost(request, response);
        Mockito.verify(session).setAttribute("username", "testUser");
        Mockito.when(request.getHeader("Referer")).thenReturn("http://localhost:8080/restart");
        servlet.doPost(request, response);
        Mockito.verify(session).setAttribute("launchCount", 2);
        Mockito.verify(requestDispatcher, Mockito.times(2)).forward(request, response);
    }
}

