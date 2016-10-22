package defpackage;

import java.io.Serializable;

/* renamed from: mne */
final class mne extends mms<Comparable> implements Serializable {
    static final mne a;
    private static final long serialVersionUID = 0;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        bm.a((Object) comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    static {
        a = new mne();
    }

    private Object readResolve() {
        return a;
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    private mne() {
    }

    public <S extends Comparable> mms<S> c() {
        return mmo.a;
    }
}
