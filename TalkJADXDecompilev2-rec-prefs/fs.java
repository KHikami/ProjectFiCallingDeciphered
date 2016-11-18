package p000;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

public final class fs {
    private final int f13868a;
    private final CharSequence f13869b;
    private final PendingIntent f13870c;
    private boolean f13871d;
    private final Bundle f13872e;
    private ArrayList<hg> f13873f;

    public fs(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle());
    }

    private fs(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.f13868a = i;
        this.f13869b = fx.m16415d(charSequence);
        this.f13870c = pendingIntent;
        this.f13872e = bundle;
    }

    public Bundle m16107a() {
        return this.f13872e;
    }

    public fs m16109a(hg hgVar) {
        if (this.f13873f == null) {
            this.f13873f = new ArrayList();
        }
        this.f13873f.add(hgVar);
        return this;
    }

    public fs m16110a(boolean z) {
        this.f13871d = true;
        return this;
    }

    public fs m16108a(ft ftVar) {
        ftVar.mo2096a(this);
        return this;
    }

    public fr m16111b() {
        return new fr(this.f13868a, this.f13869b, this.f13870c, this.f13872e, this.f13873f != null ? (hg[]) this.f13873f.toArray(new hg[this.f13873f.size()]) : null, this.f13871d);
    }
}
