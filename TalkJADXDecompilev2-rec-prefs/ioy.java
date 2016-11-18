package p000;

import android.content.Context;
import com.google.api.client.http.HttpTransport;
import java.util.LinkedList;
import java.util.Queue;

public final class ioy implements iop {
    ioq f18626a;
    private final Context f18627b;
    private final String f18628c;
    private final boolean f18629d;
    private final Queue<ipb<byte[]>> f18630e;
    private String f18631f;
    private long f18632g;
    private HttpTransport f18633h;

    public ioy(Context context, String str) {
        this(context, str, new ken(), jyn.m25433b(context, iik.class) != null);
    }

    private ioy(Context context, String str, HttpTransport httpTransport, boolean z) {
        this.f18627b = context;
        this.f18628c = str;
        this.f18633h = httpTransport;
        this.f18629d = z;
        this.f18630e = new LinkedList();
    }

    public void mo3349a(String str, long j) {
        itx.m23279a(3, "vclib", "Setting authToken, wasNull: %s", Boolean.valueOf(this.f18631f == null));
        this.f18631f = str;
        this.f18632g = j;
        if (this.f18631f == null) {
            itx.m23279a(3, "vclib", "Issuing any pending requests, #requests: %d", Integer.valueOf(this.f18630e.size()));
            while (!this.f18630e.isEmpty()) {
                ipb ipb = (ipb) this.f18630e.remove();
                ipb.mo3352a(this.f18631f, this.f18632g);
                new ipd(this, ipb).m4950b(new Void[0]);
            }
        }
    }

    public void mo3348a(ioq ioq) {
        this.f18626a = ioq;
    }

    private ioq m22823b() {
        return new ioz(this);
    }

    public void mo3347a(long j, String str, byte[] bArr, int i) {
        iil.m21875b("Expected non-null", this.f18626a);
        m22822a(j, str, bArr, i, m22823b());
    }

    public void mo3346a() {
    }

    private void m22822a(long j, String str, byte[] bArr, int i, ioq ioq) {
        ipb iox;
        if (this.f18629d) {
            iox = new iox(j, str, bArr, i, (iik) jyn.m25433b(this.f18627b, iik.class), this.f18628c, ioq, this.f18627b);
        } else {
            iox = new ipe(j, str, bArr, i, this.f18633h, this.f18628c, ioq);
        }
        if (this.f18631f != null) {
            iox.mo3352a(this.f18631f, this.f18632g);
            new ipd(this, iox).m4950b(new Void[0]);
            itx.m23279a(3, "vclib", "Starting apiary request: %s", str);
            return;
        }
        this.f18630e.add(iox);
        itx.m23279a(3, "vclib", "authToken not available yet, delaying request. #pending: %d", Integer.valueOf(this.f18630e.size()));
    }

    public void mo3350a(String str, byte[] bArr, int i, ioq ioq) {
        iil.m21875b("Expected non-null", (Object) ioq);
        m22822a(0, str, bArr, i, ioq);
    }
}
