import android.support.design.widget.CoordinatorLayout;
import android.view.View;

class bp<V extends View> extends gwb {
    private bq a;
    private int b;
    private int c;

    public bp() {
        this.b = 0;
        this.c = 0;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new bq(v);
        }
        this.a.a();
        if (this.b != 0) {
            this.a.a(this.b);
            this.b = 0;
        }
        if (this.c != 0) {
            this.a.b(this.c);
            this.c = 0;
        }
        return true;
    }

    protected void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.a((View) v, i);
    }

    public boolean a(int i) {
        if (this.a != null) {
            return this.a.a(i);
        }
        this.b = i;
        return false;
    }

    public int b() {
        return this.a != null ? this.a.b() : 0;
    }
}
