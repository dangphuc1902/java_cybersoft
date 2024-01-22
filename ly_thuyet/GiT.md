# NOTE
1. Git Hub và gitLab
    - Github: upload lên server GIT
    - GitLab: upload src lên server của công ty mình.
- gitignore: bỏ qua những cái file mà có trong gitignore.

2. file config trong folder ẩn .git sau khi liên kết thành công:
    - [core]
	repositoryformatversion = 0
	filemode = false
	bare = false
	logallrefupdates = true
	symlinks = false
	ignorecase = true
[remote "origin"]
	url = https://github.com/dangphuc1902/crmproject.git        // đường link kết nối. 
	fetch = +refs/heads/*:refs/remotes/origin/*

    Danh sách file chờ đẩy lên git.
    Cần add file vào danh sách


# 1. Đẩy file lưu trữ ở repo đã tạo trên git.
    Bước 1: git status
        <!-- git status: Giúp kiểm tra trạng thái của các file trong project, xem file nào là file mới, file nào là file đã chỉnh sửa. -->
            <!-- change username & email.  -->
            git config --global user.name "Full Name"
            git config --global user.email "email@address.com"
    Bước 2: git add
        <!-- Thêm file đã thay đổi hoặc chỉnh sửa vào danh sách chờ đẩy lên git 
        - git add tên_file tên_file2
        - git add *: add tất cả các file thay đổi hoặc mới ngoại trừ file ẩn. 
        _ git add .: add tất cả các file thay đổi cả file ẩn. 
        -->
    Bước 3: git commit-m "nội dung commit"
    <!-- Kí xác nhận các file thay đổi đã được add vào danh sách chờ, với nội dung.
        nội dung commit: là tính năng đã hoàn thành. 
     -->
    Bước 4: git push origin tên_nhánh.
        <!-- upload toàn bộ file trong danh sách chờ đẩy lên git lên server git. 
         lưu ý: 
            - origin: đại diện cho git trên sever.
            - tên nhánh: main 
         -->

    <!-- Token keycrm04
    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
        - Mở file config và sửa url thành:
            url = https://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@github.com/dangphuc1902/crmproject.git
     -->

     Lấy source từ git về máy.
     git clone link git.ư

     git pull: lấy toàn bộ hoặc thay đổi trên server về máy.
     git clone: downldoad toàn bộ src trên sever. 