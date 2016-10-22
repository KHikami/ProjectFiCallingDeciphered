import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: PG */
public final class qv {
    int a;
    int b;
    int c;
    int d;
    ViewGroup e;
    View f;
    View g;
    su h;
    sr i;
    Context j;
    boolean k;
    boolean l;
    boolean m;
    public boolean n;
    boolean o;
    boolean p;
    Bundle q;

    qv(int i) {
        this.a = i;
        this.o = false;
    }

    final void a(su suVar) {
        if (suVar != this.h) {
            if (this.h != null) {
                this.h.b(this.i);
            }
            this.h = suVar;
            if (suVar != null && this.i != null) {
                suVar.a(this.i);
            }
        }
    }
}
