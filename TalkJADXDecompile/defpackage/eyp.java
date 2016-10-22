package defpackage;

/* renamed from: eyp */
public class eyp extends evz {
    private static final long serialVersionUID = 1;

    public eyp(kmw kmw) {
        super(kmw, kmw.apiHeader);
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        etp etp = (etp) c();
        String str = etp.c;
        String str2 = etp.d;
        blo.a(str, str2, etp.f);
        if (etp.f) {
            blo.c(str, str2, etp.e, null);
        } else {
            blo.k(str, str2);
        }
        ((bhl) jyn.a(blo.f(), bhl.class)).a(new fkr(blo.g().g()));
    }
}
