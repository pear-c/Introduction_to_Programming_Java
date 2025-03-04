package Chap_10;

import java.util.Map;
import java.util.TreeMap;

public class PhoneDirectory {
    private TreeMap<String, String> treeMap;

    public PhoneDirectory() {
        treeMap = new TreeMap<>();
    }

    public String getNumber(String name) {
        return treeMap.get(name);
    }

    public void putNumber(String name, String number) {
        if(name == null || number == null)
            throw new IllegalArgumentException("name and number cannot be null");

        treeMap.put(name, number);
    }
}
