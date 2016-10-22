import java.util.ListIterator;

public final class mna<E> extends mjq<E> {
    public static final mjq<Object> a;
    private final transient int b;
    private final transient int c;
    private final transient Object[] d;

    public /* synthetic */ ListIterator listIterator(int i) {
        return a(i);
    }

    static {
        a = new mna(mmr.a);
    }

    private mna(Object[] objArr, int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = objArr;
    }

    mna(Object[] objArr) {
        this(objArr, 0, objArr.length);
    }

    public int size() {
        return this.c;
    }

    boolean e() {
        return this.c != this.d.length;
    }

    int a(Object[] objArr, int i) {
        System.arraycopy(this.d, this.b, objArr, i, this.c);
        return this.c + i;
    }

    public E get(int i) {
        bm.a(i, this.c);
        return this.d[this.b + i];
    }

    mjq<E> b(int i, int i2) {
        return new mna(this.d, this.b + i, i2 - i);
    }

    public mnz<E> a(int i) {
        return mlj.a(this.d, this.b, this.c, i);
    }
}
