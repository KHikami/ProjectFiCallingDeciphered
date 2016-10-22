import android.app.Activity;
import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class lie {
    private final kbu a;
    private final Activity b;
    private final Set<a> c;
    private final lfp d;
    private final Map<String, onc<a>> e;
    private Set<a> f;
    private boolean g;

    lie(Activity activity, Set<a> set, lfp lfp, Map<String, onc<a>> map) {
        this.g = false;
        this.c = set;
        this.b = activity;
        if (activity instanceof kbt) {
            this.a = ((kbt) activity).getLifecycle();
        } else {
            this.a = null;
        }
        this.d = lfp;
        this.e = map;
    }

    public void a() {
        if (this.a != null && !this.g) {
            this.f = new HashSet();
            this.f.addAll(this.c);
            for (Annotation annotationType : this.d.a(gwb.i(this.b))) {
                onc onc = (onc) this.e.get(annotationType.annotationType().getName());
                if (onc != null) {
                    this.f.add((a) onc.a());
                }
            }
            for (kcq a : this.f) {
                this.a.a(a);
            }
            this.g = true;
        }
    }
}
