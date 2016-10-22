package defpackage;

/* renamed from: coo */
public final class coo implements fok {
    public final String a;
    public String b;
    private final String c;
    private final String d;
    private final edo e;
    private int f;

    public coo(String str, String str2, String str3) {
        this.f = 0;
        this.c = str;
        this.d = str2;
        this.a = glk.a(new Throwable());
        if (str3 != null) {
            fbt a = fbt.a(str3);
            this.e = new edo(a.a, a.b);
            return;
        }
        this.e = null;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public edo e() {
        return this.e;
    }

    public ead a() {
        return new com(this);
    }

    public void b(int i) {
        this.f = i;
    }

    public int L_() {
        return this.f;
    }

    public void d_(String str) {
        this.b = str;
    }

    public String toString() {
        String valueOf = String.valueOf(this.e);
        String str = this.d;
        String str2 = this.c;
        String str3 = this.a;
        String str4 = this.b;
        return new StringBuilder(((((String.valueOf(valueOf).length() + 107) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("remove participant request: participantId=").append(valueOf).append("conversationId=").append(str).append("clientGeneratedId=").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }

    public boolean a(int i) {
        return fdq.N.b(i);
    }
}
