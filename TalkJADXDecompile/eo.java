import android.view.View;
import android.view.ViewGroup;

public abstract class eo extends np {
    private final ed a;
    private ew b;
    private dr c;

    public abstract dr a(int i);

    public eo(ed edVar) {
        this.b = null;
        this.c = null;
        this.a = edVar;
    }

    public void a(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    public Object a(ViewGroup viewGroup, int i) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        long b = b(i);
        dr a = this.a.a(a(viewGroup.getId(), b));
        if (a != null) {
            this.b.e(a);
        } else {
            a = a(i);
            this.b.a(viewGroup.getId(), a, a(viewGroup.getId(), b));
        }
        if (a != this.c) {
            a.setMenuVisibility(false);
            a.setUserVisibleHint(false);
        }
        return a;
    }

    public void a(ViewGroup viewGroup, int i, Object obj) {
        if (this.b == null) {
            this.b = this.a.a();
        }
        this.b.d((dr) obj);
    }

    public void b(ViewGroup viewGroup, int i, Object obj) {
        dr drVar = (dr) obj;
        if (drVar != this.c) {
            if (this.c != null) {
                this.c.setMenuVisibility(false);
                this.c.setUserVisibleHint(false);
            }
            if (drVar != null) {
                drVar.setMenuVisibility(true);
                drVar.setUserVisibleHint(true);
            }
            this.c = drVar;
        }
    }

    public void b(ViewGroup viewGroup) {
        if (this.b != null) {
            this.b.c();
            this.b = null;
        }
    }

    public boolean a(View view, Object obj) {
        return ((dr) obj).getView() == view;
    }

    public long b(int i) {
        return (long) i;
    }

    private static String a(int i, long j) {
        return "android:switcher:" + i + ":" + j;
    }
}
