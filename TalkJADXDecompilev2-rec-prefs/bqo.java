package p000;

import android.content.Context;
import android.os.Bundle;

final class bqo implements bpw, jgf, jza, kcd, kcg, kcn, kcq, kcr {
    private final Context f4243a;
    private final int f4244b;
    private final jyn f4245c;
    private jgg f4246d;
    private boolean f4247e;

    bqo(Context context, kbu kbu, int i) {
        this.f4243a = context;
        this.f4244b = i;
        this.f4245c = jyn.m25435b(context);
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f4246d = (jgg) jyn.m25443a(jgg.class);
    }

    public void mo643a(Bundle bundle) {
        if (bundle != null) {
            glk.m17970a("Babel_ConvCreator", "Gaia ID resolver restored from saved state", new Object[0]);
            if (bundle.getBoolean("listener_registered")) {
                this.f4246d.m24129a((jgf) this);
                this.f4247e = true;
            }
        }
    }

    public void mo645b(Bundle bundle) {
        glk.m17970a("Babel_ConvCreator", "Saving state of gaia ID resolver", new Object[0]);
        bundle.putBoolean("listener_registered", this.f4247e);
    }

    public String mo642a() {
        String valueOf = String.valueOf(getClass().getName());
        return new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f4244b).toString();
    }

    public void o_() {
        this.f4246d.m24136b((jgf) this);
    }

    public void mo668a(bjg bjg, bxt bxt) {
        boolean g;
        int a = ((jca) this.f4245c.m25443a(jca.class)).mo2317a();
        switch (bqp.f4248a[bxt.ordinal()]) {
            case 1:
            case 2:
            case 3:
                g = bjg.mo573g();
                break;
            case 4:
                g = false;
                break;
            default:
                String valueOf = String.valueOf(bxt);
                throw new IllegalArgumentException(new StringBuilder(String.valueOf(valueOf).length() + 27).append("Unknown conversation type: ").append(valueOf).toString());
        }
        if (g) {
            glk.m17970a("Babel_ConvCreator", "Gaia ID resolution needed; request ID: " + this.f4244b, new Object[0]);
            dwy dwy = (dwy) this.f4245c.m25443a(dwy.class);
            valueOf = String.valueOf("gaia_id_resolution");
            jgc a2 = dwy.mo1750a(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f4244b).toString(), a, bjg);
            if (!this.f4247e) {
                this.f4246d.m24129a((jgf) this);
                this.f4247e = true;
            }
            this.f4246d.m24139b(a2);
            ((iih) this.f4245c.m25443a(iih.class)).mo1979a(a).mo1693b().mo1714c(3310);
            return;
        }
        glk.m17970a("Babel_ConvCreator", "No Gaia ID resolution needed", new Object[0]);
        ((iih) this.f4245c.m25443a(iih.class)).mo1979a(a).mo1693b().mo1714c(3072);
        ((bpx) this.f4245c.m25443a(bpx.class)).mo657a(true, bjg);
    }

    public void mo662a(String str, jgz jgz, jgw jgw) {
        String valueOf = String.valueOf("gaia_id_resolution");
        if (str.equals(new StringBuilder(String.valueOf(valueOf).length() + 11).append(valueOf).append(this.f4244b).toString())) {
            bjg bjg;
            glk.m17970a("Babel_ConvCreator", "Gaia ID resolution background task finished for request ID " + this.f4244b, new Object[0]);
            if (jgz != null) {
                bjg = (bjg) jgz.m24192d().getSerializable("hangouts_contact");
            } else {
                bjg = null;
            }
            bpx bpx = (bpx) jyn.m25435b(this.f4243a).m25443a(bpx.class);
            boolean z = (jgz == null || jgz.m24194f()) ? false : true;
            bpx.mo657a(z, bjg);
            this.f4246d.m24136b((jgf) this);
            this.f4247e = false;
        }
    }
}
