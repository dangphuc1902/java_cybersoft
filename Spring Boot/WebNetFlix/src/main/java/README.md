# SW Architecture/ Design Pattern
    - Kiến trúc SW(SW Architecture): định nghĩa về cấu trúc của SW, định nghĩa các phần tử tạo nên SW và các mối quan hệ của chúng.
    - Pattern: Một mẫu các sự kiện hoặc đối tượng định kì lặp lại theo cách có thể dự đoán được.
## 1.1. Mô hình kiến trúc phân cấp
    - Chia SW thành 3-4 layers với các vai trò khác nhau.
        + Presentation Layer
        + Sau đó Application Layer
        + Sau đó Business Layer
        + Sau đó Data Access Layer 
    - Thực hiện cuộc gọi giữa các tầng, gửi và nhận dữ liệu, cộng tác và cấu thành toàn bộ dịch vụ web.
        + trình duyệt cuối cùng. gửi yêu cầu
        + Lớp đầu nhận Presentation Layer:  Spring Controller @Controller
            - Nhận yêu cầu từ Client và ủy quyền xử lý cho Applicaition.
            - Kết quả của Appliction Layer được gửi đến Client cuối
        + Sau đó Application Layer  :@Service
            - Xử lý logic nghiệp vụ khác nhau các mục đích cụ thể. 
        + Sau đó Data Access Layer  : @Repository
            - Đóng vai trò truy cập Database để lưu trữ hoặc tìm kiếm dữ liệu.
        + Sau đó truy cập vào Database.
        + trả về dữ liệu và trả về Appliaction Layer
## 1.2. Spring Controller:
    -  Tương ứng với Presentation Layer.
    - Nhận yêu cầu từ khách hàng(trình duyệt web, ứng dụng di động)
    - Đóng vai trò đưa ra phản hồi cuối cùng cho khách hàng.
        + view : Trang web mà client nhìn thấy như là kết quả của một phần hối đáp với một yêu cầu.
        + data : Dữ liệu mà khách hàng nhận được dưới dạng phản hồi cho yêu cầu.
### 1.2.1 Controller Code
    - Annotation: Cách cung cấp thông tin bổ sung trong mã nguồn Java.
    - Bắt đầu bằng "@" và có thể gắn được vào các lớp, phương thức, biến thành viên, tham số, ...vv
    - 3 loại Annotation:
        + cung cấp thông tin cho trình biên dịch Java(để tìm error,..)
        + Được sử dụng bởi các công cụ SW để tạo mã hoặc thực hiện các tác vụ bổ sung.
             - Thực thi bằng 3 Annotation(Chú thích) cơ bản sau:
                + @Controller và @RestController
                    - Chỉ định một lớp hoạt động như một controller và định rõ nó ở đầu lớp.
                + @ RequestMapping
                    - chỉ định một phương thức xử lý một Request cụ thể hoặc chỉ định nó ở đầu lớp hoặc phương thức.
        + Thực thi b sung các hành động cụ thể trong run time.
### 1.2.2 @Controller and @ RestController:
    - Giống nhau thao tác:
        + Tiếp nhận, xử lý và phản hồi các yêu cầu.
    - Khác nhau hình thức:
        + Controller: Phản hồi view(html file,..)
        + RestController: Phản hồi data(String, Json, xml,...)
#### 1.2.2.1 Cách sử dụng @RestController:
    - Lớp được gắn trên đầu và không có value.
    vd:

```java
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping(value = "/hello")
    
    public String hello(){
        // kết quả trả về "hello" ở đây đại diện cho tên tệp view. 
        
        return "hello";
    }
}
```
### Các thư viện xây dựng web hoan chinh
	- web,
	- Spring Security
	- thymeleaf
	- mysql
### Các thư viện để xây dựng API
    - web
    - JWT -> Authen2, JWT
    - Spring Security
    - mysql, postgressql, oracal, sql

