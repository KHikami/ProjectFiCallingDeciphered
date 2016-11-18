package p000;

import android.view.View;
import java.util.concurrent.TimeUnit;

public final class bvf extends btm {
    String f4577d;
    String f4578e;
    String f4579f;
    boolean f4580g;
    private Runnable f4581h;

    public bvf(dr drVar, View view) {
        super(drVar, view);
        view.setOnClickListener(new bvg(this));
    }

    public void mo754a(btf btf) {
        this.f4577d = btf.f4390c;
        this.f4578e = btf.f4389b;
        this.f4579f = btf.f4393f;
        this.f4580g = btf.f4396i == fwy.LOCATION_REQUEST_SENDER;
        this.f4581h = null;
    }

    public void mo759a() {
        super.mo759a();
        if (this.f4581h == null) {
            this.f4581h = new bvh(this);
            gwb.m1864a(this.f4581h, TimeUnit.SECONDS.toMillis((long) gwb.m1492a(gwb.m1400H(), "babel_location_request_suggestion_duration", 45)));
        }
    }

    public CharSequence mo755e() {
        return m6596d().getString(ba.iz);
    }
}
