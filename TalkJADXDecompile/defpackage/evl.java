package defpackage;

/* renamed from: evl */
public class evl extends esw {
    private static final long serialVersionUID = 1;
    public final boolean c;
    public final String d;

    public evl(boolean z, String str) {
        this.c = z;
        this.d = str;
    }

    public nzf a(String str, int i, int i2) {
        int i3 = 1;
        if (a) {
            boolean z = this.c;
            String str2 = this.d;
            new StringBuilder(String.valueOf(str2).length() + 48).append("SetCallerIdRequest: enable=").append(z).append("e164PhoneNumber=").append(str2);
        }
        nzf lve = new lve();
        lve.requestHeader = euk.a(null, true, str, i, i2, this.i);
        lve.a = new lny[1];
        lve.a[0] = new lny();
        lve.a[0].a = new muu();
        lve.a[0].a.a = this.d;
        lny lny = lve.a[0];
        if (!this.c) {
            i3 = 2;
        }
        lny.b = Integer.valueOf(i3);
        return lve;
    }

    public String g() {
        return "contacts/setcalleridconfig";
    }
}
