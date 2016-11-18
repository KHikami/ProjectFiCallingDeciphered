package p000;

final class aur<Model, Data> {
    final Class<Data> f2377a;
    final auj<Model, Data> f2378b;
    private final Class<Model> f2379c;

    public aur(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.f2379c = cls;
        this.f2377a = cls2;
        this.f2378b = auj_Model__Data;
    }

    public boolean m4072a(Class<?> cls, Class<?> cls2) {
        return m4071a(cls) && this.f2377a.isAssignableFrom(cls2);
    }

    public boolean m4071a(Class<?> cls) {
        return this.f2379c.isAssignableFrom(cls);
    }
}
