package com.example.tutor.servlet;

import com.example.tutor.model.GiangVien;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import lombok.SneakyThrows;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "HomeServlet", value = {"/giang-vien/hien-thi"
    ,"/giang-vien/search" // get
        ,"/giang-vien/remove"
        ,"/giang-vien/detail"
        ,"/giang-vien/view-update"
        ,"/giang-vien/update"
        ,"/giang-vien/add"
        ,"/giang-vien/view-add"
        ,"/giang-vien/giang-vien-nu"

})
public class HomeServlet extends HttpServlet {
    private List<GiangVien> list = new ArrayList<>();

    public HomeServlet() {
        list.add(new GiangVien("1","GV01", "Nguyen Van A",18, true, "Ha Noi"));
        list.add(new GiangVien("2","GV02", "Nguyen Van B",18, false, "Ha Noi"));
        list.add(new GiangVien("3","GV03", "Nguyen Van C",18, true, "Ha Noi"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.contains("hien-thi")){
            //Day la hien thi
            this.hienThi(request, response);
        }else if(uri.contains("search")){
            this.search(request, response);
        }else if(uri.contains("remove")){
            this.remove(request, response);

        }else if(uri.contains("view-add")){

            this.viewAdd(request, response);
        }else if(uri.contains("detail")){
            this.detail(request, response);
        }else if(uri.contains("view-update")){
            this.viewUpdate(request, response);
        }else if(uri.contains("giang-vien-nu")){

        }
    }

    private void viewUpdate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void detail(HttpServletRequest request, HttpServletResponse response) {
    }

    private void search(HttpServletRequest request, HttpServletResponse response) {
    }

    private void remove(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        for (int i = 0 ; i < list.size(); i++){
            if(list.get(i).getId().equalsIgnoreCase(id)){
                list.remove(i);
            }
        }
        response.sendRedirect("/giang-vien/hien-thi");
    }

    private void viewAdd(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/giangvien/add.jsp").forward(request, response);

    }

    private void hienThi(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("list", list);
        request.getRequestDispatcher("/giangvien/giangVien.jsp").forward(request, response);
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if(uri.contains("add")){
            this.add(request, response);
            //Day la hien thi
        }else{
            this.update(request, response);
        }
    }

    private void update(HttpServletRequest request, HttpServletResponse response) {
    }

    private void add(HttpServletRequest request, HttpServletResponse response) throws InvocationTargetException, IllegalAccessException, IOException {
        GiangVien gv = new GiangVien();
        BeanUtils.populate(gv, request.getParameterMap()); // lay gia tri cua cac o input map vao doi tuong
        list.add(gv);
        response.sendRedirect("/giang-vien/hien-thi");
    }
}
