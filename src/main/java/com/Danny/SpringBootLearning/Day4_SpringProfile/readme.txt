                                                SPRING PROFILE
- Spring Profile là 1 core feature trong Spring Boot, cho phép chương trình chạy đuợc trong nhiều môi trường
khác nhau
- Giả sử chương trình của chúng ta có 2 hướng chạy là local và aws, vì thế mà kết nối MySQL sẽ khác nhau
- Spring Profile sẽ giúp việc config không còn quá phức tạp
- Cách làm:
    +) Tạo ra các file config cho từng môi trường theo cú pháp sau: application-{profile-name}.yml
    (vd: application.yml, application-local.yml, application-aws.yml, application-common.yml)
    +) Trong đó application.yml sẽ quản lý các file config/ profile khác
    +) application-common sẽ là config dùng chung
    +) Kích hoạt:
        * Kích hoạt profile trong application.yml (vd: spring.profiles.active=aws)
        * Sử dụng JVM System Parameter: -Dspring.profiles.active=aws
        * Sử dụng lệnh trong termianl: java -jar myapp.jar --spring.profiles.active=local

----------------------------------------------------------------------------------------------------------------
                                            @Profile
- Với @Profile ta có thể quyết định bean hoặc component chạy trong môi trường chỉ định
VD:
// Bean này Spring chỉ khởi tạo và quản lý khi môi trường là `local`
                            @Component
                            @Profile("local")
                            public class LocalDatasourceConfig
Hoặc toán tử logic:
// Bean này Spring chỉ khởi tạo và quản lý khi môi trường là những môi trường không phải là `local`
                            @Component
                            @Profile("!local")
                            public class LocalDatasourceConfig

