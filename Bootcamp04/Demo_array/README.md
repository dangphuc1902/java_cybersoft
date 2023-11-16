# ArrayList
	1. Cho phép add động số lượng phần tử .
	2. Add được, Xóa được. 
Khai báo: 
	 ArrayList<SinhVien> listSV = new ArrayList<SinhVien>()
	 
## Docker.

	[web install Images: https://hub.docker.com/]
	1. App/ Container:
	2. Images: File cài đặt. 
	3. Volumes:	Ổ đĩa. 
	4. Install mysql:(https://hub.docker.com/_/mysql)
	5. key
	 Tải ứng dụng (image) trên docker hub
		$ docker pull tên_image:verson	
	
	$ ***docker run --name*** some-mysql ***-e*** MYSQL_ROOT_PASSWORD=my-secret-pw ***-d*** mysql:tag
		
		Chạy ứng dụng:
		-- name: đặt tên cho nó.some-mysql: tên của nó.
		- e: Biến môi trường dùng để thay đổi thông tin cấu hình mặc định của ứng dụng. 
		-d : detach không chiếm màn hình terminal.
		-p port_publish:port_private: Ánh xạ port cho những ứng dụng bên ngoài kết nối được các ứng dụng bên trong docker. 
		
	Khái niệm (RDBMS):
		Ám chỉ những cơ sở dữ liệu như Orcal, mysql,sql. 
		
### Cơ sở dữ liệu mysql: nơi lưu trữ dữ liệu. 
Private Port: Port ở trong docker
Publish Port: Port bên ngoài máy thật. 
	- xóa mysql đó, sau đó vào terminal add port public:
	$ docker run --name mysql04 -p  3307:3306 -e MYSQL_ROOT_PASSWORD=admin123 -d mysql:latest
	

Localhost: đại diện cho địa chỉ ip. 
Localhost:3306		// 3306 là port.  Port đại diện cho ứng dụng muốn sử dụng. 


##DBevae:

- lệnh tạo database.
CREATE DATABASE vnexpress;