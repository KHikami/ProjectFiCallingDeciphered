package defpackage;

import android.content.Context;
import com.google.api.client.http.HttpTransport;
import java.util.LinkedList;
import java.util.Queue;

public final class ioy implements iop {
    ioq a;
    private final Context b;
    private final String c;
    private final boolean d;
    private final Queue<ipb<byte[]>> e;
    private String f;
    private long g;
    private HttpTransport h;

    public ioy(Context context, String str) {
        this(context, str, new ken(), jyn.b(context, iik.class) != null);
    }

    private ioy(Context context, String str, HttpTransport httpTransport, boolean z) {
        this.b = context;
        this.c = str;
        this.h = httpTransport;
        this.d = z;
        this.e = new LinkedList();
    }

    public void a(String str, long j) {
        itx.a(3, "vclib", "Setting authToken, wasNull: %s", Boolean.valueOf(this.f == null));
        this.f = str;
        this.g = j;
        if (this.f == null) {
            itx.a(3, "vclib", "Issuing any pending requests, #requests: %d", Integer.valueOf(this.e.size()));
            while (!this.e.isEmpty()) {
                ipb ipb = (ipb) this.e.remove();
                ipb.a(this.f, this.g);
                new ipd(this, ipb).b(new Void[0]);
            }
        }
    }

    public void a(ioq ioq) {
        this.a = ioq;
    }

    private ioq b() {
        return new ioz(this);
    }

    public void a(long j, String str, byte[] bArr, int i) {
        iil.b("Expected non-null", this.a);
        a(j, str, bArr, i, b());
    }

    public void a() {
    }

    private void a(long j, String str, byte[] bArr, int i, ioq ioq) {
        ipb iox;
        if (this.d) {
            iox = new iox(j, str, bArr, i, (iik) jyn.b(this.b, iik.class), this.c, ioq, this.b);
        } else {
            iox = new ipe(j, str, bArr, i, this.h, this.c, ioq);
        }
        if (this.f != null) {
            iox.a(this.f, this.g);
            new ipd(this, iox).b(new Void[0]);
            itx.a(3, "vclib", "Starting apiary request: %s", str);
            return;
        }
        this.e.add(iox);
        itx.a(3, "vclib", "authToken not available yet, delaying request. #pending: %d", Integer.valueOf(this.e.size()));
    }

    public void a(String str, byte[] bArr, int i, ioq ioq) {
        iil.b("Expected non-null", (Object) ioq);
        a(0, str, bArr, i, ioq);
    }
}
