package defpackage;

import java.util.Arrays;

public final class fjr implements fok {
    public final long a;
    private final String b;
    private final String c;
    private final String[] d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final int i;
    private final int j;
    private final int k;
    private final String l;
    private final int m;
    private final long n;
    private int o = 0;
    private final String p = glk.a(new Throwable());
    private String q;

    fjr(fjs fjs) {
        this.a = fjs.a;
        this.b = fjs.b;
        this.c = fjs.c;
        this.d = fjs.d;
        this.e = fjs.e;
        this.f = fjs.f;
        this.g = fjs.g;
        this.h = fjs.h;
        this.i = fjs.i;
        this.j = fjs.j;
        this.k = fjs.k;
        this.l = fjs.l;
        this.m = fjs.m;
        this.n = fjs.n;
    }

    public long c() {
        return this.a;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public String[] f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public String h() {
        return this.f;
    }

    public String i() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public int k() {
        return this.i;
    }

    public int l() {
        return this.j;
    }

    public int m() {
        return this.k;
    }

    public String n() {
        return this.l;
    }

    public long o() {
        return this.n;
    }

    public int L_() {
        return this.o;
    }

    public void b(int i) {
        this.o = i;
    }

    public void d_(String str) {
        this.q = str;
    }

    public ead a() {
        return new fjq(this);
    }

    public String toString() {
        long j = this.a;
        String str = this.b;
        String str2 = this.c;
        String valueOf = String.valueOf(Arrays.toString(this.d));
        String valueOf2 = String.valueOf(glk.b(this.e));
        String valueOf3 = String.valueOf(glk.b(this.f));
        String str3 = this.g;
        String str4 = this.h;
        int i = this.i;
        int i2 = this.j;
        int i3 = this.k;
        String str5 = this.l;
        int i4 = this.m;
        long j2 = this.n;
        int i5 = this.o;
        String str6 = this.p;
        String str7 = this.q;
        return new StringBuilder((((((((((String.valueOf(str).length() + 343) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()).append("SendMmsRequest [timestampMicro=").append(j).append(", clientGeneratedId=").append(str).append(", conversationId=").append(str2).append(", recipients=").append(valueOf).append(", subject=").append(valueOf2).append(", text=").append(valueOf3).append(", attachmentUri=").append(str3).append(", contentType=").append(str4).append(", width=").append(i).append(", height=").append(i2).append(", rotation=").append(i3).append(", forwardPduUri=").append(str5).append(", attachmentCount=").append(i4).append(", messageRowId=").append(j2).append(", requestId=").append(i5).append(", creationStack=").append(str6).append(", originStack=").append(str7).append("]").toString();
    }

    public boolean a(int i) {
        return false;
    }
}
