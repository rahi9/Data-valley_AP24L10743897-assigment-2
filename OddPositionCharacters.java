public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here to search";
        
        printOddPositionCharacters(text);
    }
    
    static void printOddPositionCharacters(String str) {
        str = str.replaceAll("\\s", ""); // Remove white spaces
        
        for (int i = 0; i < str.length(); i++) {
            if ((i + 1) % 2 != 0) {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }
}
