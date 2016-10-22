package defpackage;

/* renamed from: eza */
public final class eza extends evz {
    private static final long serialVersionUID = 1;

    eza(luo luo) {
        super(luo, luo.responseHeader, -1);
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        String str = ((evh) this.b).e;
        if (((evh) this.b).d == 1) {
            blo.R(str);
            blf.a(fhc, blo, str);
        }
        blf.d(blo);
    }
}
