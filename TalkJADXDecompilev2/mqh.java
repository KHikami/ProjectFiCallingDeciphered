package defpackage;

public class mqh extends mpz {
    public final /* synthetic */ boolean a;
    private final mpz d;

    protected final Object a(Object obj, mon mon) {
        return new mqi(this, obj, this.d.a(a(obj), mon));
    }

    public mqh(mpz mpz) {
        super(mpz.c, mpz.b);
        this.d = mpz;
    }

    public Object a(Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public mqh(mpz mpz, boolean z) {
        this.a = z;
        this(mpz);
    }

    public String a() {
        return this.a ? "%H" : "%h";
    }
}
