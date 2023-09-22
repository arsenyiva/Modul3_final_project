package com.quest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.io.IOException;

class BadEndingServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher requestDispatcher;
    private BadEndingServlet servlet;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        servlet = new BadEndingServlet();
    }

    @Test
    void testDoPostWithNoAnswer() throws ServletException, IOException {
        Mockito.when(request.getParameter("answer")).thenReturn("no");
        Mockito.when(request.getRequestDispatcher("/WEB-INF/badEnding.jsp")).thenReturn(requestDispatcher);
        servlet.doPost(request, response);
        Mockito.verify(request).setCharacterEncoding("UTF-8");
        Mockito.verify(response).setCharacterEncoding("UTF-8");
        Mockito.verify(requestDispatcher).forward(request, response);
    }

    @Test
    void testDoPostWithYesAnswer() throws ServletException, IOException {
        Mockito.when(request.getParameter("answer")).thenReturn("yes");
        Mockito.when(request.getRequestDispatcher("/WEB-INF/badEnding.jsp")).thenReturn(requestDispatcher);
        servlet.doPost(request, response);
        Mockito.verify(request).setCharacterEncoding("UTF-8");
        Mockito.verify(response).setCharacterEncoding("UTF-8");
        Mockito.verify(requestDispatcher).forward(request, response);
    }
}
