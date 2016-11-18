package p000;

import java.io.Serializable;

final class mmq<T> extends mms<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final mms<? super T> f27914a;

    mmq(mms<? super T> mms__super_T) {
        this.f27914a = mms__super_T;
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
        return this.f27914a.compare(t, t2);
    }

    public <S extends T> mms<S> mo3888c() {
        return this.f27914a.mo3888c().mo3886a();
    }

    public <S extends T> mms<S> mo3886a() {
        return this.f27914a.mo3886a();
    }

    public <S extends T> mms<S> mo3887b() {
        return this;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mmq)) {
            return false;
        }
        return this.f27914a.equals(((mmq) obj).f27914a);
    }

    public int hashCode() {
        return this.f27914a.hashCode() ^ -921210296;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27914a);
        return new StringBuilder(String.valueOf(valueOf).length() + 12).append(valueOf).append(".nullsLast()").toString();
    }
}
