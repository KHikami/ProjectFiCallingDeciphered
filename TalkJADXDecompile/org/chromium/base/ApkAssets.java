package org.chromium.base;

import org.chromium.base.annotations.JNINamespace;

@JNINamespace
public class ApkAssets {
    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    @org.chromium.base.annotations.CalledByNative
    public static long[] open(android.content.Context r6, java.lang.String r7) {
        /*
        r1 = 0;
        r0 = r6.getAssets();	 Catch:{ IOException -> 0x0035 }
        r1 = r0.openNonAssetFd(r7);	 Catch:{ IOException -> 0x0035 }
        r0 = 3;
        r0 = new long[r0];	 Catch:{ IOException -> 0x0035 }
        r2 = 0;
        r3 = r1.getParcelFileDescriptor();	 Catch:{ IOException -> 0x0035 }
        r3 = r3.detachFd();	 Catch:{ IOException -> 0x0035 }
        r4 = (long) r3;	 Catch:{ IOException -> 0x0035 }
        r0[r2] = r4;	 Catch:{ IOException -> 0x0035 }
        r2 = 1;
        r4 = r1.getStartOffset();	 Catch:{ IOException -> 0x0035 }
        r0[r2] = r4;	 Catch:{ IOException -> 0x0035 }
        r2 = 2;
        r4 = r1.getLength();	 Catch:{ IOException -> 0x0035 }
        r0[r2] = r4;	 Catch:{ IOException -> 0x0035 }
        if (r1 == 0) goto L_0x002b;
    L_0x0028:
        r1.close();	 Catch:{ IOException -> 0x002c }
    L_0x002b:
        return r0;
    L_0x002c:
        r1 = move-exception;
        r2 = "ApkAssets";
        r3 = "Unable to close AssetFileDescriptor";
        android.util.Log.e(r2, r3, r1);
        goto L_0x002b;
    L_0x0035:
        r0 = move-exception;
        r2 = r0.getMessage();	 Catch:{ all -> 0x007f }
        r3 = "";
        r2 = r2.equals(r3);	 Catch:{ all -> 0x007f }
        if (r2 != 0) goto L_0x006a;
    L_0x0042:
        r2 = r0.getMessage();	 Catch:{ all -> 0x007f }
        r2 = r2.equals(r7);	 Catch:{ all -> 0x007f }
        if (r2 != 0) goto L_0x006a;
    L_0x004c:
        r2 = "ApkAssets";
        r3 = new java.lang.StringBuilder;	 Catch:{ all -> 0x007f }
        r4 = "Error while loading asset ";
        r3.<init>(r4);	 Catch:{ all -> 0x007f }
        r3 = r3.append(r7);	 Catch:{ all -> 0x007f }
        r4 = ": ";
        r3 = r3.append(r4);	 Catch:{ all -> 0x007f }
        r0 = r3.append(r0);	 Catch:{ all -> 0x007f }
        r0 = r0.toString();	 Catch:{ all -> 0x007f }
        android.util.Log.e(r2, r0);	 Catch:{ all -> 0x007f }
    L_0x006a:
        r0 = 3;
        r0 = new long[r0];	 Catch:{ all -> 0x007f }
        r0 = {-1, -1, -1};
        if (r1 == 0) goto L_0x002b;
    L_0x0072:
        r1.close();	 Catch:{ IOException -> 0x0076 }
        goto L_0x002b;
    L_0x0076:
        r1 = move-exception;
        r2 = "ApkAssets";
        r3 = "Unable to close AssetFileDescriptor";
        android.util.Log.e(r2, r3, r1);
        goto L_0x002b;
    L_0x007f:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0085;
    L_0x0082:
        r1.close();	 Catch:{ IOException -> 0x0086 }
    L_0x0085:
        throw r0;
    L_0x0086:
        r1 = move-exception;
        r2 = "ApkAssets";
        r3 = "Unable to close AssetFileDescriptor";
        android.util.Log.e(r2, r3, r1);
        goto L_0x0085;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.base.ApkAssets.open(android.content.Context, java.lang.String):long[]");
    }
}
