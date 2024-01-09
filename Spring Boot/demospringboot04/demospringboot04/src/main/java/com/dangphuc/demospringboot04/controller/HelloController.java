package com.dangphuc.demospringboot04.controller;

import com.dangphuc.demospringboot04.entity.Demo_Entity;
import com.dangphuc.demospringboot04.entity.Employees_Entity;
import com.dangphuc.demospringboot04.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
     * - POST:  Tham số sẽ được truyền ngầm.(qua thẻ form(html))
     *        - client: Phải truyền thông qua thẻ form(html) hoặc tự code gọi đường dẫn với phương thức POST
     *        - server: quy định tham số @RequestParam kiểu_dữ_liệu tên_tham_số(Giống như GET)
     * - PastVeriable:
     * //    TODO PathVariable
     * //     pathvariable {hello} là tham số truyền vào. Tham số đóng vai trò một đường dẫn.
     *     @GetMapping("/pathvariable/{hello}/{age}")
     *     public String pathVariable(@PathVariable String hello,@PathVariable int age){
     *         System.out.println("Kiem tra Path: " + hello);
     *         return "hello";
     *     }
     * */
   @Autowired      // Tìm class mà lưu trữ IOC
   @Qualifier() // Lấy Class có tên beamn là demo2 trên IOC
   private Demo_Entity demoEntity;

   @Autowired
   private EmployeeRepository employeeRepository;

   @GetMapping("")
   public String hello(){
       List<Employees_Entity> list = employeeRepository.findByEmployeNameAndAndSalary("John Doe",60000 );
//            findAll(): Hàm hỗ trợ sẵn lấy toàn bộ cơ sở dữ liệu.
       for (Employees_Entity data : list){
           System.out.println("Kiem tra " + data.getEmployeName());
       }
       return "hello";
   }


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
    // pathvariable {hello} là tham số truyền vào. Tham số đóng vai trò một đường dẫn.
   @GetMapping("/pathvariable/{hello}/{age}")
   public String pathVariable(@PathVariable String hello,@PathVariable int age){
       System.out.println("Kiem tra Path: " + hello);
       return "hello";
   }
// TODO    4 Cách để đưa class khởi tạo sẵn giá trị lưu trữ trên IOC(Container dùng chung. lưu trong ứng dụng.)
//     - Khi muốn lấy trên IOC thì sử dụng Autowried
//    - @Bean: để tạo class gán sẵn giá trị thì sử dụng function có giá trị trả về là một class.
//            + Khi sử dụng tham số thì spring boot sẽ tìm kiểu dữ liệu của tham số khai báo trong IOC
//    - @Component
//    - @Service
//    - @Repository: Tương tác cơ sở dữ liệu
}

