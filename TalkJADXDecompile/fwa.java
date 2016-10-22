import java.util.Map;

final class fwa implements jwm {
    final /* synthetic */ fwf a;
    final /* synthetic */ Map b;
    final /* synthetic */ fvy c;

    fwa(fvy fvy, fwf fwf, Map map) {
        this.c = fvy;
        this.a = fwf;
        this.b = map;
    }

    public boolean a(jwi jwi, Object obj) {
        String str = (String) obj;
        if (!this.a.h().equals(str)) {
            this.a.a(str);
            this.a.b((CharSequence) this.b.get(str));
            this.c.a.a(str);
        }
        return true;
    }
}
