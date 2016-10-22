import io.grpc.internal.ar;
import java.net.Socket;
import java.net.URI;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: PG */
final class dir implements Runnable {
    private /* synthetic */ diq a;

    dir(diq diq) {
        this.a = diq;
    }

    public final void run() {
        boolean z;
        if (this.a.b == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Runnable runnable = this.a.s;
            diq diq = this.a;
            diq diq2 = this.a;
            diq diq3 = this.a;
            diq.k = new dit(diq2, null);
            this.a.i.execute(this.a.k);
            synchronized (this.a.g) {
                this.a.p = Integer.MAX_VALUE;
                this.a.c();
            }
            dhv dhv = this.a.e;
            diq diq4 = this.a;
            dhv.a(null, this.a.o);
            this.a.t.a(null);
            return;
        }
        dlw a = dly.a(new dis(this));
        dkg djz = new djz();
        try {
            Socket socket = new Socket(this.a.b.getAddress(), this.a.b.getPort());
            if (this.a.n != null) {
                String host;
                int port;
                SSLSocketFactory sSLSocketFactory = this.a.n;
                diq2 = this.a;
                URI b = ar.b(diq2.c);
                if (b.getHost() != null) {
                    host = b.getHost();
                } else {
                    host = diq2.c;
                }
                diq2 = this.a;
                URI b2 = ar.b(diq2.c);
                if (b2.getPort() != -1) {
                    port = b2.getPort();
                } else {
                    port = diq2.b.getPort();
                }
                socket = diy.a(sSLSocketFactory, socket, host, port, this.a.r);
            }
            socket.setTcpNoDelay(true);
            a = dly.a(dly.b(socket));
            dlv a2 = dly.a(dly.a(socket));
            this.a.k = new dit(this.a, djz.a(a, true));
            this.a.i.execute(this.a.k);
            synchronized (this.a.g) {
                this.a.o = socket;
                this.a.p = Integer.MAX_VALUE;
                this.a.c();
            }
            djt a3 = djz.a(a2, true);
            this.a.e.a(a3, this.a.o);
            try {
                a3.a();
                a3.b(new dkf());
            } catch (Throwable e) {
                this.a.a(e);
            }
        } catch (Throwable e2) {
            this.a.a(e2);
            this.a.k = new dit(this.a, djz.a(a, true));
            this.a.i.execute(this.a.k);
        } catch (Throwable th) {
            this.a.k = new dit(this.a, djz.a(a, true));
            this.a.i.execute(this.a.k);
        }
    }
}
