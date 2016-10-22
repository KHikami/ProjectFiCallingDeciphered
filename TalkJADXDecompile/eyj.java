import java.util.HashSet;
import java.util.Set;

public class eyj extends evz {
    private static final long serialVersionUID = 1;
    private final Set<String> g;
    private final boolean h;
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final String l;

    eyj(ohp ohp) {
        Set hashSet = new HashSet(ohp.j.length);
        for (ohu ohu : ohp.j) {
            if (ohu.a != null) {
                hashSet.add(ohu.a);
            }
        }
        this.g = hashSet;
        this.h = gwb.b(ohp.b);
        this.i = gwb.b(ohp.c);
        this.j = gwb.b(ohp.g);
        this.k = gwb.b(ohp.k);
        if (ohp.a != null) {
            this.l = ohp.a.c;
        } else {
            this.l = null;
        }
    }

    public void a(blo blo, fhc fhc) {
        super.a(blo, fhc);
        fde.a(blo.g(), k(), l(), m(), o(), n());
        jci b = ((jcf) jyn.a(gwb.H(), jcf.class)).b(blo.g().g());
        b.b("use_tycho_branding", n());
        b.d();
    }

    public boolean k() {
        return this.h;
    }

    public boolean l() {
        return this.i;
    }

    public boolean m() {
        return this.j;
    }

    public boolean n() {
        return this.k;
    }

    public String o() {
        return this.l;
    }
}
