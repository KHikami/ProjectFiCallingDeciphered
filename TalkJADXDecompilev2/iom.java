package defpackage;

import java.util.HashMap;
import java.util.Map;

public final class iom {
    final Map<String, inj> a = new HashMap();
    private final ijn b;
    private final iny c;
    private final ine d;

    public iom(ijn ijn) {
        this.b = ijn;
        this.d = ijn.d();
        this.d.a(new ion(this));
        this.c = new iny(ijn);
    }

    public void a() {
        this.c.c();
    }

    public iny b() {
        return this.c;
    }

    public iok a(String str) {
        iil.b("Cannot get source of a null participant", (Object) str);
        if ("localParticipant".equals(str) || str.equals(this.d.d().a())) {
            return this.c;
        }
        ind a = this.d.a(str);
        if (a == null) {
            itx.a(4, "vclib", "Attempted to get remote source for a non-remote participant");
            return null;
        }
        inj inj = (inj) this.a.get(str);
        if (inj == null || !inj.d()) {
            this.a.put(str, new inj(this.b, a));
        }
        return (inj) this.a.get(str);
    }
}
