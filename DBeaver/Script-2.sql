CREATE DATABASE qlphim;
USE qlphim;
CREATE TABLE phim(
	ten_phim varchar(255),
	ma_phim int auto_increment,
	hinh_anh varchar(255),
	mo_ta varchar(10000),
	ngay_chieu datetime,
	danh_gia int(5),
	ma_quoc_gia int,
	ma_the_loai int,
	primary key(ma_phim)

);
CREATE TABLE quoc_gia(
	ma_quoc_gia int auto_increment,
	ten_quoc_gia varchar(255),
	
	primary key(ma_quoc_gia)
);

CREATE TABLE the_loai(
	ma_the_loai int auto_increment,
	ten_the_loai varchar(255),
	
	primary key(ma_the_loai)
);
-- Lệnh chỉnh sửa bảng: ALTER TABLE ten_bảng_cần_chỉnh_sửa. 
-- Tạo khóa ngoại: 
	
	-- 	constraint FK_ma_quoc_gia_phim foreign key(ma_quoc_gia) references quoc_gia(ma_quoc_gia)
	-- quy tắc đặt tên khóa ngoại: FK_tênCot_TeenBang;
	-- Dùng lệnh chỉnh sửa bảng để tạo khóa ngoại. 
	-- Có thể không thêm dữ liệu, nhưng nếu thêm thì dữ liệu phải tồn tại ở bảng cột khóa ngoại tham chiếu tới.
	-- Không thể xóa dữ liệu của bảng mà khóa ngoại tham chiếu tới nếu dữ liệu đó tồn tại ở bảng định nghĩa khóa ngoại. Tính toàn vẹn của mặt dữ liệu.
	
ALTER TABLE phim ADD constraint FK_ma_quoc_gia_phim foreign key(ma_quoc_gia) references quoc_gia(ma_quoc_gia);	-- references: tham chiếu tới bảng quoc_gia.
ALTER TABLE phim ADD constraint FK_ma_the_loai_phim foreign key(ma_the_loai) references the_loai(ma_the_loai);	-- references: tham chiếu tới bảng quoc_gia.




-- INSERT INTO phim(ten_phim,hinh_anh,mo_ta,ngay_chieu,danh_gia)
-- VALUES('Đất rừng phương nam','hinha.jpg','phim về lịch sử phương nam.','2023-1-10',5);
-- INSERT INTO phim(ten_phim,hinh_anh,mo_ta,ngay_chieu,danh_gia)
-- VALUES('Nhà bà nữ','hinhb.jpg','phim do tran thanh dao dien.','2022-1-10',5);

INSERT INTO quoc_gia(ten_quoc_gia)VALUES('Viet Nam');
INSERT INTO quoc_gia(ten_quoc_gia)VALUES('America');
DELETE FROM quoc_gia WHERE ma_quoc_gia  = 1;

INSERT INTO phim(ten_phim,ma_quoc_gia) VALUES ('Dat rung phuong nam',3);
INSERT INTO phim(ten_phim,ma_quoc_gia) VALUES ('Captain America',2);
INSERT INTO phim(ten_phim,ma_quoc_gia) VALUES ('The Flash', 2);
INSERT INTO phim(ten_phim,ma_quoc_gia) VALUES ('Nguoi Vo Cuoi Cung', 3);

INSERT INTO the_loai (ten_the_loai) VALUES ('Phim lịch sử');
-- không Thêm dữ liệu vào khóa ngoại vẫn được.

SELECT * 
FROM quoc_gia q; 	-- Alias: q Tên gọi thay thế.
SELECT *
FROM phim p ;		-- Alias: p Tên gọi thay thế.

-- Liên kết dữ liệu của 2 hoặc nhiều bảng.
-- Cách 1: Phép tích (Cách sinh viên).

SELECT * 
FROM phim p ,quoc_gia qg 	-- nhan dữ liệu 2 bảng đó với nhau.
WHERE p.ma_quoc_gia = qg.ma_quoc_gia;




-- Cách 2: Phép Join.

-- 1. INNER JOIN
SELECT * FROM phim p , quoc_gia qg ,the_loai tl JOIN quoc_gia qg2 ON p.ma = q ;
-- 2. LEFT JOIN : Toàn bộ dữ liệu bên trái và trùng,     
SELECT * FROM phim p JOIN quoc_gia qg ON p.ma_quoc_gia  = qg.ma_quoc_gia ;
-- JOIN quoc_gia qg2 ON p.ma_quoc_gia == qg.ma_quoc_gia ;

