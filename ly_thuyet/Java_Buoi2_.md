# Các bộ định dạng có sẵn trong Printf:

    %c: Ký tự
    %d: Số thập phân (số nguyên) (cơ số 10)
    %e: Dấu phẩy động theo cấp số nhân
    %f: Dấu phẩy động
    %i: Số nguyên (cơ sở 10)
    %o: Số bát phân (cơ sở 8)
    %s: Chuỗi
    %u: Số thập phân (số nguyên) không dấu
    %x: Số trong hệ thập lục phân (cơ sở 16)
    %t: Định dạng ngày / giờ
    %%: Dấu phần trăm
    \%: Dấu phần trăm

# Môi trường đặc trưng về Java:
    - Java Virtual Machine (JVM): Nó chạy trên trình duyệt web để mình thấy.
    - Java Runtime Enviroment (JRE): Môi trường để chạy ngôn ngữ Java.  + Libraties and classes
    - Java Development Kit(JDK) + Developement tools    : Bộ công cụ giúp phát triển ngôn ngữ Java: Gồm JRE và JVM. 
# Note buổi 2:
## Quy trình phát triển ứng dụng:   
    - Lấy yêu cầu khách hàng.   => BA
    - Phân tích yêu cầu.        => BA
    - Thiết kế giao diện        => Disgner
    - Phát triển ứng dụng       => Developer
    - Kiểm thử                  => Tester
    - Triển khai cho khách hàng.=> Devops

1. Đặt tên file:
    - Chỉ viết thường, Không để số trước. chỉ được sử dụng gạch _.
    - File chứa hàm *Main*: viết hoa chữ cái đầu. 

2. Quy tắc code:
    - Chạy từ trên xuống.
    - Từ trái qua phải.


3. Biến và kiểu dữ liệu:
    - Biến là nơi lưu trữ giá trị. 
        - Lưu trữ biến trên thanh ram (bộ nhớ).
        *Cú pháp: Kiểu dữ liệu tên biến = giá trị*
        Ex: int soA = 5;

        ***Lưu ý: Tên biến phải đặt theo nguyên tắc: chữ đầu là viết thường còn sau viết hoa chữ cái đầu.***

    - Kiểu dữ liệu:
        - Nguyên thủy: boolean, char, interger(byte,short, int, long), Float(float,double)
            // Đối với kiểu số thì có thể thực hiện được các phép tính toán: +, - , *, /, %(chia lấy phần dư)
            - Viết thường hết. 

        - Tham chiếu: Array, class, interface, string, enum. 
***            - Luôn viết hoa chữ cái đầu.  ***

        <!-- char kiTu = 'a';
		String loiChao = "Hello Java script"; -->
        * kiểu tham chiếu String sẽ dùng " " *

########################################################################################################################

Buổi 3: Bài tập: 

# Ép kiểu:
Đưa 5.555 về kiểu in. soA sẽ là 5
    int soA = (int) 5.555

Số mũ:
    Math.pow(2, 2);

Formatter:
		DecimalFormat formatter = new DecimalFormat("###,###,###.000");
