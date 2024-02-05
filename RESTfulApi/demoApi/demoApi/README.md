# Authentication[Who are you]: Chứng tài khoản trong hệ thống. 
# Authorization[Phân quền sau khi chứng thực thành công, kiểm tra quyền của mình. ]

# 1. JWT: Có các phương thức mã hoá thông dụng: MD5, SHA1, RSA.
Client ---Clien truyền username, password ---->  Login
        <--------- Token -------------------
# 1.1 Phương thức mã hoá RSA:
- Sinh ra một cặp key:
        - Public key: chuyên dùng để mã hoá.
        -(Server) private key: Dùng để giải mã chuỗi mã hoá bằng public key.
        
public key:                                         Server
        ABC           --Chuỗi mã hoá ---- >       private key