## 1.3. RequestMapping
### 1.3.1 URI(Uniform Resource Identifier)
    - Tên hoặc địa chỉ để truy cập 1 tài nguyên cụ thể:
        + https://www.google.com
### 1.3.2 Sử dụng URL:
    - URL được đặt tên theo loại tài nguyên được yêu cầu:
        + www.codepresso-blog.com/user
        + www.codepresso-blog.com/posts
        + www.codepresso-blog.com/reply
    - URL có thể được thể hiện trong mối quan hệ phân cấp và tách giữa các phân cấp bằng "/":
        + www.codepresso-blog.com/user/paid
        + www.codepresso-blog.com/user/enterprise
        + www.codepresso-bloh.com/user/enterprise/google
    - Các URL không được trùng nhau trong một ứng dụng web.
        Khi trùng lặp sẽ xảy ra error: Ambiguous mapping.
***Quy ước đặt tên:***

    - Sử dụng chữ thường
    - Viết tài nguyên bạn yêu cầu dưới dạng danh từ cho
    - Sử dụng '-' khi kết nối hai hoặc nhiều từ.
    - Sử dụng thống nhất tên và đặt tên có ý nghĩa.

### 1.3.3 Sử dụng @RequestMapping trong Controller Class.
    - Áp dụng đường dẫn cho tất cả các phương thức bên trong một lớp Controller cụ thể:
        + /user/paid
        + /user/enterprise
        + /user/administrator

### Point!
    - Spring Framework nhận ra @RequestMapping Annotation và quản lý các phương thức để xử lý các yêu cầu cụ thể.
    - Dựa trên thông tin đường dẫn URL theo sau 'miền mặc định/', yêu cầu của client sẽ được chuyển tiếp đến một phương thức cụ thể
    - @RequestMapping có thể được chỉ định trong lớp Controller và các phương thức bên trong lớp Controller.
    - URL là địa chỉ của tài nguyên và có thể được biểu thi dưới dạng phân cấp.

# 2.API(Application Programming Interface)
    - API là một phương pháp để chia sẻ thông tin giữa các máy tính(Chương trình)
        + API ở dạng gọi hàm hoặc phương thức.
        + API gọi tài nguyên từ xa thông qua mạng bằng công nghệ như HTTP 
## 2.1HTTP API vs REST API
    - API để chia sẽ dữ liệu từ xa sử dụng HTTP(s)
        +HTTP API
    - REST API(REpresentational State Transfer): 
        + Phong cách kiến trúc để chia sẻ dữ liệu hiêệu quả trên web.
        + phải thõa mãn điều kiện, khó thực hiện bằng cách thỏa mãn tất cả các điều kiện thực tế.
            - Hầu hết đều sử dụng API REST
    -@RestController Annotation chỉ định các lớp cho API REST và API HTTP
    -Các phương thức riêng lẻ với @RequestMapping
        trong lớp @RestController có thể được kết hợp thành một API REST và API HTTP

# 3.Giao tiếp REST API với Spring Boot Controller.
## 3.1.1 Client và Server:
    - Khi máy khách (client) yêu cầu máy chủ (Server)
    - Máy chủ xử lý yêu cầu và phản hồi với kết quả.
        + Chuỗi đơn giản, hình ảnh, video, trang HTML, ***JSON***

=> Khi Client(Web Browswer) gửi Yêu cầu (Request) tới Server.
Sau đó Server phản hồi kết quả (Response) (Chuỗi kí tự, Hình ảnh, video, HTML,Json) tới Client.

## 3.1.2 Spring Controller và Response Data
    - Controller Annotation phản hồi các chế độ xem(view) như file HTML
    - RestController Annotation phản hồi phương thức trả về giá trị chính nó.
        + Chuỗi đơn giản, JSON.
    - Phản hồi của RestController- Đối tượng.
        - Khi trả đối tượng về thì sẽ phản hồi dữ liệu ở dạng JSON.
