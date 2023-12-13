package com.dangphuc.demospringboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

// @Controller : Dùng để đánh dấu cho Spring Boot biết class này dùng để khai báo và định nghĩa đường dẫn.
// @RequestMapping: Định nghĩa đường dẫn.
/*
* Bước 1(*): Định nghĩa đường dẫn
* Bước 2(*): Nhận các tham số mà người dùng(client) truyền lên để đem đi xử lý (Request)
* Bước 3(*): Kết nối được cơ sở dữ liệu
* Bước 4: Thực thi các câu truy vấn liên quan tới yêu cầu của chức năng
* Bước 5: Trả kết quả ra giao diện
*
* */
@Controller
@RequestMapping("/hello")
public class HelloController {
//    TODO: Bước 2: Nhận các tham số mà người dùng(client) truyền lên để đem đi xử lý (Request)
    // Phương thức:
    //    TODO GET
    /**
     * - Đối với tên tham số đường dẫn nên viết thường toàn bộ.
     * - GET: Tham số sẽ được truyền trực tiếp trên đường dẫn(URL)
     *       - client: ?tên_tham_số = giá_trị_của_tham_số&tên_tham_số = giá_trị_của_tham_số
     *          + ví dụ: http://localhost:8080/hello?hoten=Nguyen Van A
     *       - server: quy định tham số @RequestParam kiểu_dữ_liệu tên_tham_số
     *       public String helloJava(@RequestParam(required = false) String loichao)
     *       (required = false là không bắt buộc có truyền tham số)
     *       @RequestParam("age") Integer tuoiNhanVien: "age" là tuoiNhanVien.
     *       - Nhược điểm:
     *             + Không bảo mật
     *             + Giới hạn kí tự truyền vào 2048
     *
     * - POST:  Tham số sẽ được truyền ngầm.
     *        - client: Phải truyền thông qua thẻ form hoặc tự code gọi đường dẫn với phương thức POST
     *        - server: quy định tham số @RequestParam kiểu_dữ_liệu tên_tham_số(Giống như GET)
     * */
    @GetMapping("/java")
    public String helloJava(@RequestParam(required = false) String loichao,@RequestParam Integer age){
    // Hàm helloJava sẽ xử lý logic code cho đường dẫn /hello/java
        System.out.println("kiem tra tham so: " + loichao + " tuoi nhan vien " + age);
        // Trả ra giao diện của file hello.html (được thymleaf hỗ trợ sẵn)
        return "hello";
    }

//    Tạo đường dẫn có tên là / máy tính với phương thức Get, yêu cầu người dùng truyền lên 2 tham số với tên tham số là soA và soB.
//    Thực hiện phép tính tổng với soA và soB.
    @GetMapping("/maytinh")
    public String maytinh(@RequestParam int soA,int soB)
    {
        int tong = soA + soB;
        System.out.println("tong hai tham so la: " + soA + " + " + soB + " = " + tong);
        return "hello";
    }
    // TODO  - POST
    @PostMapping("/welcome")
    public String welcome(@RequestParam(required = false) String username, @RequestParam(required = false) String password){
        System.out.println("Ten dang nhap: " + username + " Mat Khau " + password);
        return "welcome";
    }
//    TODO PathVariable
//     pathvariable {hello} là tham số truyền vào. Tham số đóng vai trò một đường dẫn.
    @GetMapping("/pathvariable/{hello}/{age}")
    public String pathVariable(@PathVariable String hello,@PathVariable int age){
        System.out.println("Kiem tra Path: " + hello);
        return "hello";
    }
}

