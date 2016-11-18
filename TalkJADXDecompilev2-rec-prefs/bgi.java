package p000;

import android.content.Context;
import android.os.Bundle;

public final class bgi implements jza, kcm, kcq {
    private static final gma f3309a = gma.m18073a("CallMediaTypeRefreshMixin");
    private Context f3310b;
    private jyn f3311c;
    private bhl f3312d;

    public bgi(kbu kbu) {
        kbu.m25514a((kcq) this);
    }

    public void mo479a(Context context, jyn jyn, Bundle bundle) {
        this.f3310b = context;
        this.f3311c = jyn;
        this.f3312d = (bhl) jyn.m25443a(bhl.class);
    }

    public void R_() {
        String b = f3309a.m18078b("CallMediaTypeRefreshMixin.onResume");
        jca jca = (jca) this.f3311c.m25443a(jca.class);
        if (jca.mo2319b() && gwb.m1906a(this.f3310b, "babel_enable_call_media_type_refresh", true)) {
            this.f3312d.mo550a(new bgk(jca.mo2317a(), gwb.m1519a(this.f3310b, "babel_call_media_type_refresh_initial_delay_ms", fls.f13448y)));
        }
        f3309a.m18079c(b);
    }
}
