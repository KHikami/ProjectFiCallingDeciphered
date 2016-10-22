import android.content.ContentResolver;
import android.util.Log;
import com.android.contacts.common.vcard.VCardService;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public final class ajg extends ajq implements bgq {
    private final VCardService a;
    private final ContentResolver b;
    private final ajh c;
    private final int d;
    private final ajt e;
    private final List f;
    private bgs g;
    private volatile boolean h;
    private volatile boolean i;
    private int j;
    private int k;

    public ajg(VCardService vCardService, ajt ajt, ajh ajh, int i) {
        this.f = new ArrayList();
        this.j = 0;
        this.k = 0;
        this.a = vCardService;
        this.b = this.a.getContentResolver();
        this.e = ajt;
        this.c = ajh;
        this.d = i;
    }

    public final void b() {
    }

    public final void a(bfs bfs) {
        this.j++;
        if (this.e != null) {
            this.e.a(this.c, this.d, bfs, this.j, this.k);
        }
    }

    public final int a() {
        return 1;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
        r12 = this;
        r0 = 0;
        r10 = 1;
        r1 = 0;
        r2 = "vCard import (id: %d) has started.";
        r3 = 1;
        r3 = new java.lang.Object[r3];	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r4 = 0;
        r5 = r12.d;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r5 = java.lang.Integer.valueOf(r5);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3[r4] = r5;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        java.lang.String.format(r2, r3);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r4 = r12.c;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r12.isCancelled();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r2 == 0) goto L_0x0059;
    L_0x001c:
        r0 = r4.b;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r2.length();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r2 + 46;
        r1.<init>(r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = "Canceled before actually handling parameter (";
        r1 = r1.append(r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r0 = r1.append(r0);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = ")";
        r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
    L_0x0040:
        r0 = r12.isCancelled();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r0 == 0) goto L_0x0053;
    L_0x0046:
        r0 = r12.e;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r0 == 0) goto L_0x0053;
    L_0x004a:
        r0 = r12.e;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = r12.c;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r12.d;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r0.a(r1, r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
    L_0x0053:
        monitor-enter(r12);
        r0 = 1;
        r12.i = r0;	 Catch:{ all -> 0x01b9 }
        monitor-exit(r12);	 Catch:{ all -> 0x01b9 }
        return;
    L_0x0059:
        r2 = r4.g;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r2 != 0) goto L_0x00fc;
    L_0x005d:
        r2 = 2;
        r2 = new int[r2];	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = {1, 2};	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3 = r2;
    L_0x0064:
        r5 = r4.b;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r4.a;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r6 = r4.e;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r7 = r4.h;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r8 = r12.k;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r7 = r7 + r8;
        r12.k = r7;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r7 = new bgo;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r7.<init>(r6, r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r8 = new bgn;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r12.b;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r8.<init>(r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r7.a(r8);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r7.a(r12);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r5 == 0) goto L_0x0107;
    L_0x0085:
        r2 = java.lang.String.valueOf(r5);	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r4 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r9 = java.lang.String.valueOf(r2);	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r9 = r9.length();	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r9 = r9 + 33;
        r4.<init>(r9);	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r9 = "start importing one vCard (Uri: ";
        r4 = r4.append(r9);	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r2 = r4.append(r2);	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r4 = ")";
        r2.append(r4);	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r2 = r12.b;	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r0 = r2.openInputStream(r5);	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
    L_0x00ad:
        if (r0 == 0) goto L_0x00b3;
    L_0x00af:
        r1 = r12.a(r0, r6, r7, r3);	 Catch:{ IOException -> 0x0117, all -> 0x01c2 }
    L_0x00b3:
        if (r0 == 0) goto L_0x01c8;
    L_0x00b5:
        r0.close();	 Catch:{ Exception -> 0x0114 }
        r0 = r1;
    L_0x00b9:
        r1 = r12.a;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r12.d;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1.a(r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r0 == 0) goto L_0x018c;
    L_0x00c2:
        r0 = r12.isCancelled();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r0 == 0) goto L_0x0135;
    L_0x00c8:
        r0 = java.lang.String.valueOf(r5);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r2.length();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r2 + 38;
        r1.<init>(r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = "vCard import has been canceled (uri: ";
        r1 = r1.append(r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r0 = r1.append(r0);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = ")";
        r0.append(r1);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        goto L_0x0040;
    L_0x00ec:
        r0 = move-exception;
        r1 = "VCardImport";
        r2 = "OutOfMemoryError thrown during import";
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x00f5 }
        throw r0;	 Catch:{ all -> 0x00f5 }
    L_0x00f5:
        r0 = move-exception;
        monitor-enter(r12);
        r1 = 1;
        r12.i = r1;	 Catch:{ all -> 0x01bc }
        monitor-exit(r12);	 Catch:{ all -> 0x01bc }
        throw r0;
    L_0x00fc:
        r2 = 1;
        r2 = new int[r2];	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3 = 0;
        r5 = r4.g;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2[r3] = r5;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3 = r2;
        goto L_0x0064;
    L_0x0107:
        r2 = r4.c;	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        if (r2 == 0) goto L_0x00ad;
    L_0x010b:
        r2 = new java.io.ByteArrayInputStream;	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r4 = r4.c;	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r2.<init>(r4);	 Catch:{ IOException -> 0x0117, all -> 0x0122 }
        r0 = r2;
        goto L_0x00ad;
    L_0x0114:
        r0 = move-exception;
        r0 = r1;
        goto L_0x00b9;
    L_0x0117:
        r2 = move-exception;
        if (r0 == 0) goto L_0x01c8;
    L_0x011a:
        r0.close();	 Catch:{ Exception -> 0x011f }
        r0 = r1;
        goto L_0x00b9;
    L_0x011f:
        r0 = move-exception;
        r0 = r1;
        goto L_0x00b9;
    L_0x0122:
        r1 = move-exception;
        r11 = r1;
        r1 = r0;
        r0 = r11;
    L_0x0126:
        if (r1 == 0) goto L_0x012b;
    L_0x0128:
        r1.close();	 Catch:{ Exception -> 0x01bf }
    L_0x012b:
        throw r0;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
    L_0x012c:
        r0 = move-exception;
        r1 = "VCardImport";
        r2 = "RuntimeException thrown during import";
        android.util.Log.e(r1, r2, r0);	 Catch:{ all -> 0x00f5 }
        throw r0;	 Catch:{ all -> 0x00f5 }
    L_0x0135:
        r0 = java.lang.String.valueOf(r5);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = java.lang.String.valueOf(r0);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r2.length();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r2 + 48;
        r1.<init>(r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = "Successfully finished importing one vCard file: ";
        r1 = r1.append(r2);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1.append(r0);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r0 = r8.a;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = r12.e;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r1 == 0) goto L_0x0040;
    L_0x0157:
        if (r0 == 0) goto L_0x0171;
    L_0x0159:
        r1 = r0.size();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r1 != r10) goto L_0x0171;
    L_0x015f:
        r1 = r12.e;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r12.c;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3 = r12.d;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r4 = 0;
        r0 = r0.get(r4);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r0 = (android.net.Uri) r0;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1.a(r2, r3, r0);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        goto L_0x0040;
    L_0x0171:
        if (r0 == 0) goto L_0x0179;
    L_0x0173:
        r0 = r0.size();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        if (r0 != 0) goto L_0x0180;
    L_0x0179:
        r0 = "VCardImport";
        r1 = "Created Uris is null or 0 length though the creation itself is successful.";
        android.util.Log.w(r0, r1);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
    L_0x0180:
        r0 = r12.e;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = r12.c;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = r12.d;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3 = 0;
        r0.a(r1, r2, r3);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        goto L_0x0040;
    L_0x018c:
        r0 = "VCardImport";
        r1 = java.lang.String.valueOf(r5);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r2 = new java.lang.StringBuilder;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3 = java.lang.String.valueOf(r1);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3 = r3.length();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3 = r3 + 31;
        r2.<init>(r3);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r3 = "Failed to read one vCard file: ";
        r2 = r2.append(r3);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = r2.append(r1);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r1 = r1.toString();	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        android.util.Log.w(r0, r1);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r0 = r12.f;	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        r0.add(r5);	 Catch:{ OutOfMemoryError -> 0x00ec, RuntimeException -> 0x012c }
        goto L_0x0040;
    L_0x01b9:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x01b9 }
        throw r0;
    L_0x01bc:
        r0 = move-exception;
        monitor-exit(r12);	 Catch:{ all -> 0x01bc }
        throw r0;
    L_0x01bf:
        r1 = move-exception;
        goto L_0x012b;
    L_0x01c2:
        r1 = move-exception;
        r11 = r1;
        r1 = r0;
        r0 = r11;
        goto L_0x0126;
    L_0x01c8:
        r0 = r1;
        goto L_0x00b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajg.run():void");
    }

    private final boolean a(InputStream inputStream, int i, bgr bgr, int[] iArr) {
        int length = iArr.length;
        int i2 = 0;
        while (i2 < length) {
            bgs bgx;
            int i3 = iArr[i2];
            if (i2 > 0) {
                try {
                    bgo bgo = (bgo) bgr;
                    bgo.b = null;
                    bgo.a.clear();
                } catch (IOException e) {
                    String str = "VCardImport";
                    String str2 = "IOException was emitted: ";
                    String valueOf = String.valueOf(e.getMessage());
                    Log.e(str, valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e2) {
                        }
                    }
                    i2++;
                } catch (bhf e3) {
                    Log.e("VCardImport", "Nested Exception is found.");
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e4) {
                        }
                    }
                    i2++;
                } catch (bhg e5) {
                    try {
                        Log.e("VCardImport", e5.toString());
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e6) {
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e7) {
                            }
                        }
                    }
                } catch (bhh e8) {
                    if (i2 == length - 1) {
                        Log.e("VCardImport", "Appropriate version for this vCard is not found.");
                    }
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e9) {
                        }
                    }
                    i2++;
                } catch (bhd e10) {
                    Log.e("VCardImport", e10.toString());
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException e11) {
                        }
                    }
                    i2++;
                }
            }
            synchronized (this) {
                if (i3 == 2) {
                    bgx = new bgx(i);
                } else {
                    bgx = new bgw(i);
                }
                this.g = bgx;
                if (isCancelled()) {
                    this.g.a();
                }
            }
            bgx = this.g;
            bgx.a(bgr);
            bgx.a(inputStream);
            if (inputStream == null) {
                return true;
            }
            try {
                inputStream.close();
                return true;
            } catch (IOException e12) {
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean cancel(boolean z) {
        boolean z2 = true;
        synchronized (this) {
            if (this.i || this.h) {
                z2 = false;
            } else {
                this.h = true;
                synchronized (this) {
                    if (this.g != null) {
                        this.g.a();
                    }
                }
            }
        }
        return z2;
    }

    public final synchronized boolean isCancelled() {
        return this.h;
    }

    public final synchronized boolean isDone() {
        return this.i;
    }
}
