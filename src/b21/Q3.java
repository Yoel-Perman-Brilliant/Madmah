package b21;

public class Q3 {

    public static Q3MyString special(Q3MyString ms) {
        Q3MyString output = new Q3MyString();
        while (!ms.isEmpty()) {
            char current = ms.firstChar();
            for (int i = 0; i < ms.countChar(current); i++) {
                output.appendChar(current);
            }
            ms.remove(current);
        }
        return output;
    }
}
