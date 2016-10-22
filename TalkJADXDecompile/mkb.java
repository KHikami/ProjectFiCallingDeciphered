import java.util.Iterator;
import java.util.Map.Entry;

final class mkb extends mkg<K, V> {
    final /* synthetic */ mka a;

    public /* synthetic */ Iterator iterator() {
        return a();
    }

    mkb(mka mka) {
        this.a = mka;
    }

    mjx<K, V> b() {
        return this.a;
    }

    public mny<Entry<K, V>> a() {
        return this.a.b();
    }
}
