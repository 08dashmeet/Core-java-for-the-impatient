package HashMapDataStructure;
class Entry {
    String key;
    String value;
    Entry next;

    Entry(String k, String v) {
        key = k;
        value = v;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getKey() {
        return key;
    }
}
