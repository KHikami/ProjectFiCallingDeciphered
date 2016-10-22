package defpackage;

/* renamed from: exo */
public final class exo implements far {
    public evz a(byte[] bArr) {
        nzf nzf = (lxe) nzf.a(new lxe(), bArr);
        if (evz.a(nzf.responseHeader)) {
            return new ewv(nzf, nzf.responseHeader);
        }
        return new exn(nzf);
    }
}
