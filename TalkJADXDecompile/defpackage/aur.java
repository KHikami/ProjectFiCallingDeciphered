package defpackage;

/* renamed from: aur */
final class aur<Model, Data> {
    final Class<Data> a;
    final auj<Model, Data> b;
    private final Class<Model> c;

    public aur(Class<Model> cls, Class<Data> cls2, auj<Model, Data> auj_Model__Data) {
        this.c = cls;
        this.a = cls2;
        this.b = auj_Model__Data;
    }

    public boolean a(Class<?> cls, Class<?> cls2) {
        return a(cls) && this.a.isAssignableFrom(cls2);
    }

    public boolean a(Class<?> cls) {
        return this.c.isAssignableFrom(cls);
    }
}
