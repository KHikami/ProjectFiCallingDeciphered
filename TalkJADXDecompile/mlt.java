import java.util.Map.Entry;

final class mlt extends mir<K, V> {
    final /* synthetic */ Entry a;

    mlt(Entry entry) {
        this.a = entry;
    }

    public K getKey() {
        return this.a.getKey();
    }

    public V getValue() {
        return this.a.getValue();
    }
}
