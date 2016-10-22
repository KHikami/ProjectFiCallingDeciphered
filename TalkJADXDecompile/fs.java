import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;

public final class fs {
    private final int a;
    private final CharSequence b;
    private final PendingIntent c;
    private boolean d;
    private final Bundle e;
    private ArrayList<hg> f;

    public fs(int i, CharSequence charSequence, PendingIntent pendingIntent) {
        this(i, charSequence, pendingIntent, new Bundle());
    }

    private fs(int i, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle) {
        this.a = i;
        this.b = fx.d(charSequence);
        this.c = pendingIntent;
        this.e = bundle;
    }

    public Bundle a() {
        return this.e;
    }

    public fs a(hg hgVar) {
        if (this.f == null) {
            this.f = new ArrayList();
        }
        this.f.add(hgVar);
        return this;
    }

    public fs a(boolean z) {
        this.d = true;
        return this;
    }

    public fs a(ft ftVar) {
        ftVar.a(this);
        return this;
    }

    public fr b() {
        return new fr(this.a, this.b, this.c, this.e, this.f != null ? (hg[]) this.f.toArray(new hg[this.f.size()]) : null, this.d);
    }
}
