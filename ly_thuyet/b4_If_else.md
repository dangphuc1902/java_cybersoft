<!-- 1. * Với kiểu số:
    * bằng: ==
        * lớn hơn: >
        * bé hơn: <
        * lớn hơn bằng: >=
        * bé hơn bằng: <=
        * khác: !=
    * Với kiểu chuổi:
        * So sánh bằng trong chuỗi "equals("giá trị so sánh")" 
2. Toán tử 3 ngôi:  Sử dụng khi chỉ có 1 If else
    ***(A > B) ? True : Flase;***
    <Biểu thức điều kiện>  ? <Kết quả khi điều kiện true> : <Kết quả khi điều kiện False>;

    echo ```thongBao = (soA % 2 ==) ? "Số Chẵn" : "Số lẻ";```
    + Để biến chữ Thường lên chữ Hoa: echo```nguoiChao.toUpperCase```
    + Để biến chữ Hoa lên chữ thường: echo```nguoiChao.toLowerCase```
     -->


    import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashMap<String, double[]> students = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin sinh viên và tọa độ nhà sinh viên
        System.out.print("Nhập số lượng sinh viên: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Đọc ký tự '\n' sau khi nhập số lượng sinh viên

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Nhập tên sinh viên: ");
            String tenSinhVien = scanner.nextLine();

            System.out.print("Nhập latitude của nhà sinh viên: ");
            double latitude = scanner.nextDouble();

            System.out.print("Nhập longitude của nhà sinh viên: ");
            double longitude = scanner.nextDouble();

            scanner.nextLine(); // Đọc ký tự '\n' sau khi nhập longitude

            students.put(tenSinhVien, new double[]{latitude, longitude});
        }

        // Tính khoảng cách xa nhất
        double farthestDistance = 0;
        String farthestStudent = "";

        System.out.print("Nhập latitude của trường đại học: ");
        double universityLatitude = scanner.nextDouble();

        System.out.print("Nhập longitude của trường đại học: ");
        double universityLongitude = scanner.nextDouble();

        for (String tenSinhVien : students.keySet()) {
            double[] coordinates = students.get(tenSinhVien);
            double latitude = coordinates[0];
            double longitude = coordinates[1];

            double distance = calculateDistance(latitude, longitude, universityLatitude, universityLongitude);

            if (distance > farthestDistance) {
                farthestDistance = distance;
                farthestStudent = tenSinhVien;
            }
        }

        System.out.println("Sinh viên ở xa trường đại học nhất là: " + farthestStudent);

        scanner.close();
    }

    public static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        // Haversine formula
        double R = 6371; // Bán kính Trái Đất trong km

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = R * c;

        return distance;
    }
}


Certainly! Let's break down the code block and understand it step by step:

1. `for (String tenSinhVien : students.keySet())`: This line initiates a loop that iterates over each key (student name) in the `students` HashMap.

2. `double[] coordinates = students.get(tenSinhVien);`: This line retrieves the value associated with the current key (student name) from the `students` HashMap. In this case, the value is an array of doubles containing the latitude and longitude coordinates of the student's home.

3. `double latitude = coordinates[0];`: This line assigns the first element of the `coordinates` array (latitude) to the variable `latitude`.

4. `double longitude = coordinates[1];`: This line assigns the second element of the `coordinates` array (longitude) to the variable `longitude`.

5. `double distance = calculateDistance(latitude, longitude, universityLatitude, universityLongitude);`: This line calculates the distance between the student's home coordinates (latitude and longitude) and the university coordinates (universityLatitude and universityLongitude) using the `calculateDistance` method. The calculated distance is stored in the `distance` variable.

6. `if (distance > farthestDistance) { farthestDistance = distance; farthestStudent = tenSinhVien; }`: This block of code compares the calculated distance with the current farthest distance (`farthestDistance` variable). If the calculated distance is greater than the current farthest distance, it updates the `farthestDistance` variable with the new distance and assigns the current student's name (`tenSinhVien`) to the `farthestStudent` variable.

The loop continues until all the student coordinates have been processed. After the loop finishes, the `farthestStudent` variable will contain the name of the student who lives farthest from the university, and the `farthestDistance` variable will contain the corresponding distance.

Finally, you can print out the name of the farthest student using `System.out.println(farthestStudent);`.