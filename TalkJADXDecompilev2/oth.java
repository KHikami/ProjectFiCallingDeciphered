package defpackage;

public final class oth {
    private final String a;
    private final String b;

    oth(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(": ");
        stringBuilder.append(this.b);
        return stringBuilder.toString();
    }
}
