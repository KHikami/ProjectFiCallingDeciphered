package p000;

import android.app.Activity;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class lie {
    private final kbu f25024a;
    private final Activity f25025b;
    private final Set<C0000a> f25026c;
    private final lfp f25027d;
    private final Map<String, onc<C0000a>> f25028e;
    private Set<C0000a> f25029f;
    private boolean f25030g = false;

    lie(Activity activity, Set<C0000a> set, lfp lfp, Map<String, onc<C0000a>> map) {
        this.f25026c = set;
        this.f25025b = activity;
        if (activity instanceof kbt) {
            this.f25024a = ((kbt) activity).getLifecycle();
        } else {
            this.f25024a = null;
        }
        this.f25027d = lfp;
        this.f25028e = map;
    }

    public void m29085a() {
        if (this.f25024a != null && !this.f25030g) {
            this.f25029f = new HashSet();
            this.f25029f.addAll(this.f25026c);
            for (Annotation annotationType : this.f25027d.m28996a(gwb.m2245i(this.f25025b))) {
                onc onc = (onc) this.f25028e.get(annotationType.annotationType().getName());
                if (onc != null) {
                    this.f25029f.add((C0000a) onc.mo1297a());
                }
            }
            for (kcq a : this.f25029f) {
                this.f25024a.m25514a(a);
            }
            this.f25030g = true;
        }
    }
}
