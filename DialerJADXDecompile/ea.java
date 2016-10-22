import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
public final class ea implements OnPreDrawListener {
    private /* synthetic */ View a;
    private /* synthetic */ Transition b;
    private /* synthetic */ View c;
    private /* synthetic */ ee d;
    private /* synthetic */ Map e;
    private /* synthetic */ Map f;
    private /* synthetic */ ArrayList g;
    private /* synthetic */ Transition h;

    public ea(View view, Transition transition, View view2, ee eeVar, Map map, Map map2, ArrayList arrayList, Transition transition2) {
        this.a = view;
        this.b = transition;
        this.c = view2;
        this.d = eeVar;
        this.e = map;
        this.f = map2;
        this.g = arrayList;
        this.h = transition2;
    }

    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.b != null) {
            this.b.removeTarget(this.c);
        }
        if (this.d != null) {
            View a = this.d.a();
            if (a != null) {
                if (!this.e.isEmpty()) {
                    buf.a(this.f, a);
                    this.f.keySet().retainAll(this.e.values());
                    for (Entry entry : this.e.entrySet()) {
                        View view = (View) this.f.get((String) entry.getValue());
                        if (view != null) {
                            view.setTransitionName((String) entry.getKey());
                        }
                    }
                }
                if (this.b != null) {
                    buf.a(this.g, a);
                    this.g.removeAll(this.f.values());
                    this.g.add(this.c);
                    buf.b(this.b, this.g);
                }
            }
        }
        buf.a(this.h, this.b, this.g, true);
        return true;
    }
}
