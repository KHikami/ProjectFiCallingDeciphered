package defpackage;

public class eva extends esw {
    private static final long serialVersionUID = 1;
    public final String c;
    public final String d;

    public eva(bko bko, String str) {
        if (((fzw) jyn.a(gwb.H(), fzw.class)).b(bko.g())) {
            this.c = bko.B();
        } else if (bko.s()) {
            this.c = bko.u();
        } else {
            this.c = "";
        }
        this.d = str;
    }

    public nzf a(String str, int i, int i2) {
        nzf lrk = new lrk();
        lrk.requestHeader = euk.a(str, i, i2, this.i);
        lrk.a = new muu();
        lrk.a.a = this.c;
        lrk.b = new muu();
        lrk.a.a = this.d;
        return lrk;
    }

    public String g() {
        return "conversations/getoffnetworkinviteurl";
    }
}
