package io.grpc.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import okw;
import olv;

final class aw implements db {
    final db a;
    private volatile boolean b;
    private List<Runnable> c;

    public aw(db dbVar) {
        this.c = new ArrayList();
        this.a = dbVar;
    }

    private void a(Runnable runnable) {
        synchronized (this) {
            if (this.b) {
                runnable.run();
                return;
            }
            this.c.add(runnable);
        }
    }

    public void a(InputStream inputStream) {
        if (this.b) {
            this.a.a(inputStream);
        } else {
            a(new ax(this, inputStream));
        }
    }

    public void a() {
        if (this.b) {
            this.a.a();
        } else {
            a(new ay(this));
        }
    }

    public void a(okw okw) {
        a(new az(this, okw));
    }

    public void b(olv olv, okw okw) {
        a(new ba(this, olv, okw));
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b() {
        /*
        r3 = this;
        r0 = new java.util.ArrayList;
        r0.<init>();
    L_0x0005:
        monitor-enter(r3);
        r1 = r3.c;	 Catch:{ all -> 0x002f }
        r1 = r1.isEmpty();	 Catch:{ all -> 0x002f }
        if (r1 == 0) goto L_0x0016;
    L_0x000e:
        r0 = 0;
        r3.c = r0;	 Catch:{ all -> 0x002f }
        r0 = 1;
        r3.b = r0;	 Catch:{ all -> 0x002f }
        monitor-exit(r3);	 Catch:{ all -> 0x002f }
        return;
    L_0x0016:
        r1 = r3.c;	 Catch:{ all -> 0x002f }
        r3.c = r0;	 Catch:{ all -> 0x002f }
        monitor-exit(r3);	 Catch:{ all -> 0x002f }
        r2 = r1.iterator();
    L_0x001f:
        r0 = r2.hasNext();
        if (r0 == 0) goto L_0x0032;
    L_0x0025:
        r0 = r2.next();
        r0 = (java.lang.Runnable) r0;
        r0.run();
        goto L_0x001f;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r3);	 Catch:{ all -> 0x002f }
        throw r0;
    L_0x0032:
        r1.clear();
        r0 = r1;
        goto L_0x0005;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.aw.b():void");
    }
}
