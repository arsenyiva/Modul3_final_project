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

public class GoodEndingFinalServletTest {
    @Mock
    private HttpServletRequest request;
    @Mock
    private HttpServletResponse response;
    @Mock
    private RequestDispatcher requestDispatcher;
    private GoodEndingFinalServlet servlet;

    @BeforeEach
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        servlet = new GoodEndingFinalServlet();
    }

    @Test
    public void testDoPost() throws ServletException, IOException {
        Mockito.when(request.getRequestDispatcher("/WEB-INF/goodEnding.jsp")).thenReturn(requestDispatcher);
        servlet.doPost(request, response);
        Mockito.verify(request).setCharacterEncoding("UTF-8");
        Mockito.verify(response).setCharacterEncoding("UTF-8");
        Mockito.verify(requestDispatcher).forward(request, response);
    }
}
