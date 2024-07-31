                                  @RestControllerAdvice vs @ControllerAdvice
- ControllerAdvice sẽ thường đi với @ExceptionHandler
- Với ControllerAdvice, khi 1 exception throw ra bên trong 1 Controller thay vì báo lỗi lên hệ thống thì
sẽ đi vào class chứa annotation ControllerAdvice và thực thi các hàm bên trong nó

=> Advice dùng để xử lý các exception

=> ControllerAdvice phải được khai báo trong 1 bean thuộc IoC (class) - level component

- RestControllerAdvice tương tự ControllerAdvice nhưng đối với RestController

---------------------------------------------------------------------------------------------------------------
                                            @ResponseStatus
- Đây là annotation được dùng để định dạng error code sẽ trả về cho người dùng
- Đường dùng trong các component, bean xử lý exception

---------------------------------------------------------------------------------------------------------------
                                       @ConfigurationProperties
- Với @ConfigurationProperties, ta có thể lấy value từ trong 1 file config vào trong component hoặc bean
- Value bên trong @ConfigurationProperties phải khai báo là 1 prefix - 1 prefix config cần dùng, vì bên trong
1 file config có rất nhiều prefix khác nhau
- Thuộc tính trong config phải cùng định dạng tên với biến bên trong component, bean mà ta dùng
- Khi 1 component, bean sử dụng @ConfigurationProperties thì nên đi kèm cùng với @PropertySource
- @PropertySource có value là đường dẫn file config (vd: @PropertySource("classpath:loda.yml"))
- Nếu không khai báo @PropertySource thì file config được dùng mặc định sẽ là classpath:application.yml
- Để sử dụng được @ConfigurationProperties thì ta phải dùng @EnableConfigurationProperties trên 1 component
hoặc config nào đó (có thể là hàm Main)