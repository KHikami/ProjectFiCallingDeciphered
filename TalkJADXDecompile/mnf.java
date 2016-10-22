import java.io.Serializable;

final class mnf<T> extends mms<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final mms<? super T> a;

    mnf(mms<? super T> mms__super_T) {
        this.a = (mms) bm.a((Object) mms__super_T);
    }

    public int compare(T t, T t2) {
        return this.a.compare(t2, t);
    }

    public <S extends T> mms<S> c() {
        return this.a;
    }

    public int hashCode() {
        return -this.a.hashCode();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mnf)) {
            return false;
        }
        return this.a.equals(((mnf) obj).a);
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 10).append(valueOf).append(".reverse()").toString();
    }
}
