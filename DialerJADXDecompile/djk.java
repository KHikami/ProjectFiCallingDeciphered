import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
final class djk extends djj {
    private final dji c;
    private final dji d;
    private final dji e;
    private final dji f;

    public djk(dji dji, dji dji2, Method method, Method method2, dji dji3, dji dji4) {
        this.c = dji;
        this.d = dji2;
        this.e = dji3;
        this.f = dji4;
    }

    public final void a(SSLSocket sSLSocket, String str, List list) {
        if (str != null) {
            this.c.a(sSLSocket, Boolean.valueOf(true));
            this.d.a(sSLSocket, str);
        }
        if (this.f != null && this.f.a((Object) sSLSocket)) {
            this.f.b(sSLSocket, djj.a(list));
        }
    }

    public final String b(SSLSocket sSLSocket) {
        if (this.e == null) {
            return null;
        }
        if (!this.e.a((Object) sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.e.b(sSLSocket, new Object[0]);
        return bArr != null ? new String(bArr, djp.b) : null;
    }
}
