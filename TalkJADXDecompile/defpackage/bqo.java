package defpackage;

import android.content.Context;
import android.os.Bundle;

/* renamed from: bqo */
final class bqo implements bpw, jgf, jza, kcd, kcg, kcn, kcq, kcr {
    private final Context a;
    private final int b;
    private final jyn c;
    private jgg d;
    private boolean e;

    bqo(Context context, kbu kbu, int i) {
        this.a = context;
        this.b = i;
        this.c = jyn.b(context);
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.d = (jgg) jyn.a(jgg.class);
    }

    public void a(Bundle bundle) {
        if (bundle != null) {
            glk.a("Babel_ConvCreator", "Gaia ID resolver restored from saved state", new Object[0]);
            if (bundle.getBoolean("listener_registered")) {
                this.d.a((jgf) this);
                this.e = true;
            }
        }
    }

    public void b(Bundle bundle) {
        glk.a("Babel_ConvCreator", "Saving state of gaia ID resolver", new Object[0]);
        bundle.putBoolean("listener_registered", this.e);
    }

    public String a() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.b).toString();
    }

    public void o_() {
        this.d.b((jgf) this);
    }

    public void a(bjg bjg, bxt bxt) {
        boolean g;
        int a = ((jca) this.c.a(jca.class)).a();
        switch (bqp.a[bxt.ordinal()]) {
            case wi.j /*1*/:
            case wi.l /*2*/:
            case wi.z /*3*/:
                g = bjg.g();
                break;
            case wi.h /*4*/:
                g = false;
                break;
            default:
                String valueOf = String.valueOf(bxt);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
        }
        if (g) {
            glk.a("Babel_ConvCreator", "Gaia ID resolution needed; request ID: " + this.b, new Object[0]);
            dwy dwy = (dwy) this.c.a(dwy.class);
            valueOf = String.valueOf("gaia_id_resolution");
            jgc a2 = dwy.a(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.b).toString(), a, bjg);
            if (!this.e) {
                this.d.a((jgf) this);
                this.e = true;
            }
            this.d.b(a2);
            ((iih) this.c.a(iih.class)).a(a).b().c(3310);
            return;
        }
        glk.a("Babel_ConvCreator", "No Gaia ID resolution needed", new Object[0]);
        ((iih) this.c.a(iih.class)).a(a).b().c(3072);
        ((bpx) this.c.a(bpx.class)).a(true, bjg);
    }

    public void a(String str, jgz jgz, jgw jgw) {
        String valueOf = String.valueOf("gaia_id_resolution");
        if (str.equals(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.b).toString())) {
            bjg bjg;
            glk.a("Babel_ConvCreator", "Gaia ID resolution background task finished for request ID " + this.b, new Object[0]);
            if (jgz != null) {
                bjg = (bjg) jgz.d().getSerializable("hangouts_contact");
            } else {
                bjg = null;
            }
            bpx bpx = (bpx) jyn.b(this.a).a(bpx.class);
            boolean z = (jgz == null || jgz.f()) ? false : true;
            bpx.a(z, bjg);
            this.d.b((jgf) this);
            this.e = false;
        }
    }
}
