package com.quest;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class RestartServletTest {

    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher requestDispatcher;
    private RestartServlet servlet;
    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        servlet = new RestartServlet();
    }

    @Test
    public void testDoPostWithValidAnswer() throws Exception {
        Mockito.when(request.getParameter("answer")).thenReturn("yes5");
        Mockito.when(request.getRequestDispatcher("/index.jsp")).thenReturn(requestDispatcher);
        servlet.doPost(request, response);
        Mockito.verify(request).setCharacterEncoding("UTF-8");
        Mockito.verify(response).setCharacterEncoding("UTF-8");
        Mockito.verify(request).getParameter("answer");
        Mockito.verify(requestDispatcher).forward(request, response);

    }
}
