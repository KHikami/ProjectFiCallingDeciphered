package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.TreeMap;
import org.apache.http.Header;
import org.apache.http.HttpEntity;

/* renamed from: amb */
public final class amb implements all {
    public static final boolean a;
    private static int d;
    private static int e;
    public final amg b;
    public final amc c;

    static {
        a = aly.b;
        d = 3000;
        e = 4096;
    }

    public amb(amg amg) {
        this(amg, new amc(e));
    }

    private amb(amg amg, amc amc) {
        this.b = amg;
        this.c = amc;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.aln a(defpackage.alo<?> r19) {
        /*
        r18 = this;
        r16 = android.os.SystemClock.elapsedRealtime();
    L_0x0004:
        r3 = 0;
        r14 = 0;
        r6 = java.util.Collections.emptyMap();
        r2 = new java.util.HashMap;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r4 = r19.e();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        if (r4 == 0) goto L_0x0038;
    L_0x0015:
        r5 = r4.b;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        if (r5 == 0) goto L_0x0020;
    L_0x0019:
        r5 = "If-None-Match";
        r7 = r4.b;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r2.put(r5, r7);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
    L_0x0020:
        r8 = r4.d;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r10 = 0;
        r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r5 <= 0) goto L_0x0038;
    L_0x0028:
        r5 = new java.util.Date;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r8 = r4.d;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r5.<init>(r8);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r4 = "If-Modified-Since";
        r5 = org.apache.http.impl.cookie.DateUtils.formatDate(r5);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r2.put(r4, r5);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
    L_0x0038:
        r0 = r18;
        r4 = r0.b;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r0 = r19;
        r15 = r4.a(r0, r2);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x0139 }
        r3 = r15.getStatusLine();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r4 = r3.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r2 = r15.getAllHeaders();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r6 = defpackage.amb.a(r2);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r2 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        if (r4 != r2) goto L_0x0085;
    L_0x0056:
        r2 = r19.e();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        if (r2 != 0) goto L_0x006c;
    L_0x005c:
        r3 = new aln;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r4 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r5 = 0;
        r7 = 1;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
    L_0x006b:
        return r3;
    L_0x006c:
        r3 = r2.g;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r3.putAll(r6);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r7 = new aln;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r8 = 304; // 0x130 float:4.26E-43 double:1.5E-321;
        r9 = r2.a;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r10 = r2.g;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r11 = 1;
        r2 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r12 = r2 - r16;
        r7.<init>(r8, r9, r10, r11, r12);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r3 = r7;
        goto L_0x006b;
    L_0x0085:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        if (r2 == 0) goto L_0x00fa;
    L_0x008b:
        r2 = r15.getEntity();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        r0 = r18;
        r5 = r0.a(r2);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
    L_0x0095:
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r8 = r8 - r16;
        r2 = a;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        if (r2 != 0) goto L_0x00a6;
    L_0x009f:
        r2 = d;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r10 = (long) r2;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r2 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1));
        if (r2 <= 0) goto L_0x00dc;
    L_0x00a6:
        r7 = "HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]";
        r2 = 5;
        r10 = new java.lang.Object[r2];	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r2 = 0;
        r10[r2] = r19;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r2 = 1;
        r8 = java.lang.Long.valueOf(r8);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r10[r2] = r8;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r8 = 2;
        if (r5 == 0) goto L_0x00fe;
    L_0x00b8:
        r2 = r5.length;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
    L_0x00bd:
        r10[r8] = r2;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r2 = 3;
        r3 = r3.getStatusCode();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r10[r2] = r3;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r2 = 4;
        r3 = r19.q();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r3 = r3.b();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r10[r2] = r3;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        defpackage.aly.b(r7, r10);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
    L_0x00dc:
        r2 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 < r2) goto L_0x00e4;
    L_0x00e0:
        r2 = 299; // 0x12b float:4.19E-43 double:1.477E-321;
        if (r4 <= r2) goto L_0x0101;
    L_0x00e4:
        r2 = new java.io.IOException;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r2.<init>();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        throw r2;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
    L_0x00ea:
        r2 = move-exception;
        r2 = "socket";
        r3 = new alx;
        r4 = 0;
        r3.<init>(r4);
        r0 = r19;
        defpackage.amb.a(r2, r0, r3);
        goto L_0x0004;
    L_0x00fa:
        r2 = 0;
        r5 = new byte[r2];	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01cf }
        goto L_0x0095;
    L_0x00fe:
        r2 = "null";
        goto L_0x00bd;
    L_0x0101:
        r3 = new aln;	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);	 Catch:{ SocketTimeoutException -> 0x00ea, ConnectTimeoutException -> 0x010f, MalformedURLException -> 0x011f, IOException -> 0x01d4 }
        goto L_0x006b;
    L_0x010f:
        r2 = move-exception;
        r2 = "connection";
        r3 = new alx;
        r4 = 0;
        r3.<init>(r4);
        r0 = r19;
        defpackage.amb.a(r2, r0, r3);
        goto L_0x0004;
    L_0x011f:
        r2 = move-exception;
        r3 = new java.lang.RuntimeException;
        r4 = new java.lang.StringBuilder;
        r5 = "Bad URL ";
        r4.<init>(r5);
        r5 = r19.c();
        r4 = r4.append(r5);
        r4 = r4.toString();
        r3.<init>(r4, r2);
        throw r3;
    L_0x0139:
        r2 = move-exception;
        r5 = r14;
    L_0x013b:
        if (r3 == 0) goto L_0x017f;
    L_0x013d:
        r2 = r3.getStatusLine();
        r4 = r2.getStatusCode();
        r2 = "Unexpected response code %d for %s";
        r3 = 2;
        r3 = new java.lang.Object[r3];
        r7 = 0;
        r8 = java.lang.Integer.valueOf(r4);
        r3[r7] = r8;
        r7 = 1;
        r8 = r19.c();
        r3[r7] = r8;
        defpackage.aly.c(r2, r3);
        if (r5 == 0) goto L_0x01c0;
    L_0x015d:
        r3 = new aln;
        r7 = 0;
        r8 = android.os.SystemClock.elapsedRealtime();
        r8 = r8 - r16;
        r3.<init>(r4, r5, r6, r7, r8);
        r2 = 401; // 0x191 float:5.62E-43 double:1.98E-321;
        if (r4 == r2) goto L_0x0171;
    L_0x016d:
        r2 = 403; // 0x193 float:5.65E-43 double:1.99E-321;
        if (r4 != r2) goto L_0x0186;
    L_0x0171:
        r2 = "auth";
        r4 = new ale;
        r4.<init>(r3);
        r0 = r19;
        defpackage.amb.a(r2, r0, r4);
        goto L_0x0004;
    L_0x017f:
        r3 = new alx;
        r4 = 0;
        r3.<init>(r2, r4);
        throw r3;
    L_0x0186:
        r2 = 400; // 0x190 float:5.6E-43 double:1.976E-321;
        if (r4 < r2) goto L_0x0195;
    L_0x018a:
        r2 = 499; // 0x1f3 float:6.99E-43 double:2.465E-321;
        if (r4 > r2) goto L_0x0195;
    L_0x018e:
        r2 = new alx;
        r4 = 0;
        r2.<init>(r3, r4);
        throw r2;
    L_0x0195:
        r2 = 500; // 0x1f4 float:7.0E-43 double:2.47E-321;
        if (r4 < r2) goto L_0x01b9;
    L_0x0199:
        r2 = 599; // 0x257 float:8.4E-43 double:2.96E-321;
        if (r4 > r2) goto L_0x01b9;
    L_0x019d:
        r0 = r19;
        r2 = r0.d;
        if (r2 == 0) goto L_0x01b2;
    L_0x01a3:
        r2 = "server";
        r4 = new alx;
        r5 = 0;
        r4.<init>(r3, r5);
        r0 = r19;
        defpackage.amb.a(r2, r0, r4);
        goto L_0x0004;
    L_0x01b2:
        r2 = new alx;
        r4 = 0;
        r2.<init>(r3, r4);
        throw r2;
    L_0x01b9:
        r2 = new alx;
        r4 = 0;
        r2.<init>(r3, r4);
        throw r2;
    L_0x01c0:
        r2 = "network";
        r3 = new alx;
        r4 = 0;
        r3.<init>(r4);
        r0 = r19;
        defpackage.amb.a(r2, r0, r3);
        goto L_0x0004;
    L_0x01cf:
        r2 = move-exception;
        r5 = r14;
        r3 = r15;
        goto L_0x013b;
    L_0x01d4:
        r2 = move-exception;
        r3 = r15;
        goto L_0x013b;
        */
        throw new UnsupportedOperationException("Method not decompiled: amb.a(alo):aln");
    }

    private static void a(String str, alo<?> alo_, alx alx) {
        alw q = alo_.q();
        int p = alo_.p();
        try {
            q.a(alx);
            alo_.a(String.format("%s-retry [timeout=%s]", new Object[]{str, Integer.valueOf(p)}));
        } catch (alx e) {
            alo_.a(String.format("%s-timeout-giveup [timeout=%s]", new Object[]{str, Integer.valueOf(p)}));
            throw e;
        }
    }

    private byte[] a(HttpEntity httpEntity) {
        amh amh = new amh(this.c, (int) httpEntity.getContentLength());
        byte[] bArr = null;
        try {
            InputStream content = httpEntity.getContent();
            if (content == null) {
                throw new alx(0);
            }
            bArr = this.c.a(1024);
            while (true) {
                int read = content.read(bArr);
                if (read == -1) {
                    break;
                }
                amh.write(bArr, 0, read);
            }
            byte[] toByteArray = amh.toByteArray();
            return toByteArray;
        } finally {
            try {
                httpEntity.consumeContent();
            } catch (IOException e) {
                aly.a("Error occured when calling consumingContent", new Object[0]);
            }
            this.c.a(bArr);
            amh.close();
        }
    }

    private static Map<String, String> a(Header[] headerArr) {
        Map<String, String> treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < headerArr.length; i++) {
            treeMap.put(headerArr[i].getName(), headerArr[i].getValue());
        }
        return treeMap;
    }
}