SELECT * FROM phim p LEFT JOIN quoc_gia qg ON p.ma_quoc_gia  = qg.ma_quoc_gia ;

DELETE FROM quoc_gia q WHERE q.ma_quoc_gia  = 1;
DELETE FROM phim p WHERE p.ma_quoc_gia = 1;

 	
----	Sắp xếp dữ liệu.

SELECT * FROM phim p 
ORDER BY p.ten_phim ASC 
LIMIT 3, 4; -- a:Vị trí bắt đầu đếm lên bao nhiêu dòng. 	Số b: Vị trí này là số dòng lấy ra được.  
-- LIMIT: Giới hạn dữ liệu từ 0 - 2.Từ vị trí số 0 lấy ra 2 dòng. VÍ dụ muốn lấy 3 và 4 thì vị trí bắt đầu sẽ là 2 và lấy 2 dòng. 
-- Không có vị trí bắt đầu thì sẽ mặc định là 2.
-- ASC: ODER BY sắp xếp theo thứ tự tăng dần a-z
-- DESC: ODER BY sắp xếp theo thứ tự giảm dần z-a.


----- GROUP BY.
-- Đếm xem các quốc gia có bao nhiêu bộ phim.
SELECT COUNT(p.ma_quoc_gia) soluong, qg.ten_quoc_gia  FROM phim p 
JOIN quoc_gia qg ON qg.ma_quoc_gia = p.ma_quoc_gia
GROUP BY p.ma_quoc_gia,qg.ten_quoc_gia
HAVING soluong >= 2;
-- Không sử dụng chung với slect *. Phải chỉ định cột .
-- Gom các dữ liệu giống nhau thành 1 dữ liệu .	
-- Khi Group dữ liệu có từ 2 cột thì tất cả các dữ liệu của các cột phải trùng nhau thì nó mới gom nhóm. Nó ở điều kiện AND.
-- Khi SELECT cột nào thì phải để vào GROUP BY tất cả các bảng.
-- ? Sự khác biệt WHERE với HAVING như thế nào, 
-- WHERE: Trong quá trình tìm kiếm dữ liệu thì của bảng thì xét điều kiện thõa với WHERE thì lấy.
-- HAVING: Sau khi truy vấn ra kết quả thì lọc tiếp trên kết quả đã trả ra trước đó.
-- Xài cả 2 cũng được. 




-- =========================
CREATE DATABASE cybersoft_shop;
USE cybersoft_shop;

CREATE TABLE san_pham(
	ma_san_pham int auto_increment,
	ten_san_pham varchar(255),
	gia_ban Decimal(10,2),
	mo_ta varchar(500),
	ma_loai_san_pham int,	
	
	primary key(ma_san_pham)
);
CREATE TABLE sanpham_hoadon(
	gia_ban Decimal(10,2),
	so_luong int,
	ma_san_pham int,
	ma_hoa_don int,

	primary key(ma_san_pham, ma_hoa_don)	
);

CREATE TABLE hoa_don(
	ma_hoa_don int auto_increment,
	ngay_mua datetime,
	ma_khach_hang int,

	primary key(ma_hoa_don)
);



CREATE TABLE loai_san_pham(
	ma_loai_san_pham int auto_increment,
	ten_loai_san_pham varchar(255),
	
	primary key(ma_loai_san_pham) 
);

CREATE TABLE khach_hang(
	ma_khach_hang int auto_increment,
	dia_chi varchar(255),
	email varchar(50),
	ho varchar(10),
	ten varchar(20),
	so_dien_thoai varchar(11),
	
	primary key(ma_khach_hang)
);

 
ALTER TABLE san_pham ADD CONSTRAINT FK_ma_loai_san_pham_san_pham FOREIGN KEY (ma_loai_san_pham) REFERENCES loai_san_pham(ma_loai_san_pham);
ALTER TABLE sanpham_hoadon ADD CONSTRAINT FK_ma_san_pham_sanpham_hoadon FOREIGN KEY(ma_san_pham) REFERENCES san_pham(ma_san_pham);
ALTER TABLE sanpham_hoadon ADD CONSTRAINT FK_ma_hoa_don_sanpham_hoadon FOREIGN KEY(ma_hoa_don) REFERENCES hoa_don(ma_hoa_don);
ALTER TABLE hoa_don ADD CONSTRAINT FK_ma_khach_hang_hoadon FOREIGN KEY(ma_khach_hang) REFERENCES khach_hang(ma_khach_hang);



