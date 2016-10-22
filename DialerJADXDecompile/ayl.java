import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class ayl {
    public static ayl a;
    public final List b;
    public int c;
    public boolean d;
    public int e;

    public ayl() {
        this.b = new ArrayList();
        this.c = 1;
        this.d = false;
        this.e = 15;
    }

    static {
        a = new ayl();
    }

    public final void a(aym aym) {
        if (!this.b.contains(aym)) {
            this.b.add(aym);
            aym.c(this.e);
            aym.b(this.c);
            aym.a(this.d);
        }
    }

    public final void b(aym aym) {
        if (this.b.contains(aym)) {
            this.b.remove(aym);
        }
    }
}
