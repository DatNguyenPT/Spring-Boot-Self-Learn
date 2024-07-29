document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Tạo đối tượng loginRequest
    const loginRequest = { username, password };

    // Ẩn cả hai thông báo trước khi gửi yêu cầu
    document.getElementById('successAlert').classList.add('hidden');
    document.getElementById('errorAlert').classList.add('hidden');

    axios.post('/user/login', loginRequest)
        .then(response => {
            if (response.data) { // Kiểm tra phản hồi
                document.getElementById('successAlert').classList.remove('hidden');
            } else {
                document.getElementById('errorAlert').classList.remove('hidden');
            }
        })
        .catch(error => {
            // Xử lý lỗi
            document.getElementById('errorAlert').classList.remove('hidden');
        });
});
