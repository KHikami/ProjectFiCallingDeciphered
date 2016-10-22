import java.io.Serializable;

public final class mmo extends mms<Comparable> implements Serializable {
    public static final mmo a;
    private static final long serialVersionUID = 0;
    private transient mms<Comparable> b;
    private transient mms<Comparable> c;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        obj = (Comparable) obj;
        obj2 = (Comparable) obj2;
        bm.a(obj);
        bm.a(obj2);
        return obj.compareTo(obj2);
    }

    static {
        a = new mmo();
    }

    public <S extends Comparable> mms<S> a() {
        mms<S> mms_S = this.b;
        if (mms_S != null) {
            return mms_S;
        }
        mms_S = super.a();
        this.b = mms_S;
        return mms_S;
    }

    public <S extends Comparable> mms<S> b() {
        mms<S> mms_S = this.c;
        if (mms_S != null) {
            return mms_S;
        }
        mms_S = super.b();
        this.c = mms_S;
        return mms_S;
    }

    public <S extends Comparable> mms<S> c() {
        return mne.a;
    }

    private Object readResolve() {
        return a;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    private mmo() {
    }
}
