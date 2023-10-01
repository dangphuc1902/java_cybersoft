package homework_session_4_B1;
import java.util.HashMap;
import java.util.Scanner;

/*
* Cho biết tên và tọa độ nhà của 3 sinh viên. Cho biết tọa độ của trường đại học. Hãy viết chương trình cho máy in tên sinh viên ở xa trường đại học nhất.
* 	Phân tích mô hình 3 khối:
* 		+ Đầu vào:
* 			- Người dùng nhập thông tin gồm tên và tọa độ của 3 sinh viên. 
* 			- Người dùng nhập vào thông tin về tọa độ trường đại học.
* 		+ Phân tích nghiệp vụ:
* 			-  Tính khoảng cách từ tọa độ nhà của từng sinh viên đến tọa độ của trường học.
* 			- So sánh khoảng cách của các sinh viên với nhau. 
* 			- Nếu khoảng cách có khoảng cách lớn nhất, suy ra nhà của sv đó xa trường nhất và ngược lại. 
*		+ Đầu ra:
*			- Tên sinh viên ở xa trường nhất.
*
*		latsv1: 10.77973966877115
*		longsv1: 106.68223380721726
*
*		latsv2: 10.81301369271333
*		longsv2: 106.68409221020623
*
*		latsv3: 10.798133968039869
*		longsv3: 106.70698981468689
*
*		latCyber: 10.79042652804407
*		longCyber: 106.7044366438174
* */
public class b4_find_student_far_school {
   
	    public static void main(String[] args) {
	        HashMap<String, double[]> students = new HashMap<>();
	    	Scanner sc = new Scanner(System.in);
	    	// Nhập thông tin sinh viên và tọa độ nhà sinh viên.
	    	System.out.println("Nhập số lượng sinh viên: ");
	    	int numbersStudents = sc.nextInt();
            sc.nextLine(); // Đọc ký tự '\n' sau khi nhập số lượng sinh viên

	    	
	    	for(int i = 0; i < numbersStudents; i++) {
	    		System.out.println("Nhập tên của sinh viên: ");
	    		String nameStudent  =sc.nextLine();
	    		
	    		System.out.println("Nhập latitude(vĩ độ) của nhà sinh viên: ");
	    		double latitude = sc.nextDouble();
	    		
	    		System.out.println("Nhập longitude(kinh độ) của nhà sinh viên: ");
	    		double longitude = sc.nextDouble();
	    		sc.nextLine();

	    		students.put(nameStudent, new double[] {latitude,longitude});
	    	}
	    	// Khởi tạo biến lưu trữ khoảng cách xa nhất và Tên của sinh viên xa nhất. 
	    	double farthestDistance = 0;
	    	String farthestStudent = "";
	    	
	        // Tọa độ trường đại học
	        System.out.println("Nhập latitude(vĩ độ)của trường đại học: ");
	        double universityLatitude = sc.nextDouble();

	        System.out.println("Nhập longitude(kinh độ) của trường đại học: ");
	        double universityLongitude = sc.nextDouble();

	        for(String nameStudent : students.keySet()) {
	        	double[] coordinates = students.get(nameStudent);
	        	double latitude = coordinates[0];
	        	double longitude = coordinates[1];
	        	
	        	double distance = calculateDistance(latitude, longitude, universityLatitude, universityLongitude);
	        	
	        	if(distance > farthestDistance) {
	        		farthestDistance = distance;
	        		farthestStudent = nameStudent;
	        	}
	        	
	        }
	        
	        System.out.println("Sinh viên ở xa trường đại học nhất là sinh viên: " + farthestStudent);
	        
	    }
   // Phương thức tính khoảng cách giữa hai điểm dựa trên tọa độ
   public static double calculateDistance(double latitude, double longitude, double universityLatitude, double universityLongitude) {
	   double pow_V1 = Math.pow((universityLatitude - latitude), 2);
	   double pow_V2 = Math.pow((universityLatitude - longitude), 2);
	   double distance = Math.sqrt( pow_V1 + pow_V2);
       return distance;
   }
	
	
}
