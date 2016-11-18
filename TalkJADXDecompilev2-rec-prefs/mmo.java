package p000;

import java.io.Serializable;

public final class mmo extends mms<Comparable> implements Serializable {
    public static final mmo f27910a = new mmo();
    private static final long serialVersionUID = 0;
    private transient mms<Comparable> f27911b;
    private transient mms<Comparable> f27912c;

    public /* synthetic */ int compare(Object obj, Object obj2) {
        obj = (Comparable) obj;
        obj2 = (Comparable) obj2;
        bm.m6122a(obj);
        bm.m6122a(obj2);
        return obj.compareTo(obj2);
    }

    public <S extends Comparable> mms<S> mo3886a() {
        mms<S> mms_S = this.f27911b;
        if (mms_S != null) {
            return mms_S;
        }
        mms_S = super.mo3886a();
        this.f27911b = mms_S;
        return mms_S;
    }

    public <S extends Comparable> mms<S> mo3887b() {
        mms<S> mms_S = this.f27912c;
        if (mms_S != null) {
            return mms_S;
        }
        mms_S = super.mo3887b();
        this.f27912c = mms_S;
        return mms_S;
    }

    public <S extends Comparable> mms<S> mo3888c() {
        return mne.f27942a;
    }

    private Object readResolve() {
        return f27910a;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    private mmo() {
    }
}
