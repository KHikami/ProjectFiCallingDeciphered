import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* compiled from: PG */
final class dds extends LinkedHashMap {
    private /* synthetic */ ddr a;

    dds(ddr ddr, int i, float f, boolean z) {
        this.a = ddr;
        super(i, 0.75f, true);
    }

    protected final boolean removeEldestEntry(Entry entry) {
        return size() > this.a.a;
    }
}
