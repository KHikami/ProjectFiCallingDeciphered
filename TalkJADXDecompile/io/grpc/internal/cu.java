package io.grpc.internal;

final class cu implements Runnable {
    final /* synthetic */ cs a;

    cu(cs csVar) {
        this.a = csVar;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
        r8 = this;
        r1 = 0;
        r2 = 1;
    L_0x0002:
        r0 = r8.a;	 Catch:{ all -> 0x0050 }
        r3 = r0.d;	 Catch:{ all -> 0x0050 }
        monitor-enter(r3);	 Catch:{ all -> 0x0050 }
        r0 = r8.a;	 Catch:{ all -> 0x005f }
        r0 = r0.c;	 Catch:{ all -> 0x005f }
        bm.b(r0);	 Catch:{ all -> 0x005f }
        r0 = r8.a;	 Catch:{ all -> 0x005f }
        r0 = r0.b;	 Catch:{ all -> 0x005f }
        r0 = r0.poll();	 Catch:{ all -> 0x005f }
        r0 = (java.lang.Runnable) r0;	 Catch:{ all -> 0x005f }
        if (r0 != 0) goto L_0x0021;
    L_0x001a:
        r0 = r8.a;	 Catch:{ all -> 0x005f }
        r4 = 0;
        r0.c = r4;	 Catch:{ all -> 0x005f }
        monitor-exit(r3);	 Catch:{ all -> 0x0069 }
        return;
    L_0x0021:
        monitor-exit(r3);	 Catch:{ all -> 0x005f }
        r0.run();	 Catch:{ RuntimeException -> 0x0026 }
        goto L_0x0002;
    L_0x0026:
        r3 = move-exception;
        r4 = io.grpc.internal.cs.a;	 Catch:{ all -> 0x0050 }
        r5 = java.util.logging.Level.SEVERE;	 Catch:{ all -> 0x0050 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0050 }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0050 }
        r7 = java.lang.String.valueOf(r0);	 Catch:{ all -> 0x0050 }
        r7 = r7.length();	 Catch:{ all -> 0x0050 }
        r7 = r7 + 35;
        r6.<init>(r7);	 Catch:{ all -> 0x0050 }
        r7 = "Exception while executing runnable ";
        r6 = r6.append(r7);	 Catch:{ all -> 0x0050 }
        r0 = r6.append(r0);	 Catch:{ all -> 0x0050 }
        r0 = r0.toString();	 Catch:{ all -> 0x0050 }
        r4.log(r5, r0, r3);	 Catch:{ all -> 0x0050 }
        goto L_0x0002;
    L_0x0050:
        r0 = move-exception;
    L_0x0051:
        if (r2 == 0) goto L_0x005e;
    L_0x0053:
        r1 = r8.a;
        r1 = r1.d;
        monitor-enter(r1);
        r2 = r8.a;	 Catch:{ all -> 0x0066 }
        r3 = 0;
        r2.c = r3;	 Catch:{ all -> 0x0066 }
        monitor-exit(r1);	 Catch:{ all -> 0x0066 }
    L_0x005e:
        throw r0;
    L_0x005f:
        r0 = move-exception;
        r1 = r2;
    L_0x0061:
        monitor-exit(r3);	 Catch:{ all -> 0x0069 }
        throw r0;	 Catch:{ all -> 0x0063 }
    L_0x0063:
        r0 = move-exception;
        r2 = r1;
        goto L_0x0051;
    L_0x0066:
        r0 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0066 }
        throw r0;
    L_0x0069:
        r0 = move-exception;
        goto L_0x0061;
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.internal.cu.run():void");
    }
}
