# 1. Tính đóng gói: Không cho những cái khác xài. 
    - private: Khi thuộc tính hoặc phương thức của đối tượng có từ khóa private thì thuộc tính hoặc phương thức đó không thể sử dụng bên ngoài đối tượng. (Chỉ có thể sử dụng được bên trong đối tượng).
    - public: Ở đâu cũng sử dụng được. 
    - proteced: Những thuộc tính hoặc phương thức mà có từ khóa này thì chỉ có những đối tượng con mới nhìn thấy được.(Chung package vẫn gọi được trong proteced)


    Khi nào xài private ở lớp con thì chỉ có thể dùng getter, setter.
    Xài proteced thì để cho con kế thừa thuộc tính. 
***Note:***
    - Có thể định nghĩa được nhiều phương thức khởi tạo cho đối tượng. 
    - OverLoading: Nhiều hàm có thể trùng tên nhưng khác nhau về số lượng tham số hoặc kiểu dữ liệu của tham số hoặc thứ tự tham số. 
    - Ưu tiên kế thừa với lớp cha gần nhất. 

    - Hàm gán giá trị: *setter*
        Nguyên tắc để ```public void setHoTen(String hoTen)```
    - Hàm dùng lấy giá trị thuộc tính: *getter*
            ```public int getTuoi()```
# 2. Tính kế thừa: Khi lớp con kế thừa thằng cha, thì mọi tính chất của thằng cha sẽ được con kế thừa. 

# 3. Tính trừu tượng
# 4. tính đa hình.