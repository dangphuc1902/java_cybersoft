package com.crmapp.crm.controller;

import com.crmapp.crm.Entity.UsersEntity;
import com.crmapp.crm.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private UserRespository userRespository;
    public boolean authenticate(String email, String password) {
        // Tìm người dùng có email và mật khẩu tương ứng
        List<UsersEntity> listUser = userRespository.findByEmailAndPassword(email, password);

        // Nếu tìm thấy ít nhất một người dùng, trả về true
        return !listUser.isEmpty();
    }

    @GetMapping("")
    public String login(){
        List<UsersEntity> list = userRespository.findByEmailAndPassword("nguyenvana@gmail.com","123456");
        for (UsersEntity item : list){
            System.out.println("Kiemtra " + item.getEmail());
        }
        return "login";
    }
@PostMapping("")
public String progressLogin(@RequestParam(value = "error", required = false) String error,
                            @RequestParam(value = "email", required = false) String email,
                            @RequestParam(required = false) String password,
                            Model model) {
    /*
     * Hoàn thiện chức năng login:
     * Bước 1: Thế tham số người dùng tuyền vào hàm findByEmailANdPassword
     * Bước 2: Kiếm tra xem List có dữ liệu hay không?
     * Bước 3: Nếu có thì chuyển qua trang DashBoard(Tạo Link trang Dashboard/ Sử dng page index.html)
     * Bước 4: Nếu thất bài thì xuất thông báo "Đăng nhập thất bại" ra màn hình login
     * Lưu ý: Phương thc Post => Chỉnh form data bên giao diện login
     * */
    // If the user list is empty (there are matching users), redirect to the Dashboard page
    List<UsersEntity> listUser = userRespository.findByEmailAndPassword(email, password);
    if (!listUser.isEmpty()) {
        for(UsersEntity list : listUser){
            System.out.println("Kiemtra " + list.getEmail());
            System.out.println("Kiemtra " + list.getPassword());
        }
        return "index";
    } else {
        // If there are no matching users or an error, display a login failure message
        model.addAttribute("error", "Đăng nhập thất bại, vui lòng thử lại!");
        return "login";
    }
}


}



