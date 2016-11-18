package defpackage;

import android.app.Activity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivityPeer;
import java.util.Set;

final class eke implements gbe {
    onc<jfl> a = oiv.a(new jev(this.h));
    onc<jer> b = oiv.a(new jeu(this.e, this.h));
    final /* synthetic */ ekd c;
    private final lhs d;
    private onc<Activity> e = new lht(this.d);
    private onc<lie> f = oiv.a(new lif(this.e, oiy.a, this.c.c, oiw.a));
    private onc<kbu> g = ojb.a(new lia(this.e));
    private onc<kbu> h = new lib(this.g, oiy.a);
    private onc<lfj> i = oiv.a(lfk.a);
    private onc<lfl> j = oiv.a(new lfo(this.e, this.c.d, this.g, this.i));
    private onc<jca> k = oiv.a(new lfc(this.e, this.h, this.c.c, this.c.d, this.c.b, this.j));
    private onc<lfd> l = new lfi(this.k);
    private onc<Set<lfd>> m = oiy.a(1, 0).a(this.l).a();
    private onc<StatusMessageSettingsActivity> n = new gbf(this.e);
    private onc<StatusMessageSettingsActivityPeer> o = new gbd(this.n);

    public /* synthetic */ Object a(lhq lhq) {
        return b(lhq);
    }

    eke(ekd ekd, lhs lhs) {
        this.c = ekd;
        this.d = (lhs) bn.a(lhs);
    }

    public lie a() {
        return (lie) this.f.a();
    }

    public Set<lfd> b() {
        return (Set) this.m.a();
    }

    public StatusMessageSettingsActivityPeer c() {
        return (StatusMessageSettingsActivityPeer) this.o.a();
    }

    private eiq b(lhq lhq) {
        return new ekf(this, lhq);
    }
}
