package OOP_homework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMainApp {
	public static void main(String[] args) {
		// Tạo ra một list rỗng(không có phần tử nào trong list)
		List<inner_city_bus> list_inner_city_bus = new ArrayList<inner_city_bus>();
		// .size() : Trả về độ dài của List.
		// .add(Kiểu của List): Thêm phần tử vào trong List.
		// .remove() : Xóa phần tử chỉ định. 
		inner_city_bus ChuyenXeNoiThanh = new inner_city_bus();
		ChuyenXeNoiThanh.hoTenTaiXe = "Nguyen Van A";
		
		inner_city_bus ChuyenXeNoiThanh2 = new inner_city_bus();
		ChuyenXeNoiThanh2.hoTenTaiXe = "Tran Van B";

		list_inner_city_bus.add(ChuyenXeNoiThanh);
		list_inner_city_bus.add(ChuyenXeNoiThanh2);
//		list_inner_city_bus.remove(ChuyenXeNoiThanh2);		.remove() : Xóa phần tử chỉ định. 
		System.out.println("Kiem tra List " + list_inner_city_bus.size());
		// Duyệt List.
		for (int i = 0; i < list_inner_city_bus.size(); i++) {
			// get(i): Trả về phần tử mà mình chỉ định.
			inner_city_bus noithanh = list_inner_city_bus.get(i); 	//inner_city_bus: Kiểu dữ liệu.
			System.out.println("Kiem tra gia tri vi tri: " + i + " - " + noithanh.getHoTenTaiXe());
		}

		
	}
}
