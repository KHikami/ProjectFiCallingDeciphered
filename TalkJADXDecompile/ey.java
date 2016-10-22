import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public final class ey implements OnPreDrawListener {
    final /* synthetic */ View a;
    final /* synthetic */ Transition b;
    final /* synthetic */ View c;
    final /* synthetic */ fc d;
    final /* synthetic */ Map e;
    final /* synthetic */ Map f;
    final /* synthetic */ ArrayList g;
    final /* synthetic */ Transition h;

    public ey(View view, Transition transition, View view2, fc fcVar, Map map, Map map2, ArrayList arrayList, Transition transition2) {
        this.a = view;
        this.b = transition;
        this.c = view2;
        this.d = fcVar;
        this.e = map;
        this.f = map2;
        this.g = arrayList;
        this.h = transition2;
    }

    public boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.b != null) {
            this.b.removeTarget(this.c);
        }
        if (this.d != null) {
            View a = this.d.a();
            if (a != null) {
                if (!this.e.isEmpty()) {
                    gwb.a(this.f, a);
                    this.f.keySet().retainAll(this.e.values());
                    for (Entry entry : this.e.entrySet()) {
                        View view = (View) this.f.get((String) entry.getValue());
                        if (view != null) {
                            view.setTransitionName((String) entry.getKey());
                        }
                    }
                }
                if (this.b != null) {
                    gwb.a(this.g, a);
                    this.g.removeAll(this.f.values());
                    this.g.add(this.c);
                    gwb.b(this.b, this.g);
                }
            }
        }
        gwb.a(this.h, this.b, this.g, true);
        return true;
    }
}
