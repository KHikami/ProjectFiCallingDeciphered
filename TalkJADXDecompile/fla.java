import java.util.HashMap;
import java.util.Map;

public final class fla extends fhb {
    private byte[] a;
    private Map<String, Integer> b;
    private boolean g;

    public fla(bko bko, byte[] bArr, String str, boolean z) {
        super(bko);
        this.a = bArr;
        this.b = new HashMap();
        this.b.put(str, z ? null : Integer.valueOf(0));
        this.g = z;
    }

    public void w_() {
        a(new evv(this.a, this.b, this.g));
    }
}
