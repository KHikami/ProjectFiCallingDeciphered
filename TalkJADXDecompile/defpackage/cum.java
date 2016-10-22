package defpackage;

/* renamed from: cum */
final class cum extends itg {
    final /* synthetic */ ite a;
    final /* synthetic */ cuk b;

    cum(cuk cuk, ite ite) {
        this.b = cuk;
        this.a = ite;
    }

    public void a(itk itk) {
        cuk cuk = this.b;
        Object a = itk.a();
        iil.a("Expected null", cuk.d);
        iil.b("Expected non-null", a);
        glk.a("Babel_explane_invite", "Joined Hangout. Id: {%s}", a);
        cuk.d = a;
        for (cuo cuo : cuk.c) {
            glk.a("Babel_explane_invite", "Sending queued invite", new Object[0]);
            cuk.a(cuo);
        }
        cuk.c.clear();
        this.a.b((itg) this);
    }

    public void a(int i) {
        this.a.b((itg) this);
    }
}
