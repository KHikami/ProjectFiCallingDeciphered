public final class hry {
    public static final hry a;
    private boolean b;
    private int c;

    static {
        a = new hry();
    }

    public hry() {
        this.c = 0;
    }

    public hry a(boolean z) {
        this.b = false;
        return this;
    }

    public boolean a() {
        return this.b;
    }

    public int b() {
        return this.c;
    }

    public String toString() {
        return gwb.b("mIncludePlusPages", Boolean.valueOf(this.b), "mSortOrder", Integer.valueOf(this.c));
    }
}
