import android.view.View;

/* compiled from: PG */
final class aaq extends mh {
    private boolean a;
    private /* synthetic */ int b;
    private /* synthetic */ aao c;

    aaq(aao aao, int i) {
        this.c = aao;
        this.b = i;
        this.a = false;
    }

    public final void a(View view) {
        this.c.a.setVisibility(0);
    }

    public final void b(View view) {
        if (!this.a) {
            this.c.a.setVisibility(this.b);
        }
    }

    public final void c(View view) {
        this.a = true;
    }
}
