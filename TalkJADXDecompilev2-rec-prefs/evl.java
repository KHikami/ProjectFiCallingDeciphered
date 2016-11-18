package p000;

public class evl extends esw {
    private static final long serialVersionUID = 1;
    public final boolean f12370c;
    public final String f12371d;

    public evl(boolean z, String str) {
        this.f12370c = z;
        this.f12371d = str;
    }

    public nzf mo1944a(String str, int i, int i2) {
        int i3 = 1;
        if (a) {
            boolean z = this.f12370c;
            String str2 = this.f12371d;
            new StringBuilder(String.valueOf(str2).length() + 48).append("SetCallerIdRequest: enable=").append(z).append("e164PhoneNumber=").append(str2);
        }
        nzf lve = new lve();
        lve.requestHeader = euk.m14557a(null, true, str, i, i2, this.i);
        lve.f26581a = new lny[1];
        lve.f26581a[0] = new lny();
        lve.f26581a[0].f25839a = new muu();
        lve.f26581a[0].f25839a.f28411a = this.f12371d;
        lny lny = lve.f26581a[0];
        if (!this.f12370c) {
            i3 = 2;
        }
        lny.f25840b = Integer.valueOf(i3);
        return lve;
    }

    public String mo1947g() {
        return "contacts/setcalleridconfig";
    }
}
