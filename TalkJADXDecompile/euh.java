import java.util.concurrent.TimeUnit;

public class euh extends euc {
    private static final long serialVersionUID = 1;
    private final byte[] c;

    public euh(byte[] bArr) {
        this.c = bArr;
    }

    public nzf a(String str, int i, int i2) {
        nzf mbs = new mbs();
        try {
            mbr mbr = (mbr) nzf.a(new mbr(), this.c);
            mbs.requestHeader = euk.a(str, i, i2, this.i);
            mbs.requestHeader.g = euc.a(false);
            mbs.a = mbr;
            return mbs;
        } catch (Throwable e) {
            glk.d("Babel", "Parse failed", e);
            return null;
        }
    }

    public String g() {
        return "hangout_invitations/ack";
    }

    public long b() {
        return TimeUnit.DAYS.toMillis(2);
    }
}
