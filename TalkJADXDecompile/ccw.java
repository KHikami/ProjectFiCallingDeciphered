import android.view.ViewGroup;

public abstract class ccw<H> {
    public H c;
    public ViewGroup d;

    public abstract boolean a();

    public abstract void c();

    public abstract void d();

    public ccw(H h, ViewGroup viewGroup) {
        this.c = h;
        this.d = viewGroup;
        c();
    }

    public void a(boolean z) {
        if (z) {
            d();
        }
        int i = z ? 0 : 8;
        if (this.d != null) {
            this.d.setVisibility(i);
        }
    }
}
