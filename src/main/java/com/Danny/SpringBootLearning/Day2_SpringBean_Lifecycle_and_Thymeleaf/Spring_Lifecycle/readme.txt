                                                                   VÒNG ĐỜI SPRING BEAN
- Khi khởi chạy ứng dụng, IoC Container hay ApplicationContext sẽ tiến hànhtìm các bean thông qua các lớp được đánh dấu bởi các annotation như @Component,
@Service, @RestController,...
- Container tiến hành tạo các instance của bean dựa trên các cấu hình hoặc tự động phát hiện
- Inject dependency vào bean thông qua constructor và setter
- Hàm đánh dấu @PostConstruct được gọi
- Tiền xử lý sau khi @PostConstruct được gọi
- Bean sẵn sàng hoạt động
- Nếu IoC Container không quản lý bean nữa hoặc bị shutdown thì sẽ gọi hàm
được đánh dấu @PreDestroy trong bean
- Xóa bean

------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                                 @PreDestroy và @PostConstruct
+) @PostConstruct:
    - Các hàm được đánh dấu là @PostConstruct sẽ được thực thi sau khi các dependency được inject vào bean
    - Thông thường các hàm được đánh dấu @PostConstruct được dùng để cấu hình thêm bean sau khi bean được khởi tạo

+) @PreDestroy:
    - Các hàm được đánh dấu là @PreDestroy sẽ được thực thi trước khi bean bị xóa bỏ
    - Cho phép tùy chỉnh cách dọn dẹp, xóa bean, cho phép dọn dẹp tài nguyên trước khi xóa bean

------------------------------------------------------------------------------------------------------------------------------------------------------------
                                                                        Bean Scope
 +) Singleton - @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    - Mô Tả: Chỉ có một instance của bean được tạo ra trong toàn bộ Spring container. Tất cả các yêu cầu cho bean này sẽ nhận được cùng một instance.
    - Ứng Dụng: Phạm vi mặc định cho các bean. Sử dụng khi bạn muốn chia sẻ cùng một instance giữa tất cả các yêu cầu và thành phần trong ứng dụng.

 +) Prototype - @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    - Mô Tả: Mỗi lần yêu cầu bean, Spring sẽ tạo ra một instance mới. Không có sự chia sẻ instance giữa các yêu cầu.
    - Ứng Dụng: Sử dụng khi bạn cần một instance mới của bean mỗi khi bean đó được yêu cầu, chẳng hạn như các bean có trạng thái nội bộ mà không nên được chia sẻ.

 +) Request - @Scope(WebApplicationContext.SCOPE_REQUEST)
    - Mô Tả: Một instance của bean sẽ được tạo ra cho mỗi yêu cầu HTTP. Bean này chỉ tồn tại trong phạm vi của một yêu cầu HTTP.
    - Ứng Dụng: Thường được sử dụng trong các ứng dụng web để lưu trữ dữ liệu liên quan đến một yêu cầu HTTP cụ thể.

+) Session - @Scope(WebApplicationContext.SCOPE_SESSION)
    - Mô Tả: Một instance của bean sẽ được tạo ra cho mỗi phiên (session) HTTP. Bean này tồn tại trong suốt thời gian của một phiên HTTP.
    - Ứng Dụng: Thường được sử dụng để lưu trữ dữ liệu liên quan đến một phiên làm việc của người dùng, chẳng hạn như thông tin người dùng đã đăng nhập.

+) Application - @Scope(WebApplicationContext.SCOPE_APPLICATION)
    - Mô Tả: Một instance của bean sẽ được tạo ra cho toàn bộ ứng dụng web (tương tự như singleton nhưng trong ngữ cảnh web). Bean này tồn tại trong toàn bộ thời gian sống của ứng dụng.
    - Ứng Dụng: Dùng khi bạn cần một bean duy nhất cho toàn bộ ứng dụng web.

+) Websocket - @Scope("websocket")
    - Mô Tả: Một instance của bean sẽ được tạo ra cho mỗi kết nối WebSocket. Bean này tồn tại trong suốt thời gian của một kết nối WebSocket.
    - Ứng Dụng: Dùng trong các ứng dụng WebSocket khi bạn cần quản lý trạng thái cho từng kết nối WebSocket.
