# 1. Tính đóng gói: Không cho những cái khác xài. 
    - private: Khi thuộc tính hoặc phương thức của đối tượng có từ khóa private
        thì thuộc tính hoặc phương thức đó không thể sử dụng bên ngoài đối tượng.
        (Chỉ có thể sử dụng được bên trong đối tượng).
    - public: Ở đâu cũng sử dụng được. 
    - proteced: Những thuộc tính hoặc phương thức mà có từ khóa này thì chỉ có những đối tượng con mới nhìn thấy được.(Chung package vẫn gọi được trong proteced)
    - default: Cùng packgae là xài được. 

    Khi xài private ở lớp con thì chỉ có thể dùng getter, setter.
    Xài proteced thì để cho con kế thừa thuộc tính. 
***Note:***

- ***OverLoading(Nạp chồng phương thức)***: Nhiều hàm có thể trùng tên nhưng khác nhau về số lượng tham số hoặc kiểu dữ liệu của tham số hoặc thứ tự tham số.
- ***Override(Annotation)*** : Ghi đè lại lớp cha.
-  "override" là  Khi một lớp con kế thừa từ một lớp cha, nó có khả năng "override" (ghi đè) các phương thức của lớp cha, nghĩa là định nghĩa lại phương thức đó trong lớp con với nội dung mới.

	  - Có thể định nghĩa được nhiều phương thức khởi tạo cho đối tượng. 
- 
	- Ưu tiên kế thừa với lớp cha gần nhất.
	- Hàm gán giá trị: *setter*
  Nguyên tắc để ```public void setHoTen(String hoTen)```
	- Hàm dùng lấy giá trị thuộc tính: *getter*
      ```public int getTuoi()```

# 2. Tính kế thừa: Khi class con kế thừa thằng cha, thì class con sẽ sở hưu tất cả thuộc tính và phương thức của class cha.  

# 3. Tính trừu tượng:(Abstract class)không khởi tạo được.

Abstract class và Class:
	- Giống: Xử lý logic code đc, kế thừa được.Vẫn sử dụng tính đa hình được. 
	- Khác: Abstract class ko khởi tạo được.

# 3.1. Interface (cũng là tính trừu tượng). Là nơi định nghĩa ra các hàm, Cho các class kế thừa.
	- thông qua từ khóa ***implements*** 
	- Khai báo biến được, nhưng nó là hằng số.  Không thể thay thế được. 
# 4. tính đa hình: Từ Class cha thì có thể sử dụng được phương thức khởi tạo của class con. 

	(có 2 loại: 1 chạy ở quá trình build code, và 1 loại chạy trong quá trình run time.)
		- Bị ràng buộc biến và kiểu dữ liệu. Nên chỉ có thể gọi các thuộc tính và phương thức của Cha.
		- Tính đa hình: Lớp cha khởi tạo bằng lớp con(Cha dùng phương thức khởi tạo của con). Nhưng lớp con ko khởi tạo về lớp cha.
		- Có hỗ trợ ép kiểu:
			HocSinh hocSinh = new HSLopPhoHocTap();
			hocSinh.hoTen = "Dang Trong Phuc";
			HSLopPhoHocTap lopPhoHocTap = (HSLopPhoHocTap) hocSinh;
***Note:***
	- đối tượng sẽ tìm và ưu tiên thực thi phương thức ở bên con (new) thì nó sẽ được thực thi. 
	  Kết quả chạy nó sẽ hiện thi chạy của Class cha trc, sau đó chạy tiếp hàm ở class con. 
	 
## ? Dùng Interface làm j:
	- Khi chỉ muốn thực hiện những cái hàm bên trong mà ko sử dụng các biến ở trong thì sử dụng interface. 
	- Giúp hạn chế phạm vi truy cập.