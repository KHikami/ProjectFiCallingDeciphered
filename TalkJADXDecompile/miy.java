import java.util.Comparator;

final class miy extends mix {
    miy() {
        super();
    }

    public <T> mix a(T t, T t2, Comparator<T> comparator) {
        return a(comparator.compare(t, t2));
    }

    public mix a(long j, long j2) {
        return a(mrw.a(j, j2));
    }

    public mix a(float f, float f2) {
        return a(Float.compare(f, f2));
    }

    public mix a(boolean z, boolean z2) {
        return a(gwb.a(z2, z));
    }

    public mix b(boolean z, boolean z2) {
        return a(gwb.a(z, z2));
    }

    private static mix a(int i) {
        if (i < 0) {
            return mix.b;
        }
        if (i > 0) {
            return mix.c;
        }
        return mix.a;
    }

    public int a() {
        return 0;
    }
}
