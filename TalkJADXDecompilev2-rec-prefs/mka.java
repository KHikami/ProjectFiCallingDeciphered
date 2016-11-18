package p000;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Set;

abstract class mka<K, V> extends mjx<K, V> {
    abstract mny<Entry<K, V>> mo3848b();

    mka() {
    }

    public /* synthetic */ Set entrySet() {
        return super.mo3873e();
    }

    public /* synthetic */ Set keySet() {
        return super.mo3874g();
    }

    public /* synthetic */ Collection values() {
        return super.mo3833c();
    }

    mks<Entry<K, V>> mo3845f() {
        return new mkb(this);
    }
}
