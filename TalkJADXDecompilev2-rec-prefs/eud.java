package p000;

public class eud extends euc {
    private static final long serialVersionUID = 1;
    private final int f12286c;
    private final String f12287d;
    private final int f12288e;

    public eud(int i, String str, int i2) {
        this.f12286c = i;
        this.f12288e = i2;
        this.f12287d = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lyi = new lyi();
        lyi.requestHeader = euk.m14556a(str, i, i2, this.i);
        lyi.requestHeader.f26512g = euc.m14534a(false);
        lyh lyh = new lyh();
        lyh.f26867b = Integer.valueOf(this.f12286c);
        lyh.f26878m = Integer.valueOf(this.f12288e);
        if (this.f12287d != null) {
            lyh.f26872g = this.f12287d;
        }
        lyi.f26892a = lyh;
        return lyi;
    }

    public String mo1947g() {
        return "hangouts/add";
    }

    public long mo1017b() {
        return did.m11926E();
    }

    public String K_() {
        return "ui_queue";
    }
}
