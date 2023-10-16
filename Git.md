# TÌM HIỂU VỀ GIT/GITHUB



## 1.	Version Control System (VCS)
-	Một hệ thống kiểm soát các phiên bản của mã nguồn
-	Lưu trữ tất cả các file của dự án và toàn bộ lịch sử thay đổi trên file
-	Giúp xem lại các sự thay đổi hoặc khôi phục lại phiên bản trước đó
-	Hỗ trợ phối hợp thực hiện dự án trong nhóm, dễ dàng chia sẻ code


## 2. Git
-	Là một Version Control System
-	Ra đời năm 2005
-	Một số khái niệm cơ bản
    - **Repository (repo)**: Kho lưu trữ của Git chứa tất cả các tệp, thông tin cần thiết cùng lịch sử sửa đổi của dự án
    - **Branch**: Nhánh đại diện cho một phiên bản cụ thể của một repo, là một bản sao của repo tại thời điểm phân nhánh, cho phép thử nghiệm và thực hiện thay đổi trên repo mà không ảnh hưởng đến project gốc
    - **Snapshot**: là ảnh chụp toàn bộ nội dung tất cả các file tại một thời điểm
    - **Commit**: là git đã snapshot và record lại thay đổi trong repo


## 3. GitHub
-	Là một dịch vụ cung cấp kho lưu trữ mã nguồn Git dựa trên nền web cho các dự án phát triển phần mềm
-	Một số tính năng khác: Chia sẻ source code, tạo pull request, các chức năng social networking...


## 4. Một số lệnh Git cơ bản

### **git config**
- Tác dụng: Set username và email
> `git config - -global user.name = “Thao Nguyen”`
>
> `git config - -global user.email = “nguyen@gmail.com”`

### **git clone**
- Tác dụng: Tạo 1 bản sao git repository từ remote source (trên GitHub là sử dụng https hoặc ssh link)
> `git clone <url>`

### **git init**
- Tác dụng: Khởi tạo 1 git repository trên 1 project đã có
  
### **git remote**
- Tác dụng: Kiểm tra remote/source hiện có hoặc thêm/xóa remote
> `git remote`
> `git remote add <url>`
> `git remote rm <url>`

### **git status**
- Tác dụng: Kiểm tra trạng thái của các file đã thay đổi trong thư mục làm việc (tất cả các thay đổi cuối cùng từ lần commit gần nhất). Cần thiết trước khi thực hiện commit

### **git diff**
- Tác dụng: So sánh sự khác biệt giữa trước và sau khi thay đổi trên file
> `git diff <file>`

### **git add**
- Tác dụng: Thêm thay đổi đến stage trong thư mục làm việc (để git track những file có sự thay đổi trước khi commit)

### **git commit**
- Tác dụng: Git ghi lại một snapshot của sự thay đổi trong thư mục làm việc. Mỗi lần commit sẽ lưu lại lịch sử chỉnh sửa code kèm theo tên và địa chỉ email của người chỉnh sửa. Có thể khôi phục lại phiên bản trước đó của tệp tin trong lịch sử commit
> `git commit –m “message to note about the changes in repository”`

### **git push**
- Tác dụng: Đẩy các thay đổi sau khi commit lên remote repository
> `git push –u/- -set-upstream origin <branch>`

### **git pull**
- Tác dụng: Kéo code về local repository
> `git pull origin <branch>`

### **git branch**
- Tác dụng: Liệt kê tất cả các branch
> `git branch`
- Xóa branch
> `git branch –d <branch>`

<p align="center">
<img src="https://docs.wavemaker.com/learn/assets/branching-model.png" width=50% height=50%>
</p>
	
### **git checkout**
- Tác dụng: Chuyển sang branch khác
> `git checkout <branch>`
- Tạo và chuyển sang một branch mới
> `git checkout –b <new_branch>`

### **git merge**
- Tác dụng: Hợp nhất hai branch
> `git merge < branch_to_be_merged_into_other>`

<p align="center">
<img src="https://xuanthulab.net/photo/basic-remote-workflow.png" width=50% height=50%>
</p>


## 5.	Pull Request (PR) và xung đột

### 5.1.	Pull Request
-	Tác dụng: Thông báo vừa có một feature branch commit để review tất cả sự thay đổi so với lần commit cuối cùng trước khi merge branch vào main
-	Cần thiết khi làm việc nhóm với nhiều người cùng phối hợp trên một dự án, đảm bảo mọi sự thay đổi trên code được kiểm duyệt và thông qua bởi tất cả mọi người
-	Cách tạo PR và merge trên GitHub:
    - Sau khi push branch lên remote repo, **Compare and pull request**
    - **Open a pull request**: Ghi lại những sự thay đổi/cập nhất chính vào comment -> **Create pull request**
    - **Resolve conversation**: Sửa đổi nếu có dựa trên các nhận xét của mọi người
    - **Merge pull request** và xóa feature branch

### 5.2.	Xung đột
-	Thường xảy ra trong quá trình hợp nhất khi hai branch có những thay đổi mâu thuẫn với nhau
-	Git sẽ thông báo ngay khi xảy ra xung đột
```
git merge develop
Auto-merging index.html
CONFLICT (content): Merge conflict in index.html
CONFLICT (modify/delete): error.html deleted in HEAD and modified in develop. Version develop of error.html left in tree.
Automatic merge failed; fix conflicts and then commit the result.
```
-	**Thể hiện xung đột**: Git đánh dấu khu vực có vấn đề bằng các từ khóa

<p align="center">
<img src="https://cdn.hashnode.com/res/hashnode/image/upload/v1630758001424/BQIq-8p1L.png" width=50% height=50%>
</p>

-	**Cách giải quyết xung đột**: chỉnh sửa nội dung trên file mà nó dẫn tới xung đột, sau đó thực hiện add, commit cho file đó
-	**Để giảm thiểu xung đột**:
    -	Có kế hoạch cụ thể, mỗi thành viên làm việc trên một tính năng riêng biệt, tránh để nhiều người làm việc trên cùng một branch
    -	Cam kết thường xuyên: Commit và push thường xuyên, không dồn cục nhiều thay đổi cùng một lúc, tránh để nhiều thay đổi diễn ra trên main trong thời gian dài mà chưa được cập nhật



