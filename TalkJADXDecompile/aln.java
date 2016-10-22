import com.google.api.client.http.HttpStatusCodes;
import java.util.Map;

public final class aln {
    public final int a;
    public final byte[] b;
    public final Map<String, String> c;
    public final boolean d;
    public final long e;

    public aln(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.a = i;
        this.b = bArr;
        this.c = map;
        this.d = z;
        this.e = j;
    }

    public aln(byte[] bArr, Map<String, String> map) {
        this(HttpStatusCodes.STATUS_CODE_OK, bArr, map, false, 0);
    }
}
