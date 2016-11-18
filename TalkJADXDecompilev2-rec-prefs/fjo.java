package p000;

public final class fjo implements fok {
    private final String f13215a;
    private final byte[] f13216b;
    private final long f13217c;
    private final boolean f13218d;
    private int f13219e = 0;
    private final String f13220f;
    private String f13221g;

    public fjo(String str, byte[] bArr, long j, boolean z) {
        this.f13215a = str;
        this.f13216b = bArr;
        this.f13217c = j;
        this.f13218d = z;
        this.f13220f = glk.m17967a(new Throwable());
    }

    public int L_() {
        return this.f13219e;
    }

    public void mo1023b(int i) {
        this.f13219e = i;
    }

    public ead mo1021a() {
        return new fjm(this);
    }

    public void d_(String str) {
        this.f13221g = str;
    }

    public String toString() {
        String str = this.f13215a;
        int length = this.f13216b.length;
        long j = this.f13217c;
        boolean z = this.f13218d;
        String str2 = this.f13220f;
        String str3 = this.f13221g;
        return new StringBuilder(((String.valueOf(str).length() + 159) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("retrive mms request: content location=").append(str).append(" len(transactionId)=").append(length).append(" notificationRowId=").append(j).append(" autoRetrieve=").append(z).append("\nCreation stack:\n").append(str2).append("\nOrigin stack:\n").append(str3).toString();
    }

    public String m15452c() {
        return this.f13215a;
    }

    public byte[] m15453d() {
        return this.f13216b;
    }

    public long m15454e() {
        return this.f13217c;
    }

    public boolean m15455f() {
        return this.f13218d;
    }

    public boolean mo1022a(int i) {
        return false;
    }
}
