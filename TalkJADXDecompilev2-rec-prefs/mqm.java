package p000;

public abstract class mqm {
    private static final mqm f28115b = new mql();
    private static final mqm f28116c = new mqk();
    public final moa f28117a;

    protected abstract <T> void mo3912a(moc<T> moc_T);

    mqm(moa moa) {
        this.f28117a = (moa) ba.m4538a((Object) moa, "log format");
    }

    public final <T> T m32701b(moc<T> moc_T) {
        try {
            mo3912a(moc_T);
            return moc_T.m32605c();
        } catch (mqn e) {
            throw new mod(moe.f27977c, null, e.getMessage());
        }
    }
}
