public class ijk {
    public final ipr a;
    public final ipv b;
    public final ipy c;
    public final iqb d;
    public final iqe e;

    public <T extends iji> T a(Class<T> cls) {
        if (cls == ijb.class) {
            return this.c;
        }
        if (cls == ijd.class) {
            return this.d;
        }
        if (cls == ijf.class) {
            return this.e;
        }
        if (cls == iix.class) {
            return this.a;
        }
        if (cls == iiz.class) {
            return this.b;
        }
        String str = "Unrecognized collection type ";
        String valueOf = String.valueOf(cls.getSimpleName());
        throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public ijk(ipu ipu, ijh ijh) {
        this.c = new ipy(ipu, ijh);
        this.d = new iqb(ipu, ijh);
        this.e = new iqe(ipu, ijh);
        this.a = new ipr(ipu, ijh);
        this.b = new ipv(ipu, ijh);
    }

    public void a(int i, int i2, byte[] bArr) {
        nzf nzf = null;
        switch (i) {
            case wi.w /*0*/:
                ipy ipy = this.c;
                if (bArr != null) {
                    lyh lyh = (lyh) nzf.a(new lyh(), bArr);
                }
                ipy.a(i2, nzf);
                return;
            case wi.j /*1*/:
                iqb iqb = this.d;
                if (bArr != null) {
                    lym lym = (lym) nzf.a(new lym(), bArr);
                }
                iqb.a(i2, nzf);
                return;
            case wi.l /*2*/:
                iqe iqe = this.e;
                if (bArr != null) {
                    mab mab = (mab) nzf.a(new mab(), bArr);
                }
                iqe.a(i2, nzf);
                return;
            case wi.z /*3*/:
                ipr ipr = this.a;
                if (bArr != null) {
                    lxh lxh = (lxh) nzf.a(new lxh(), bArr);
                }
                ipr.a(i2, nzf);
                return;
            case wi.h /*4*/:
                ipv ipv = this.b;
                if (bArr != null) {
                    lya lya = (lya) nzf.a(new lya(), bArr);
                }
                ipv.a(i2, nzf);
                return;
            default:
                try {
                    itx.a("vclib", "Unknown collection type " + i);
                    return;
                } catch (Throwable e) {
                    itx.b("vclib", "Unable to parse proto from bytes", e);
                }
        }
        itx.b("vclib", "Unable to parse proto from bytes", e);
    }

    public void a(String str) {
        this.d.a(str);
    }
}
