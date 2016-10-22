import java.text.SimpleDateFormat;
import java.util.Locale;

public final class fnd {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final long g;

    public fnd(int i, String str, String str2, int i2, String str3, boolean z, long j) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = z;
        this.g = j;
    }

    public String toString() {
        int i = this.a;
        String str = this.b;
        String str2 = this.c;
        int i2 = this.d;
        String str3 = this.e;
        boolean z = this.f;
        String valueOf = String.valueOf(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSSZ", Locale.getDefault()).format(Long.valueOf(this.g)));
        return new StringBuilder((((String.valueOf(str).length() + 142) + String.valueOf(str2).length()) + String.valueOf(str3).length()) + String.valueOf(valueOf).length()).append("AccountId: ").append(i).append(", FullJid: ").append(str).append(", Resource: ").append(str2).append(", Upgrade Type: ").append(i2).append(", UpgradeExplanationUrl: ").append(str3).append(", DesireIncomingPSTNCalls: ").append(z).append(", timestamp: ").append(valueOf).toString();
    }
}
