package Chap_10;

public class Entry {
    String key;
    String value;
    Entry next;

    public Entry(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}
