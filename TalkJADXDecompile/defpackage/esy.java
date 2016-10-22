package defpackage;

import ohu;
import oid;
import oif;

/* renamed from: esy */
public class esy extends esx {
    private static final long serialVersionUID = 1;
    private final String c;
    private final String d;
    private final String e;

    public esy(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public nzf a(String str, int i, int i2) {
        oid oid = new oid();
        oid.d = new oif();
        oid.d.a = this.c;
        oid.d.b = this.d;
        String str2 = this.c;
        String str3 = this.d;
        oid.a = new StringBuilder((String.valueOf(str2).length() + 1) + String.valueOf(str3).length()).append(str2).append(":").append(str3).toString();
        oid.b = new ohu();
        oid.b.a = this.e;
        return oid;
    }

    public boolean k() {
        return true;
    }

    public String g() {
        return "handoffnumbers/add";
    }
}
