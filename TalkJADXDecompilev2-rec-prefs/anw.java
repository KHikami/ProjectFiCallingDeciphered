package p000;

import java.security.MessageDigest;

public final class anw<T> {
    public static final any<Object> f1946a = new anx();
    private final T f1947b;
    private final any<T> f1948c;
    private final String f1949d;
    private volatile byte[] f1950e;

    public static <T> anw<T> m3521a(String str, T t) {
        return new anw(str, t, f1946a);
    }

    public static <T> anw<T> m3522a(String str, T t, any<T> any_T) {
        return new anw(str, t, any_T);
    }

    public anw(String str, T t, any<T> any_T) {
        this.f1949d = gwb.m2289l(str);
        this.f1947b = t;
        this.f1948c = (any) gwb.m1404I((Object) any_T);
    }

    public T m3523a() {
        return this.f1947b;
    }

    public void m3524a(T t, MessageDigest messageDigest) {
        any any = this.f1948c;
        if (this.f1950e == null) {
            this.f1950e = this.f1949d.getBytes(anv.f1945a);
        }
        any.mo307a(this.f1950e, t, messageDigest);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof anw)) {
            return false;
        }
        return this.f1949d.equals(((anw) obj).f1949d);
    }

    public int hashCode() {
        return this.f1949d.hashCode();
    }

    public String toString() {
        String str = this.f1949d;
        return new StringBuilder(String.valueOf(str).length() + 14).append("Option{key='").append(str).append("'}").toString();
    }
}
