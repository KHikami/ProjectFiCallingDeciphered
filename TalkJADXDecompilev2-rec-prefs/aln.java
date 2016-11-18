package p000;

import com.google.api.client.http.HttpStatusCodes;
import java.util.Map;

public final class aln {
    public final int f1208a;
    public final byte[] f1209b;
    public final Map<String, String> f1210c;
    public final boolean f1211d;
    public final long f1212e;

    public aln(int i, byte[] bArr, Map<String, String> map, boolean z, long j) {
        this.f1208a = i;
        this.f1209b = bArr;
        this.f1210c = map;
        this.f1211d = z;
        this.f1212e = j;
    }

    public aln(byte[] bArr, Map<String, String> map) {
        this(HttpStatusCodes.STATUS_CODE_OK, bArr, map, false, 0);
    }
}
