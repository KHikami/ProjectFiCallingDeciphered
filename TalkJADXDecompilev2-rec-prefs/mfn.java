package p000;

final class mfn<T> extends mfa<T> {
    private static final long serialVersionUID = 0;
    private final T f27616a;

    mfn(T t) {
        this.f27616a = t;
    }

    public boolean mo3733a() {
        return true;
    }

    public T mo3734b() {
        return this.f27616a;
    }

    public T mo3732a(T t) {
        bm.m6123a((Object) t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.f27616a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfn)) {
            return false;
        }
        return this.f27616a.equals(((mfn) obj).f27616a);
    }

    public int hashCode() {
        return 1502476572 + this.f27616a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f27616a);
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append("Optional.of(").append(valueOf).append(")").toString();
    }
}
