package defpackage;

/* renamed from: fjw */
public final class fjw implements fok {
    public final long a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final String g;
    private final long h;
    private int i;
    private final String j;
    private String k;

    fjw(fjx fjx) {
        this.i = 0;
        this.j = glk.a(new Throwable());
        this.a = fjx.a;
        this.b = fjx.b;
        this.c = fjx.c;
        this.d = fjx.d;
        this.e = fjx.e;
        this.f = fjx.f;
        this.g = fjx.g;
        this.h = fjx.h;
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

    public String f() {
        return this.d;
    }

    public String g() {
        return this.e;
    }

    public long h() {
        return this.f;
    }

    public String i() {
        return this.g;
    }

    public long j() {
        return this.h;
    }

    public int L_() {
        return this.i;
    }

    public void b(int i) {
        this.i = i;
    }

    public void d_(String str) {
        this.k = str;
    }

    public ead a() {
        return new fjv(this);
    }

    public boolean a(int i) {
        return false;
    }

    public String toString() {
        long j = this.a;
        String str = this.b;
        String str2 = this.c;
        String str3 = this.d;
        String valueOf = String.valueOf(glk.b(this.e));
        long j2 = this.f;
        String str4 = this.g;
        long j3 = this.h;
        int i = this.i;
        String str5 = this.j;
        String str6 = this.k;
        return new StringBuilder(((((((String.valueOf(str).length() + 242) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()).append("SendSmsRequest [timestampMicro=").append(j).append(", clientGeneratedId=").append(str).append(", conversationId=").append(str2).append(", phone=").append(str3).append(", text=").append(valueOf).append(", smsThreadId=").append(j2).append(", serviceCenter=").append(str4).append(", messageRowId=").append(j3).append(", requestId=").append(i).append(", creationStack=").append(str5).append(", originStack=").append(str6).append("]").toString();
    }
}
