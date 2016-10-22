public final class jqa {
    private final byte[] a;
    private final int b;
    private final int c;
    private final int d;
    private final boolean e;

    jqa(jqb jqb) {
        this.a = jqb.a;
        this.b = jqb.b;
        this.c = jqb.c;
        this.d = jqb.d;
        this.e = jqb.e;
    }

    public byte[] a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }

    public boolean e() {
        return this.e;
    }

    public static jqb newBuilder() {
        return new jqb();
    }
}
