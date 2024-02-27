-- lệnh tạo database.
CREATE DATABASE vnexpress;
-- Chỉ định cơ sở dữ liệu sẽ sử dụng. 
USE vnexpress;
-- Tạo bảng để lưu trữ dữ liệu.
-- Làm java tên bảng viết thường hết. 
CREATE TABLE baiviet(
-- ten cot1 kieudulieu(size)
id int auto_increment,
-- auto_increment: Tự động tăng. 
hinh_anh varchar(255),
	tieu_de varchar(255),
	noi_dung text,
	primary key(id,hinh_anh)
-- Khóa chính
);
-- thêm dữ liệu vào bảng.
-- VALUES: Sẽ đi theo thứ tự ở INSERT INTO. 
INSERT INTO
	baiviet (hinh_anh,
	tieu_de,
	noi_dung)
VALUES('hinha.jpg',
'Giá xăng lên sát 24.000 đồng một lít',
'Mỗi lít xăng tăng 250-410 đồng, còn dầu giảm 370-540 đồng, từ 15h hôm nay.');

INSERT INTO	baiviet (hinh_anh,tieu_de,noi_dung)
VALUES('hinhb.jpg',
'Màn sương bí mật bao phủ chiến dịch tấn công Gaza của Israel',
'Quân đội Israel đang đưa quân tiến sâu hơn và giao tranh dữ dội hơn ở Dải Gaza, nhưng mọi thông tin chỉ được công bố nhỏ giọt và chìm dưới màn sương bí mật.');
-- xóa dữ liệu:
-- xóa dữ liệu từ bảng bài viết với điều kiện nội dung lưu trữ trong bảng bài viết bằng nội dung so sánh thì xóa.
-- xóa bằng cột dữ liệu bất cứ hình nào. 
DELETE
FROM
	baiviet
WHERE
	tieu_de = 'Giá xăng lên sát 24.000 đồng một lít';

DELETE FROM	baiviet WHERE id = 1;
-- Khóa chính: Dữ liệu sẽ là duy nhất không được phép thêm trùng dữ liệu. 
-- 1 bảng chỉ được 1 phép là 1 khóa chính. 
-- Khi 1 trong 2 cột đóng vai trò khóa chính khác thì vẫn được thêm vào database.Nghĩa là 2 khóa chính phải trùng thì mới  
-- Cú pháp:		Primary key(tên_cột_đóng_vai_trò_là_Khóa_Chính.)
-- id int,;
-- primary key(id)
-- xóa bảng:
DROP TABLE baiviet;
-- Cập nhật dữ liệu:
UPDATE	baiviet SET hinh_anh = 'hinhc.jpg' WHERE id = 4;

UPDATE	baiviet SET hinh_anh = 'hinha.jpg' WHERE id = 2;
-- Lấy dữ liệu của bảng chỉ định. 
-- Câu truy vấn dữ liệu: SELECT * 
SELECT	*
FROM baiviet
	-- WHERE id = 4;
-- ======================================
-- PHÂN TÍCH DỰ ÁN CRM.
CREATE TABLE users(
	id int auto_increment,
	email varchar(50),
	mota varchar(250),
	
	primary key(id)
);

CREATE TABLE members(
)

	
