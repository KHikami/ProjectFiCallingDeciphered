package defpackage;

import java.util.concurrent.TimeUnit;

public class eui extends euc {
    private static final long serialVersionUID = 1;
    public final String c;
    private final byte[] d;
    private final boolean e;

    public eui(String str, mav mav, boolean z) {
        this.c = str;
        nzf lzz = new lzz();
        lzz.b = mav;
        this.d = nzf.a(lzz);
        this.e = z;
    }

    public nzf a(String str, int i, int i2) {
        try {
            lzz lzz = (lzz) nzf.a(new lzz(), this.d);
            lzz.requestHeader = euk.a(str, i, i2, this.i);
            lzz.requestHeader.g = euc.a(this.e);
            lzz.a = this.c;
            lzz.b.u = Long.valueOf(glj.a());
            gwb.f(2015);
            return lzz;
        } catch (nzd e) {
            return null;
        }
    }

    public String g() {
        return "media_sessions/log";
    }

    public long b() {
        return TimeUnit.DAYS.toMillis(2);
    }
}