- Đối tượng được trả về:
```java
public class UserDto{
    Integer id;
    String name;
    String email;
    List<String> specialties;
}
```
## 3.1.3 Dữ liệu JSON phản hồi:
```json
{
  "id": 1,
  "name": "jin",
  "email": "jin@codepresso.kr",
  "specialties": [ 
      "Java",
      "Spring Boot"
  ]
}
```
    - Giao diện người dùng nhận dữ liệu được định dạng JSON để phản hồi và định cấu hình màn hình.
    - Xác định trước dữ liệu JSON nào sẽ phản hồi cho từng API REST
***JSON(JavaScript Object Notation)***
    - JSON được sử dụng để trao đổi dữ liệu.
### 3.1.3.1 Cú pháp JSON:
    - Đối tượng JSON (Object) chứa dữ liệu "key":value là đơn vị cơ bản nhất.
        + Các đối tượng JSON bắt đầu và kết thúc bằng dấu ngoặc nhọn {}
        + Key được đặt trong dấu ngoặc kép ("")
        + phân tách giữa các "key":values bằng dấu phẩy(,)
    - Mảng JSON là một danh sách dữ liệu được sắp xếp theo thứ tự.
        - Thể hiện trong ngoặc vuông ([])
        - Mảng JSON có thể chứa nhiều kiểu dữ liệu khác nhau.
    - Chuỗi, Số, Boolean, null
        - Đối tượng JSON(Object), Mảng JSON(Array).
```json
{
  "name": "John",
  "age": 30,
  "cars": [
    {"name": "Ford","models": ["Fiesta","Focus"]},
    {"name": "BMW","models": ["320","X3","X5"]},
    {"name": "Fiat","models": ["500","Panda"]}
  ]
}
```
### Point!
    -  Máy chủ phản hồi kết quả sau khi xử lý thích hợp theo yêu cầu của máy khách.
    -  Máy chủ phản hồi với nhiều loại dữ liệu khác nhau như: HTML, chuỗi đơn giản, hình ảnh, JSON
    -  Trong Spring Boot, khi một đối tượng được trả về, nó sẽ được chuyển đổi thành định dạng JSON thích hợp và phản hồi cuối cùng sẽ được gửi tới máy khách.
    -  JSON là một định dạng Key/Value và cũng có thể biểu thị các đối tượng và mảng.

# Lưu ý(security).
    - @SpringBootApplication(exclude = SecurityAutoConfiguration.class)
        : Loại bỏ trang đăng nhập của Security.
# 3. HTTP Method.
    - HTTP chỉ định loại hành động sẽ được thực hiện trên một tài nguyên cụ thể.
        + Tạo tài nguyên, truy vấn, sửa đổi, xóa, sửa đổi một phần. 
    - Sử dụng HTTP Method, có thể xác định các hành vi khác nhau bằng URL.
    - Cung cấp khoảng 9 phương thức.
        + GET, POST, PUT, DELETE, PATCH,...
    - Phương thức HTTP được sử dụng chủ yếu:
        + GET(Truy vấn tài nguyên)
        + POST(Tạo tài nguyên)
        + PUT(Sửa đổi tài nguyên)
        + DELETE(Xóa tài nguyên)

    - 4 Thao tác cơ bản của DB: 
        Thao tác DataBase   Giải thích          URI       Phương thức HTTP đối xứng.
        + C - Create        Lưu data            /post        POST
        + R - Read          Tìm kiếm data       /post        GET
        + U - Update        Sửa data            /post        PUT, PATCH
        + D - Delete        Xóa data            /post        DELETE

## 3.1 Thực hiện HTTP Method
    - Chỉ định phương thức làm thành phần của @RequestMapping
        + Default là GET Method
    - Nên thiết kế từng phương thức Java để thực hiện xử lý tương ứng vs phương thức HTTP.

