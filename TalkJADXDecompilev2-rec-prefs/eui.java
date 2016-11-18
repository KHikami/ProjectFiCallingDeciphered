package p000;

import java.util.concurrent.TimeUnit;

public class eui extends euc {
    private static final long serialVersionUID = 1;
    public final String f12294c;
    private final byte[] f12295d;
    private final boolean f12296e;

    public eui(String str, mav mav, boolean z) {
        this.f12294c = str;
        nzf lzz = new lzz();
        lzz.f27076b = mav;
        this.f12295d = nzf.m1029a(lzz);
        this.f12296e = z;
    }

    public nzf mo1944a(String str, int i, int i2) {
        try {
            lzz lzz = (lzz) nzf.m1027a(new lzz(), this.f12295d);
            lzz.requestHeader = euk.m14556a(str, i, i2, this.i);
            lzz.requestHeader.f26512g = euc.m14534a(this.f12296e);
            lzz.f27075a = this.f12294c;
            lzz.f27076b.f27178u = Long.valueOf(glj.m17956a());
            gwb.m2198f(2015);
            return lzz;
        } catch (nzd e) {
            return null;
        }
    }

    public String mo1947g() {
        return "media_sessions/log";
    }

    public long mo1017b() {
        return TimeUnit.DAYS.toMillis(2);
    }
}
