package defpackage;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

/* renamed from: mka */
abstract class mka<K, V> extends mjx<K, V> {
    abstract mny<Entry<K, V>> b();

    mka() {
    }

    public /* synthetic */ Set entrySet() {
        return super.e();
    }

    public /* synthetic */ Set keySet() {
        return super.g();
    }

    public /* synthetic */ Collection values() {
        return super.c();
    }

    mks<Entry<K, V>> f() {
        return new mkb(this);
    }
}
