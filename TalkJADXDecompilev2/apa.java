package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.load.resource.bitmap.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;

final class apa {
    private static final aov a = new aov();
    private final aov b;
    private final aoz c;
    private final aqy d;
    private final ContentResolver e;

    public java.io.InputStream b(android.net.Uri r9) {
        /* JADX: method processing error */
/*
Error: java.util.NoSuchElementException
	at java.util.HashMap$HashIterator.nextNode(HashMap.java:1439)
	at java.util.HashMap$KeyIterator.next(HashMap.java:1461)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.applyRemove(BlockFinallyExtract.java:535)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.extractFinally(BlockFinallyExtract.java:175)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.processExceptionHandler(BlockFinallyExtract.java:80)
	at jadx.core.dex.visitors.blocksmaker.BlockFinallyExtract.visit(BlockFinallyExtract.java:51)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r8 = this;
        r0 = 0;
        r1 = r8.c;
        r2 = r1.a(r9);
        if (r2 == 0) goto L_0x000f;
    L_0x0009:
        r1 = r2.moveToFirst();	 Catch:{ all -> 0x004d }
        if (r1 != 0) goto L_0x0015;
    L_0x000f:
        if (r2 == 0) goto L_0x0014;
    L_0x0011:
        r2.close();
    L_0x0014:
        return r0;
    L_0x0015:
        r1 = 0;
        r1 = r2.getString(r1);	 Catch:{ all -> 0x004d }
        r3 = android.text.TextUtils.isEmpty(r1);	 Catch:{ all -> 0x004d }
        if (r3 == 0) goto L_0x0026;
    L_0x0020:
        if (r2 == 0) goto L_0x0014;
    L_0x0022:
        r2.close();
        goto L_0x0014;
    L_0x0026:
        r3 = new java.io.File;	 Catch:{ all -> 0x004d }
        r3.<init>(r1);	 Catch:{ all -> 0x004d }
        r1 = r3.exists();	 Catch:{ all -> 0x004d }
        if (r1 == 0) goto L_0x0054;	 Catch:{ all -> 0x004d }
    L_0x0031:
        r4 = r3.length();	 Catch:{ all -> 0x004d }
        r6 = 0;	 Catch:{ all -> 0x004d }
        r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));	 Catch:{ all -> 0x004d }
        if (r1 <= 0) goto L_0x0054;	 Catch:{ all -> 0x004d }
    L_0x003b:
        r1 = android.net.Uri.fromFile(r3);	 Catch:{ all -> 0x004d }
    L_0x003f:
        if (r2 == 0) goto L_0x0044;
    L_0x0041:
        r2.close();
    L_0x0044:
        if (r1 == 0) goto L_0x0014;
    L_0x0046:
        r0 = r8.e;
        r0 = r0.openInputStream(r1);
        goto L_0x0014;
    L_0x004d:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0053;
    L_0x0050:
        r2.close();
    L_0x0053:
        throw r0;
    L_0x0054:
        r1 = r0;
        goto L_0x003f;
        */
        throw new UnsupportedOperationException("Method not decompiled: apa.b(android.net.Uri):java.io.InputStream");
    }

    public apa(aoz aoz, aqy aqy, ContentResolver contentResolver) {
        this(a, aoz, aqy, contentResolver);
    }

    private apa(aov aov, aoz aoz, aqy aqy, ContentResolver contentResolver) {
        this.b = aov;
        this.c = aoz;
        this.d = aqy;
        this.e = contentResolver;
    }

    public int a(Uri uri) {
        int i = -1;
        InputStream inputStream = null;
        try {
            inputStream = this.e.openInputStream(uri);
            i = new ImageHeaderParser(inputStream, this.d).c();
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        } catch (IOException e2) {
            if (Log.isLoggable("ThumbStreamOpener", 3)) {
                String valueOf = String.valueOf(uri);
                new StringBuilder(String.valueOf(valueOf).length() + 20).append("Failed to open uri: ").append(valueOf);
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                }
            }
        }
        return i;
    }
}
