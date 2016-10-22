import java.util.Iterator;

/* compiled from: PG */
final class ic implements Iterator {
    private int a;
    private int b;
    private int c;
    private boolean d;
    private /* synthetic */ ib e;

    ic(ib ibVar, int i) {
        this.e = ibVar;
        this.d = false;
        this.a = i;
        this.b = ibVar.a();
    }

    public final boolean hasNext() {
        return this.c < this.b;
    }

    public final Object next() {
        Object a = this.e.a(this.c, this.a);
        this.c++;
        this.d = true;
        return a;
    }

    public final void remove() {
        if (this.d) {
            this.c--;
            this.b--;
            this.d = false;
            this.e.a(this.c);
            return;
        }
        throw new IllegalStateException();
    }
}
