package p000;

final class cum extends itg {
    final /* synthetic */ ite f9112a;
    final /* synthetic */ cuk f9113b;

    cum(cuk cuk, ite ite) {
        this.f9113b = cuk;
        this.f9112a = ite;
    }

    public void mo1386a(itk itk) {
        cuk cuk = this.f9113b;
        Object a = itk.m23222a();
        iil.m21872a("Expected null", cuk.f9106d);
        iil.m21875b("Expected non-null", a);
        glk.m17970a("Babel_explane_invite", "Joined Hangout. Id: {%s}", a);
        cuk.f9106d = a;
        for (cuo cuo : cuk.f9105c) {
            glk.m17970a("Babel_explane_invite", "Sending queued invite", new Object[0]);
            cuk.m11030a(cuo);
        }
        cuk.f9105c.clear();
        this.f9112a.mo3219b((itg) this);
    }

    public void mo1385a(int i) {
        this.f9112a.mo3219b((itg) this);
    }
}