```java
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/post")
public class PostController {
    //    @RequestMapping(method = GET)
    @GetMapping
    public String getPost() {
        // Truy xuất dữ liệu trả về kq
        return "GET /post";
    }

    //    @RequestMapping(method = POST)
    @PostMapping
    public String savePost() {
        // Xử lý dữ liệu
        return "POST /post";
    }

    //    @RequestMapping(method = PUT)
    @PutMapping
    public String updatePost() {
        // Xử lý cập nhật.
        return "PUT /post";
    }
    
//    @RequestMapping(method = DELETE)
    @PutMapping
    public String deletePost() {
        // Xử lý xóa.
        return "DELETE /post";
    }
}
```
    - Trong Postman có cách gọi phương thức tương ứng GET/POST/PUT/DELETE.
### Point!
    - POST,GET,PUT, DELETE là 4 phương thức HTTP được sử dụng chủ yếu.
        + Tương ứng với các thao tác Create, Read, Update, Delete của DB.
    - Sử dụng HTTP Method, có thể thiết kế API REST thực hiện nhiều hành động khác nhau cho một URL
        + GET /post truy xuất một bài đăng.
        + POST /post lưu một bài đăng.
    => Trong Spring, Phương thức Java được gọi theo phương thức HTTP được xác định bởi phần tử RequestMapping hoặc Annotation như: GetMapping.

# 4.Hiểu về RequestBody.
## 4.1 Request Data: dữ liệu bổ sung mà máy khách gửi đến máy chủ khi yêu cầu.
    - Đã biết 2 cách truyền dữ liệu:
        + Query String
        + Path Parameter.
    -thường được sử dụng trong các phương thức POST, PUT để lưu và sửa đổi dữ liệu.
        + GET, DELETE chủ yếu được sử dụng cho Query String và Path Param.
    
    - Dữ liệu ở dạng khác nhau có thể truyền được trong phần Request Body bằng kiểu dữ liệu JSON
    
## 4.2 Sử dụng Request Body
    - Gửi dữ liệu JSON dưới dạng Request Body trong Postman
        + Cần gửi qua phương thức POST sau đó chỉ định URI
    - Trong phần Body chọn loại ***raw*** và chọn JSON(application/json)

```java
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

//@PostMapping
//public String savePost(@RequestBody PostDto postDto){
//    System.out.print(postDto.getId());
//    System.out.print(postDto.getTitle());
//    System.out.print(postDto.getContent());
//    System.out.print(postDto.getUsername());
//    return "POST /post";
//}
        
public  class  PostDto{
    Integer id;
    String title;
    String content;
    String username;
    
}
```

# 5. Sử dụng tài liệu "REST API".
    - API là các phương thức/ giao ước để gửi và nhận thông tin.
    - Tài liệu chỉ định thông tin API REST sẽ được gọi từ giao diện người dùng.
        + được thiết kế bởi dev Front End được dẫn dắt bởi các nhà phát triển Back-end(Back-end tạo ra API).
## 5.1 Thông tin mà tài liệu API REST cần có:
    - Mô tả REST API
    - URI
    - HTTP Method
    - Tham số yêu cầu(tham số bắt buộc và tham số tùy chọn)
    - Dữ liệu phản hồi(dữ liệu phản hồi bắt buộc và dữ liệu phản hồi tùy chọn)
    - Các mã lỗi có thể xảy ra và caách xử lý lỗi.
    - Ví dụ về gọi API.

## 5.2 Sử dụng tài liệu API REST
    - Dev Back-end có thể viết các tài liệu API REST cho client, ví dụ như Front end
    
# 6. Service Spring Boot và cơ chế tiêm phụ thuộc.
## 6.1  Spring Service: Lớp thực hiện logic nghiệp vụ cốt lõi của hệ thống. 
	- Trong mô hình: Spring Boot Application:
        + Application Layer(@Service): Xử lý logic nghiệp vụ khác nhau cho các mục đích cụ thể.
    - Sử dng @Service Annotation trong lớp
    - Thực hiện xác thực dữ liệu truyền dưới dạng tham số.
    - Truy cập cơ sở dữ liệu bằng tầng Reponsitory
        + Một phương thức duy nhất trong tầng Services trở thành đơn vị giao dịch, 
    - Tạo và hiện thực các lớp cho từng khu vực cụ thể của ứng dụng (User, Post,...)
    - Việc sử dụng các giao diện được khuyến nghị, nhưng có thể không sử dụng nếu không có yêu cầu mở rộng chức năng sử dụng tính đa hình.
