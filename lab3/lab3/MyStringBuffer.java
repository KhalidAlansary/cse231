package lab3;

public class MyStringBuffer {
    char[] buffer;

    public MyStringBuffer(String str) {
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

    public void erase(int index, int length) {
        buffer = (new String(buffer).substring(0, index) + new String(buffer).substring(index + length)).toCharArray();
    }

    public void insert(int index, String str) {
        buffer = (new String(buffer).substring(0, index) + str + new String(buffer).substring(index)).toCharArray();
    }
}
