package p000;

import android.os.Bundle;

final class frr implements guk {
    final /* synthetic */ frq f13851a;

    frr(frq frq) {
        this.f13851a = frq;
    }

    public void a_(Bundle bundle) {
        synchronized (this.f13851a.f13834f) {
            if (this.f13851a.f13831c) {
                return;
            }
            glk.m17970a("BabelPeopleCache", "Google API client connected.", new Object[0]);
            hsj.f17176m.m20766a(this.f13851a.f13832d, this.f13851a.f13836i, "gms_people_cache_account", null, 8);
            this.f13851a.m16072d();
        }
    }

    public void mo1150a(int i) {
        glk.m17970a("BabelPeopleCache", "Google API client disconnected.", new Object[0]);
    }
}
