package defpackage;

import android.os.ParcelFileDescriptor;
import java.util.concurrent.Callable;

/* renamed from: iax */
final class iax implements Callable<Boolean> {
    final /* synthetic */ ParcelFileDescriptor a;
    final /* synthetic */ byte[] b;
    final /* synthetic */ iaw c;

    iax(iaw iaw, ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.c = iaw;
        this.a = parcelFileDescriptor;
        this.b = bArr;
    }

    private java.lang.Boolean a() {
        /* JADX: method processing error */
/*
        Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x00d3 in list []
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:42)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:58)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:281)
	at jadx.api.JavaClass.decompile(JavaClass.java:59)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:161)
*/
        /*
        r5 = this;
        r1 = 3;
        r0 = "WearableClient";
        r0 = android.util.Log.isLoggable(r0, r1);
        if (r0 == 0) goto L_0x0027;
    L_0x0009:
        r0 = r5.a;
        r0 = java.lang.String.valueOf(r0);
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r0);
        r2 = r2.length();
        r2 = r2 + 36;
        r1.<init>(r2);
        r2 = "processAssets: writing data to FD : ";
        r1 = r1.append(r2);
        r1.append(r0);
    L_0x0027:
        r1 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream;
        r0 = r5.a;
        r1.<init>(r0);
        r0 = r5.b;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r1.write(r0);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r1.flush();	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r0 = "WearableClient";	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2 = 3;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r0 = android.util.Log.isLoggable(r0, r2);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        if (r0 == 0) goto L_0x005d;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
    L_0x003f:
        r0 = r5.a;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r3 = r3.length();	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r3 = r3 + 27;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2.<init>(r3);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r3 = "processAssets: wrote data: ";	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2.append(r0);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
    L_0x005d:
        r0 = 1;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2 = "WearableClient";	 Catch:{ IOException -> 0x010c }
        r3 = 3;	 Catch:{ IOException -> 0x010c }
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IOException -> 0x010c }
        if (r2 == 0) goto L_0x0089;	 Catch:{ IOException -> 0x010c }
    L_0x006b:
        r2 = r5.a;	 Catch:{ IOException -> 0x010c }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x010c }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x010c }
        r4 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x010c }
        r4 = r4.length();	 Catch:{ IOException -> 0x010c }
        r4 = r4 + 24;	 Catch:{ IOException -> 0x010c }
        r3.<init>(r4);	 Catch:{ IOException -> 0x010c }
        r4 = "processAssets: closing: ";	 Catch:{ IOException -> 0x010c }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x010c }
        r3.append(r2);	 Catch:{ IOException -> 0x010c }
    L_0x0089:
        r1.close();	 Catch:{ IOException -> 0x010c }
    L_0x008c:
        return r0;
    L_0x008d:
        r0 = move-exception;
        r0 = r5.a;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r3 = java.lang.String.valueOf(r0);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r3 = r3.length();	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r3 = r3 + 36;	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2.<init>(r3);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r3 = "processAssets: writing data failed: ";	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2 = r2.append(r3);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r2.append(r0);	 Catch:{ IOException -> 0x008d, all -> 0x00dc }
        r0 = "WearableClient";
        r2 = 3;
        r0 = android.util.Log.isLoggable(r0, r2);
        if (r0 == 0) goto L_0x00d3;
    L_0x00b5:
        r0 = r5.a;
        r0 = java.lang.String.valueOf(r0);
        r2 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r0);
        r3 = r3.length();
        r3 = r3 + 24;
        r2.<init>(r3);
        r3 = "processAssets: closing: ";
        r2 = r2.append(r3);
        r2.append(r0);
    L_0x00d3:
        r1.close();
    L_0x00d6:
        r0 = 0;
        r0 = java.lang.Boolean.valueOf(r0);
        goto L_0x008c;
    L_0x00dc:
        r0 = move-exception;
        r2 = "WearableClient";	 Catch:{ IOException -> 0x0108 }
        r3 = 3;	 Catch:{ IOException -> 0x0108 }
        r2 = android.util.Log.isLoggable(r2, r3);	 Catch:{ IOException -> 0x0108 }
        if (r2 == 0) goto L_0x0104;	 Catch:{ IOException -> 0x0108 }
    L_0x00e6:
        r2 = r5.a;	 Catch:{ IOException -> 0x0108 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x0108 }
        r3 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0108 }
        r4 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x0108 }
        r4 = r4.length();	 Catch:{ IOException -> 0x0108 }
        r4 = r4 + 24;	 Catch:{ IOException -> 0x0108 }
        r3.<init>(r4);	 Catch:{ IOException -> 0x0108 }
        r4 = "processAssets: closing: ";	 Catch:{ IOException -> 0x0108 }
        r3 = r3.append(r4);	 Catch:{ IOException -> 0x0108 }
        r3.append(r2);	 Catch:{ IOException -> 0x0108 }
    L_0x0104:
        r1.close();	 Catch:{ IOException -> 0x0108 }
    L_0x0107:
        throw r0;
    L_0x0108:
        r1 = move-exception;
        goto L_0x0107;
    L_0x010a:
        r0 = move-exception;
        goto L_0x00d6;
    L_0x010c:
        r1 = move-exception;
        goto L_0x008c;
        */
        throw new UnsupportedOperationException("Method not decompiled: iax.a():java.lang.Boolean");
    }

    public /* synthetic */ Object call() {
        return a();
    }
}
