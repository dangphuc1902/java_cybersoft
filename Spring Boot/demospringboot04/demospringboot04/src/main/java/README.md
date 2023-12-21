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
     * */

# 4 Cách để đưa class khởi tạo sẵn giá trị lưu trữ trên IOC
    - @Bean:  để tạo class gán sẵn giá trị thì sử dụng function có giá trị trả về là một class.
    - @Component
    - @Service
    - @Repository

        - Query Creation là một cơ chế cho phép tạo ra các câu query theo tên
    method trong Spring Data JPA(Giống Select )
        Lấy một Student theo thuộc tính Name.
            public Student findFirstByName(String name);
        Đếm số Student theo thuộc tính Age.
            public Integer countByAge(int age);
        Lấy danh sách Student theo thuộc tính Name và Email.
            public List<Student> findByNameAndEmail(String name, String email);


    - Giúp giải quyết vấn đề khi thay đổi Database vd từ mysql sang orcle thì ko cần thay đổi câu truy vấn


# Các bước Làm dự án:
    - Bước 1: Phân tích dự án.
          tạo cơ sở dữ liệu
    - Bước 2: Tạo project. Cấu hình database. Chạy demo.
    - Bước 3: Cấu hình src(html để templates, còn lại để statis)
    - Bước 4: Xài Entity để Mapping.(Khi chưa quen làm tới đâu map tới đó. Thường Map hết)
# Lưu ý:
    - Khi FE và BE cùng src thì cần 1 phương thức get để hiện thị giao diện.
    - Và cần 1 phương thức post lấy tham số.
## Lưu ý về quan hệ:
    - quan hệ 1 vs 1:
        1 dữ liệu bên này sẽ lấy được 1 dòng dữ liệu bên kìa.
        Khóa chính và khóa ngoại cùng là 1. Khóa chính không tự động tăng.
    - quan hệ 1 vs nhiều
        1 dữ liệu bên này sẽ lấy được nhiều dòng dữ liệu bên kia
            Bên nào nhiều sẽ giữ khóa ngoại.
# Nguyên tắc Mapping khóa ngoại trong Entity:
    - Bước 1: Xem khóa chính 2 bảng đang quan hệ với nhau có phải là tự động tăng hay không. Nếu tự động tăng thì không là OneToOne mà là => OneToMany
    - Bước 2: Nếu khóa chính không tự động tăng và vừa là khóa chính và khóa ngoại => OneToOne.
    (Không map quan hệ cũng được. Nhưng để tận dụng lợi thế của JPA trong spring boot JPA thì sẽ giúp map bảng khi có giữ khóa ngoại)

## (*) Cách map:    Entity nào giữ khóa ngoại thì sẽ có 2 Annotation sau đây:
    -  @ManyToOne và @JoinColumn
    Bảng được tham chiếu khóa ngoại sẽ map ngược lại
    - @OneToMany

# Các bước cần làm cho một chức năng dự án
    - Bước 1: Phân tích chức năng đó và kết quả mình mong muốn là gì
    - Bước 2: Xác định được câu truy vấn (query) giành cho chức năng đó.(Khi xác định được câu truy vấn thì mới xác định được có truyền tham số vào đường dẫn không)
    - Bước 3: Từ câu truy vấn sẽ xác định được đường dẫn có nhận tham số hay không và số lượng tham số là bao nhiêu.
