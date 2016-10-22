package defpackage;

/* renamed from: coh */
public final class coh implements fok {
    private static final long serialVersionUID = 1;
    private final int a;
    private final String b;
    private final String c;
    private int d;
    private final String e;
    private String f;

    public coh(String str, String str2, int i) {
        this.d = 0;
        this.c = str;
        this.b = str2;
        this.a = i;
        this.e = glk.a(new Throwable());
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.b;
    }

    public int L_() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public ead a() {
        return new cof(this);
    }

    public void d_(String str) {
        this.f = str;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.e;
        String str4 = this.f;
        return new StringBuilder((((String.valueOf(str).length() + 109) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("modify OTR request: newOtrStatus=").append(i).append("conversationId=").append(str).append("clientGeneratedId=").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }

    public int e() {
        return this.a;
    }

    public boolean a(int i) {
        return fdq.N.b(i);
    }
}
