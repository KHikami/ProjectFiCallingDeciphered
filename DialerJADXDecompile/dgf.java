import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
final class dgf implements Runnable {
    private /* synthetic */ dge a;

    dgf(dge dge) {
        this.a = dge;
    }

    public final void run() {
        synchronized (this.a) {
            if (this.a.e != null) {
                this.a.e.cancel(false);
                this.a.e = null;
            }
            dge dge = this.a;
            dhh dhh = this.a.g;
            this.a.f = true;
        }
        try {
            InetAddress[] allByName = InetAddress.getAllByName(this.a.a);
            List arrayList = new ArrayList(allByName.length);
            for (InetAddress inetSocketAddress : allByName) {
                arrayList.add(new dhj(new InetSocketAddress(inetSocketAddress, this.a.b), dfc.b));
            }
            dhh.a(arrayList, dfc.b);
            synchronized (this.a) {
                this.a.f = false;
            }
        } catch (Throwable e) {
            synchronized (this.a) {
            }
            dge dge2 = this.a;
            this.a.e = this.a.c.schedule(this.a.i, 1, TimeUnit.MINUTES);
            dhh.a(dhn.j.b(e));
            synchronized (this.a) {
            }
            this.a.f = false;
        } catch (Throwable th) {
            synchronized (this.a) {
            }
            this.a.f = false;
        }
    }
}
