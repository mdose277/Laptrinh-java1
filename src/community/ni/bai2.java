package community.ni;

public class bai2 {
	// Hàm tìm và xuất các số nguyên âm trong chuỗi
    public static void NegativeNumberInStrings(String str) {

        String number = "";
        boolean found = false;

        for (int i = 0; i < str.length(); i++) {

            // Kiểm tra dấu '-' và ký tự phía sau là số
            if (str.charAt(i) == '-' &&
                i + 1 < str.length() &&
                Character.isDigit(str.charAt(i + 1))) {

                number = "-";
                i++;

                // Lấy toàn bộ các chữ số phía sau
                while (i < str.length() && Character.isDigit(str.charAt(i))) {
                    number += str.charAt(i);
                    i++;
                }

                System.out.println("So am tim thay: " + number);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Khong co so am trong chuoi");
        }
    }

    public static void main(String[] args) {

        String str = "abc-5xyz-12k9l--p";

        NegativeNumberInStrings(str);
    }

}
