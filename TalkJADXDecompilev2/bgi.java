package defpackage;

import android.content.Context;
import android.os.Bundle;

public final class bgi implements jza, kcm, kcq {
    private static final gma a = gma.a("CallMediaTypeRefreshMixin");
    private Context b;
    private jyn c;
    private bhl d;

    public bgi(kbu kbu) {
        kbu.a((kcq) this);
    }

    public void a(Context context, jyn jyn, Bundle bundle) {
        this.b = context;
        this.c = jyn;
        this.d = (bhl) jyn.a(bhl.class);
    }

    public void R_() {
        String b = a.b("CallMediaTypeRefreshMixin.onResume");
        jca jca = (jca) this.c.a(jca.class);
        if (jca.b() && gwb.a(this.b, "babel_enable_call_media_type_refresh", true)) {
            this.d.a(new bgk(jca.a(), gwb.a(this.b, "babel_call_media_type_refresh_initial_delay_ms", fls.y)));
        }
        a.c(b);
    }
}
