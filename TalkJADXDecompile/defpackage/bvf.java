package defpackage;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* renamed from: bvf */
public final class bvf extends btm {
    String d;
    String e;
    String f;
    boolean g;
    private Runnable h;

    public bvf(dr drVar, View view) {
        super(drVar, view);
        view.setOnClickListener(new bvg(this));
    }

    public void a(btf btf) {
        this.d = btf.c;
        this.e = btf.b;
        this.f = btf.f;
        this.g = btf.i == fwy.LOCATION_REQUEST_SENDER;
        this.h = null;
    }

    public void a() {
        super.a();
        if (this.h == null) {
            this.h = new bvh(this);
            gwb.a(this.h, TimeUnit.SECONDS.toMillis((long) gwb.a(gwb.H(), "babel_location_request_suggestion_duration", 45)));
        }
    }

    public CharSequence e() {
        return d().getString(ba.iz);
    }
}
