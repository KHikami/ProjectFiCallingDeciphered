package p000;

public final class fjw implements fok {
    public final long f13281a;
    private final String f13282b;
    private final String f13283c;
    private final String f13284d;
    private final String f13285e;
    private final long f13286f;
    private final String f13287g;
    private final long f13288h;
    private int f13289i = 0;
    private final String f13290j = glk.m17967a(new Throwable());
    private String f13291k;

    fjw(fjx fjx) {
        this.f13281a = fjx.f13292a;
        this.f13282b = fjx.f13293b;
        this.f13283c = fjx.f13294c;
        this.f13284d = fjx.f13295d;
        this.f13285e = fjx.f13296e;
        this.f13286f = fjx.f13297f;
        this.f13287g = fjx.f13298g;
        this.f13288h = fjx.f13299h;
    }

    public long m15507c() {
        return this.f13281a;
    }

    public String m15508d() {
        return this.f13282b;
    }

    public String m15509e() {
        return this.f13283c;
    }

    public String m15510f() {
        return this.f13284d;
    }

    public String m15511g() {
        return this.f13285e;
    }

    public long m15512h() {
        return this.f13286f;
    }

    public String m15513i() {
        return this.f13287g;
    }

    public long m15514j() {
        return this.f13288h;
    }

    public int L_() {
        return this.f13289i;
    }

    public void mo1023b(int i) {
        this.f13289i = i;
    }

    public void d_(String str) {
        this.f13291k = str;
    }

    public ead mo1021a() {
        return new fjv(this);
    }

    public boolean mo1022a(int i) {
        return false;
    }

    public String toString() {
        long j = this.f13281a;
        String str = this.f13282b;
        String str2 = this.f13283c;
        String str3 = this.f13284d;
        String valueOf = String.valueOf(glk.m17974b(this.f13285e));
        long j2 = this.f13286f;
        String str4 = this.f13287g;
        long j3 = this.f13288h;
        int i = this.f13289i;
        String str5 = this.f13290j;
        String str6 = this.f13291k;
        return new StringBuilder(((((((String.valueOf(str).length() + 242) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()).append("SendSmsRequest [timestampMicro=").append(j).append(", clientGeneratedId=").append(str).append(", conversationId=").append(str2).append(", phone=").append(str3).append(", text=").append(valueOf).append(", smsThreadId=").append(j2).append(", serviceCenter=").append(str4).append(", messageRowId=").append(j3).append(", requestId=").append(i).append(", creationStack=").append(str5).append(", originStack=").append(str6).append("]").toString();
    }
}
