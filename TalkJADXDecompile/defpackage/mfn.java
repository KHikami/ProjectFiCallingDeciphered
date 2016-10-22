package defpackage;

/* renamed from: mfn */
final class mfn<T> extends mfa<T> {
    private static final long serialVersionUID = 0;
    private final T a;

    mfn(T t) {
        this.a = t;
    }

    public boolean a() {
        return true;
    }

    public T b() {
        return this.a;
    }

    public T a(T t) {
        bm.a((Object) t, (Object) "use Optional.orNull() instead of Optional.or(null)");
        return this.a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof mfn)) {
            return false;
        }
        return this.a.equals(((mfn) obj).a);
    }

    public int hashCode() {
        return 1502476572 + this.a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        return new StringBuilder(String.valueOf(valueOf).length() + 13).append("Optional.of(").append(valueOf).append(")").toString();
    }
}