## Thực hiện Service:
    - Tạo và triển khai các lớp cho từng khu vực cụ thể của ứng dụng.Chia nhỏ chức năng cụ thể.
    - Client(1)    @Controller(2):               @Service(3)                    @Reponsitory(4)
                + (1)UserController(1)           (2)UserService(1.1,1.2)         (3)UserRepository
                + (1)PostController(2)           (2)PostService(1.2,- 2.3)       (3)PostReponsitory
                + (1)ReplyController(3)          (2)ReplyService(1.3,2.2)        (3)ReplyReponsitory
                + (1)SearchController(4)         (2)SearchService(1.4)           (3)SearchRepository
    - Tạo một lớp mới trong gói Service

```java
import org.springframework.stereotype.Service;

@Service
public class PostService{
    
    public void getPost(int id){
        System.out.println("find post data from database by " + id);
        System.out.println("validate data from database");
        System.out.println("process data if necessary");
    }
}
```

```java
import com.dtp.WebNetFlix.controllertest.dto.PostDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/post")
public class PostController {
    // Tạo đối postService  của lớp PostService.
    public PostService postService = new PostService();
     // 
    @GetMapping
    public PostDto getPost(@RequestParam int id){
        PostDto result = postService.getPost(id);
        return result;
    }
}
```
    - Kiểm tra nhất ký bảng điều khiển sau khi gọi GET /post?id=1

## 6.2 Spring Bean và Dependency(Tính phụ thuộc)
### 6.2.1 Cách sử dụng và tính phụ thuộc của đối tượng.
    - Tính phụ thuộc Dependency:
        + Khi một mô-dun(lớp, gói,...) sử dụng mô-đun khác
            + vd: Class PostController phụ thuộc vào lớp PostService.
### 6.2.2 Cách sử dụng và tính phụ thuộc của đối tượng.
    - Thông thường, để sử dụng các chức năng của một đối tượng khác:
        + Cần tạo một đối tượng bằng "new" trong một biến thành viên và tham chiếu đến nó.
    - Gọi phương thức của đối tượng đã tạo.
    - Chỉ định trong mã đối tượng nào sẽ tạo và sử dụng.
        + phụ thuộc compile-time(biên dịch) được tạo.
### 6.2.3 DI(Dependency Injection)
    - DI là quá trình tạo đối tượng được thực hiện bởi bên ngoài.
    - Thiết lập phụ thuộc(tham chiếu) của đối tượng cần sử dụng được thực hiện bởi bên ngoài.
    - Triển khai hàm tạo sau khi chỉ khai báo các biến thành viên của lớp (interface) sẽ được sử dụng.
        + các đối tượng không thể dược tạo trực tiếp với từ khóa new.

# 7.Maven
    - Công cụ tự động hóa xây dựng được sử dụng trong dự án Java
        + Quá trình biên dịch mã nguồn thành phần mềm có thể chạy được.
    - 2 Chức năng chính của Maven
        + Quản lý cấu trúc và xây dựng dự án
        + Quản lý phụ thuộc thư viện.
## 7.1 Quản lý phụ thuộc thư viện Maven
    - Nếu chỉ định thông tin thư viện bên ngoài, nó sẽ tự động tải xuống và sử dụng
        + Không cần thiết phải tải xuống và cài đặt từng thư viện mà nhà phát triển cần.
        + Cài đặt thông tin thư viện sử dụng trong phần dependencies của file pom.xml
    - Cần phải đắng ký thư viện được sử dụng trong Maven Reponsitory.
        + Maven Central Repository: Repository trung tâm được quản lý bơi Maven
    
# 8. Data Access Layer
