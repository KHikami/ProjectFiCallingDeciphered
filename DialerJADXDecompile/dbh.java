import java.util.Map.Entry;

/* compiled from: PG */
final class dbh extends czy {
    private static final long serialVersionUID = 0;
    private final transient Entry[] b;
    private final transient dac[] c;
    private final transient int d;

    dbh(Entry[] entryArr, dac[] dacArr, int i) {
        this.b = entryArr;
        this.c = dacArr;
        this.d = i;
    }

    static void a(Object obj, Entry entry, dac dac) {
        while (dac != null) {
            czy.a(!obj.equals(dac.getKey()), "key", entry, dac);
            dac = dac.a();
        }
    }

    public final Object get(Object obj) {
        return a(obj, this.c, this.d);
    }

    static Object a(Object obj, dac[] dacArr, int i) {
        if (obj == null) {
            return null;
        }
        for (dac dac = dacArr[buf.C(obj.hashCode()) & i]; dac != null; dac = dac.a()) {
            if (obj.equals(dac.getKey())) {
                return dac.getValue();
            }
        }
        return null;
    }

    public final int size() {
        return this.b.length;
    }

    final dao d() {
        return new dah(this, this.b);
    }
}
