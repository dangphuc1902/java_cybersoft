package homework_session_4_B1;

    import java.util.HashMap;
import java.util.Scanner;

public class b4_find_student_far_school {
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