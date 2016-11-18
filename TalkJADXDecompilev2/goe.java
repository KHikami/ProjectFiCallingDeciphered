package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class goe {
    final ArrayList<Integer> a = new ArrayList();
    final ArrayList<gof> b = new ArrayList();
    final WeakReference<View> c;

    public goe(View view) {
        this.c = new WeakReference(view);
    }

    public void a(int i, gof gof) {
        this.a.add(Integer.valueOf(i));
        this.b.add(gof);
    }
}
