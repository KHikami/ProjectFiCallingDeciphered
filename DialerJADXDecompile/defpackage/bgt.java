package defpackage;

import android.util.Log;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* renamed from: bgt */
class bgt {
    public bgu a;
    private String b;
    private final List c;
    private boolean d;
    private String e;
    private Set f;
    private Set g;

    public bgt() {
        int i = bfr.a;
        this((byte) 0);
    }

    public bgt(byte b) {
        this.c = new ArrayList();
        this.f = new HashSet();
        this.g = new HashSet();
        this.b = "ISO-8859-1";
    }

    protected String a() {
        return this.a.readLine();
    }

    protected String b() {
        String a;
        do {
            a = a();
            if (a == null) {
                throw new bhd("Reached end of buffer.");
            }
        } while (a.trim().length() <= 0);
        return a;
    }

    private final boolean g() {
        this.e = "8BIT";
        if (!a(false)) {
            return false;
        }
        for (bgr c : this.c) {
            c.c();
        }
        h();
        for (bgr c2 : this.c) {
            c2.d();
        }
        return true;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected boolean a(boolean r8) {
        /*
        r7 = this;
        r6 = 2;
        r1 = 1;
        r0 = 0;
    L_0x0003:
        r2 = r7.a();
        if (r2 != 0) goto L_0x000a;
    L_0x0009:
        return r0;
    L_0x000a:
        r3 = r2.trim();
        r3 = r3.length();
        if (r3 <= 0) goto L_0x0003;
    L_0x0014:
        r3 = ":";
        r3 = r2.split(r3, r6);
        r4 = r3.length;
        if (r4 != r6) goto L_0x003b;
    L_0x001d:
        r4 = r3[r0];
        r4 = r4.trim();
        r5 = "BEGIN";
        r4 = r4.equalsIgnoreCase(r5);
        if (r4 == 0) goto L_0x003b;
    L_0x002b:
        r3 = r3[r1];
        r3 = r3.trim();
        r4 = "VCARD";
        r3 = r3.equalsIgnoreCase(r4);
        if (r3 == 0) goto L_0x003b;
    L_0x0039:
        r0 = r1;
        goto L_0x0009;
    L_0x003b:
        if (r8 != 0) goto L_0x0066;
    L_0x003d:
        r0 = new bhd;
        r1 = new java.lang.StringBuilder;
        r3 = java.lang.String.valueOf(r2);
        r3 = r3.length();
        r3 = r3 + 61;
        r1.<init>(r3);
        r3 = "Expected String \"BEGIN:VCARD\" did not come (Instead, \"";
        r1 = r1.append(r3);
        r1 = r1.append(r2);
        r2 = "\" came)";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0066:
        if (r8 != 0) goto L_0x0003;
    L_0x0068:
        r0 = new bhd;
        r1 = "Reached where must not be reached.";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgt.a(boolean):boolean");
    }

    private void h() {
        boolean z = false;
        try {
            z = i();
        } catch (bhe e) {
            Log.e("vCard", "Invalid line which looks like some comment was found. Ignored.");
        }
        while (!z) {
            try {
                z = i();
            } catch (bhe e2) {
                Log.e("vCard", "Invalid line which looks like some comment was found. Ignored.");
            }
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean i() {
        /*
        r13 = this;
        r12 = 59;
        r11 = 58;
        r10 = 34;
        r2 = 1;
        r4 = 0;
        r0 = "8BIT";
        r13.e = r0;
        r6 = r13.b();
        r3 = new bgy;
        r3.<init>();
        r7 = r6.length();
        if (r7 <= 0) goto L_0x0029;
    L_0x001b:
        r0 = r6.charAt(r4);
        r1 = 35;
        if (r0 != r1) goto L_0x0029;
    L_0x0023:
        r0 = new bhe;
        r0.<init>();
        throw r0;
    L_0x0029:
        r5 = r4;
        r0 = r4;
        r1 = r4;
    L_0x002c:
        if (r5 >= r7) goto L_0x00fa;
    L_0x002e:
        r8 = r6.charAt(r5);
        switch(r1) {
            case 0: goto L_0x0038;
            case 1: goto L_0x00a4;
            case 2: goto L_0x00e4;
            default: goto L_0x0035;
        };
    L_0x0035:
        r5 = r5 + 1;
        goto L_0x002c;
    L_0x0038:
        if (r8 != r11) goto L_0x006e;
    L_0x003a:
        r0 = r6.substring(r0, r5);
        r3.a(r0);
        r0 = r7 + -1;
        if (r5 >= r0) goto L_0x006b;
    L_0x0045:
        r0 = r5 + 1;
        r0 = r6.substring(r0);
    L_0x004b:
        r3.d = r0;
        r0 = r3;
    L_0x004e:
        r1 = r0.a;
        r3 = r1.toUpperCase();
        r1 = r0.d;
        r5 = "BEGIN";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x013f;
    L_0x005e:
        r0 = "VCARD";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 == 0) goto L_0x0123;
    L_0x0066:
        r13.j();
    L_0x0069:
        r2 = r4;
    L_0x006a:
        return r2;
    L_0x006b:
        r0 = "";
        goto L_0x004b;
    L_0x006e:
        r9 = 46;
        if (r8 != r9) goto L_0x0097;
    L_0x0072:
        r0 = r6.substring(r0, r5);
        r8 = r0.length();
        if (r8 != 0) goto L_0x0086;
    L_0x007c:
        r0 = "vCard";
        r8 = "Empty group found. Ignoring.";
        android.util.Log.w(r0, r8);
    L_0x0083:
        r0 = r5 + 1;
        goto L_0x0035;
    L_0x0086:
        r8 = r3.b;
        if (r8 != 0) goto L_0x0091;
    L_0x008a:
        r8 = new java.util.ArrayList;
        r8.<init>();
        r3.b = r8;
    L_0x0091:
        r8 = r3.b;
        r8.add(r0);
        goto L_0x0083;
    L_0x0097:
        if (r8 != r12) goto L_0x0035;
    L_0x0099:
        r0 = r6.substring(r0, r5);
        r3.a(r0);
        r0 = r5 + 1;
    L_0x00a2:
        r1 = r2;
        goto L_0x0035;
    L_0x00a4:
        if (r8 != r10) goto L_0x00bc;
    L_0x00a6:
        r1 = "2.1";
        r8 = r13.d();
        r1 = r1.equalsIgnoreCase(r8);
        if (r1 == 0) goto L_0x00b9;
    L_0x00b2:
        r1 = "vCard";
        r8 = "Double-quoted params found in vCard 2.1. Silently allow it";
        android.util.Log.w(r1, r8);
    L_0x00b9:
        r1 = 2;
        goto L_0x0035;
    L_0x00bc:
        if (r8 != r12) goto L_0x00c9;
    L_0x00be:
        r0 = r6.substring(r0, r5);
        r13.a(r3, r0);
        r0 = r5 + 1;
        goto L_0x0035;
    L_0x00c9:
        if (r8 != r11) goto L_0x0035;
    L_0x00cb:
        r0 = r6.substring(r0, r5);
        r13.a(r3, r0);
        r0 = r7 + -1;
        if (r5 >= r0) goto L_0x00e1;
    L_0x00d6:
        r0 = r5 + 1;
        r0 = r6.substring(r0);
    L_0x00dc:
        r3.d = r0;
        r0 = r3;
        goto L_0x004e;
    L_0x00e1:
        r0 = "";
        goto L_0x00dc;
    L_0x00e4:
        if (r8 != r10) goto L_0x0035;
    L_0x00e6:
        r1 = "2.1";
        r8 = r13.d();
        r1 = r1.equalsIgnoreCase(r8);
        if (r1 == 0) goto L_0x00a2;
    L_0x00f2:
        r1 = "vCard";
        r8 = "Double-quoted params found in vCard 2.1. Silently allow it";
        android.util.Log.w(r1, r8);
        goto L_0x00a2;
    L_0x00fa:
        r0 = new bhd;
        r1 = new java.lang.StringBuilder;
        r2 = java.lang.String.valueOf(r6);
        r2 = r2.length();
        r2 = r2 + 16;
        r1.<init>(r2);
        r2 = "Invalid line: \"";
        r1 = r1.append(r2);
        r1 = r1.append(r6);
        r2 = "\"";
        r1 = r1.append(r2);
        r1 = r1.toString();
        r0.<init>(r1, r4);
        throw r0;
    L_0x0123:
        r2 = new bhd;
        r3 = "Unknown BEGIN type: ";
        r0 = java.lang.String.valueOf(r1);
        r1 = r0.length();
        if (r1 == 0) goto L_0x0139;
    L_0x0131:
        r0 = r3.concat(r0);
    L_0x0135:
        r2.<init>(r0);
        throw r2;
    L_0x0139:
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x0135;
    L_0x013f:
        r5 = "END";
        r5 = r3.equals(r5);
        if (r5 == 0) goto L_0x016b;
    L_0x0147:
        r0 = "VCARD";
        r0 = r1.equalsIgnoreCase(r0);
        if (r0 != 0) goto L_0x006a;
    L_0x014f:
        r2 = new bhd;
        r3 = "Unknown END type: ";
        r0 = java.lang.String.valueOf(r1);
        r1 = r0.length();
        if (r1 == 0) goto L_0x0165;
    L_0x015d:
        r0 = r3.concat(r0);
    L_0x0161:
        r2.<init>(r0);
        throw r2;
    L_0x0165:
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x0161;
    L_0x016b:
        r2 = r0.d;
        r1 = "AGENT";
        r1 = r3.equals(r1);
        if (r1 == 0) goto L_0x017a;
    L_0x0175:
        r13.a(r0);
        goto L_0x0069;
    L_0x017a:
        r1 = r13.e();
        r5 = r3.toUpperCase();
        r1 = r1.contains(r5);
        if (r1 != 0) goto L_0x01b2;
    L_0x0188:
        r1 = "X-";
        r1 = r3.startsWith(r1);
        if (r1 != 0) goto L_0x01b2;
    L_0x0190:
        r1 = r13.f;
        r1 = r1.contains(r3);
        if (r1 != 0) goto L_0x01b2;
    L_0x0198:
        r1 = r13.f;
        r1.add(r3);
        r5 = "vCard";
        r6 = "Property name unsupported by vCard 2.1: ";
        r1 = java.lang.String.valueOf(r3);
        r7 = r1.length();
        if (r7 == 0) goto L_0x0202;
    L_0x01ab:
        r1 = r6.concat(r1);
    L_0x01af:
        android.util.Log.w(r5, r1);
    L_0x01b2:
        r1 = "VERSION";
        r1 = r3.equals(r1);
        if (r1 == 0) goto L_0x0208;
    L_0x01ba:
        r1 = r13.d();
        r1 = r2.equals(r1);
        if (r1 != 0) goto L_0x0208;
    L_0x01c4:
        r0 = new bhh;
        r1 = r13.d();
        r1 = java.lang.String.valueOf(r1);
        r3 = new java.lang.StringBuilder;
        r4 = java.lang.String.valueOf(r2);
        r4 = r4.length();
        r4 = r4 + 26;
        r5 = java.lang.String.valueOf(r1);
        r5 = r5.length();
        r4 = r4 + r5;
        r3.<init>(r4);
        r4 = "Incompatible version: ";
        r3 = r3.append(r4);
        r2 = r3.append(r2);
        r3 = " != ";
        r2 = r2.append(r3);
        r1 = r2.append(r1);
        r1 = r1.toString();
        r0.<init>(r1);
        throw r0;
    L_0x0202:
        r1 = new java.lang.String;
        r1.<init>(r6);
        goto L_0x01af;
    L_0x0208:
        r13.b(r0);
        goto L_0x0069;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgt.i():boolean");
    }

    private final void j() {
        for (bgr c : this.c) {
            c.c();
        }
        h();
        for (bgr c2 : this.c) {
            c2.d();
        }
    }

    protected void a(bgy bgy, String str) {
        String[] split = str.split("=", 2);
        if (split.length == 2) {
            String toUpperCase = split[0].trim().toUpperCase();
            String trim = split[1].trim();
            if (toUpperCase.equals("TYPE")) {
                c(bgy, trim);
                return;
            } else if (toUpperCase.equals("VALUE")) {
                if (!(bgw.c.contains(trim.toUpperCase()) || trim.startsWith("X-") || this.g.contains(trim))) {
                    this.g.add(trim);
                    Log.w("vCard", String.format("The value unsupported by TYPE of %s: %s", new Object[]{Integer.valueOf(c()), trim}));
                }
                bgy.a("VALUE", trim);
                return;
            } else if (toUpperCase.equals("ENCODING")) {
                trim = trim.toUpperCase();
                if (bgw.d.contains(trim) || trim.startsWith("X-")) {
                    bgy.a("ENCODING", trim);
                    this.e = trim.toUpperCase();
                    return;
                }
                throw new bhd(new StringBuilder(String.valueOf(trim).length() + 19).append("Unknown encoding \"").append(trim).append("\"").toString());
            } else if (toUpperCase.equals("CHARSET")) {
                bgy.a("CHARSET", trim);
                return;
            } else if (toUpperCase.equals("LANGUAGE")) {
                d(bgy, trim);
                return;
            } else if (toUpperCase.startsWith("X-")) {
                a(bgy, toUpperCase, trim);
                return;
            } else {
                throw new bhd(new StringBuilder(String.valueOf(toUpperCase).length() + 15).append("Unknown type \"").append(toUpperCase).append("\"").toString());
            }
        }
        b(bgy, split[0]);
    }

    protected void b(bgy bgy, String str) {
        c(bgy, str);
    }

    private void d(bgy bgy, String str) {
        int i = 0;
        String[] split = str.split("-");
        if (split.length != 2) {
            throw new bhd(new StringBuilder(String.valueOf(str).length() + 20).append("Invalid Language: \"").append(str).append("\"").toString());
        }
        String str2 = split[0];
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            if (bgt.a(str2.charAt(i2))) {
                i2++;
            } else {
                throw new bhd(new StringBuilder(String.valueOf(str).length() + 20).append("Invalid Language: \"").append(str).append("\"").toString());
            }
        }
        String str3 = split[1];
        int length2 = str3.length();
        while (i < length2) {
            if (bgt.a(str3.charAt(i))) {
                i++;
            } else {
                throw new bhd(new StringBuilder(String.valueOf(str).length() + 20).append("Invalid Language: \"").append(str).append("\"").toString());
            }
        }
        bgy.a("LANGUAGE", str);
    }

    private static boolean a(char c) {
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            return false;
        }
        return true;
    }

    protected void a(bgy bgy, String str, String str2) {
        bgy.a(str, str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(defpackage.bgy r10) {
        /*
        r9 = this;
        r1 = 0;
        r8 = 1;
        r7 = 0;
        r0 = r10.a;
        r4 = r0.toUpperCase();
        r3 = r10.d;
        r0 = "CHARSET";
        r0 = r10.b(r0);
        if (r0 == 0) goto L_0x0075;
    L_0x0013:
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (java.lang.String) r0;
    L_0x001d:
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 == 0) goto L_0x0214;
    L_0x0023:
        r0 = "UTF-8";
        r2 = r0;
    L_0x0026:
        r0 = "ADR";
        r0 = r4.equals(r0);
        if (r0 != 0) goto L_0x003e;
    L_0x002e:
        r0 = "ORG";
        r0 = r4.equals(r0);
        if (r0 != 0) goto L_0x003e;
    L_0x0036:
        r0 = "N";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00b3;
    L_0x003e:
        r1 = "ISO-8859-1";
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r9.e;
        r5 = "QUOTED-PRINTABLE";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x0077;
    L_0x004f:
        r0 = r9.c(r3);
        r10.d = r0;
        r3 = r9.c();
        r0 = defpackage.bha.a(r0, r3);
        r3 = r0.iterator();
    L_0x0061:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x009b;
    L_0x0067:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r0 = defpackage.bha.a(r0, r7, r1, r2);
        r4.add(r0);
        goto L_0x0061;
    L_0x0075:
        r0 = r1;
        goto L_0x001d;
    L_0x0077:
        r0 = r9.d(r3);
        r0 = defpackage.bha.a(r0, r1, r2);
        r1 = r9.c();
        r0 = defpackage.bha.a(r0, r1);
        r1 = r0.iterator();
    L_0x008b:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x009b;
    L_0x0091:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r4.add(r0);
        goto L_0x008b;
    L_0x009b:
        r10.e = r4;
        r0 = r9.c;
        r1 = r0.iterator();
    L_0x00a3:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0211;
    L_0x00a9:
        r0 = r1.next();
        r0 = (defpackage.bgr) r0;
        r0.a(r10);
        goto L_0x00a3;
    L_0x00b3:
        r0 = r9.e;
        r5 = "QUOTED-PRINTABLE";
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x00d3;
    L_0x00bd:
        r0 = "FN";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00ff;
    L_0x00c5:
        r0 = "ENCODING";
        r0 = r10.b(r0);
        if (r0 != 0) goto L_0x00ff;
    L_0x00cd:
        r0 = defpackage.bha.f(r3);
        if (r0 == 0) goto L_0x00ff;
    L_0x00d3:
        r0 = r9.c(r3);
        r1 = "ISO-8859-1";
        r1 = defpackage.bha.a(r0, r7, r1, r2);
        r10.d = r0;
        r0 = new java.lang.String[r8];
        r0[r7] = r1;
        r0 = java.util.Arrays.asList(r0);
        r10.e = r0;
        r0 = r9.c;
        r1 = r0.iterator();
    L_0x00ef:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0211;
    L_0x00f5:
        r0 = r1.next();
        r0 = (defpackage.bgr) r0;
        r0.a(r10);
        goto L_0x00ef;
    L_0x00ff:
        r0 = r9.e;
        r4 = "BASE64";
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x0113;
    L_0x0109:
        r0 = r9.e;
        r4 = "B";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x016f;
    L_0x0113:
        r0 = r9.a(r3);	 Catch:{ OutOfMemoryError -> 0x0134 }
        r1 = 0;
        r0 = android.util.Base64.decode(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0152 }
        r10.f = r0;	 Catch:{ IllegalArgumentException -> 0x0152 }
        r0 = r9.c;	 Catch:{ OutOfMemoryError -> 0x0134 }
        r1 = r0.iterator();	 Catch:{ OutOfMemoryError -> 0x0134 }
    L_0x0124:
        r0 = r1.hasNext();	 Catch:{ OutOfMemoryError -> 0x0134 }
        if (r0 == 0) goto L_0x0211;
    L_0x012a:
        r0 = r1.next();	 Catch:{ OutOfMemoryError -> 0x0134 }
        r0 = (defpackage.bgr) r0;	 Catch:{ OutOfMemoryError -> 0x0134 }
        r0.a(r10);	 Catch:{ OutOfMemoryError -> 0x0134 }
        goto L_0x0124;
    L_0x0134:
        r0 = move-exception;
        r0 = "vCard";
        r1 = "OutOfMemoryError happened during parsing BASE64 data!";
        android.util.Log.e(r0, r1);
        r0 = r9.c;
        r1 = r0.iterator();
    L_0x0142:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0211;
    L_0x0148:
        r0 = r1.next();
        r0 = (defpackage.bgr) r0;
        r0.a(r10);
        goto L_0x0142;
    L_0x0152:
        r0 = move-exception;
        r1 = new bhd;	 Catch:{ OutOfMemoryError -> 0x0134 }
        r2 = "Decode error on base64 photo: ";
        r0 = java.lang.String.valueOf(r3);	 Catch:{ OutOfMemoryError -> 0x0134 }
        r3 = r0.length();	 Catch:{ OutOfMemoryError -> 0x0134 }
        if (r3 == 0) goto L_0x0169;
    L_0x0161:
        r0 = r2.concat(r0);	 Catch:{ OutOfMemoryError -> 0x0134 }
    L_0x0165:
        r1.<init>(r0);	 Catch:{ OutOfMemoryError -> 0x0134 }
        throw r1;	 Catch:{ OutOfMemoryError -> 0x0134 }
    L_0x0169:
        r0 = new java.lang.String;	 Catch:{ OutOfMemoryError -> 0x0134 }
        r0.<init>(r2);	 Catch:{ OutOfMemoryError -> 0x0134 }
        goto L_0x0165;
    L_0x016f:
        r0 = r9.e;
        r4 = "7BIT";
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x01a5;
    L_0x0179:
        r0 = r9.e;
        r4 = "8BIT";
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x01a5;
    L_0x0183:
        r0 = r9.e;
        r4 = "X-";
        r0 = r0.startsWith(r4);
        if (r0 != 0) goto L_0x01a5;
    L_0x018d:
        r0 = "vCard";
        r4 = "The encoding \"%s\" is unsupported by vCard %s";
        r5 = 2;
        r5 = new java.lang.Object[r5];
        r6 = r9.e;
        r5[r7] = r6;
        r6 = r9.d();
        r5[r8] = r6;
        r4 = java.lang.String.format(r4, r5);
        android.util.Log.w(r0, r4);
    L_0x01a5:
        r0 = r9.c();
        if (r0 != 0) goto L_0x0212;
    L_0x01ab:
        r0 = r1;
    L_0x01ac:
        r1 = r9.a;
        r1 = r1.a();
        r4 = android.text.TextUtils.isEmpty(r1);
        if (r4 != 0) goto L_0x01e1;
    L_0x01b8:
        r4 = r1.charAt(r7);
        r5 = 32;
        if (r4 != r5) goto L_0x01e1;
    L_0x01c0:
        r4 = "END:VCARD";
        r5 = r1.toUpperCase();
        r4 = r4.contains(r5);
        if (r4 != 0) goto L_0x01e1;
    L_0x01cc:
        r9.a();
        if (r0 != 0) goto L_0x01d9;
    L_0x01d1:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r3);
    L_0x01d9:
        r1 = r1.substring(r8);
        r0.append(r1);
        goto L_0x01ac;
    L_0x01e1:
        if (r0 == 0) goto L_0x0212;
    L_0x01e3:
        r0 = r0.toString();
    L_0x01e7:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r3 = "ISO-8859-1";
        r0 = defpackage.bha.a(r0, r3, r2);
        r0 = r9.b(r0);
        r1.add(r0);
        r10.e = r1;
        r0 = r9.c;
        r1 = r0.iterator();
    L_0x0201:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x0211;
    L_0x0207:
        r0 = r1.next();
        r0 = (defpackage.bgr) r0;
        r0.a(r10);
        goto L_0x0201;
    L_0x0211:
        return;
    L_0x0212:
        r0 = r3;
        goto L_0x01e7;
    L_0x0214:
        r2 = r0;
        goto L_0x0026;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgt.b(bgy):void");
    }

    private final String c(String str) {
        if (!str.trim().endsWith("=")) {
            return str;
        }
        int length = str.length() - 1;
        do {
        } while (str.charAt(length) != '=');
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str.substring(0, length + 1));
        stringBuilder.append("\r\n");
        while (true) {
            String a = a();
            if (a == null) {
                break;
            } else if (a.trim().endsWith("=")) {
                int length2 = a.length() - 1;
                do {
                } while (a.charAt(length2) != '=');
                stringBuilder.append(a.substring(0, length2 + 1));
                stringBuilder.append("\r\n");
            } else {
                stringBuilder.append(a);
                return stringBuilder.toString();
            }
        }
        throw new bhd("File ended during parsing a Quoted-Printable String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String d(java.lang.String r4) {
        /*
        r3 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r4);
    L_0x0008:
        r1 = r3.a;
        r1 = r1.a();
        if (r1 == 0) goto L_0x0029;
    L_0x0010:
        r2 = r1.length();
        if (r2 == 0) goto L_0x0029;
    L_0x0016:
        r2 = defpackage.bgt.e(r1);
        if (r2 != 0) goto L_0x0029;
    L_0x001c:
        r3.a();
        r2 = " ";
        r2 = r0.append(r2);
        r2.append(r1);
        goto L_0x0008;
    L_0x0029:
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgt.d(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String a(java.lang.String r6) {
        /*
        r5 = this;
        r1 = new java.lang.StringBuilder;
        r1.<init>();
        r1.append(r6);
    L_0x0008:
        r0 = r5.a;
        r0 = r0.a();
        if (r0 != 0) goto L_0x0018;
    L_0x0010:
        r0 = new bhd;
        r1 = "File ended during parsing BASE64 binary";
        r0.<init>(r1);
        throw r0;
    L_0x0018:
        r2 = defpackage.bgt.e(r0);
        r3 = r5.e();
        r3 = r3.contains(r2);
        if (r3 != 0) goto L_0x002e;
    L_0x0026:
        r3 = "X-ANDROID-CUSTOM";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x0059;
    L_0x002e:
        r2 = "vCard";
        r3 = "Found a next property during parsing a BASE64 string, which must not contain semi-colon or colon. Treat the line as next property.";
        android.util.Log.w(r2, r3);
        r2 = "vCard";
        r3 = "Problematic line: ";
        r0 = r0.trim();
        r0 = java.lang.String.valueOf(r0);
        r4 = r0.length();
        if (r4 == 0) goto L_0x0053;
    L_0x0047:
        r0 = r3.concat(r0);
    L_0x004b:
        android.util.Log.w(r2, r0);
    L_0x004e:
        r0 = r1.toString();
        return r0;
    L_0x0053:
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x004b;
    L_0x0059:
        r5.a();
        r2 = r0.length();
        if (r2 == 0) goto L_0x004e;
    L_0x0062:
        r0 = r0.trim();
        r1.append(r0);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgt.a(java.lang.String):java.lang.String");
    }

    private static String e(String str) {
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            return null;
        }
        int indexOf2 = str.indexOf(";");
        if (indexOf != -1) {
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            } else {
                indexOf2 = Math.min(indexOf, indexOf2);
            }
        }
        return str.substring(0, indexOf2).toUpperCase();
    }

    protected String b(String str) {
        return str;
    }

    protected int c() {
        return 0;
    }

    protected String d() {
        return "2.1";
    }

    protected Set e() {
        return bgw.a;
    }

    public final void a(bgr bgr) {
        this.c.add(bgr);
    }

    public final void a(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("InputStream must not be null.");
        }
        this.a = new bgu(new InputStreamReader(inputStream, this.b));
        System.currentTimeMillis();
        for (bgr a : this.c) {
            a.a();
        }
        do {
            synchronized (this) {
                if (this.d) {
                    break;
                }
            }
        } while (g());
        for (bgr a2 : this.c) {
            a2.b();
        }
    }

    public final synchronized void f() {
        this.d = true;
    }

    protected void c(bgy bgy, String str) {
        if (!(bgw.b.contains(str.toUpperCase()) || str.startsWith("X-") || this.f.contains(str))) {
            this.f.add(str);
            Log.w("vCard", String.format("TYPE unsupported by %s: %s", new Object[]{Integer.valueOf(c()), str}));
        }
        bgy.a("TYPE", str);
    }

    protected void a(bgy bgy) {
        if (bgy.d.toUpperCase().contains("BEGIN:VCARD")) {
            throw new bhg("AGENT Property is not supported now.", (byte) 0);
        }
        for (bgr a : this.c) {
            a.a(bgy);
        }
    }
}
