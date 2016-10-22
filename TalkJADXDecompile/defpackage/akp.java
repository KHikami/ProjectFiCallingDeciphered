package defpackage;

import android.util.Log;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: akp */
class akp {
    public final String a;
    public String b;
    public String c;
    public akq d;
    public final Set<String> e;
    public final Set<String> f;
    private final List<akn> g;
    private boolean h;

    public akp() {
        int i = ajq.b;
        this((byte) 0);
    }

    public akp(byte b) {
        this.g = new ArrayList();
        this.e = new HashSet();
        this.f = new HashSet();
        this.a = "ISO-8859-1";
    }

    protected boolean a(String str) {
        if (!(h().contains(str.toUpperCase()) || str.startsWith("X-") || this.e.contains(str))) {
            this.e.add(str);
            String str2 = "Property name unsupported by vCard 2.1: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                valueOf = new String(str2);
            }
        }
        return true;
    }

    protected String a() {
        return this.d.readLine();
    }

    protected String b() {
        return this.d.a();
    }

    protected String c() {
        String a;
        do {
            a = a();
            if (a == null) {
                throw new akz("Reached end of buffer.");
            }
        } while (a.trim().length() <= 0);
        return a;
    }

    private boolean l() {
        this.b = "8BIT";
        this.c = "UTF-8";
        if (!a(false)) {
            return false;
        }
        for (akn d : this.g) {
            d.d();
        }
        d();
        for (akn d2 : this.g) {
            d2.e();
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
        r0 = new akz;
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
        r0 = new akz;
        r1 = "Reached where must not be reached.";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: akp.a(boolean):boolean");
    }

    protected void d() {
        boolean z = false;
        try {
            z = e();
        } catch (ala e) {
            Log.e("vCard", "Invalid line which looks like some comment was found. Ignored.");
        }
        while (!z) {
            try {
                z = e();
            } catch (ala e2) {
                Log.e("vCard", "Invalid line which looks like some comment was found. Ignored.");
            }
        }
    }

    protected boolean e() {
        this.b = "8BIT";
        aku b = b(c());
        String toUpperCase = b.a().toUpperCase();
        String c = b.c();
        String str;
        String valueOf;
        if (toUpperCase.equals("BEGIN")) {
            if (c.equalsIgnoreCase("VCARD")) {
                for (akn d : this.g) {
                    d.d();
                }
                d();
                for (akn d2 : this.g) {
                    d2.e();
                }
            } else {
                str = "Unknown BEGIN type: ";
                valueOf = String.valueOf(c);
                throw new akz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if (!toUpperCase.equals("END")) {
            c = b.c();
            if (toUpperCase.equals("AGENT")) {
                b(b);
            } else {
                a(toUpperCase);
                if (!toUpperCase.equals("VERSION") || c.equals(g())) {
                    a(b);
                } else {
                    toUpperCase = String.valueOf(g());
                    throw new ald(new StringBuilder((String.valueOf(c).length() + 26) + String.valueOf(toUpperCase).length()).append("Incompatible version: ").append(c).append(" != ").append(toUpperCase).toString());
                }
            }
        } else if (c.equalsIgnoreCase("VCARD")) {
            return true;
        } else {
            str = "Unknown END type: ";
            valueOf = String.valueOf(c);
            throw new akz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        return false;
    }

    protected aku b(String str) {
        aku aku = new aku();
        int length = str.length();
        if (length <= 0 || str.charAt(0) != '#') {
            int i = 0;
            int i2 = 0;
            byte b = (byte) 0;
            while (i < length) {
                char charAt = str.charAt(i);
                switch (b) {
                    case wi.w /*0*/:
                        String substring;
                        if (charAt != ':') {
                            if (charAt != '.') {
                                if (charAt != ';') {
                                    break;
                                }
                                aku.a(str.substring(i2, i));
                                i2 = i + 1;
                                b = (byte) 1;
                                break;
                            }
                            substring = str.substring(i2, i);
                            if (substring.length() != 0) {
                                aku.b(substring);
                            }
                            i2 = i + 1;
                            break;
                        }
                        aku.a(str.substring(i2, i));
                        if (i < length - 1) {
                            substring = str.substring(i + 1);
                        } else {
                            substring = "";
                        }
                        aku.c(substring);
                        return aku;
                    case wi.j /*1*/:
                        if (charAt != '\"') {
                            if (charAt != ';') {
                                if (charAt != ':') {
                                    break;
                                }
                                a(aku, str.substring(i2, i));
                                aku.c(i < length + -1 ? str.substring(i + 1) : "");
                                return aku;
                            }
                            a(aku, str.substring(i2, i));
                            i2 = i + 1;
                            break;
                        }
                        "2.1".equalsIgnoreCase(g());
                        b = (byte) 2;
                        break;
                    case wi.l /*2*/:
                        if (charAt != '\"') {
                            break;
                        }
                        "2.1".equalsIgnoreCase(g());
                        b = (byte) 1;
                        break;
                    default:
                        break;
                }
                i++;
            }
            throw new akz(new StringBuilder(String.valueOf(str).length() + 16).append("Invalid line: \"").append(str).append("\"").toString(), (byte) 0);
        }
        throw new ala();
    }

    protected void a(aku aku, String str) {
        String[] split = str.split("=", 2);
        if (split.length == 2) {
            String toUpperCase = split[0].trim().toUpperCase();
            String trim = split[1].trim();
            if (toUpperCase.equals("TYPE")) {
                c(aku, trim);
                return;
            } else if (toUpperCase.equals("VALUE")) {
                d(aku, trim);
                return;
            } else if (toUpperCase.equals("ENCODING")) {
                e(aku, trim.toUpperCase());
                return;
            } else if (toUpperCase.equals("CHARSET")) {
                f(aku, trim);
                return;
            } else if (toUpperCase.equals("LANGUAGE")) {
                g(aku, trim);
                return;
            } else if (toUpperCase.startsWith("X-")) {
                a(aku, toUpperCase, trim);
                return;
            } else {
                throw new akz(new StringBuilder(String.valueOf(toUpperCase).length() + 15).append("Unknown type \"").append(toUpperCase).append("\"").toString());
            }
        }
        b(aku, split[0]);
    }

    protected void b(aku aku, String str) {
        c(aku, str);
    }

    protected void c(aku aku, String str) {
        if (!(i().contains(str.toUpperCase()) || str.startsWith("X-") || this.e.contains(str))) {
            this.e.add(str);
            String.format("TYPE unsupported by %s: %s", new Object[]{Integer.valueOf(f()), str});
        }
        aku.a("TYPE", str);
    }

    protected void d(aku aku, String str) {
        if (!(j().contains(str.toUpperCase()) || str.startsWith("X-") || this.f.contains(str))) {
            this.f.add(str);
            String.format("The value unsupported by TYPE of %s: %s", new Object[]{Integer.valueOf(f()), str});
        }
        aku.a("VALUE", str);
    }

    protected void e(aku aku, String str) {
        if (k().contains(str) || str.startsWith("X-")) {
            aku.a("ENCODING", str);
            this.b = str.toUpperCase();
            return;
        }
        throw new akz(new StringBuilder(String.valueOf(str).length() + 19).append("Unknown encoding \"").append(str).append("\"").toString());
    }

    protected void f(aku aku, String str) {
        this.c = str;
        aku.a("CHARSET", str);
    }

    protected void g(aku aku, String str) {
        int i = 0;
        String[] split = str.split("-");
        if (split.length != 2) {
            throw new akz(new StringBuilder(String.valueOf(str).length() + 20).append("Invalid Language: \"").append(str).append("\"").toString());
        }
        String str2 = split[0];
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            if (akp.a(str2.charAt(i2))) {
                i2++;
            } else {
                throw new akz(new StringBuilder(String.valueOf(str).length() + 20).append("Invalid Language: \"").append(str).append("\"").toString());
            }
        }
        String str3 = split[1];
        int length2 = str3.length();
        while (i < length2) {
            if (akp.a(str3.charAt(i))) {
                i++;
            } else {
                throw new akz(new StringBuilder(String.valueOf(str).length() + 20).append("Invalid Language: \"").append(str).append("\"").toString());
            }
        }
        aku.a("LANGUAGE", str);
    }

    private static boolean a(char c) {
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            return false;
        }
        return true;
    }

    protected void a(aku aku, String str, String str2) {
        aku.a(str, str2);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected void a(defpackage.aku r9) {
        /*
        r8 = this;
        r1 = 0;
        r7 = 1;
        r6 = 0;
        r0 = r9.a();
        r4 = r0.toUpperCase();
        r3 = r9.c();
        r0 = "CHARSET";
        r0 = r9.d(r0);
        if (r0 == 0) goto L_0x007a;
    L_0x0017:
        r0 = r0.iterator();
        r0 = r0.next();
        r0 = (java.lang.String) r0;
    L_0x0021:
        r2 = android.text.TextUtils.isEmpty(r0);
        if (r2 == 0) goto L_0x0212;
    L_0x0027:
        r0 = "UTF-8";
        r2 = r0;
    L_0x002a:
        r0 = "ADR";
        r0 = r4.equals(r0);
        if (r0 != 0) goto L_0x0042;
    L_0x0032:
        r0 = "ORG";
        r0 = r4.equals(r0);
        if (r0 != 0) goto L_0x0042;
    L_0x003a:
        r0 = "N";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x00b9;
    L_0x0042:
        r1 = "ISO-8859-1";
        r4 = new java.util.ArrayList;
        r4.<init>();
        r0 = r8.b;
        r5 = "QUOTED-PRINTABLE";
        r0 = r0.equals(r5);
        if (r0 == 0) goto L_0x007c;
    L_0x0053:
        r0 = r8.e(r3);
        r9.c(r0);
        r3 = r8.f();
        r0 = defpackage.akw.a(r0, r3);
        r3 = r0.iterator();
    L_0x0066:
        r0 = r3.hasNext();
        if (r0 == 0) goto L_0x00a0;
    L_0x006c:
        r0 = r3.next();
        r0 = (java.lang.String) r0;
        r0 = defpackage.akw.a(r0, r6, r1, r2);
        r4.add(r0);
        goto L_0x0066;
    L_0x007a:
        r0 = r1;
        goto L_0x0021;
    L_0x007c:
        r0 = r8.f(r3);
        r0 = defpackage.akw.a(r0, r1, r2);
        r1 = r8.f();
        r0 = defpackage.akw.a(r0, r1);
        r1 = r0.iterator();
    L_0x0090:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x00a0;
    L_0x0096:
        r0 = r1.next();
        r0 = (java.lang.String) r0;
        r4.add(r0);
        goto L_0x0090;
    L_0x00a0:
        r9.a(r4);
        r0 = r8.g;
        r1 = r0.iterator();
    L_0x00a9:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x020f;
    L_0x00af:
        r0 = r1.next();
        r0 = (defpackage.akn) r0;
        r0.a(r9);
        goto L_0x00a9;
    L_0x00b9:
        r0 = r8.b;
        r5 = "QUOTED-PRINTABLE";
        r0 = r0.equals(r5);
        if (r0 != 0) goto L_0x00d9;
    L_0x00c3:
        r0 = "FN";
        r0 = r4.equals(r0);
        if (r0 == 0) goto L_0x0103;
    L_0x00cb:
        r0 = "ENCODING";
        r0 = r9.d(r0);
        if (r0 != 0) goto L_0x0103;
    L_0x00d3:
        r0 = defpackage.akw.a(r3);
        if (r0 == 0) goto L_0x0103;
    L_0x00d9:
        r0 = r8.e(r3);
        r1 = "ISO-8859-1";
        r1 = defpackage.akw.a(r0, r6, r1, r2);
        r9.c(r0);
        r0 = new java.lang.String[r7];
        r0[r6] = r1;
        r9.a(r0);
        r0 = r8.g;
        r1 = r0.iterator();
    L_0x00f3:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x020f;
    L_0x00f9:
        r0 = r1.next();
        r0 = (defpackage.akn) r0;
        r0.a(r9);
        goto L_0x00f3;
    L_0x0103:
        r0 = r8.b;
        r4 = "BASE64";
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x0117;
    L_0x010d:
        r0 = r8.b;
        r4 = "B";
        r0 = r0.equals(r4);
        if (r0 == 0) goto L_0x0174;
    L_0x0117:
        r0 = r8.c(r3);	 Catch:{ OutOfMemoryError -> 0x0139 }
        r1 = 0;
        r0 = android.util.Base64.decode(r0, r1);	 Catch:{ IllegalArgumentException -> 0x0157 }
        r9.a(r0);	 Catch:{ IllegalArgumentException -> 0x0157 }
        r0 = r8.g;	 Catch:{ OutOfMemoryError -> 0x0139 }
        r1 = r0.iterator();	 Catch:{ OutOfMemoryError -> 0x0139 }
    L_0x0129:
        r0 = r1.hasNext();	 Catch:{ OutOfMemoryError -> 0x0139 }
        if (r0 == 0) goto L_0x020f;
    L_0x012f:
        r0 = r1.next();	 Catch:{ OutOfMemoryError -> 0x0139 }
        r0 = (defpackage.akn) r0;	 Catch:{ OutOfMemoryError -> 0x0139 }
        r0.a(r9);	 Catch:{ OutOfMemoryError -> 0x0139 }
        goto L_0x0129;
    L_0x0139:
        r0 = move-exception;
        r0 = "vCard";
        r1 = "OutOfMemoryError happened during parsing BASE64 data!";
        android.util.Log.e(r0, r1);
        r0 = r8.g;
        r1 = r0.iterator();
    L_0x0147:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x020f;
    L_0x014d:
        r0 = r1.next();
        r0 = (defpackage.akn) r0;
        r0.a(r9);
        goto L_0x0147;
    L_0x0157:
        r0 = move-exception;
        r1 = new akz;	 Catch:{ OutOfMemoryError -> 0x0139 }
        r2 = "Decode error on base64 photo: ";
        r0 = java.lang.String.valueOf(r3);	 Catch:{ OutOfMemoryError -> 0x0139 }
        r3 = r0.length();	 Catch:{ OutOfMemoryError -> 0x0139 }
        if (r3 == 0) goto L_0x016e;
    L_0x0166:
        r0 = r2.concat(r0);	 Catch:{ OutOfMemoryError -> 0x0139 }
    L_0x016a:
        r1.<init>(r0);	 Catch:{ OutOfMemoryError -> 0x0139 }
        throw r1;	 Catch:{ OutOfMemoryError -> 0x0139 }
    L_0x016e:
        r0 = new java.lang.String;	 Catch:{ OutOfMemoryError -> 0x0139 }
        r0.<init>(r2);	 Catch:{ OutOfMemoryError -> 0x0139 }
        goto L_0x016a;
    L_0x0174:
        r0 = r8.b;
        r4 = "7BIT";
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x01a4;
    L_0x017e:
        r0 = r8.b;
        r4 = "8BIT";
        r0 = r0.equals(r4);
        if (r0 != 0) goto L_0x01a4;
    L_0x0188:
        r0 = r8.b;
        r4 = "X-";
        r0 = r0.startsWith(r4);
        if (r0 != 0) goto L_0x01a4;
    L_0x0192:
        r0 = "The encoding \"%s\" is unsupported by vCard %s";
        r4 = 2;
        r4 = new java.lang.Object[r4];
        r5 = r8.b;
        r4[r6] = r5;
        r5 = r8.g();
        r4[r7] = r5;
        java.lang.String.format(r0, r4);
    L_0x01a4:
        r0 = r8.f();
        if (r0 != 0) goto L_0x0210;
    L_0x01aa:
        r0 = r1;
    L_0x01ab:
        r1 = r8.b();
        r4 = android.text.TextUtils.isEmpty(r1);
        if (r4 != 0) goto L_0x01de;
    L_0x01b5:
        r4 = r1.charAt(r6);
        r5 = 32;
        if (r4 != r5) goto L_0x01de;
    L_0x01bd:
        r4 = "END:VCARD";
        r5 = r1.toUpperCase();
        r4 = r4.contains(r5);
        if (r4 != 0) goto L_0x01de;
    L_0x01c9:
        r8.a();
        if (r0 != 0) goto L_0x01d6;
    L_0x01ce:
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r3);
    L_0x01d6:
        r1 = r1.substring(r7);
        r0.append(r1);
        goto L_0x01ab;
    L_0x01de:
        if (r0 == 0) goto L_0x0210;
    L_0x01e0:
        r0 = r0.toString();
    L_0x01e4:
        r1 = new java.util.ArrayList;
        r1.<init>();
        r3 = "ISO-8859-1";
        r0 = defpackage.akw.a(r0, r3, r2);
        r0 = r8.d(r0);
        r1.add(r0);
        r9.a(r1);
        r0 = r8.g;
        r1 = r0.iterator();
    L_0x01ff:
        r0 = r1.hasNext();
        if (r0 == 0) goto L_0x020f;
    L_0x0205:
        r0 = r1.next();
        r0 = (defpackage.akn) r0;
        r0.a(r9);
        goto L_0x01ff;
    L_0x020f:
        return;
    L_0x0210:
        r0 = r3;
        goto L_0x01e4;
    L_0x0212:
        r2 = r0;
        goto L_0x002a;
        */
        throw new UnsupportedOperationException("Method not decompiled: akp.a(aku):void");
    }

    private String e(String str) {
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
        throw new akz("File ended during parsing a Quoted-Printable String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String f(java.lang.String r4) {
        /*
        r3 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r4);
    L_0x0008:
        r1 = r3.b();
        if (r1 == 0) goto L_0x0027;
    L_0x000e:
        r2 = r1.length();
        if (r2 == 0) goto L_0x0027;
    L_0x0014:
        r2 = defpackage.akp.g(r1);
        if (r2 != 0) goto L_0x0027;
    L_0x001a:
        r3.a();
        r2 = " ";
        r2 = r0.append(r2);
        r2.append(r1);
        goto L_0x0008;
    L_0x0027:
        r0 = r0.toString();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: akp.f(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected java.lang.String c(java.lang.String r5) {
        /*
        r4 = this;
        r0 = new java.lang.StringBuilder;
        r0.<init>();
        r0.append(r5);
    L_0x0008:
        r1 = r4.b();
        if (r1 != 0) goto L_0x0016;
    L_0x000e:
        r0 = new akz;
        r1 = "File ended during parsing BASE64 binary";
        r0.<init>(r1);
        throw r0;
    L_0x0016:
        r2 = defpackage.akp.g(r1);
        r3 = r4.h();
        r3 = r3.contains(r2);
        if (r3 != 0) goto L_0x002c;
    L_0x0024:
        r3 = "X-ANDROID-CUSTOM";
        r2 = r3.equals(r2);
        if (r2 == 0) goto L_0x004a;
    L_0x002c:
        r2 = "Problematic line: ";
        r1 = r1.trim();
        r1 = java.lang.String.valueOf(r1);
        r3 = r1.length();
        if (r3 == 0) goto L_0x0044;
    L_0x003c:
        r2.concat(r1);
    L_0x003f:
        r0 = r0.toString();
        return r0;
    L_0x0044:
        r1 = new java.lang.String;
        r1.<init>(r2);
        goto L_0x003f;
    L_0x004a:
        r4.a();
        r2 = r1.length();
        if (r2 == 0) goto L_0x003f;
    L_0x0053:
        r1 = r1.trim();
        r0.append(r1);
        goto L_0x0008;
        */
        throw new UnsupportedOperationException("Method not decompiled: akp.c(java.lang.String):java.lang.String");
    }

    private static String g(String str) {
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

    protected void b(aku aku) {
        if (aku.c().toUpperCase().contains("BEGIN:VCARD")) {
            throw new alc("AGENT Property is not supported now.", (byte) 0);
        }
        for (akn a : this.g) {
            a.a(aku);
        }
    }

    protected String d(String str) {
        return str;
    }

    protected int f() {
        return 0;
    }

    protected String g() {
        return "2.1";
    }

    protected Set<String> h() {
        return aks.a;
    }

    protected Set<String> i() {
        return aks.b;
    }

    protected Set<String> j() {
        return aks.c;
    }

    protected Set<String> k() {
        return aks.d;
    }

    public void a(akn akn) {
        this.g.add(akn);
    }

    public void a(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("InputStream must not be null.");
        }
        this.d = new akq(new InputStreamReader(inputStream, this.a));
        System.currentTimeMillis();
        for (akn a : this.g) {
            a.a();
        }
        do {
            synchronized (this) {
                if (this.h) {
                    break;
                }
            }
        } while (l());
        for (akn a2 : this.g) {
            a2.b();
        }
    }
}
