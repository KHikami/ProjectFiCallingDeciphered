import java.util.ArrayList;
import java.util.List;

public final class ayz {
    private final List<aza<?>> a;

    public ayz() {
        this.a = new ArrayList();
    }

    public synchronized <T> ant<T> a(Class<T> cls) {
        ant<T> ant_T;
        for (aza aza : this.a) {
            if (aza.a(cls)) {
                ant_T = aza.a;
                break;
            }
        }
        ant_T = null;
        return ant_T;
    }

    public synchronized <T> void a(Class<T> cls, ant<T> ant_T) {
        this.a.add(new aza(cls, ant_T));
    }
}
