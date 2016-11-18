package p000;

public class cpa implements fok {
    private static final long serialVersionUID = 1;
    private String f5834a;
    private String f5835b;
    private String f5836c;
    private mjq<fpd> f5837d;
    private mjq<bxn> f5838e;
    private mjq<String> f5839f;
    private long f5840g;
    private boolean f5841h;
    private boolean f5842i;
    private int f5843j;
    private String f5844k;
    private int f5845l;
    private int f5846m;
    private String f5847n = glk.m17967a(new Throwable());
    private String f5848o;

    protected cpa(cpb cpb) {
        this.f5834a = cpb.f8757a;
        this.f5835b = cpb.f8758b;
        this.f5836c = cpb.f8759c;
        this.f5837d = mjq.m32314a(cpb.f8760d);
        this.f5838e = mjq.m32314a(cpb.f8761e);
        this.f5839f = mjq.m32314a(cpb.f8762f);
        this.f5840g = cpb.f8763g;
        this.f5841h = cpb.f8764h;
        this.f5842i = cpb.f8765i;
        this.f5843j = cpb.f8766j;
        this.f5844k = cpb.f8767k;
        this.f5845l = cpb.f8768l;
    }

    public String m8180c() {
        return this.f5834a;
    }

    public String m8181d() {
        return this.f5835b;
    }

    public String m8182e() {
        return this.f5836c;
    }

    public mjq<fpd> m8183f() {
        return this.f5837d;
    }

    public mjq<bxn> m8184g() {
        return this.f5838e;
    }

    public mjq<String> m8185h() {
        return this.f5839f;
    }

    public long m8186i() {
        return this.f5840g;
    }

    public boolean m8187j() {
        return this.f5841h;
    }

    public boolean m8188k() {
        return this.f5842i;
    }

    public int m8189l() {
        return this.f5843j;
    }

    public String m8190m() {
        return this.f5844k;
    }

    public int m8191n() {
        return this.f5845l;
    }

    public int L_() {
        return this.f5846m;
    }

    public void mo1023b(int i) {
        this.f5846m = i;
    }

    public void d_(String str) {
        this.f5848o = str;
    }

    public ead mo1021a() {
        return new coy(this);
    }

    public String toString() {
        String str = this.f5834a;
        String str2 = this.f5835b;
        String valueOf = String.valueOf(this.f5837d.toString());
        String valueOf2 = String.valueOf(this.f5838e.toString());
        boolean z = this.f5841h;
        boolean z2 = this.f5842i;
        int i = this.f5843j;
        String str3 = this.f5844k;
        long j = this.f5840g;
        int i2 = this.f5846m;
        String str4 = this.f5847n;
        String str5 = this.f5848o;
        return new StringBuilder(((((((String.valueOf(str).length() + 259) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()).append("SendMultiAttachmentRequest [clientGeneratedId=").append(str).append(", conversationId=").append(str2).append(", text=").append(valueOf).append(", attachments=").append(valueOf2).append(", isOffRecord=").append(z).append(", inContingency=").append(z2).append(", transportType=").append(i).append(", transportPhone=").append(str3).append(", sequenceNumber=").append(j).append(", requestId=").append(i2).append(", creationStack=").append(str4).append(", originStack=").append(str5).append("]").toString();
    }

    public boolean mo1022a(int i) {
        return fdq.f12772N.m14370b(i);
    }
}
