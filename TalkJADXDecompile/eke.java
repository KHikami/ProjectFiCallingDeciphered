import android.app.Activity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivityPeer;
import java.util.Set;

final class eke implements gbe {
    onc<jfl> a;
    onc<jer> b;
    final /* synthetic */ ekd c;
    private final lhs d;
    private onc<Activity> e;
    private onc<lie> f;
    private onc<kbu> g;
    private onc<kbu> h;
    private onc<lfj> i;
    private onc<lfl> j;
    private onc<jca> k;
    private onc<lfd> l;
    private onc<Set<lfd>> m;
    private onc<StatusMessageSettingsActivity> n;
    private onc<StatusMessageSettingsActivityPeer> o;

    public /* synthetic */ Object a(lhq lhq) {
        return b(lhq);
    }

    eke(ekd ekd, lhs lhs) {
        this.c = ekd;
        this.d = (lhs) bn.a(lhs);
        this.e = new lht(this.d);
        this.f = oiv.a(new lif(this.e, oiy.a, this.c.c, oiw.a));
        this.g = ojb.a(new lia(this.e));
        this.h = new lib(this.g, oiy.a);
        this.i = oiv.a(lfk.INSTANCE);
        this.j = oiv.a(new lfo(this.e, this.c.d, this.g, this.i));
        this.k = oiv.a(new lfc(this.e, this.h, this.c.c, this.c.d, this.c.b, this.j));
        this.l = new lfi(this.k);
        this.m = oiy.a(1, 0).a(this.l).a();
        this.n = new gbf(this.e);
        this.o = new gbd(this.n);
        this.a = oiv.a(new jev(this.h));
        this.b = oiv.a(new jeu(this.e, this.h));
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
