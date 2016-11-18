package p000;

public class ijk {
    public final ipr f17758a;
    public final ipv f17759b;
    public final ipy f17760c;
    public final iqb f17761d;
    public final iqe f17762e;

    public <T extends iji> T m21926a(Class<T> cls) {
        if (cls == ijb.class) {
            return this.f17760c;
        }
        if (cls == ijd.class) {
            return this.f17761d;
        }
        if (cls == ijf.class) {
            return this.f17762e;
        }
        if (cls == iix.class) {
            return this.f17758a;
        }
        if (cls == iiz.class) {
            return this.f17759b;
        }
        String str = "Unrecognized collection type ";
        String valueOf = String.valueOf(cls.getSimpleName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public ijk(ipu ipu, ijh ijh) {
        this.f17760c = new ipy(ipu, ijh);
        this.f17761d = new iqb(ipu, ijh);
        this.f17762e = new iqe(ipu, ijh);
        this.f17758a = new ipr(ipu, ijh);
        this.f17759b = new ipv(ipu, ijh);
    }

    public void m21927a(int i, int i2, byte[] bArr) {
        nzf nzf = null;
        switch (i) {
            case 0:
                ipy ipy = this.f17760c;
                if (bArr != null) {
                    lyh lyh = (lyh) nzf.m1027a(new lyh(), bArr);
                }
                ipy.m22864a(i2, nzf);
                return;
            case 1:
                iqb iqb = this.f17761d;
                if (bArr != null) {
                    lym lym = (lym) nzf.m1027a(new lym(), bArr);
                }
                iqb.m22864a(i2, nzf);
                return;
            case 2:
                iqe iqe = this.f17762e;
                if (bArr != null) {
                    mab mab = (mab) nzf.m1027a(new mab(), bArr);
                }
                iqe.m22864a(i2, nzf);
                return;
            case 3:
                ipr ipr = this.f17758a;
                if (bArr != null) {
                    lxh lxh = (lxh) nzf.m1027a(new lxh(), bArr);
                }
                ipr.m22864a(i2, nzf);
                return;
            case 4:
                ipv ipv = this.f17759b;
                if (bArr != null) {
                    lya lya = (lya) nzf.m1027a(new lya(), bArr);
                }
                ipv.m22864a(i2, nzf);
                return;
            default:
                try {
                    itx.m23280a("vclib", "Unknown collection type " + i);
                    return;
                } catch (Throwable e) {
                    itx.m23286b("vclib", "Unable to parse proto from bytes", e);
                }
        }
        itx.m23286b("vclib", "Unable to parse proto from bytes", e);
    }

    public void m21928a(String str) {
        this.f17761d.m22913a(str);
    }
}
