package p000;

import android.content.res.Resources;
import android.text.TextUtils;

final class dns implements dmz {
    final /* synthetic */ dnr f10191a;

    dns(dnr dnr) {
        this.f10191a = dnr;
    }

    public void mo1618a(lym lym) {
        this.f10191a.m12317c();
        this.f10191a.m12316a(lym);
    }

    public void mo1620b(lym lym) {
        String string;
        dnr dnr = this.f10191a;
        Resources resources = dnr.f10182a.getResources();
        if (TextUtils.isEmpty(lym.f26909d)) {
            string = resources.getString(ba.lh);
        } else {
            string = resources.getString(ba.lg, new Object[]{lym.f26909d});
        }
        dnr.f10183b.mo1630a(new dog().m12359a(1).m12361a(string).m12362a(false).m12358a());
    }

    public void mo1621c(lym lym) {
        String string;
        dnr dnr = this.f10191a;
        Resources resources = dnr.f10182a.getResources();
        if (TextUtils.isEmpty(lym.f26909d)) {
            string = resources.getString(ba.lm);
        } else {
            string = resources.getString(ba.ll, new Object[]{lym.f26909d});
        }
        dnr.f10183b.mo1630a(new dog().m12359a(1).m12361a(string).m12362a(false).m12358a());
    }

    public void mo1617a() {
    }

    public void mo1619b() {
        this.f10191a.m12317c();
        dnr dnr = this.f10191a;
        dnr.f10186e = new dnf();
        dnr.f10186e.m12277a(new dnt(dnr));
        dnr.f10186e.mo2341a(dnr.f10182a.J_(), null);
    }
}
