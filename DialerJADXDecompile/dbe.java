import java.util.Map.Entry;

/* compiled from: PG */
final class dbe extends czk {
    private /* synthetic */ dbd a;

    dbe(dbd dbd) {
        this.a = dbd;
    }

    final czp a() {
        return this.a;
    }

    public final /* synthetic */ Object get(int i) {
        Entry entry = this.a.a.b.d[i];
        return day.a(entry.getValue(), entry.getKey());
    }
}
