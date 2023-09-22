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

public class QuestServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher requestDispatcher;

    private QuestServlet questServlet;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        questServlet = new QuestServlet();
    }

    @Test
    public void testDoPostWithAnswerYes1() throws ServletException, IOException {
        Mockito.when(request.getParameter("answer")).thenReturn("yes1");
        Mockito.when(request.getRequestDispatcher("/WEB-INF/stepOne.jsp")).thenReturn(requestDispatcher);
        questServlet.doPost(request, response);
        Mockito.verify(requestDispatcher).forward(request, response);
    }
    @Test
    public void testDoPostWithAnswerYes2() throws ServletException, IOException {
        Mockito.when(request.getParameter("answer")).thenReturn("yes2");
        Mockito.when(request.getRequestDispatcher("/WEB-INF/stepTwo.jsp")).thenReturn(requestDispatcher);
        questServlet.doPost(request, response);
        Mockito.verify(requestDispatcher).forward(request, response);
    }
    @Test
    public void testDoPostWithAnswerYes3() throws ServletException, IOException {
        Mockito.when(request.getParameter("answer")).thenReturn("yes3");
        Mockito.when(request.getRequestDispatcher("/WEB-INF/stepThree.jsp")).thenReturn(requestDispatcher);
        questServlet.doPost(request, response);
        Mockito.verify(requestDispatcher).forward(request, response);
    }
    @Test
    public void testDoPostWithAnswerYes4() throws ServletException, IOException {
        Mockito.when(request.getParameter("answer")).thenReturn("yes4");
        Mockito.when(request.getRequestDispatcher("/WEB-INF/goodEnding.jsp")).thenReturn(requestDispatcher);
        questServlet.doPost(request, response);
        Mockito.verify(requestDispatcher).forward(request, response);
    }
}
