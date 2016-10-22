package defpackage;

/* renamed from: cup */
final class cup implements ijl<mbu> {
    final /* synthetic */ cuo a;

    cup(cuo cuo) {
        this.a = cuo;
    }

    private void a(mbu mbu) {
        glk.a("Babel_explane_invite", "Added invitation {%s}", mbu);
        cuo cuo = this.a;
        cuo.b = true;
        cuo.c = false;
        for (cuq b : cuo.d.b) {
            b.b();
        }
    }

    private void b(mbu mbu) {
        glk.e("Babel_explane_invite", "Failed to add invitation {%s}", mbu);
        this.a.g();
    }
}
