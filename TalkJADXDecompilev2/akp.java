package defpackage;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    protected boolean a(boolean z) {
        while (true) {
            String a = a();
            if (a == null) {
                return false;
            }
            if (a.trim().length() > 0) {
                String[] split = a.split(":", 2);
                if (split.length == 2 && split[0].trim().equalsIgnoreCase("BEGIN") && split[1].trim().equalsIgnoreCase("VCARD")) {
                    return true;
                }
                if (!z) {
                    throw new akz(new StringBuilder(String.valueOf(a).length() + 61).append("Expected String \"BEGIN:VCARD\" did not come (Instead, \"").append(a).append("\" came)").toString());
                } else if (!z) {
                    throw new akz("Reached where must not be reached.");
                }
            }
        }
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
                    case (byte) 0:
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
                    case (byte) 1:
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
                    case (byte) 2:
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

    protected void a(aku aku) {
        String toUpperCase = aku.a().toUpperCase();
        String c = aku.c();
        Collection d = aku.d("CHARSET");
        CharSequence charSequence = d != null ? (String) d.iterator().next() : null;
        if (TextUtils.isEmpty(charSequence)) {
            String str = "UTF-8";
        } else {
            CharSequence charSequence2 = charSequence;
        }
        String str2;
        String e;
        if (toUpperCase.equals("ADR") || toUpperCase.equals("ORG") || toUpperCase.equals("N")) {
            str2 = "ISO-8859-1";
            List arrayList = new ArrayList();
            if (this.b.equals("QUOTED-PRINTABLE")) {
                e = e(c);
                aku.c(e);
                for (String e2 : akw.a(e2, f())) {
                    arrayList.add(akw.a(e2, false, str2, str));
                }
            } else {
                for (String e22 : akw.a(akw.a(f(c), str2, str), f())) {
                    arrayList.add(e22);
                }
            }
            aku.a(arrayList);
            for (akn a : this.g) {
                a.a(aku);
            }
        } else if (this.b.equals("QUOTED-PRINTABLE") || (toUpperCase.equals("FN") && aku.d("ENCODING") == null && akw.a(c))) {
            e22 = e(c);
            str2 = akw.a(e22, false, "ISO-8859-1", str);
            aku.c(e22);
            aku.a(str2);
            for (akn a2 : this.g) {
                a2.a(aku);
            }
        } else if (this.b.equals("BASE64") || this.b.equals("B")) {
            try {
                aku.a(Base64.decode(c(c), 0));
                for (akn a22 : this.g) {
                    a22.a(aku);
                }
            } catch (IllegalArgumentException e3) {
                str = "Decode error on base64 photo: ";
                e22 = String.valueOf(c);
                throw new akz(e22.length() != 0 ? str.concat(e22) : new String(str));
            } catch (OutOfMemoryError e4) {
                Log.e("vCard", "OutOfMemoryError happened during parsing BASE64 data!");
                for (akn a222 : this.g) {
                    a222.a(aku);
                }
            }
        } else {
            List arrayList2;
            if (!(this.b.equals("7BIT") || this.b.equals("8BIT") || this.b.startsWith("X-"))) {
                String.format("The encoding \"%s\" is unsupported by vCard %s", new Object[]{this.b, g()});
            }
            if (f() == 0) {
                StringBuilder stringBuilder = null;
                while (true) {
                    str2 = b();
                    if (!TextUtils.isEmpty(str2) && str2.charAt(0) == ' ' && !"END:VCARD".contains(str2.toUpperCase())) {
                        a();
                        if (stringBuilder == null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(c);
                        }
                        stringBuilder.append(str2.substring(1));
                    } else if (stringBuilder != null) {
                        e22 = stringBuilder.toString();
                        arrayList2 = new ArrayList();
                        arrayList2.add(d(akw.a(e22, "ISO-8859-1", str)));
                        aku.a(arrayList2);
                        for (akn a2222 : this.g) {
                            a2222.a(aku);
                        }
                    }
                }
                if (stringBuilder != null) {
                    e22 = stringBuilder.toString();
                    arrayList2 = new ArrayList();
                    arrayList2.add(d(akw.a(e22, "ISO-8859-1", str)));
                    aku.a(arrayList2);
                    while (r1.hasNext()) {
                        a2222.a(aku);
                    }
                }
            }
            e22 = c;
            arrayList2 = new ArrayList();
            arrayList2.add(d(akw.a(e22, "ISO-8859-1", str)));
            aku.a(arrayList2);
            while (r1.hasNext()) {
                a2222.a(aku);
            }
        }
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
                throw new akz("File ended during parsing a Quoted-Printable String");
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
    }

    private String f(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        while (true) {
            String b = b();
            if (b != null && b.length() != 0 && akp.g(b) == null) {
                a();
                stringBuilder.append(" ").append(b);
            }
        }
        return stringBuilder.toString();
    }

    protected String c(String str) {
        String b;
        String g;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        while (true) {
            b = b();
            if (b != null) {
                g = akp.g(b);
                if (!h().contains(g) && !"X-ANDROID-CUSTOM".equals(g)) {
                    a();
                    if (b.length() == 0) {
                        break;
                    }
                    stringBuilder.append(b.trim());
                } else {
                    g = "Problematic line: ";
                    b = String.valueOf(b.trim());
                }
            } else {
                throw new akz("File ended during parsing BASE64 binary");
            }
        }
        g = "Problematic line: ";
        b = String.valueOf(b.trim());
        if (b.length() != 0) {
            g.concat(b);
        } else {
            b = new String(g);
        }
        return stringBuilder.toString();
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
