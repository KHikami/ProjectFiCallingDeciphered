package defpackage;

public final class ojj<T> {
    private final String a;

    private ojj(String str) {
        this.a = str;
    }

    public String toString() {
        return this.a;
    }

    public static <T> ojj<T> a(String str) {
        return new ojj(str);
    }
}
