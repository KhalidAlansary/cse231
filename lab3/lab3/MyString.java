package lab3;

public class MyString {
    char[] buffer;

    public MyString(String str) {
        buffer = str.toCharArray();
    }

    public void print() {
        System.out.println(buffer);
    }

    public int indexOf(char c) {
        return new String(buffer).indexOf(c);
    }

    public int length() {
        return buffer.length;
    }

    public MyString erase(int index, int length) {
        return new MyString(new String(buffer).substring(0, index) + new String(buffer).substring(index + length));
    }

    public MyString insert(int index, String str) {
        return new MyString(new String(buffer).substring(0, index) + str + new String(buffer).substring(index));
    }
}
