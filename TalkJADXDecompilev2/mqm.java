package defpackage;

public abstract class mqm {
    private static final mqm b = new mql();
    private static final mqm c = new mqk();
    public final moa a;

    protected abstract <T> void a(moc<T> moc_T);

    mqm(moa moa) {
        this.a = (moa) ba.a((Object) moa, "log format");
    }

    public final <T> T b(moc<T> moc_T) {
        try {
            a(moc_T);
            return moc_T.c();
        } catch (mqn e) {
            throw new mod(moe.c, null, e.getMessage());
        }
    }
}
