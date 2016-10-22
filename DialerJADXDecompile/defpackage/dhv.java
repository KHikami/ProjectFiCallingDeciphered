package defpackage;

import io.grpc.internal.bx;
import java.net.Socket;
import java.util.List;
import java.util.logging.Logger;

/* compiled from: PG */
/* renamed from: dhv */
final class dhv implements djt {
    static final Logger a;
    djt b;
    Socket c;
    final diq d;
    private final bx e;

    static {
        a = Logger.getLogger(diq.class.getName());
    }

    public dhv(diq diq, bx bxVar) {
        this.d = diq;
        this.e = bxVar;
    }

    final void a(djt djt, Socket socket) {
        cob.b(this.b == null, (Object) "AsyncFrameWriter's setFrameWriter() should only be called once.");
        this.b = (djt) cob.i((Object) djt);
        this.c = (Socket) cob.i((Object) socket);
    }

    public final void a() {
        this.e.execute(new dhw(this));
    }

    public final void a(dkf dkf) {
        this.e.execute(new dic(this, dkf));
    }

    public final void b() {
        this.e.execute(new did(this));
    }

    public final void a(boolean z, boolean z2, int i, int i2, List list) {
        this.e.execute(new die(this, z, z2, i, i2, list));
    }

    public final void a(int i, djq djq) {
        this.e.execute(new dif(this, i, djq));
    }

    public final void a(boolean z, int i, dlu dlu, int i2) {
        this.e.execute(new dig(this, z, i, dlu, i2));
    }

    public final void b(dkf dkf) {
        this.e.execute(new dhx(this, dkf));
    }

    public final void a(boolean z, int i, int i2) {
        this.e.execute(new dhy(this, z, i, i2));
    }

    public final void a(int i, djq djq, byte[] bArr) {
        this.e.execute(new dhz(this, i, djq, bArr));
    }

    public final void a(int i, long j) {
        this.e.execute(new dia(this, i, j));
    }

    public final void close() {
        this.e.execute(new dib(this));
    }

    public final int c() {
        if (this.b == null) {
            return 16384;
        }
        return this.b.c();
    }
}
