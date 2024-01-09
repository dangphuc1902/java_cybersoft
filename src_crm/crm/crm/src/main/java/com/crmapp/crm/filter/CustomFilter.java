package com.crmapp.crm.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Component;

import java.io.IOException;

public class CustomFilter implements Filter {
// Khai báo fileter
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
        System.out.println("Kiem tra filter: " );
        HttpServletRequest request =  (HttpServletRequest) servletRequest;  // Ep kieu HttpServletRequest moi co getSession
        // request: Client truyền vào server.
        HttpServletResponse response = (HttpServletResponse) servletResponse; //// Ep kieu HttpServletResponse moi co sendRedirect
        // response: server truyền vào Client.
        HttpSession session = request.getSession();     //Session tạo cookie là idsession.=> Lấy IDsesstion ở client. Yêu client dùng gửi lên server
        String path = request.getServletPath();
        if (session != null && session.getAttribute("email") != null && !session.getAttribute("email").equals("")) {
            response.sendRedirect("http://localhost:8080");
        }else {
            chain.doFilter(servletRequest,servletResponse);
        }
//        if (session != null && session.getAttribute("email") != null && !session.getAttribute("email").equals("")){
//            // Kiểm tra xem session có giá trị ,
//            if (path.equals("/login")){
//                response.sendRedirect("http://localhost:8080");
//            }else if(path.equals("/role")) {
//                chain.doFilter(servletRequest,servletResponse);
//            }
//
//        }else {
//            if (path.equals("/login")){
//                chain.doFilter(servletRequest,servletResponse);
//            }else if(path.equals("/role")) {
//                response.sendRedirect("http://localhost:8080/login");
//            }
//        }


//        Cho đi tiếp vào đường dẫn mà client đang gọi hoặc thoát khỏi filter và đi tiếp.
//        chain.doFilter(servletRequest,servletResponse);//        return null;
    }

}
