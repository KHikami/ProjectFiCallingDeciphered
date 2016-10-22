import java.util.ArrayList;
import java.util.List;

public final class azf {
    final List<azg<?>> a;

    public azf() {
        this.a = new ArrayList();
    }

    public synchronized <Z> void a(Class<Z> cls, aob<Z> aob_Z) {
        this.a.add(new azg(cls, aob_Z));
    }

    public synchronized <Z> aob<Z> a(Class<Z> cls) {
        aob<Z> aob_Z;
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            azg azg = (azg) this.a.get(i);
            if (azg.a.isAssignableFrom(cls)) {
                aob_Z = azg.b;
                break;
            }
        }
        aob_Z = null;
        return aob_Z;
    }
}
