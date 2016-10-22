package io.grpc.internal;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import ojh;
import olm;
import olt;
import olv;

final class bc implements Runnable {
    final /* synthetic */ bb a;

    bc(bb bbVar) {
        this.a = bbVar;
    }

    public void run() {
        synchronized (this.a) {
            if (this.a.f != null) {
                this.a.f.cancel(false);
                this.a.f = null;
            }
            if (this.a.c) {
                return;
            }
            r2 = this.a.h;
            this.a.g = true;
            try {
                InetAddress[] allByName = InetAddress.getAllByName(this.a.a);
                List arrayList = new ArrayList(allByName.length);
                for (InetAddress inetSocketAddress : allByName) {
                    arrayList.add(new olt(new InetSocketAddress(inetSocketAddress, this.a.b), ojh.b));
                }
                r2.a(Collections.singletonList(arrayList), ojh.b);
                synchronized (this.a) {
                    this.a.g = false;
                }
            } catch (Throwable e) {
                synchronized (this.a) {
                }
                if (this.a.c) {
                    synchronized (this.a) {
                    }
                    this.a.g = false;
                    return;
                }
                olm olm;
                this.a.f = this.a.d.schedule(new bq(this.a.j), 1, TimeUnit.MINUTES);
                olm.a(olv.q.b(e));
                synchronized (this.a) {
                }
                this.a.g = false;
            } catch (Throwable th) {
                synchronized (this.a) {
                }
                this.a.g = false;
            }
        }
    }
}
