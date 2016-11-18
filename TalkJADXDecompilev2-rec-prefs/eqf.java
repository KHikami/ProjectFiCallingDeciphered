package p000;

import android.content.Context;
import android.os.Bundle;
import java.io.Serializable;

public final class eqf implements epx {
    private final epw f12044a;

    public eqf(epw epw) {
        this.f12044a = epw;
    }

    public ery mo497a() {
        Serializable serializable = this.f12044a;
        ery eqd = new eqd();
        Bundle bundle = new Bundle();
        bundle.putSerializable("source_activity", serializable);
        bundle.putSerializable("set_discoverability", epv.ENABLED);
        bundle.putSerializable("current_step", eqe.ONE);
        eqd.setArguments(bundle);
        return eqd;
    }

    public boolean mo498a(Context context) {
        return ((eps) jyn.m25426a(context, eps.class)).m14234b(fde.m15018e(((jca) jyn.m25426a(context, jca.class)).mo2317a()));
    }

    public int mo499b() {
        return bm.ak;
    }
}
