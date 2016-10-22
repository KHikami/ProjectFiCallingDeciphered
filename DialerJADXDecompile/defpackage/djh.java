package defpackage;

import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;

/* compiled from: PG */
/* renamed from: djh */
public final class djh implements HostnameVerifier {
    public static final djh a;
    private static final Pattern b;

    static {
        a = new djh();
        b = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    private djh() {
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean verify(java.lang.String r12, javax.net.ssl.SSLSession r13) {
        /*
        r11 = this;
        r4 = 0;
        r2 = 1;
        r3 = 0;
        r0 = r13.getPeerCertificates();	 Catch:{ SSLException -> 0x00de }
        r1 = 0;
        r0 = r0[r1];	 Catch:{ SSLException -> 0x00de }
        r0 = (java.security.cert.X509Certificate) r0;	 Catch:{ SSLException -> 0x00de }
        r1 = b;	 Catch:{ SSLException -> 0x00de }
        r1 = r1.matcher(r12);	 Catch:{ SSLException -> 0x00de }
        r1 = r1.matches();	 Catch:{ SSLException -> 0x00de }
        if (r1 == 0) goto L_0x0037;
    L_0x0018:
        r1 = 7;
        r4 = defpackage.djh.a(r0, r1);	 Catch:{ SSLException -> 0x00de }
        r5 = r4.size();	 Catch:{ SSLException -> 0x00de }
        r1 = r3;
    L_0x0022:
        if (r1 >= r5) goto L_0x0032;
    L_0x0024:
        r0 = r4.get(r1);	 Catch:{ SSLException -> 0x00de }
        r0 = (java.lang.String) r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r12.equalsIgnoreCase(r0);	 Catch:{ SSLException -> 0x00de }
        if (r0 == 0) goto L_0x0033;
    L_0x0030:
        r0 = r2;
    L_0x0031:
        r3 = r0;
    L_0x0032:
        return r3;
    L_0x0033:
        r0 = r1 + 1;
        r1 = r0;
        goto L_0x0022;
    L_0x0037:
        r1 = java.util.Locale.US;	 Catch:{ SSLException -> 0x00de }
        r6 = r12.toLowerCase(r1);	 Catch:{ SSLException -> 0x00de }
        r1 = 2;
        r7 = defpackage.djh.a(r0, r1);	 Catch:{ SSLException -> 0x00de }
        r8 = r7.size();	 Catch:{ SSLException -> 0x00de }
        r5 = r3;
        r1 = r3;
    L_0x0048:
        if (r5 >= r8) goto L_0x005d;
    L_0x004a:
        r1 = r7.get(r5);	 Catch:{ SSLException -> 0x00de }
        r1 = (java.lang.String) r1;	 Catch:{ SSLException -> 0x00de }
        r1 = defpackage.djh.a(r6, r1);	 Catch:{ SSLException -> 0x00de }
        if (r1 == 0) goto L_0x0058;
    L_0x0056:
        r3 = r2;
        goto L_0x0032;
    L_0x0058:
        r1 = r5 + 1;
        r5 = r1;
        r1 = r2;
        goto L_0x0048;
    L_0x005d:
        if (r1 != 0) goto L_0x01b8;
    L_0x005f:
        r0 = r0.getSubjectX500Principal();	 Catch:{ SSLException -> 0x00de }
        r2 = new djg;	 Catch:{ SSLException -> 0x00de }
        r2.<init>(r0);	 Catch:{ SSLException -> 0x00de }
        r5 = "cn";
        r0 = 0;
        r2.c = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = 0;
        r2.d = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = 0;
        r2.e = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = 0;
        r2.f = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.a;	 Catch:{ SSLException -> 0x00de }
        r0 = r0.toCharArray();	 Catch:{ SSLException -> 0x00de }
        r2.g = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.a();	 Catch:{ SSLException -> 0x00de }
        if (r0 != 0) goto L_0x01bb;
    L_0x0084:
        r0 = r4;
    L_0x0085:
        if (r0 == 0) goto L_0x01b8;
    L_0x0087:
        r3 = defpackage.djh.a(r6, r0);	 Catch:{ SSLException -> 0x00de }
        goto L_0x0032;
    L_0x008c:
        r1 = r0;
    L_0x008d:
        r0 = "";
        r7 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.b;	 Catch:{ SSLException -> 0x00de }
        if (r7 != r8) goto L_0x0097;
    L_0x0095:
        r0 = r4;
        goto L_0x0085;
    L_0x0097:
        r7 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r7 = r7[r8];	 Catch:{ SSLException -> 0x00de }
        switch(r7) {
            case 34: goto L_0x00b2;
            case 35: goto L_0x014c;
            case 43: goto L_0x00a4;
            case 44: goto L_0x00a4;
            case 59: goto L_0x00a4;
            default: goto L_0x00a0;
        };	 Catch:{ SSLException -> 0x00de }
    L_0x00a0:
        r0 = r2.c();	 Catch:{ SSLException -> 0x00de }
    L_0x00a4:
        r1 = r5.equalsIgnoreCase(r1);	 Catch:{ SSLException -> 0x00de }
        if (r1 != 0) goto L_0x0085;
    L_0x00aa:
        r0 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r1 = r2.b;	 Catch:{ SSLException -> 0x00de }
        if (r0 < r1) goto L_0x0152;
    L_0x00b0:
        r0 = r4;
        goto L_0x0085;
    L_0x00b2:
        r0 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.c = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r2.d = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.d;	 Catch:{ SSLException -> 0x00de }
        r2.e = r0;	 Catch:{ SSLException -> 0x00de }
    L_0x00c0:
        r0 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.b;	 Catch:{ SSLException -> 0x00de }
        if (r0 != r7) goto L_0x00e7;
    L_0x00c6:
        r1 = new java.lang.IllegalStateException;	 Catch:{ SSLException -> 0x00de }
        r4 = "Unexpected end of DN: ";
        r0 = r2.a;	 Catch:{ SSLException -> 0x00de }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ SSLException -> 0x00de }
        r2 = r0.length();	 Catch:{ SSLException -> 0x00de }
        if (r2 == 0) goto L_0x00e1;
    L_0x00d6:
        r0 = r4.concat(r0);	 Catch:{ SSLException -> 0x00de }
    L_0x00da:
        r1.<init>(r0);	 Catch:{ SSLException -> 0x00de }
        throw r1;	 Catch:{ SSLException -> 0x00de }
    L_0x00de:
        r0 = move-exception;
        goto L_0x0032;
    L_0x00e1:
        r0 = new java.lang.String;	 Catch:{ SSLException -> 0x00de }
        r0.<init>(r4);	 Catch:{ SSLException -> 0x00de }
        goto L_0x00da;
    L_0x00e7:
        r0 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r7];	 Catch:{ SSLException -> 0x00de }
        r7 = 34;
        if (r0 != r7) goto L_0x010e;
    L_0x00f1:
        r0 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.c = r0;	 Catch:{ SSLException -> 0x00de }
    L_0x00f7:
        r0 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.b;	 Catch:{ SSLException -> 0x00de }
        if (r0 >= r7) goto L_0x013c;
    L_0x00fd:
        r0 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r7];	 Catch:{ SSLException -> 0x00de }
        r7 = 32;
        if (r0 != r7) goto L_0x013c;
    L_0x0107:
        r0 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.c = r0;	 Catch:{ SSLException -> 0x00de }
        goto L_0x00f7;
    L_0x010e:
        r0 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r7];	 Catch:{ SSLException -> 0x00de }
        r7 = 92;
        if (r0 != r7) goto L_0x012f;
    L_0x0118:
        r0 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.e;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.d();	 Catch:{ SSLException -> 0x00de }
        r0[r7] = r8;	 Catch:{ SSLException -> 0x00de }
    L_0x0122:
        r0 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.c = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.e;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.e = r0;	 Catch:{ SSLException -> 0x00de }
        goto L_0x00c0;
    L_0x012f:
        r0 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.e;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r9 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r8 = r8[r9];	 Catch:{ SSLException -> 0x00de }
        r0[r7] = r8;	 Catch:{ SSLException -> 0x00de }
        goto L_0x0122;
    L_0x013c:
        r0 = new java.lang.String;	 Catch:{ SSLException -> 0x00de }
        r7 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r8 = r2.d;	 Catch:{ SSLException -> 0x00de }
        r9 = r2.e;	 Catch:{ SSLException -> 0x00de }
        r10 = r2.d;	 Catch:{ SSLException -> 0x00de }
        r9 = r9 - r10;
        r0.<init>(r7, r8, r9);	 Catch:{ SSLException -> 0x00de }
        goto L_0x00a4;
    L_0x014c:
        r0 = r2.b();	 Catch:{ SSLException -> 0x00de }
        goto L_0x00a4;
    L_0x0152:
        r0 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r1 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r1];	 Catch:{ SSLException -> 0x00de }
        r1 = 44;
        if (r0 == r1) goto L_0x018e;
    L_0x015c:
        r0 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r1 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r1];	 Catch:{ SSLException -> 0x00de }
        r1 = 59;
        if (r0 == r1) goto L_0x018e;
    L_0x0166:
        r0 = r2.g;	 Catch:{ SSLException -> 0x00de }
        r1 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0[r1];	 Catch:{ SSLException -> 0x00de }
        r1 = 43;
        if (r0 == r1) goto L_0x018e;
    L_0x0170:
        r1 = new java.lang.IllegalStateException;	 Catch:{ SSLException -> 0x00de }
        r4 = "Malformed DN: ";
        r0 = r2.a;	 Catch:{ SSLException -> 0x00de }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ SSLException -> 0x00de }
        r2 = r0.length();	 Catch:{ SSLException -> 0x00de }
        if (r2 == 0) goto L_0x0188;
    L_0x0180:
        r0 = r4.concat(r0);	 Catch:{ SSLException -> 0x00de }
    L_0x0184:
        r1.<init>(r0);	 Catch:{ SSLException -> 0x00de }
        throw r1;	 Catch:{ SSLException -> 0x00de }
    L_0x0188:
        r0 = new java.lang.String;	 Catch:{ SSLException -> 0x00de }
        r0.<init>(r4);	 Catch:{ SSLException -> 0x00de }
        goto L_0x0184;
    L_0x018e:
        r0 = r2.c;	 Catch:{ SSLException -> 0x00de }
        r0 = r0 + 1;
        r2.c = r0;	 Catch:{ SSLException -> 0x00de }
        r0 = r2.a();	 Catch:{ SSLException -> 0x00de }
        if (r0 != 0) goto L_0x008c;
    L_0x019a:
        r1 = new java.lang.IllegalStateException;	 Catch:{ SSLException -> 0x00de }
        r4 = "Malformed DN: ";
        r0 = r2.a;	 Catch:{ SSLException -> 0x00de }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ SSLException -> 0x00de }
        r2 = r0.length();	 Catch:{ SSLException -> 0x00de }
        if (r2 == 0) goto L_0x01b2;
    L_0x01aa:
        r0 = r4.concat(r0);	 Catch:{ SSLException -> 0x00de }
    L_0x01ae:
        r1.<init>(r0);	 Catch:{ SSLException -> 0x00de }
        throw r1;	 Catch:{ SSLException -> 0x00de }
    L_0x01b2:
        r0 = new java.lang.String;	 Catch:{ SSLException -> 0x00de }
        r0.<init>(r4);	 Catch:{ SSLException -> 0x00de }
        goto L_0x01ae;
    L_0x01b8:
        r0 = r3;
        goto L_0x0031;
    L_0x01bb:
        r1 = r0;
        goto L_0x008d;
        */
        throw new UnsupportedOperationException("Method not decompiled: djh.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }

    private static List a(X509Certificate x509Certificate, int i) {
        List arrayList = new ArrayList();
        try {
            Collection<List> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.emptyList();
            }
            for (List list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2) {
                    Integer num = (Integer) list.get(0);
                    if (num != null && num.intValue() == i) {
                        String str = (String) list.get(1);
                        if (str != null) {
                            arrayList.add(str);
                        }
                    }
                }
            }
            return arrayList;
        } catch (CertificateParsingException e) {
            return Collections.emptyList();
        }
    }

    private static boolean a(String str, String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        String valueOf;
        if (!str.endsWith(".")) {
            valueOf = String.valueOf(str);
            str = new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append(".").toString();
        }
        if (!str2.endsWith(".")) {
            valueOf = String.valueOf(str2);
            str2 = new StringBuilder(String.valueOf(valueOf).length() + 1).append(valueOf).append(".").toString();
        }
        valueOf = str2.toLowerCase(Locale.US);
        if (!valueOf.contains("*")) {
            return str.equals(valueOf);
        }
        if (!valueOf.startsWith("*.") || valueOf.indexOf(42, 1) != -1 || str.length() < valueOf.length() || "*.".equals(valueOf)) {
            return false;
        }
        valueOf = valueOf.substring(1);
        if (!str.endsWith(valueOf)) {
            return false;
        }
        int length = str.length() - valueOf.length();
        if (length <= 0 || str.lastIndexOf(46, length - 1) == -1) {
            return true;
        }
        return false;
    }
}
