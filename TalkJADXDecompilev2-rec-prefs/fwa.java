package p000;

import java.util.Map;

final class fwa implements jwm {
    final /* synthetic */ fwf f14132a;
    final /* synthetic */ Map f14133b;
    final /* synthetic */ fvy f14134c;

    fwa(fvy fvy, fwf fwf, Map map) {
        this.f14134c = fvy;
        this.f14132a = fwf;
        this.f14133b = map;
    }

    public boolean mo1377a(jwi jwi, Object obj) {
        String str = (String) obj;
        if (!this.f14132a.m16386h().equals(str)) {
            this.f14132a.m16373a(str);
            this.f14132a.mo2102b((CharSequence) this.f14133b.get(str));
            this.f14134c.f14126a.mo2143a(str);
        }
        return true;
    }
}
