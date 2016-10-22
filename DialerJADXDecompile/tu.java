import android.view.View;

/* compiled from: PG */
public final class tu implements mg {
    private boolean a;
    private int b;
    private /* synthetic */ tt c;

    protected tu(tt ttVar) {
        this.c = ttVar;
        this.a = false;
    }

    public final tu a(lv lvVar, int i) {
        this.c.e = lvVar;
        this.b = i;
        return this;
    }

    public final void a(View view) {
        super.setVisibility(0);
        this.a = false;
    }

    public final void b(View view) {
        if (!this.a) {
            this.c.e = null;
            super.setVisibility(this.b);
        }
    }

    public final void c(View view) {
        this.a = true;
    }
}
