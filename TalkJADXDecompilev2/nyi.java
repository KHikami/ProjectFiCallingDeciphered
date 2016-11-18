package defpackage;

public enum nyi {
    DOUBLE(nyn.DOUBLE, 1),
    FLOAT(nyn.FLOAT, 5),
    INT64(nyn.LONG, 0),
    UINT64(nyn.LONG, 0),
    INT32(nyn.INT, 0),
    FIXED64(nyn.LONG, 1),
    FIXED32(nyn.INT, 5),
    BOOL(nyn.BOOLEAN, 0),
    STRING(nyn.STRING, 2),
    GROUP(nyn.MESSAGE, 3),
    MESSAGE(nyn.MESSAGE, 2),
    BYTES(nyn.BYTE_STRING, 2),
    UINT32(nyn.INT, 0),
    ENUM(nyn.ENUM, 0),
    SFIXED32(nyn.INT, 5),
    SFIXED64(nyn.LONG, 1),
    SINT32(nyn.INT, 0),
    SINT64(nyn.LONG, 0);
    
    private final nyn s;
    private final int t;

    private nyi(nyn nyn, int i) {
        this.s = nyn;
        this.t = i;
    }

    public nyn a() {
        return this.s;
    }

    public int b() {
        return this.t;
    }

    public boolean c() {
        return true;
    }
}
