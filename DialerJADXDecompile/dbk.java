import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
final class dbk extends czt {
    private transient Object a;

    public final /* synthetic */ List subList(int i, int i2) {
        return a(i, i2);
    }

    dbk(Object obj) {
        this.a = cob.i(obj);
    }

    public final Object get(int i) {
        cob.b(i, 1);
        return this.a;
    }

    public final dbn b() {
        return das.a(this.a);
    }

    public final int size() {
        return 1;
    }

    public final czt a(int i, int i2) {
        cob.b(i, i2, 1);
        if (i == i2) {
            return dbg.a;
        }
        return this;
    }

    public final String toString() {
        String obj = this.a.toString();
        return new StringBuilder(obj.length() + 2).append('[').append(obj).append(']').toString();
    }

    public final /* synthetic */ Iterator iterator() {
        return das.a(this.a);
    }
}
