Cấu trúc các thư mục:
    - Static: chứa hình ảnh.
    - templates: chứa front-end
    - application.properties: file quy định config, khai báo các thông tin cấu hình cho thư viện sử dụng.
# 1. Buổi 2    
@Controller : Dùng để đánh dấu cho Spring Boot biết class này dùng để khai báo và định nghĩa đường dẫn.
    @RequestMapping: Định nghĩa đường dẫn.
    
    Bước 1: Định nghĩa đường dẫn
    Bước 2: Nhận các tham số mà người dùng(client) truyền lên để đem đi xử lý (Request)
    Bước 3: Kết nối được cơ sở dữ liệu
    Bước 4: Thực thi các câu truy vấn liên quan tới yêu cầu của chức năng
    Bước 5: Trả kết quả ra giao diện

    /** - GET: Tham số sẽ được truyền trực tiếp trên đường dẫn(URL)
     *       - client: ?tên_tham_số = giá_trị_của_tham_số&tên_tham_số = giá_trị_của_tham_số
     *          - ví dụ: http://localhost:8080/hello?hoten=Nguyen Van A
     *       - server: quy định tham số @RequestParam kiểu_dữ_liệu tên_tham_số
     *       
     *       
     *          
     * */