package p000;

public class mqh extends mpz {
    public final /* synthetic */ boolean f28111a;
    private final mpz f28112d;

    protected final Object mo3910a(Object obj, mon mon) {
        return new mqi(this, obj, this.f28112d.mo3910a(m32696a(obj), mon));
    }

    public mqh(mpz mpz) {
        super(mpz.f28059c, mpz.f28058b);
        this.f28112d = mpz;
    }

    public Object m32696a(Object obj) {
        return Integer.valueOf(obj.hashCode());
    }

    public mqh(mpz mpz, boolean z) {
        this.f28111a = z;
        this(mpz);
    }

    public String mo3911a() {
        return this.f28111a ? "%H" : "%h";
    }
}
