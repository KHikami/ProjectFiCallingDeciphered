package p000;

final class cup implements ijl<mbu> {
    final /* synthetic */ cuo f9122a;

    cup(cuo cuo) {
        this.f9122a = cuo;
    }

    private void m11043a(mbu mbu) {
        glk.m17970a("Babel_explane_invite", "Added invitation {%s}", mbu);
        cuo cuo = this.f9122a;
        cuo.f9116b = true;
        cuo.f9117c = false;
        for (cuq b : cuo.f9118d.f9104b) {
            b.mo1429b();
        }
    }

    private void m11044b(mbu mbu) {
        glk.m17982e("Babel_explane_invite", "Failed to add invitation {%s}", mbu);
        this.f9122a.m11042g();
    }
}
