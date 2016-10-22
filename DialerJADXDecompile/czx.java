import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
final class czx extends czt {
    private transient int a;
    private transient int b;
    private /* synthetic */ czt c;

    public final /* synthetic */ Iterator iterator() {
        return super.b();
    }

    public final /* synthetic */ ListIterator listIterator(int i) {
        return super.a(i);
    }

    public final /* synthetic */ List subList(int i, int i2) {
        return a(i, i2);
    }

    czx(czt czt, int i, int i2) {
        this.c = czt;
        this.a = i;
        this.b = i2;
    }

    public final int size() {
        return this.b;
    }

    public final Object get(int i) {
        cob.b(i, this.b);
        return this.c.get(this.a + i);
    }

    public final czt a(int i, int i2) {
        cob.b(i, i2, this.b);
        return this.c.a(this.a + i, this.a + i2);
    }

    public final /* synthetic */ ListIterator listIterator() {
        return a(0);
    }
}
