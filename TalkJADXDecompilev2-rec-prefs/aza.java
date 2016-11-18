package p000;

final class aza<T> {
    final ant<T> f2574a;
    private final Class<T> f2575b;

    public aza(Class<T> cls, ant<T> ant_T) {
        this.f2575b = cls;
        this.f2574a = ant_T;
    }

    public boolean m4400a(Class<?> cls) {
        return this.f2575b.isAssignableFrom(cls);
    }
}
