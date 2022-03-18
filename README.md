# ASM1_Android-Programming-Course_FUNIX
Thiết kế 1 chương trình Android đơn giản gồm có 2 màn hình
Màn hình thứ nhất gồm 1 danh mục các con vật được hiển thị theo grid view, 3 cột, và có những nút favorite button
Khi kích vào mỗi con vật, thì sẽ hiện ra 1 màn hình Detail Activity
Ở mỗi màn hình Detail Activity tương ứng này, ngoài 1 cái image View, 1 cái Text view, 1 cái Description có thể scollable, thì còn có 1 hình trái tim (favorite)
Người dùng có thể thay đổi trạng thái hình trái tim này bao nhiêu lần tùy thích (căn cứ theo thích hoặc không thích)
Khi quay lại màn hình chính, thì trạng thái thích này sẽ được hiển thị ở mỗi con vật
ASM còn áp dụng tween animation là fadeIn (hiệu ứng alpha) cho mỗi animal icon khi người dùng kích vào !
1 lưu ý của ASM này là nút upward tự động do Adroid tạo tự động (khi khai báo parent activity), không sử dụng được
phải tự tạo 1 nút back (chứa method finish()), để thay thế !
