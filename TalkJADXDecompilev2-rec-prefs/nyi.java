package p000;

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
    
    private final nyn f31262s;
    private final int f31263t;

    private nyi(nyn nyn, int i) {
        this.f31262s = nyn;
        this.f31263t = i;
    }

    public nyn m37074a() {
        return this.f31262s;
    }

    public int m37075b() {
        return this.f31263t;
    }

    public boolean mo4075c() {
        return true;
    }
}
