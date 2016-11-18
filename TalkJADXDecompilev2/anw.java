package defpackage;

import java.security.MessageDigest;

public final class anw<T> {
    public static final any<Object> a = new anx();
    private final T b;
    private final any<T> c;
    private final String d;
    private volatile byte[] e;

    public static <T> anw<T> a(String str, T t) {
        return new anw(str, t, a);
    }

    public static <T> anw<T> a(String str, T t, any<T> any_T) {
        return new anw(str, t, any_T);
    }

    public anw(String str, T t, any<T> any_T) {
        this.d = gwb.l(str);
        this.b = t;
        this.c = (any) gwb.I((Object) any_T);
    }

    public T a() {
        return this.b;
    }

    public void a(T t, MessageDigest messageDigest) {
        any any = this.c;
        if (this.e == null) {
            this.e = this.d.getBytes(anv.a);
        }
        any.a(this.e, t, messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof anw)) {
            return false;
        }
        return this.d.equals(((anw) obj).d);
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        String str = this.d;
        return new StringBuilder(String.valueOf(str).length() + 14).append("Option{key='").append(str).append("'}").toString();
    }
}
