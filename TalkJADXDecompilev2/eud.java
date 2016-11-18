package defpackage;

public class eud extends euc {
    private static final long serialVersionUID = 1;
    private final int c;
    private final String d;
    private final int e;

    public eud(int i, String str, int i2) {
        this.c = i;
        this.e = i2;
        this.d = str;
    }

    public nzf a(String str, int i, int i2) {
        nzf lyi = new lyi();
        lyi.requestHeader = euk.a(str, i, i2, this.i);
        lyi.requestHeader.g = euc.a(false);
        lyh lyh = new lyh();
        lyh.b = Integer.valueOf(this.c);
        lyh.m = Integer.valueOf(this.e);
        if (this.d != null) {
            lyh.g = this.d;
        }
        lyi.a = lyh;
        return lyi;
    }

    public String g() {
        return "hangouts/add";
    }

    public long b() {
        return did.E();
    }

    public String K_() {
        return "ui_queue";
    }
}
