public final class fjo implements fok {
    private final String a;
    private final byte[] b;
    private final long c;
    private final boolean d;
    private int e;
    private final String f;
    private String g;

    public fjo(String str, byte[] bArr, long j, boolean z) {
        this.e = 0;
        this.a = str;
        this.b = bArr;
        this.c = j;
        this.d = z;
        this.f = glk.a(new Throwable());
    }

    public int L_() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public ead a() {
        return new fjm(this);
    }

    public void d_(String str) {
        this.g = str;
    }

    public String toString() {
        String str = this.a;
        int length = this.b.length;
        long j = this.c;
        boolean z = this.d;
        String str2 = this.f;
        String str3 = this.g;
        return new StringBuilder(((String.valueOf(str).length() + 159) + String.valueOf(str2).length()) + String.valueOf(str3).length()).append("retrive mms request: content location=").append(str).append(" len(transactionId)=").append(length).append(" notificationRowId=").append(j).append(" autoRetrieve=").append(z).append("\nCreation stack:\n").append(str2).append("\nOrigin stack:\n").append(str3).toString();
    }

    public String c() {
        return this.a;
    }

    public byte[] d() {
        return this.b;
    }

    public long e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    public boolean a(int i) {
        return false;
    }
}
