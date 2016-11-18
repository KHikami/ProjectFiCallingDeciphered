package p000;

public class eva extends esw {
    private static final long serialVersionUID = 1;
    public final String f12340c;
    public final String f12341d;

    public eva(bko bko, String str) {
        if (((fzw) jyn.m25426a(gwb.m1400H(), fzw.class)).mo2148b(bko.m5638g())) {
            this.f12340c = bko.m5615B();
        } else if (bko.m5650s()) {
            this.f12340c = bko.m5652u();
        } else {
            this.f12340c = "";
        }
        this.f12341d = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf lrk = new lrk();
        lrk.requestHeader = euk.m14556a(str, i, i2, this.i);
        lrk.f26217a = new muu();
        lrk.f26217a.f28411a = this.f12340c;
        lrk.f26218b = new muu();
        lrk.f26217a.f28411a = this.f12341d;
        return lrk;
    }

    public String mo1947g() {
        return "conversations/getoffnetworkinviteurl";
    }
}
