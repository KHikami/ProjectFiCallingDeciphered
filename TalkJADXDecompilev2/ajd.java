package defpackage;

import android.text.TextUtils;
import java.io.IOException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ajd {
    public static final char[] a = "0123456789ABCDEF".toCharArray();
    private static final String b;
    private static final Pattern c = Pattern.compile("##(\\S+)##");

    static {
        Locale locale = Locale.getDefault();
        StringBuilder stringBuilder = new StringBuilder();
        String language = locale.getLanguage();
        if (language == null) {
            language = null;
        } else if ("iw".equals(language)) {
            language = "he";
        } else if ("in".equals(language)) {
            language = "id";
        } else if ("ji".equals(language)) {
            language = "yi";
        }
        if (language != null) {
            stringBuilder.append(language);
            language = locale.getCountry();
            if (language != null) {
                stringBuilder.append("-");
                stringBuilder.append(language);
            }
        }
        if (!Locale.US.equals(locale)) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("en-US");
        }
        b = stringBuilder.toString();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] a(android.content.Context r13, long r14, java.lang.String r16, byte[] r17, int r18, boolean r19, java.lang.String r20, int r21, boolean r22) {
        /*
        if (r16 != 0) goto L_0x000a;
    L_0x0002:
        r2 = new java.lang.IllegalArgumentException;
        r3 = "URL must not be null.";
        r2.<init>(r3);
        throw r2;
    L_0x000a:
        r4 = 0;
        r2 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r0 = r16;
        r2.<init>(r0);	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r5 = new org.apache.http.HttpHost;	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r3 = r2.getHost();	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r2 = r2.getPort();	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r6 = "http";
        r5.<init>(r3, r2, r6);	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r2 = defpackage.ajf.a();	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r2 = r2.g();	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r0 = r22;
        r3 = defpackage.ajg.a(r2, r13, r0);	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r2 = r3.getParams();	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r6 = "UTF-8";
        org.apache.http.params.HttpProtocolParams.setContentCharset(r2, r6);	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r6 = defpackage.ajf.a();	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        r6 = r6.o();	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        org.apache.http.params.HttpConnectionParams.setSoTimeout(r2, r6);	 Catch:{ URISyntaxException -> 0x023c, IllegalStateException -> 0x0239, IllegalArgumentException -> 0x0236, SocketException -> 0x0208, Exception -> 0x0213, all -> 0x021e }
        switch(r18) {
            case 1: goto L_0x004d;
            case 2: goto L_0x00dc;
            default: goto L_0x0046;
        };
    L_0x0046:
        if (r3 == 0) goto L_0x004b;
    L_0x0048:
        r3.a();
    L_0x004b:
        r2 = 0;
    L_0x004c:
        return r2;
    L_0x004d:
        r4 = new ajo;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r6 = -1;
        r0 = r17;
        r4.<init>(r13, r6, r0);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = "application/vnd.wap.mms-message";
        r4.setContentType(r2);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = new org.apache.http.client.methods.HttpPost;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r0 = r16;
        r2.<init>(r0);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2.setEntity(r4);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r8 = r2;
    L_0x0066:
        r2 = r3.getParams();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        if (r19 == 0) goto L_0x0078;
    L_0x006c:
        r4 = new org.apache.http.HttpHost;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r0 = r20;
        r1 = r21;
        r4.<init>(r0, r1);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        org.apache.http.conn.params.ConnRouteParams.setDefaultProxy(r2, r4);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x0078:
        r8.setParams(r2);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = "Accept";
        r4 = "*/*, application/vnd.wap.mms-message, application/vnd.wap.sic";
        r8.addHeader(r2, r4);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = defpackage.ajf.a();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = r2.h();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r4 = defpackage.ajf.a();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r4 = r4.i();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        if (r4 == 0) goto L_0x0097;
    L_0x0094:
        r8.addHeader(r2, r4);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x0097:
        r2 = defpackage.ajf.a();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = r2.j();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        if (r2 == 0) goto L_0x00e5;
    L_0x00a1:
        r4 = "\\|";
        r4 = r2.split(r4);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r6 = r4.length;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = 0;
    L_0x00a9:
        if (r2 >= r6) goto L_0x00e5;
    L_0x00ab:
        r7 = r4[r2];	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r9 = ":";
        r10 = 2;
        r7 = r7.split(r9, r10);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r9 = r7.length;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r10 = 2;
        if (r9 != r10) goto L_0x00d9;
    L_0x00b8:
        r9 = 0;
        r9 = r7[r9];	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r9 = r9.trim();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r10 = 1;
        r7 = r7[r10];	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r7 = r7.trim();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r7 = defpackage.ajd.a(r7);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r10 = android.text.TextUtils.isEmpty(r9);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        if (r10 != 0) goto L_0x00d9;
    L_0x00d0:
        r10 = android.text.TextUtils.isEmpty(r7);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        if (r10 != 0) goto L_0x00d9;
    L_0x00d6:
        r8.addHeader(r9, r7);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x00d9:
        r2 = r2 + 1;
        goto L_0x00a9;
    L_0x00dc:
        r2 = new org.apache.http.client.methods.HttpGet;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r0 = r16;
        r2.<init>(r0);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r8 = r2;
        goto L_0x0066;
    L_0x00e5:
        r2 = "Accept-Language";
        r4 = b;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r8.addHeader(r2, r4);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = r3.execute(r5, r8);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r9 = r2.getStatusLine();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r10 = r2.getEntity();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = 0;
        if (r10 == 0) goto L_0x0159;
    L_0x00fb:
        r4 = r10.getContentLength();	 Catch:{ all -> 0x01b1 }
        r6 = 0;
        r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1));
        if (r4 <= 0) goto L_0x011b;
    L_0x0105:
        r4 = r10.getContentLength();	 Catch:{ all -> 0x01b1 }
        r2 = (int) r4;	 Catch:{ all -> 0x01b1 }
        r2 = new byte[r2];	 Catch:{ all -> 0x01b1 }
        r4 = new java.io.DataInputStream;	 Catch:{ all -> 0x01b1 }
        r5 = r10.getContent();	 Catch:{ all -> 0x01b1 }
        r4.<init>(r5);	 Catch:{ all -> 0x01b1 }
        r4.readFully(r2);	 Catch:{ all -> 0x01ac }
        r4.close();	 Catch:{ IOException -> 0x0226 }
    L_0x011b:
        r4 = r10.isChunked();	 Catch:{ all -> 0x01b1 }
        if (r4 == 0) goto L_0x0154;
    L_0x0121:
        r4 = defpackage.ajf.a();	 Catch:{ all -> 0x01b1 }
        r7 = r4.e();	 Catch:{ all -> 0x01b1 }
        r11 = new byte[r7];	 Catch:{ all -> 0x01b1 }
        r12 = new java.io.DataInputStream;	 Catch:{ all -> 0x01b1 }
        r4 = r10.getContent();	 Catch:{ all -> 0x01b1 }
        r12.<init>(r4);	 Catch:{ all -> 0x01b1 }
        r6 = 0;
        r5 = 0;
        r4 = 0;
    L_0x0137:
        r6 = r12.read(r11, r5, r7);	 Catch:{ IOException -> 0x01c4 }
        if (r6 <= 0) goto L_0x013f;
    L_0x013d:
        r7 = r7 - r6;
        r5 = r5 + r6;
    L_0x013f:
        if (r6 < 0) goto L_0x0143;
    L_0x0141:
        if (r7 > 0) goto L_0x0137;
    L_0x0143:
        r7 = -1;
        if (r6 != r7) goto L_0x0151;
    L_0x0146:
        if (r5 <= 0) goto L_0x0151;
    L_0x0148:
        if (r4 != 0) goto L_0x0151;
    L_0x014a:
        r2 = new byte[r5];	 Catch:{ all -> 0x01c8 }
        r4 = 0;
        r6 = 0;
        java.lang.System.arraycopy(r11, r4, r2, r6, r5);	 Catch:{ all -> 0x01c8 }
    L_0x0151:
        r12.close();	 Catch:{ IOException -> 0x022b }
    L_0x0154:
        if (r10 == 0) goto L_0x0159;
    L_0x0156:
        r10.consumeContent();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x0159:
        r4 = r9.getStatusCode();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r5 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r4 == r5) goto L_0x0201;
    L_0x0161:
        r4 = new java.lang.StringBuilder;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r4.<init>();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        if (r2 == 0) goto L_0x017c;
    L_0x0168:
        r5 = "response: text=";
        r5 = r4.append(r5);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r6 = new java.lang.String;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r6.<init>(r2);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = r5.append(r6);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r5 = 10;
        r2.append(r5);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x017c:
        r5 = r8.getAllHeaders();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r6 = r5.length;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = 0;
    L_0x0182:
        if (r2 >= r6) goto L_0x01cd;
    L_0x0184:
        r7 = r5[r2];	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        if (r7 == 0) goto L_0x01a9;
    L_0x0188:
        r8 = "header: ";
        r8 = r4.append(r8);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r10 = r7.getName();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r8 = r8.append(r10);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r10 = 61;
        r8 = r8.append(r10);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r7 = r7.getValue();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r7 = r8.append(r7);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r8 = 10;
        r7.append(r8);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x01a9:
        r2 = r2 + 1;
        goto L_0x0182;
    L_0x01ac:
        r2 = move-exception;
        r4.close();	 Catch:{ IOException -> 0x0229 }
    L_0x01b0:
        throw r2;	 Catch:{ all -> 0x01b1 }
    L_0x01b1:
        r2 = move-exception;
        if (r10 == 0) goto L_0x01b7;
    L_0x01b4:
        r10.consumeContent();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x01b7:
        throw r2;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x01b8:
        r2 = move-exception;
    L_0x01b9:
        defpackage.ajd.a(r2);	 Catch:{ all -> 0x0230 }
        if (r3 == 0) goto L_0x01c1;
    L_0x01be:
        r3.a();
    L_0x01c1:
        r2 = 0;
        goto L_0x004c;
    L_0x01c4:
        r4 = move-exception;
        r4 = 1;
        goto L_0x0143;
    L_0x01c8:
        r2 = move-exception;
        r12.close();	 Catch:{ IOException -> 0x022e }
    L_0x01cc:
        throw r2;	 Catch:{ all -> 0x01b1 }
    L_0x01cd:
        r4 = new java.io.IOException;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r5 = "HTTP error: ";
        r2 = r9.getReasonPhrase();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2 = java.lang.String.valueOf(r2);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r6 = r2.length();	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        if (r6 == 0) goto L_0x01f1;
    L_0x01df:
        r2 = r5.concat(r2);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x01e3:
        r4.<init>(r2);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        throw r4;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
    L_0x01e7:
        r2 = move-exception;
    L_0x01e8:
        defpackage.ajd.a(r2);	 Catch:{ all -> 0x0230 }
        if (r3 == 0) goto L_0x01c1;
    L_0x01ed:
        r3.a();
        goto L_0x01c1;
    L_0x01f1:
        r2 = new java.lang.String;	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        r2.<init>(r5);	 Catch:{ URISyntaxException -> 0x01b8, IllegalStateException -> 0x01e7, IllegalArgumentException -> 0x01f7, SocketException -> 0x0234, Exception -> 0x0232 }
        goto L_0x01e3;
    L_0x01f7:
        r2 = move-exception;
    L_0x01f8:
        defpackage.ajd.a(r2);	 Catch:{ all -> 0x0230 }
        if (r3 == 0) goto L_0x01c1;
    L_0x01fd:
        r3.a();
        goto L_0x01c1;
    L_0x0201:
        if (r3 == 0) goto L_0x004c;
    L_0x0203:
        r3.a();
        goto L_0x004c;
    L_0x0208:
        r2 = move-exception;
        r3 = r4;
    L_0x020a:
        defpackage.ajd.a(r2);	 Catch:{ all -> 0x0230 }
        if (r3 == 0) goto L_0x01c1;
    L_0x020f:
        r3.a();
        goto L_0x01c1;
    L_0x0213:
        r2 = move-exception;
        r3 = r4;
    L_0x0215:
        defpackage.ajd.a(r2);	 Catch:{ all -> 0x0230 }
        if (r3 == 0) goto L_0x01c1;
    L_0x021a:
        r3.a();
        goto L_0x01c1;
    L_0x021e:
        r2 = move-exception;
        r3 = r4;
    L_0x0220:
        if (r3 == 0) goto L_0x0225;
    L_0x0222:
        r3.a();
    L_0x0225:
        throw r2;
    L_0x0226:
        r4 = move-exception;
        goto L_0x011b;
    L_0x0229:
        r4 = move-exception;
        goto L_0x01b0;
    L_0x022b:
        r4 = move-exception;
        goto L_0x0154;
    L_0x022e:
        r4 = move-exception;
        goto L_0x01cc;
    L_0x0230:
        r2 = move-exception;
        goto L_0x0220;
    L_0x0232:
        r2 = move-exception;
        goto L_0x0215;
    L_0x0234:
        r2 = move-exception;
        goto L_0x020a;
    L_0x0236:
        r2 = move-exception;
        r3 = r4;
        goto L_0x01f8;
    L_0x0239:
        r2 = move-exception;
        r3 = r4;
        goto L_0x01e8;
    L_0x023c:
        r2 = move-exception;
        r3 = r4;
        goto L_0x01b9;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajd.a(android.content.Context, long, java.lang.String, byte[], int, boolean, java.lang.String, int, boolean):byte[]");
    }

    private static void a(Exception exception) {
        IOException iOException = new IOException(exception.getMessage());
        iOException.initCause(exception);
        throw iOException;
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = c.matcher(str);
        int i = 0;
        StringBuilder stringBuilder = null;
        while (matcher.find()) {
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder();
            }
            int start = matcher.start();
            if (start > i) {
                stringBuilder.append(str.substring(i, start));
            }
            String b = ajf.a().b(matcher.group(1));
            if (b != null) {
                stringBuilder.append(b);
            }
            i = matcher.end();
        }
        if (stringBuilder != null && i < str.length()) {
            stringBuilder.append(str.substring(i));
        }
        return stringBuilder != null ? stringBuilder.toString() : str;
    }
}
