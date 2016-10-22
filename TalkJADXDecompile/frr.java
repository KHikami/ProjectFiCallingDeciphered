import android.os.Bundle;

final class frr implements guk {
    final /* synthetic */ frq a;

    frr(frq frq) {
        this.a = frq;
    }

    public void a_(Bundle bundle) {
        synchronized (this.a.f) {
            if (this.a.c) {
                return;
            }
            glk.a("BabelPeopleCache", "Google API client connected.", new Object[0]);
            hsj.m.a(this.a.d, this.a.i, "gms_people_cache_account", null, 8);
            this.a.d();
        }
    }

    public void a(int i) {
        glk.a("BabelPeopleCache", "Google API client disconnected.", new Object[0]);
    }
}
