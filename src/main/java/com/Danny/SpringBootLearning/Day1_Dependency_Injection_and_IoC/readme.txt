                                            DEPENDENCY INJECTION
- Dựa vào câu nói "Dependency Injection is a design pattern", cho thấy DI là một phương pháp lập trình
- Code chạy được thì đơn giản, tuy nhiên để code có thể chạy, maintain hoặc mở rộng thì không đơn giản
- Để code dễ maintain, mở rộng thì cần hạn chế tight-coupling, nghĩa là các class, object quá phụ thuộc lẫn nhau
dẫn đến khi 1 class bị lỗi, thay đổi thì sẽ ảnh hưởng đến class còn lại
- Nguyên lý của DI:
    "Các Class không nên phụ thuộc vào các kế thừa cấp thấp, mà nên phụ thuộc vào Abstraction (lớp trừu tượng)"
- Có 3 cách để inject dependency:
 +) Constructor Injection
 +) Setter Injection
 +) Interface Injection
- Mức độ ưu tiên Injection trong Spring Boot: Constructor > Setter > Interface (vì không phổ biến và khó bảo trì)

---------------------------------------------------------------------------------------------------------------------
                                               IOC CONTAINER
- Giả sử nếu có quá nhiều object kế thừa 1 interface, các object này chính là beans
- Nếu quá nhiều beans kế thừa, trong service nếu ta sử dụng đến interface thì ta chỉ biết nghiệp vụ chứ không biết
bean nào được thực thi
- Mỗi lần inject bean thì lại quá tốn thời gian nếu số lượng bean quá nhiều
=> Tạo 1 container lưu trữ các bean, khi cần sử dụng bean nào trong service thì gọi thông qua annotation @Qualifier
=> Hoặc sử dụng annotation @Primary thì không cần khai báo Qualifier, bean nào có @Primary sẽ được ưu tiên inject

    Container
 (Các bean kế thừa Sort Interface)
-----------------
|   Bubble sort |   inject (qualifier)                                       Service đã thực thi bean chỉ định
|   Quick sort  | ---------------------> SortService (@Qualifer("tên bean") -----------------------------> Controller
|---------------|
         ^
         |
         |
         |
  Sort Interface
=> Đảm bảo logic và nghiệp vụ: Có sort và biết sort loại nào (Quick hoặc Bubble)

---------------------------------------------------------------------------------------------------------------------
                                                     @Bean vs @Component
- Cả 2 đều là annotation dùng để đánh dấu bean trong 1 IoC của Spring, tuy nhiên trường hợp dùng là khác nhau
+) @Bean dùng cho function của 1 class
+) @Component dùng cho cả 1 class
- @Bean sẽ linh hoạt hơn @Component vì @Bean là tùy chỉnh bean trong cấu hình, trong khi @Component là tự động đăng kí
bean trong IoC của Spring (phát hiện tự động)