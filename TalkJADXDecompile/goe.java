import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

final class goe {
    final ArrayList<Integer> a;
    final ArrayList<gof> b;
    final WeakReference<View> c;

    public goe(View view) {
        this.c = new WeakReference(view);
        this.a = new ArrayList();
        this.b = new ArrayList();
    }

    public void a(int i, gof gof) {
        this.a.add(Integer.valueOf(i));
        this.b.add(gof);
    }
}
