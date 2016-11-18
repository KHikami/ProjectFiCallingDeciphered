package p000;

import java.util.HashMap;
import java.util.Map;

public final class fla extends fhb {
    private byte[] f13355a;
    private Map<String, Integer> f13356b = new HashMap();
    private boolean f13357g;

    public fla(bko bko, byte[] bArr, String str, boolean z) {
        super(bko);
        this.f13355a = bArr;
        this.f13356b.put(str, z ? null : Integer.valueOf(0));
        this.f13357g = z;
    }

    public void w_() {
        m8039a(new evv(this.f13355a, this.f13356b, this.f13357g));
    }
}
