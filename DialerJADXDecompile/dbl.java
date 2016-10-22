import java.util.Iterator;

/* compiled from: PG */
final class dbl extends dao {
    private transient Object a;
    private transient int b;

    dbl(Object obj) {
        this.a = cob.i(obj);
    }

    dbl(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final int size() {
        return 1;
    }

    public final boolean contains(Object obj) {
        return this.a.equals(obj);
    }

    public final dbn b() {
        return das.a(this.a);
    }

    final int a(Object[] objArr, int i) {
        objArr[i] = this.a;
        return i + 1;
    }

    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        i = this.a.hashCode();
        this.b = i;
        return i;
    }

    final boolean e() {
        return this.b != 0;
    }

    public final String toString() {
        String obj = this.a.toString();
        return new StringBuilder(obj.length() + 2).append('[').append(obj).append(']').toString();
    }

    public final /* synthetic */ Iterator iterator() {
        return das.a(this.a);
    }
}
