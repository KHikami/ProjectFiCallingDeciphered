package p000;

public final class coh implements fok {
    private static final long serialVersionUID = 1;
    private final int f5818a;
    private final String f5819b;
    private final String f5820c;
    private int f5821d = 0;
    private final String f5822e;
    private String f5823f;

    public coh(String str, String str2, int i) {
        this.f5820c = str;
        this.f5819b = str2;
        this.f5818a = i;
        this.f5822e = glk.m17967a(new Throwable());
    }

    public String m8157c() {
        return this.f5820c;
    }

    public String m8158d() {
        return this.f5819b;
    }

    public int L_() {
        return this.f5821d;
    }

    public void mo1023b(int i) {
        this.f5821d = i;
    }

    public ead mo1021a() {
        return new cof(this);
    }

    public void d_(String str) {
        this.f5823f = str;
    }

    public String toString() {
        int i = this.f5818a;
        String str = this.f5819b;
        String str2 = this.f5820c;
        String str3 = this.f5822e;
        String str4 = this.f5823f;
        return new StringBuilder((((String.valueOf(str).length() + 109) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(str4).length()).append("modify OTR request: newOtrStatus=").append(i).append("conversationId=").append(str).append("clientGeneratedId=").append(str2).append("\nCreation stack:\n").append(str3).append("\nOrigin stack:\n").append(str4).toString();
    }

    public int m8159e() {
        return this.f5818a;
    }

    public boolean mo1022a(int i) {
        return fdq.f12772N.m14370b(i);
    }
}
