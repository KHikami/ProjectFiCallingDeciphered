public abstract class mqm {
    private static final mqm b;
    private static final mqm c;
    public final moa a;

    protected abstract <T> void a(moc<T> moc_T);

    static {
        b = new mql();
        c = new mqk();
    }

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
