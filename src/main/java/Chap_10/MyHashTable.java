package Chap_10;


import java.util.LinkedList;

public class MyHashTable {
    private Entry[] table;
    private int size;

    public MyHashTable(int capacity) {
        table = new Entry[capacity];
        size = 0;
    }

    public void put(String key, String value) {
        int index = Math.abs(key.hashCode() % table.length);

        // 해당 인덱스에 값이 없는 경우, 새로운 엔트리 추가
        if(table[index] == null) {
            table[index] = new Entry(key, value);
        }
        // 이미 값이 있는 경우, 연결 리스트 탐색 후 key 가 존재하면 업데이트
        else {
            Entry current = table[index];
            while(current != null) {
                if(current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                if(current.next == null)
                    break;
                current = current.next;
            }
            // 리스트의 끝에 새로운 엔트리 추가
            current.next = new Entry(key, value);
        }
        size++;
    }

    public String get(String key) {
        int index = Math.abs(key.hashCode() % table.length);
        // 해당 인덱스 첫 번째 엔트리
        Entry current = table[index];

        while(current != null) {
            // 키 찾으면 반환
            if(current.key.equals(key)) {
                return current.value;
            }
            // 다음 노드 이동
            current = current.next;
        }
        // 해당 키가 없으면 null 반환
        return null;
    }

    public void remove(String key) {
        int index = Math.abs(key.hashCode() % table.length);

        Entry current = table[index];
        Entry prev = null;

        while(current != null) {
            if(current.key.equals(key)) {
                if(prev == null) {
                    // 첫번째 노드 삭제
                    table[index] = current.next;
                }
                else {
                    // 중간 or 마지막 노드 삭제
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public boolean containsKey(String key) {
        int index = Math.abs(key.hashCode() % table.length);

        Entry current = table[index];

        while(current != null) {
            if(current.key.equals(key)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }
}
