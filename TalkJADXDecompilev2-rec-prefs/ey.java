package p000;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public final class ey implements OnPreDrawListener {
    final /* synthetic */ View f12453a;
    final /* synthetic */ Transition f12454b;
    final /* synthetic */ View f12455c;
    final /* synthetic */ fc f12456d;
    final /* synthetic */ Map f12457e;
    final /* synthetic */ Map f12458f;
    final /* synthetic */ ArrayList f12459g;
    final /* synthetic */ Transition f12460h;

    public ey(View view, Transition transition, View view2, fc fcVar, Map map, Map map2, ArrayList arrayList, Transition transition2) {
        this.f12453a = view;
        this.f12454b = transition;
        this.f12455c = view2;
        this.f12456d = fcVar;
        this.f12457e = map;
        this.f12458f = map2;
        this.f12459g = arrayList;
        this.f12460h = transition2;
    }

    public boolean onPreDraw() {
        this.f12453a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f12454b != null) {
            this.f12454b.removeTarget(this.f12455c);
        }
        if (this.f12456d != null) {
            View a = this.f12456d.m14947a();
            if (a != null) {
                if (!this.f12457e.isEmpty()) {
                    gwb.m1879a(this.f12458f, a);
                    this.f12458f.keySet().retainAll(this.f12457e.values());
                    for (Entry entry : this.f12457e.entrySet()) {
                        View view = (View) this.f12458f.get((String) entry.getValue());
                        if (view != null) {
                            view.setTransitionName((String) entry.getKey());
                        }
                    }
                }
                if (this.f12454b != null) {
                    gwb.m1876a(this.f12459g, a);
                    this.f12459g.removeAll(this.f12458f.values());
                    this.f12459g.add(this.f12455c);
                    gwb.m2040b(this.f12454b, this.f12459g);
                }
            }
        }
        gwb.m1787a(this.f12460h, this.f12454b, this.f12459g, true);
        return true;
    }
}
