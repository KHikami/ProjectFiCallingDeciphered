package p000;

import java.io.Serializable;

final class mmp<T> extends mms<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final mms<? super T> f27913a;

    mmp(mms<? super T> mms__super_T) {
        this.f27913a = mms__super_T;
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
        return this.f27913a.compare(t, t2);
    }

    public <S extends T> mms<S> mo3888c() {
        return this.f27913a.mo3888c().mo3887b();
    }

    public <S extends T> mms<S> mo3886a() {
        return this;
    }

    public <S extends T> mms<S> mo3887b() {
        return this.f27913a.mo3887b();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mmp)) {
            return false;
        }
        return this.f27913a.equals(((mmp) obj).f27913a);
    }

    public int hashCode() {
        return this.f27913a.hashCode() ^ 957692532;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27913a);
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append(valueOf).append(".nullsFirst()").toString();
    }
}
