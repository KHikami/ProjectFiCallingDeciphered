package p000;

import java.util.Arrays;

public final class fjr implements fok {
    public final long f13226a;
    private final String f13227b;
    private final String f13228c;
    private final String[] f13229d;
    private final String f13230e;
    private final String f13231f;
    private final String f13232g;
    private final String f13233h;
    private final int f13234i;
    private final int f13235j;
    private final int f13236k;
    private final String f13237l;
    private final int f13238m;
    private final long f13239n;
    private int f13240o = 0;
    private final String f13241p = glk.m17967a(new Throwable());
    private String f13242q;

    fjr(fjs fjs) {
        this.f13226a = fjs.f13243a;
        this.f13227b = fjs.f13244b;
        this.f13228c = fjs.f13245c;
        this.f13229d = fjs.f13246d;
        this.f13230e = fjs.f13247e;
        this.f13231f = fjs.f13248f;
        this.f13232g = fjs.f13249g;
        this.f13233h = fjs.f13250h;
        this.f13234i = fjs.f13251i;
        this.f13235j = fjs.f13252j;
        this.f13236k = fjs.f13253k;
        this.f13237l = fjs.f13254l;
        this.f13238m = fjs.f13255m;
        this.f13239n = fjs.f13256n;
    }

    public long m15468c() {
        return this.f13226a;
    }

    public String m15469d() {
        return this.f13227b;
    }

    public String m15470e() {
        return this.f13228c;
    }

    public String[] m15471f() {
        return this.f13229d;
    }

    public String m15472g() {
        return this.f13230e;
    }

    public String m15473h() {
        return this.f13231f;
    }

    public String m15474i() {
        return this.f13232g;
    }

    public String m15475j() {
        return this.f13233h;
    }

    public int m15476k() {
        return this.f13234i;
    }

    public int m15477l() {
        return this.f13235j;
    }

    public int m15478m() {
        return this.f13236k;
    }

    public String m15479n() {
        return this.f13237l;
    }

    public long m15480o() {
        return this.f13239n;
    }

    public int L_() {
        return this.f13240o;
    }

    public void mo1023b(int i) {
        this.f13240o = i;
    }

    public void d_(String str) {
        this.f13242q = str;
    }

    public ead mo1021a() {
        return new fjq(this);
    }

    public String toString() {
        long j = this.f13226a;
        String str = this.f13227b;
        String str2 = this.f13228c;
        String valueOf = String.valueOf(Arrays.toString(this.f13229d));
        String valueOf2 = String.valueOf(glk.m17974b(this.f13230e));
        String valueOf3 = String.valueOf(glk.m17974b(this.f13231f));
        String str3 = this.f13232g;
        String str4 = this.f13233h;
        int i = this.f13234i;
        int i2 = this.f13235j;
        int i3 = this.f13236k;
        String str5 = this.f13237l;
        int i4 = this.f13238m;
        long j2 = this.f13239n;
        int i5 = this.f13240o;
        String str6 = this.f13241p;
        String str7 = this.f13242q;
        return new StringBuilder((((((((((String.valueOf(str).length() + 343) + String.valueOf(str2).length()) + String.valueOf(valueOf).length()) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()) + String.valueOf(str5).length()) + String.valueOf(str6).length()) + String.valueOf(str7).length()).append("SendMmsRequest [timestampMicro=").append(j).append(", clientGeneratedId=").append(str).append(", conversationId=").append(str2).append(", recipients=").append(valueOf).append(", subject=").append(valueOf2).append(", text=").append(valueOf3).append(", attachmentUri=").append(str3).append(", contentType=").append(str4).append(", width=").append(i).append(", height=").append(i2).append(", rotation=").append(i3).append(", forwardPduUri=").append(str5).append(", attachmentCount=").append(i4).append(", messageRowId=").append(j2).append(", requestId=").append(i5).append(", creationStack=").append(str6).append(", originStack=").append(str7).append("]").toString();
    }

    public boolean mo1022a(int i) {
        return false;
    }
}
