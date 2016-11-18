package defpackage;

public final class mdv<T> extends mfa<T> {
    public static final mdv<Object> a = new mdv();
    private static final long serialVersionUID = 0;

    private mdv() {
    }

    public boolean a() {
        return false;
    }

    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public T a(T t) {
        return bm.a((Object) t, (Object) "use Optional.orNull() instead of Optional.or(null)");
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }

    private Object readResolve() {
        return a;
    }
}
