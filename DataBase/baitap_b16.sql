CREATE DATABASE homework;
USE homework;

CREATE TABLE san_pham(
	ma_san_pham int auto_increment,
	ten_san_pham varchar(50),
	gia_nhap decimal(10,2),
	gia_niem_yet decimal(10,2),
	so_luong int,
	phantram_giamgia DECIMAL(5,2),
	ma_nha_cung_cap int ,
	ngay_them datetime,
	
	PRIMARY KEY (ma_san_pham)
);

CREATE TABLE nha_cung_cap(
	ma_nha_cung_cap int auto_increment,
	ten_nha_cung_cap varchar(250),
	
	PRIMARY KEY (ma_nha_cung_cap)
);

ALTER TABLE san_pham ADD constraint FK_ma_nha_cung_cap_san_pham FOREIGN KEY (ma_nha_cung_cap) REFERENCES nha_cung_cap (ma_nha_cung_cap);


-- Thêm dữ liệu vào bảng NhaCungCap
INSERT INTO san_pham (ten_san_pham, gia_nhap, gia_niem_yet, so_luong, phantram_giamgia, ngay_them, ma_nha_cung_cap,maloai)
VALUES
    ('Laptop Dell XPS', 15000000, 18000000, 100, 5.5, '2023-01-01', 1,1),
    ('Smartphone Samsung Galaxy S21', 12000000, 15000000, 80, 3.75, '2023-02-15', 2,2),
    ('Tablet iPad Air', 8000000, 10000000, 120, 2.25, '2023-03-20', 3,3),
    ('Laptop HP Spectre', 16000000, 19000000, 90, 4.8, '2023-04-10', 1,1),
    ('Smartphone iPhone 13', 18000000, 21000000, 70, 6.2, '2023-05-05', 2,2),
	('Apple MacBook Air M1', 16990000, 18990000, 56, 5.1, '2023-09-25', 2,4),
	('Apple MacBook Pro', 18000000, 21000000, 47, 3.4, '2020-08-25', 2,4);




-- Thêm dữ liệu vào bảng NhaCungCap
INSERT INTO nha_cung_cap (ten_nha_cung_cap)
VALUES
    ('Công ty ABC'),
    ('Công ty XYZ'),
    ('Công ty DEF');

   
   -- Tạo bảng LoaiSanPham
CREATE TABLE loai_san_pham (
    maloai INT AUTO_INCREMENT,
    tenloai VARCHAR(50),
    PRIMARY KEY (maloai)
);

-- Thêm dữ liệu vào bảng LoaiSanPham
INSERT INTO loai_san_pham (tenloai)
VALUES
    ('Laptop'),
    ('Smartphone'),
    ('Tablet'),
    ('Apple'),
    ('Máy tính bảng');

-- Thêm cột maloai vào bảng san_pham
ALTER TABLE san_pham
ADD COLUMN maloai INT,
ADD FOREIGN KEY (maloai) REFERENCES loai_san_pham(maloai);

-- Cập nhật giá trị cho cột maloai trong bảng san_pham
-- UPDATE san_pham 
-- SET maloai = 1
-- WHERE ten_san_pham LIKE '%Laptop%';
-- 
-- UPDATE san_pham
-- SET maloai = 2
-- WHERE ten_san_pham LIKE '%Smartphone%';
-- 
-- UPDATE san_pham
-- SET maloai = 3
-- WHERE ten_san_pham LIKE '%Tablet%';
-- 
-- UPDATE san_pham
-- SET maloai = 4
-- WHERE ten_san_pham LIKE '%Máy tính bảng%';
-- 
-- UPDATE san_pham
-- SET maloai = 5
-- WHERE ten_san_pham LIKE '%Apple%';

 -- ----------------------------
--    1.1. Lấy danh sách tất cả sản phẩm
SELECT * FROM san_pham sp ;
-- 1.2. Chỉ lấy các thông tin về mã sản phẩm, tên sản phẩm, giá nhập, giá niêm yết
--  (giá bán), số lượng, % giảm giá của các sản phẩm
SELECT ma_san_pham,ten_san_pham,gia_nhap,gia_niem_yet,so_luong,phantram_giamgia FROM san_pham sp; 

-- 1.3. Lấy mã sản phẩm, tên sản phẩm, giá nhập, giá niêm yết (giá bán) của những sản phẩm có số lượng còn lại > 60
SELECT ma_san_pham,ten_san_pham,gia_nhap,gia_niem_yet,so_luong FROM san_pham sp WHERE so_luong > 60; 

-- 1.4. Lấy 3 sản phẩm mới nhất vừa được thêm vào Hệ thống
SELECT * FROM san_pham sp ORDER BY ngay_them DESC  LIMIT 3; 

-- 1.5. Lấy sản phẩm mà tên sản phẩm có chứa chữ 'Samsung'
SELECT * FROM san_pham sp WHERE ten_san_pham LIKE '%Samsung%';

-- 1.6. Lấy các sản phẩm với tên có chứa 'MacBook' và giá niêm yết (giá bán) trên 7,000,000
SELECT * FROM san_pham sp WHERE ten_san_pham LIKE '%MacBook%' AND gia_niem_yet > 7000000 ;

-- 1.7. Lấy các sản phẩm với tên có giá niêm yết (giá bán) từ 8,000,000 đến 10,000,000
SELECT * FROM san_pham sp WHERE gia_niem_yet BETWEEN 8000000 AND 10000000;

-- 2.1. Lấy mã sản phẩm, tên sản phẩm, giá nhập, giá niêm yết (giá bán), số lượng, tên nhà cung cấp của tất cả sản phẩm
SELECT sp.ma_san_pham,sp.ten_san_pham,sp.gia_nhap,sp.gia_niem_yet,sp.so_luong,ncc.ten_nha_cung_cap  FROM san_pham sp JOIN nha_cung_cap ncc ON sp.ma_nha_cung_cap = ncc.ma_nha_cung_cap; 
-- 2.2. Lấy mã sản phẩm, tên sản phẩm, giá nhập, giá niêm yết (giá bán), số lượng, mã nhà cung cấp,
--  tên nhà cung cấp, mã loại sản phẩm, tên loại sản phẩm của những sản phẩm có giá lớn hơn 5.000.000.
SELECT sp.ma_san_pham,sp.ten_san_pham,sp.gia_nhap,sp.gia_niem_yet,sp.so_luong,ncc.ma_nha_cung_cap ,ncc.ten_nha_cung_cap,lsp.maloai ,lsp.tenloai 
FROM san_pham sp JOIN nha_cung_cap ncc  ON sp.ma_nha_cung_cap = ncc.ma_nha_cung_cap 	 
JOIN loai_san_pham lsp ON sp.maloai = lsp.maloai;

-- 2.3. Lấy tất cả sản phẩm là máy tính bảng (tablet)
SELECT * FROM san_pham sp JOIN loai_san_pham lsp ON sp.maloai = lsp.maloai WHERE LOWER(tenloai) LIKE 'tablet' ;


-- DROP TABLE san_pham;
-- DROP TABLE loai_san_pham ;
--  DROP TABLE nha_cung_cap ;
   
   
 
   



