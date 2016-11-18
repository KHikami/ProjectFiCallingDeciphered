package p000;

import android.app.Activity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivity;
import com.google.android.apps.hangouts.statusmessage.impl.StatusMessageSettingsActivityPeer;
import java.util.Set;

final class eke implements gbe {
    onc<jfl> f11729a = oiv.a(new jev(this.f11736h));
    onc<jer> f11730b = oiv.a(new jeu(this.f11733e, this.f11736h));
    final /* synthetic */ ekd f11731c;
    private final lhs f11732d;
    private onc<Activity> f11733e = new lht(this.f11732d);
    private onc<lie> f11734f = oiv.a(new lif(this.f11733e, oiy.a, this.f11731c.f11705c, oiw.a));
    private onc<kbu> f11735g = ojb.a(new lia(this.f11733e));
    private onc<kbu> f11736h = new lib(this.f11735g, oiy.a);
    private onc<lfj> f11737i = oiv.a(lfk.f24904a);
    private onc<lfl> f11738j = oiv.a(new lfo(this.f11733e, this.f11731c.f11706d, this.f11735g, this.f11737i));
    private onc<jca> f11739k = oiv.a(new lfc(this.f11733e, this.f11736h, this.f11731c.f11705c, this.f11731c.f11706d, this.f11731c.f11704b, this.f11738j));
    private onc<lfd> f11740l = new lfi(this.f11739k);
    private onc<Set<lfd>> f11741m = oiy.a(1, 0).a(this.f11740l).a();
    private onc<StatusMessageSettingsActivity> f11742n = new gbf(this.f11733e);
    private onc<StatusMessageSettingsActivityPeer> f11743o = new gbd(this.f11742n);

    public /* synthetic */ Object m14084a(lhq lhq) {
        return m14083b(lhq);
    }

    eke(ekd ekd, lhs lhs) {
        this.f11731c = ekd;
        this.f11732d = (lhs) bn.m6214a(lhs);
    }

    public lie mo1911a() {
        return (lie) this.f11734f.mo1297a();
    }

    public Set<lfd> m14086b() {
        return (Set) this.f11741m.mo1297a();
    }

    public StatusMessageSettingsActivityPeer mo1912c() {
        return (StatusMessageSettingsActivityPeer) this.f11743o.mo1297a();
    }

    private eiq m14083b(lhq lhq) {
        return new ekf(this, lhq);
    }
}
