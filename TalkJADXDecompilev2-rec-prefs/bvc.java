package p000;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

public final class bvc {
    private final ky<fwy, btn> f4570a = new ky();
    private final bvr f4571b;

    public bvc(Context context) {
        List<btn> c = jyn.m25438c(context, btn.class);
        this.f4571b = (bvr) jyn.m25426a(context, bvr.class);
        for (btn btn : c) {
            for (Object obj : btn.mo758a()) {
                if (this.f4570a.containsKey(obj)) {
                    String valueOf = String.valueOf(((btn) this.f4570a.get(obj)).getClass().getName());
                    String valueOf2 = String.valueOf(btn.getClass().getName());
                    String valueOf3 = String.valueOf(obj);
                    iil.m21870a(new StringBuilder(((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()) + String.valueOf(valueOf3).length()).append(valueOf).append(" and ").append(valueOf2).append(" supports same MessageType: ").append(valueOf3).toString());
                }
                this.f4570a.put(obj, btn);
            }
        }
    }

    public int m6763a(fwy fwy) {
        if (this.f4570a.containsKey(fwy)) {
            return this.f4570a.m28011a((Object) fwy);
        }
        return this.f4570a.size();
    }

    public bwd m6764a(dr drVar, ViewGroup viewGroup, int i) {
        fwy fwy;
        btn btn;
        if (i < this.f4570a.size()) {
            fwy = (fwy) this.f4570a.m28017b(i);
        } else {
            fwy = fwy.UNKNOWN;
        }
        if (i < this.f4570a.size()) {
            btn = (btn) this.f4570a.m28018c(i);
        } else {
            btn = this.f4571b;
        }
        return new bwd(drVar, viewGroup, btn, fwy);
    }
}
