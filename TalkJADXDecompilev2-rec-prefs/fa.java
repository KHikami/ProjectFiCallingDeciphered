package p000;

import android.transition.Transition;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

public final class fa implements OnPreDrawListener {
    final /* synthetic */ View f12562a;
    final /* synthetic */ Transition f12563b;
    final /* synthetic */ ArrayList f12564c;
    final /* synthetic */ Transition f12565d;
    final /* synthetic */ ArrayList f12566e;
    final /* synthetic */ Transition f12567f;
    final /* synthetic */ ArrayList f12568g;
    final /* synthetic */ Map f12569h;
    final /* synthetic */ ArrayList f12570i;
    final /* synthetic */ Transition f12571j;
    final /* synthetic */ View f12572k;

    public fa(View view, Transition transition, ArrayList arrayList, Transition transition2, ArrayList arrayList2, Transition transition3, ArrayList arrayList3, Map map, ArrayList arrayList4, Transition transition4, View view2) {
        this.f12562a = view;
        this.f12563b = transition;
        this.f12564c = arrayList;
        this.f12565d = transition2;
        this.f12566e = arrayList2;
        this.f12567f = transition3;
        this.f12568g = arrayList3;
        this.f12569h = map;
        this.f12570i = arrayList4;
        this.f12571j = transition4;
        this.f12572k = view2;
    }

    public boolean onPreDraw() {
        this.f12562a.getViewTreeObserver().removeOnPreDrawListener(this);
        if (this.f12563b != null) {
            gwb.m1861a(this.f12563b, this.f12564c);
            gwb.m1787a(this.f12563b, this.f12565d, this.f12566e, false);
            gwb.m1787a(this.f12563b, this.f12567f, this.f12568g, false);
        }
        if (this.f12565d != null) {
            gwb.m1861a(this.f12565d, this.f12566e);
            gwb.m1787a(this.f12565d, this.f12563b, this.f12564c, false);
            gwb.m1787a(this.f12565d, this.f12567f, this.f12568g, false);
        }
        if (this.f12567f != null) {
            gwb.m1861a(this.f12567f, this.f12568g);
        }
        for (Entry entry : this.f12569h.entrySet()) {
            ((View) entry.getValue()).setTransitionName((String) entry.getKey());
        }
        int size = this.f12570i.size();
        for (int i = 0; i < size; i++) {
            this.f12571j.excludeTarget((View) this.f12570i.get(i), false);
        }
        this.f12571j.excludeTarget(this.f12572k, false);
        return true;
    }
}
