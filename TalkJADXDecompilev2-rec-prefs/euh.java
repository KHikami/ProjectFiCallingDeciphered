package p000;

import java.util.concurrent.TimeUnit;

public class euh extends euc {
    private static final long serialVersionUID = 1;
    private final byte[] f12293c;

    public euh(byte[] bArr) {
        this.f12293c = bArr;
    }

    public nzf mo1944a(String str, int i, int i2) {
        nzf mbs = new mbs();
        try {
            mbr mbr = (mbr) nzf.m1027a(new mbr(), this.f12293c);
            mbs.requestHeader = euk.m14556a(str, i, i2, this.i);
            mbs.requestHeader.f26512g = euc.m14534a(false);
            mbs.f27269a = mbr;
            return mbs;
        } catch (Throwable e) {
            glk.m17980d("Babel", "Parse failed", e);
            return null;
        }
    }

    public String mo1947g() {
        return "hangout_invitations/ack";
    }

    public long mo1017b() {
        return TimeUnit.DAYS.toMillis(2);
    }
}
