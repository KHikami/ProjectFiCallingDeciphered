package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;

public final class lhm<C> extends ContextWrapper implements lhj<C> {
    private final C f25007a;
    private LayoutInflater f25008b;

    public lhm(Context context, C c) {
        super((Context) bm.m6122a((Object) context));
        this.f25007a = bm.m6122a((Object) c);
    }

    public C mo1180a() {
        return this.f25007a;
    }

    public LayoutInflater m29067b() {
        if (this.f25008b == null) {
            this.f25008b = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f25008b;
    }

    public Object getSystemService(String str) {
        if ("layout_inflater".equals(str)) {
            return m29067b();
        }
        return getBaseContext().getSystemService(str);
    }
}
