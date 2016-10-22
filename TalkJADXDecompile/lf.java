import java.util.Iterator;

final class lf<T> implements Iterator<T> {
    final int a;
    int b;
    int c;
    boolean d;
    final /* synthetic */ le e;

    lf(le leVar, int i) {
        this.e = leVar;
        this.d = false;
        this.a = i;
        this.b = leVar.a();
    }

    public boolean hasNext() {
        return this.c < this.b;
    }

    public T next() {
        T a = this.e.a(this.c, this.a);
        this.c++;
        this.d = true;
        return a;
    }

    public void remove() {
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
