package defpackage;

import java.io.Serializable;

final class mmp<T> extends mms<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final mms<? super T> a;

    mmp(mms<? super T> mms__super_T) {
        this.a = mms__super_T;
    }

    public int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return this.a.compare(t, t2);
    }

    public <S extends T> mms<S> c() {
        return this.a.c().b();
    }

    public <S extends T> mms<S> a() {
        return this;
    }

    public <S extends T> mms<S> b() {
        return this.a.b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mmp)) {
            return false;
        }
        return this.a.equals(((mmp) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ 957692532;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append(".nullsFirst()").toString();
    }
}
