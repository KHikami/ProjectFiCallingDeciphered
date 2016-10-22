import android.view.View;

/* compiled from: PG */
final class se extends mh {
    private boolean a;
    private int b;
    private /* synthetic */ sd c;

    se(sd sdVar) {
        this.c = sdVar;
        this.a = false;
        this.b = 0;
    }

    public final void a(View view) {
        if (!this.a) {
            this.a = true;
            if (this.c.b != null) {
                this.c.b.a(null);
            }
        }
    }

    public final void b(View view) {
        int i = this.b + 1;
        this.b = i;
        if (i == this.c.a.size()) {
            if (this.c.b != null) {
                this.c.b.b(null);
            }
            this.b = 0;
            this.a = false;
            this.c.c = false;
        }
    }
}
