package p000;

import java.text.SimpleDateFormat;
import java.util.Locale;

public final class fnd {
    public final int f13484a;
    public final String f13485b;
    public final String f13486c;
    public final int f13487d;
    public final String f13488e;
    public final boolean f13489f;
    public final long f13490g;

    public fnd(int i, String str, String str2, int i2, String str3, boolean z, long j) {
        this.f13484a = i;
        this.f13485b = str;
        this.f13486c = str2;
        this.f13487d = i2;
        this.f13488e = str3;
        this.f13489f = z;
        this.f13490g = j;
    }

    public String toString() {
        int i = this.f13484a;
        String str = this.f13485b;
        String str2 = this.f13486c;
        int i2 = this.f13487d;
        String str3 = this.f13488e;
        boolean z = this.f13489f;
        String valueOf = String.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault()).format(Long.valueOf(this.f13490g)));
        return new StringBuilder((((String.valueOf(str).length() + 142) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf).length()).append("AccountId: ").append(i).append(", FullJid: ").append(str).append(", Resource: ").append(str2).append(", Upgrade Type: ").append(i2).append(", UpgradeExplanationUrl: ").append(str3).append(", DesireIncomingPSTNCalls: ").append(z).append(", timestamp: ").append(valueOf).toString();
    }
}