-- DROP TABLE khach_hang;
-- DROP TABLE hoadon ;
-- DROP TABLE san_pham  ;
-- DROP TABLE loai_san_pham  ;


-- Dựa vào UI UX của design: (vnexpress)
	-- đi tìm đối tượng. Với 1 đối tượng thì sẽ có 1 bảng.























-- CREATE TABLE products(
-- 	id int auto_increment,
-- 	price double,
-- 	
-- 	primary key(id)
-- );

-- INSERT INTO products(price)VALUES(349.99);
-- INSERT INTO products(price)VALUES(345.01);
-- INSERT INTO products(price)VALUES(345.02);
-- INSERT INTO products(price)VALUES(345.03);
-- 
-- SELECT * FROM products WHERE price = 349.99;
-- 
-- DELETE FROM	products WHERE id = 1;
-- 
-- DROP TABLE products;
-- 
-- CREATE TABLE lopsv(
-- 	ma_sv int auto_increment,
-- 	ho_ten varchar(255),
-- 	ma_lop varchar(255),
-- 	ngay_sinh datetime,
-- 	gioi_tinh bool,	-- 1: Nam, 0 Nu
-- 	
-- 	primary key(ma_sv)
-- );

-- INSERT INTO lopsv(ho_ten,ma_lop, ngay_sinh, gioi_tinh) VALUES ('Nguyen Van An', 'D18CQKD01-N', '2000-02-19', true);
-- INSERT INTO lopsv(ho_ten,ma_lop, ngay_sinh, gioi_tinh) VALUES ('Tran Dang Van Anh', 'D23CQKT01-N', '2000-02-19', false);
-- INSERT INTO lopsv(ho_ten,ma_lop, ngay_sinh, gioi_tinh) VALUES ('Pham Quoc Vy', 'D18CQKD01-N', '2000-02-19', true);
-- INSERT INTO lopsv(ho_ten,ma_lop, ngay_sinh, gioi_tinh) VALUES ('Ho Tan Phat', 'D23CQKT01-N', '2000-02-19', false);
-- INSERT INTO lopsv(ho_ten,ma_lop, ngay_sinh, gioi_tinh) VALUES ('Do Ngoc Tran', 'D23CQKT01-N', '2000-02-19', false);
-- INSERT INTO lopsv(ho_ten,ma_lop, ngay_sinh, gioi_tinh) VALUES ('Dang Trong Phuc', 'D18CQKD01-N', '2000-02-19', true);
-- 
-- SELECT * FROM lopsv WHERE ho_ten LIKE '%Dang%';
-- DELETE FROM lopsv WHERE ho_ten LIKE '%Dang%' OR ma_lop LIKE '%23%';












--------------================================--------------
-- Dựa vào yêu cầu của khách hàng để xác định mối quan hệ: 
-- OneToOne: Một dòng dữ liệu bảng A sẽ lấy được một dòng dữ liệu bảng B. 
	-- Vừa là khóa chính vừa là khóa ngoại. để bên nào cũng được.  
		-- Khóa ngoại nằm bảng nào cũng được. Nhưng với điều kiện cột đóng vai trò khóa ngoại kiêm luôn khóa chính.
-- OneToMany:Một dòng dữ liệu bảng A lấy được nhiều dòng dữ liệu bảng B;
	--  Khóa ngoại nằm ở bảng được xsc định là nhiều. N là nhiều.  

-- ManyToOne:Nhiều dòng dữ liệu bên kia lấy được một dòng dữ liệu bên đây.
	--	Tương tự OneToMany.

-- ManyToMany: Nhiều dòng dữ liệu bên kia lấy được nhiều dòng dữ liệu bên đây.
	-- Sẽ phát sinh ra bản trung gian. Bảng trung gian sẽ có 2 cột vừa đóng vai trò là khóa chính và khóa ngoại. 
-- Có thể chạy thử bằng tay: (1 khóa chính + dữ liệu vài cột)
