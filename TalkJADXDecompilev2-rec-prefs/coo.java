package p000;

public final class coo implements fok {
    public final String f8719a;
    public String f8720b;
    private final String f8721c;
    private final String f8722d;
    private final edo f8723e;
    private int f8724f = 0;

    public coo(String str, String str2, String str3) {
        this.f8721c = str;
        this.f8722d = str2;
        this.f8719a = glk.m17967a(new Throwable());
        if (str3 != null) {
            fbt a = fbt.m14917a(str3);
            this.f8723e = new edo(a.f12658a, a.f12659b);
            return;
        }
        this.f8723e = null;
    }

    public String m10541c() {
        return this.f8721c;
    }

    public String m10542d() {
        return this.f8722d;
    }

    public edo m10543e() {
        return this.f8723e;
    }

    public ead mo1021a() {
        return new com(this);
    }

    public void mo1023b(int i) {
        this.f8724f = i;
    }

    public int L_() {
        return this.f8724f;
    }

    public void d_(String str) {
        this.f8720b = str;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f8723e);
        String str = this.f8722d;
        String str2 = this.f8721c;
        String str3 = this.f8719a;
        String str4 = this.f8720b;
        return new StringBuilder(((((String.valueOf(valueOf).length() + 107) + String.valueOf(str).length()) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("remove participant request: participantId=").append(valueOf).append("conversationId=").append(str).append("clientGeneratedId=").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }

    public boolean mo1022a(int i) {
        return fdq.f12772N.m14370b(i);
    }
}
