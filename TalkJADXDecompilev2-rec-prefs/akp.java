package p000;

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
    public final String f1135a;
    public String f1136b;
    public String f1137c;
    public akq f1138d;
    public final Set<String> f1139e;
    public final Set<String> f1140f;
    private final List<akn> f1141g;
    private boolean f1142h;

    public akp() {
        int i = ajq.f1025b;
        this((byte) 0);
    }

    public akp(byte b) {
        this.f1141g = new ArrayList();
        this.f1139e = new HashSet();
        this.f1140f = new HashSet();
        this.f1135a = "ISO-8859-1";
    }

    protected boolean m2753a(String str) {
        if (!(mo255h().contains(str.toUpperCase()) || str.startsWith("X-") || this.f1139e.contains(str))) {
            this.f1139e.add(str);
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

    protected String mo242a() {
        return this.f1138d.readLine();
    }

    protected String m2756b() {
        return this.f1138d.m2775a();
    }

    protected String mo248c() {
        String a;
        do {
            a = mo242a();
            if (a == null) {
                throw new akz("Reached end of buffer.");
            }
        } while (a.trim().length() <= 0);
        return a;
    }

    private boolean m2746l() {
        this.f1136b = "8BIT";
        this.f1137c = "UTF-8";
        if (!mo245a(false)) {
            return false;
        }
        for (akn d : this.f1141g) {
            d.mo240d();
        }
        m2763d();
        for (akn d2 : this.f1141g) {
            d2.mo241e();
        }
        return true;
    }

    protected boolean mo245a(boolean z) {
        while (true) {
            String a = mo242a();
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

    protected void m2763d() {
        boolean z = false;
        try {
            z = m2766e();
        } catch (ala e) {
            Log.e("vCard", "Invalid line which looks like some comment was found. Ignored.");
        }
        while (!z) {
            try {
                z = m2766e();
            } catch (ala e2) {
                Log.e("vCard", "Invalid line which looks like some comment was found. Ignored.");
            }
        }
    }

    protected boolean m2766e() {
        this.f1136b = "8BIT";
        aku b = m2755b(mo248c());
        String toUpperCase = b.m2795a().toUpperCase();
        String c = b.m2803c();
        String str;
        String valueOf;
        if (toUpperCase.equals("BEGIN")) {
            if (c.equalsIgnoreCase("VCARD")) {
                for (akn d : this.f1141g) {
                    d.mo240d();
                }
                m2763d();
                for (akn d2 : this.f1141g) {
                    d2.mo241e();
                }
            } else {
                str = "Unknown BEGIN type: ";
                valueOf = String.valueOf(c);
                throw new akz(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
            }
        } else if (!toUpperCase.equals("END")) {
            c = b.m2803c();
            if (toUpperCase.equals("AGENT")) {
                mo246b(b);
            } else {
                m2753a(toUpperCase);
                if (!toUpperCase.equals("VERSION") || c.equals(mo254g())) {
                    m2749a(b);
                } else {
                    toUpperCase = String.valueOf(mo254g());
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

    protected aku m2755b(String str) {
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
                                aku.m2796a(str.substring(i2, i));
                                i2 = i + 1;
                                b = (byte) 1;
                                break;
                            }
                            substring = str.substring(i2, i);
                            if (substring.length() != 0) {
                                aku.m2802b(substring);
                            }
                            i2 = i + 1;
                            break;
                        }
                        aku.m2796a(str.substring(i2, i));
                        if (i < length - 1) {
                            substring = str.substring(i + 1);
                        } else {
                            substring = "";
                        }
                        aku.m2804c(substring);
                        return aku;
                    case (byte) 1:
                        if (charAt != '\"') {
                            if (charAt != ';') {
                                if (charAt != ':') {
                                    break;
                                }
                                mo243a(aku, str.substring(i2, i));
                                aku.m2804c(i < length + -1 ? str.substring(i + 1) : "");
                                return aku;
                            }
                            mo243a(aku, str.substring(i2, i));
                            i2 = i + 1;
                            break;
                        }
                        "2.1".equalsIgnoreCase(mo254g());
                        b = (byte) 2;
                        break;
                    case (byte) 2:
                        if (charAt != '\"') {
                            break;
                        }
                        "2.1".equalsIgnoreCase(mo254g());
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

    protected void mo243a(aku aku, String str) {
        String[] split = str.split("=", 2);
        if (split.length == 2) {
            String toUpperCase = split[0].trim().toUpperCase();
            String trim = split[1].trim();
            if (toUpperCase.equals("TYPE")) {
                mo250c(aku, trim);
                return;
            } else if (toUpperCase.equals("VALUE")) {
                m2764d(aku, trim);
                return;
            } else if (toUpperCase.equals("ENCODING")) {
                m2765e(aku, trim.toUpperCase());
                return;
            } else if (toUpperCase.equals("CHARSET")) {
                m2768f(aku, trim);
                return;
            } else if (toUpperCase.equals("LANGUAGE")) {
                m2770g(aku, trim);
                return;
            } else if (toUpperCase.startsWith("X-")) {
                mo244a(aku, toUpperCase, trim);
                return;
            } else {
                throw new akz(new StringBuilder(String.valueOf(toUpperCase).length() + 15).append("Unknown type \"").append(toUpperCase).append("\"").toString());
            }
        }
        mo247b(aku, split[0]);
    }

    protected void mo247b(aku aku, String str) {
        mo250c(aku, str);
    }

    protected void mo250c(aku aku, String str) {
        if (!(m2772i().contains(str.toUpperCase()) || str.startsWith("X-") || this.f1139e.contains(str))) {
            this.f1139e.add(str);
            String.format("TYPE unsupported by %s: %s", new Object[]{Integer.valueOf(mo253f()), str});
        }
        aku.m2797a("TYPE", str);
    }

    protected void m2764d(aku aku, String str) {
        if (!(m2773j().contains(str.toUpperCase()) || str.startsWith("X-") || this.f1140f.contains(str))) {
            this.f1140f.add(str);
            String.format("The value unsupported by TYPE of %s: %s", new Object[]{Integer.valueOf(mo253f()), str});
        }
        aku.m2797a("VALUE", str);
    }

    protected void m2765e(aku aku, String str) {
        if (m2774k().contains(str) || str.startsWith("X-")) {
            aku.m2797a("ENCODING", str);
            this.f1136b = str.toUpperCase();
            return;
        }
        throw new akz(new StringBuilder(String.valueOf(str).length() + 19).append("Unknown encoding \"").append(str).append("\"").toString());
    }

    protected void m2768f(aku aku, String str) {
        this.f1137c = str;
        aku.m2797a("CHARSET", str);
    }

    protected void m2770g(aku aku, String str) {
        int i = 0;
        String[] split = str.split("-");
        if (split.length != 2) {
            throw new akz(new StringBuilder(String.valueOf(str).length() + 20).append("Invalid Language: \"").append(str).append("\"").toString());
        }
        String str2 = split[0];
        int length = str2.length();
        int i2 = 0;
        while (i2 < length) {
            if (akp.m2742a(str2.charAt(i2))) {
                i2++;
            } else {
                throw new akz(new StringBuilder(String.valueOf(str).length() + 20).append("Invalid Language: \"").append(str).append("\"").toString());
            }
        }
        String str3 = split[1];
        int length2 = str3.length();
        while (i < length2) {
            if (akp.m2742a(str3.charAt(i))) {
                i++;
            } else {
                throw new akz(new StringBuilder(String.valueOf(str).length() + 20).append("Invalid Language: \"").append(str).append("\"").toString());
            }
        }
        aku.m2797a("LANGUAGE", str);
    }

    private static boolean m2742a(char c) {
        if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
            return false;
        }
        return true;
    }

    protected void mo244a(aku aku, String str, String str2) {
        aku.m2797a(str, str2);
    }

    protected void m2749a(aku aku) {
        String toUpperCase = aku.m2795a().toUpperCase();
        String c = aku.m2803c();
        Collection d = aku.m2805d("CHARSET");
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
            if (this.f1136b.equals("QUOTED-PRINTABLE")) {
                e = mo252e(c);
                aku.m2804c(e);
                for (String e2 : akw.m2820a(e2, mo253f())) {
                    arrayList.add(akw.m2819a(e2, false, str2, str));
                }
            } else {
                for (String e22 : akw.m2820a(akw.m2818a(m2744f(c), str2, str), mo253f())) {
                    arrayList.add(e22);
                }
            }
            aku.m2798a(arrayList);
            for (akn a : this.f1141g) {
                a.mo238a(aku);
            }
        } else if (this.f1136b.equals("QUOTED-PRINTABLE") || (toUpperCase.equals("FN") && aku.m2805d("ENCODING") == null && akw.m2821a(c))) {
            e22 = mo252e(c);
            str2 = akw.m2819a(e22, false, "ISO-8859-1", str);
            aku.m2804c(e22);
            aku.m2800a(str2);
            for (akn a2 : this.f1141g) {
                a2.mo238a(aku);
            }
        } else if (this.f1136b.equals("BASE64") || this.f1136b.equals("B")) {
            try {
                aku.m2799a(Base64.decode(mo249c(c), 0));
                for (akn a22 : this.f1141g) {
                    a22.mo238a(aku);
                }
            } catch (IllegalArgumentException e3) {
                str = "Decode error on base64 photo: ";
                e22 = String.valueOf(c);
                throw new akz(e22.length() != 0 ? str.concat(e22) : new String(str));
            } catch (OutOfMemoryError e4) {
                Log.e("vCard", "OutOfMemoryError happened during parsing BASE64 data!");
                for (akn a222 : this.f1141g) {
                    a222.mo238a(aku);
                }
            }
        } else {
            List arrayList2;
            if (!(this.f1136b.equals("7BIT") || this.f1136b.equals("8BIT") || this.f1136b.startsWith("X-"))) {
                String.format("The encoding \"%s\" is unsupported by vCard %s", new Object[]{this.f1136b, mo254g()});
            }
            if (mo253f() == 0) {
                StringBuilder stringBuilder = null;
                while (true) {
                    str2 = m2756b();
                    if (!TextUtils.isEmpty(str2) && str2.charAt(0) == ' ' && !"END:VCARD".contains(str2.toUpperCase())) {
                        mo242a();
                        if (stringBuilder == null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(c);
                        }
                        stringBuilder.append(str2.substring(1));
                    } else if (stringBuilder != null) {
                        e22 = stringBuilder.toString();
                        arrayList2 = new ArrayList();
                        arrayList2.add(mo251d(akw.m2818a(e22, "ISO-8859-1", str)));
                        aku.m2798a(arrayList2);
                        for (akn a2222 : this.f1141g) {
                            a2222.mo238a(aku);
                        }
                    }
                }
                if (stringBuilder != null) {
                    e22 = stringBuilder.toString();
                    arrayList2 = new ArrayList();
                    arrayList2.add(mo251d(akw.m2818a(e22, "ISO-8859-1", str)));
                    aku.m2798a(arrayList2);
                    while (r1.hasNext()) {
                        a2222.mo238a(aku);
                    }
                }
            }
            e22 = c;
            arrayList2 = new ArrayList();
            arrayList2.add(mo251d(akw.m2818a(e22, "ISO-8859-1", str)));
            aku.m2798a(arrayList2);
            while (r1.hasNext()) {
                a2222.mo238a(aku);
            }
        }
    }

    private String mo252e(String str) {
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
            String a = mo242a();
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

    private String m2744f(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        while (true) {
            String b = m2756b();
            if (b != null && b.length() != 0 && akp.m2745g(b) == null) {
                mo242a();
                stringBuilder.append(" ").append(b);
            }
        }
        return stringBuilder.toString();
    }

    protected String mo249c(String str) {
        String b;
        String g;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        while (true) {
            b = m2756b();
            if (b != null) {
                g = akp.m2745g(b);
                if (!mo255h().contains(g) && !"X-ANDROID-CUSTOM".equals(g)) {
                    mo242a();
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

    private static String m2745g(String str) {
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

    protected void mo246b(aku aku) {
        if (aku.m2803c().toUpperCase().contains("BEGIN:VCARD")) {
            throw new alc("AGENT Property is not supported now.", (byte) 0);
        }
        for (akn a : this.f1141g) {
            a.mo238a(aku);
        }
    }

    protected String mo251d(String str) {
        return str;
    }

    protected int mo253f() {
        return 0;
    }

    protected String mo254g() {
        return "2.1";
    }

    protected Set<String> mo255h() {
        return aks.f1148a;
    }

    protected Set<String> m2772i() {
        return aks.f1149b;
    }

    protected Set<String> m2773j() {
        return aks.f1150c;
    }

    protected Set<String> m2774k() {
        return aks.f1151d;
    }

    public void m2748a(akn akn) {
        this.f1141g.add(akn);
    }

    public void m2752a(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("InputStream must not be null.");
        }
        this.f1138d = new akq(new InputStreamReader(inputStream, this.f1135a));
        System.currentTimeMillis();
        for (akn a : this.f1141g) {
            a.mo237a();
        }
        do {
            synchronized (this) {
                if (this.f1142h) {
                    break;
                }
            }
        } while (m2746l());
        for (akn a2 : this.f1141g) {
            a2.mo239b();
        }
    }
}
