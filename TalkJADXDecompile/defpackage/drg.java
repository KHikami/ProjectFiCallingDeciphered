package defpackage;

/* renamed from: drg */
public final class drg extends drl {
    private final String c;
    private final String d;

    public drg(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public ead a() {
        return new dre(this);
    }

    public String c() {
        return this.d;
    }

    public String toString() {
        String str = this.d;
        String str2 = this.c;
        String str3 = this.a;
        String str4 = this.b;
        return new StringBuilder((((String.valueOf(str).length() + 95) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("get conversation URL request: conversationId=").append(str).append("clientGeneratedId=").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }
}
