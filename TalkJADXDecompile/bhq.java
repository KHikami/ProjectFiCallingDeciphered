public class bhq<T extends bhm> {
    public final Class<T> a;
    public final String b;

    public bhq(Class<T> cls) {
        this.a = cls;
        this.b = cls.getName();
    }
}
