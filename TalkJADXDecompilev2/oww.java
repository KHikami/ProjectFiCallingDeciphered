package defpackage;

import java.nio.ByteBuffer;
import org.chromium.net.impl.CronetBidirectionalStream;

public final class oww implements Runnable {
    final /* synthetic */ CronetBidirectionalStream a;
    private ByteBuffer b;
    private final boolean c;

    public oww(CronetBidirectionalStream cronetBidirectionalStream, ByteBuffer byteBuffer, boolean z) {
        this.a = cronetBidirectionalStream;
        this.b = byteBuffer;
        this.c = z;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.b;	 Catch:{ Exception -> 0x0038 }
        r2 = 0;
        r5.b = r2;	 Catch:{ Exception -> 0x0038 }
        r2 = r5.a;	 Catch:{ Exception -> 0x0038 }
        r2 = r2.c;	 Catch:{ Exception -> 0x0038 }
        monitor-enter(r2);	 Catch:{ Exception -> 0x0038 }
        r3 = r5.a;	 Catch:{ all -> 0x003f }
        r3 = r3.d();	 Catch:{ all -> 0x003f }
        if (r3 == 0) goto L_0x0015;
    L_0x0013:
        monitor-exit(r2);	 Catch:{ all -> 0x003f }
    L_0x0014:
        return;
    L_0x0015:
        r3 = r5.c;	 Catch:{ all -> 0x003f }
        if (r3 == 0) goto L_0x0028;
    L_0x0019:
        r3 = r5.a;	 Catch:{ all -> 0x003f }
        r4 = defpackage.owx.k;	 Catch:{ all -> 0x003f }
        r3.f = r4;	 Catch:{ all -> 0x003f }
        r3 = r5.a;	 Catch:{ all -> 0x003f }
        r3 = r3.e;	 Catch:{ all -> 0x003f }
        r4 = defpackage.owx.e;	 Catch:{ all -> 0x003f }
        if (r3 != r4) goto L_0x0028;
    L_0x0027:
        r0 = 1;
    L_0x0028:
        monitor-exit(r2);	 Catch:{ all -> 0x003f }
        r2 = r5.a;	 Catch:{ Exception -> 0x0038 }
        r2 = r2.a;	 Catch:{ Exception -> 0x0038 }
        r2.a(r1);	 Catch:{ Exception -> 0x0038 }
        if (r0 == 0) goto L_0x0014;
    L_0x0032:
        r0 = r5.a;	 Catch:{ Exception -> 0x0038 }
        r0.e();	 Catch:{ Exception -> 0x0038 }
        goto L_0x0014;
    L_0x0038:
        r0 = move-exception;
        r1 = r5.a;
        r1.a(r0);
        goto L_0x0014;
    L_0x003f:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x003f }
        throw r0;	 Catch:{ Exception -> 0x0038 }
        */
        throw new UnsupportedOperationException("Method not decompiled: oww.run():void");
    }
}
