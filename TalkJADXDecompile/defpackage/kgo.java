package defpackage;

import java.util.Iterator;

/* renamed from: kgo */
public final class kgo implements Iterable<T> {
    final /* synthetic */ Object a;

    public kgo(Object obj) {
        this.a = obj;
    }

    public Iterator<T> iterator() {
        return new kgp(this);
    }
}
