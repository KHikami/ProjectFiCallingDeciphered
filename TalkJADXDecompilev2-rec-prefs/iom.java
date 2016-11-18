package p000;

import java.util.HashMap;
import java.util.Map;

public final class iom {
    final Map<String, inj> f18586a = new HashMap();
    private final ijn f18587b;
    private final iny f18588c;
    private final ine f18589d;

    public iom(ijn ijn) {
        this.f18587b = ijn;
        this.f18589d = ijn.m21966d();
        this.f18589d.m22341a(new ion(this));
        this.f18588c = new iny(ijn);
    }

    public void m22771a() {
        this.f18588c.m22435c();
    }

    public iny m22772b() {
        return this.f18588c;
    }

    public iok m22770a(String str) {
        iil.m21875b("Cannot get source of a null participant", (Object) str);
        if ("localParticipant".equals(str) || str.equals(this.f18589d.m22346d().m22332a())) {
            return this.f18588c;
        }
        ind a = this.f18589d.m22338a(str);
        if (a == null) {
            itx.m23277a(4, "vclib", "Attempted to get remote source for a non-remote participant");
            return null;
        }
        inj inj = (inj) this.f18586a.get(str);
        if (inj == null || !inj.m22379d()) {
            this.f18586a.put(str, new inj(this.f18587b, a));
        }
        return (inj) this.f18586a.get(str);
    }
}
