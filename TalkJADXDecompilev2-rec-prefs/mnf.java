package p000;

import java.io.Serializable;

final class mnf<T> extends mms<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final mms<? super T> f27943a;

    mnf(mms<? super T> mms__super_T) {
        this.f27943a = (mms) bm.m6122a((Object) mms__super_T);
    }

    public int compare(T t, T t2) {
        return this.f27943a.compare(t2, t);
    }

    public <S extends T> mms<S> mo3888c() {
        return this.f27943a;
    }

    public int hashCode() {
        return -this.f27943a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mnf)) {
            return false;
        }
        return this.f27943a.equals(((mnf) obj).f27943a);
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27943a);
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append(valueOf).append(".reverse()").toString();
    }
}
