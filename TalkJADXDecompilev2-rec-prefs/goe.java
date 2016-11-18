package p000;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class goe {
    final ArrayList<Integer> f15780a = new ArrayList();
    final ArrayList<gof> f15781b = new ArrayList();
    final WeakReference<View> f15782c;

    public goe(View view) {
        this.f15782c = new WeakReference(view);
    }

    public void m18211a(int i, gof gof) {
        this.f15780a.add(Integer.valueOf(i));
        this.f15781b.add(gof);
    }
}
