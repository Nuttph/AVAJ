public class StringType {
    public static void main(String[] args) {
        // String
        String text = "Abc Defg";
        int length = text.length(); // 8
        String upper = text.toUpperCase(); // ABC DEFG
        String lower = text.toLowerCase(); // abc defg

        int index = text.indexOf("De"); // 4 เพราะว่า เริ่มที่เจอที่ตำแหน่งที่ 4
        int index2 = text.indexOf("i"); // -1 เพราะหาไม่เจอ

        // Concatenation
        String name = "Nuttaphon";
        String surname = "Popardit";
        String full_name = name + " " + surname; // Nuttaphon Popardit
        String concat = name.concat(surname); // NuttaphonPopardit

        // Number and Strings
        String x = "10";
        String y = "20";
        String z = x + y; // 1020 (a String)

        String a = "10";
        int b = 20;
        String c = x + y; // 1020 (a String)

        // Special Characters
        String special1 = "Hello World, I\'m from Thailand"; // Hello World, I'm from Thailand
        String special2 = "My name is \"Nuttaphon\""; // My name is "Nuttaphon"
        String special3 = "Good morning \\Everone\\"; // Good morning \Everone\"

        String special4 = "Other common \nescape senquences that are valid in Java are"; // \n is New Line
        String special5 = "Other com\rmon escape senquences that are valid in Java are"; // \r
                                                                                         // เขาบอกว่ามันจะทับข้อความเดิมหลังจาก
                                                                                         // \r
        String special6 = "Other com\tmon escape senquences that are valid in Java are"; // \t = tab เว้นวรรค
        String special7 = "Other common \bescape senquences that are valid in Java are"; // \b is Backspace
        String special8 = "Other common escape sen\fquences that are valid in Java are"; // \f is Form Feed
    }
}
