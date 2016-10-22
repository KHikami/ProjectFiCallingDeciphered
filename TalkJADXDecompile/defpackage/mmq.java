package defpackage;

import java.io.Serializable;

/* renamed from: mmq */
final class mmq<T> extends mms<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final mms<? super T> a;

    mmq(mms<? super T> mms__super_T) {
        this.a = mms__super_T;
    }

    public int compare(T t, T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return 1;
        }
        if (t2 == null) {
            return -1;
        }
        return this.a.compare(t, t2);
    }

    public <S extends T> mms<S> c() {
        return this.a.c().a();
    }

    public <S extends T> mms<S> a() {
        return this.a.a();
    }

    public <S extends T> mms<S> b() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mmq)) {
            return false;
        }
        return this.a.equals(((mmq) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode() ^ -921210296;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append(".nullsLast()").toString();
    }
}
