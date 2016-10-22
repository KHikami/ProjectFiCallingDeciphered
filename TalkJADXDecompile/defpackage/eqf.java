package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.io.Serializable;

/* renamed from: eqf */
public final class eqf implements epx {
    private final epw a;

    public eqf(epw epw) {
        this.a = epw;
    }

    public ery a() {
        Serializable serializable = this.a;
        ery eqd = new eqd();
        Bundle bundle = new Bundle();
        bundle.putSerializable("source_activity", serializable);
        bundle.putSerializable("set_discoverability", epv.ENABLED);
        bundle.putSerializable("current_step", eqe.ONE);
        eqd.setArguments(bundle);
        return eqd;
    }

    public boolean a(Context context) {
        return ((eps) jyn.a(context, eps.class)).b(fde.e(((jca) jyn.a(context, jca.class)).a()));
    }

    public int b() {
        return bm.ak;
    }
}
