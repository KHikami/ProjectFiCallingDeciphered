package defpackage;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: PG */
/* renamed from: ec */
public final class ec implements OnPreDrawListener {
    private /* synthetic */ View a;
    private /* synthetic */ Transition b;
    private /* synthetic */ ArrayList c;
    private /* synthetic */ Transition d;
    private /* synthetic */ ArrayList e;
    private /* synthetic */ Transition f;
    private /* synthetic */ ArrayList g;
    private /* synthetic */ Map h;
    private /* synthetic */ ArrayList i;
    private /* synthetic */ Transition j;
    private /* synthetic */ View k;

    public ec(View view, Transition transition, ArrayList arrayList, Transition transition2, ArrayList arrayList2, Transition transition3, ArrayList arrayList3, Map map, ArrayList arrayList4, Transition transition4, View view2) {
        this.a = view;
        this.b = transition;
        this.c = arrayList;
        this.d = transition2;
        this.e = arrayList2;
        this.f = transition3;
        this.g = arrayList3;
        this.h = map;
        this.i = arrayList4;
        this.j = transition4;
        this.k = view2;
    }

    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.b != null) {
            buf.a(this.b, this.c);
            buf.a(this.b, this.d, this.e, false);
            buf.a(this.b, this.f, this.g, false);
        }
        if (this.d != null) {
            buf.a(this.d, this.e);
            buf.a(this.d, this.b, this.c, false);
            buf.a(this.d, this.f, this.g, false);
        }
        if (this.f != null) {
            buf.a(this.f, this.g);
        }
        for (Entry entry : this.h.entrySet()) {
            ((View) entry.getValue()).setTransitionName((String) entry.getKey());
        }
        int size = this.i.size();
        for (int i = 0; i < size; i++) {
            this.j.excludeTarget((View) this.i.get(i), false);
        }
        this.j.excludeTarget(this.k, false);
        return true;
    }
}
