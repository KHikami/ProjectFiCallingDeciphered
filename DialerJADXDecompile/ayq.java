import android.telecom.DisconnectCause;
import java.util.Locale;

/* compiled from: PG */
public final class ayq {
    public DisconnectCause a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public long f;
    public boolean g;

    public ayq() {
        this.b = false;
        this.c = 0;
        this.d = 12;
        this.e = 0;
        this.f = 0;
        this.g = false;
    }

    public final String toString() {
        String str;
        Locale locale = Locale.US;
        String str2 = "[%s, isIncoming: %s, contactLookup: %s, callInitiation: %s, duration: %s]";
        Object[] objArr = new Object[5];
        objArr[0] = this.a;
        objArr[1] = Boolean.valueOf(this.b);
        switch (this.c) {
            case rq.c /*2*/:
                str = "Local";
                break;
            case rl.e /*3*/:
                str = "Cache";
                break;
            case rl.f /*4*/:
                str = "Remote";
                break;
            case rl.g /*5*/:
                str = "Emergency";
                break;
            case rl.i /*6*/:
                str = "Voicemail";
                break;
            default:
                str = "Not found";
                break;
        }
        objArr[2] = str;
        switch (this.d) {
            case rq.b /*1*/:
                str = "Incoming";
                break;
            case rq.c /*2*/:
                str = "Dialpad";
                break;
            case rl.e /*3*/:
                str = "Speed Dial";
                break;
            case rl.f /*4*/:
                str = "Remote Directory";
                break;
            case rl.g /*5*/:
                str = "Smart Dial";
                break;
            case rl.i /*6*/:
                str = "Regular Search";
                break;
            case rl.h /*7*/:
                str = "Call Log";
                break;
            case rl.j /*8*/:
                str = "Call Log Filter";
                break;
            case rl.l /*9*/:
                str = "Voicemail Log";
                break;
            case rl.m /*10*/:
                str = "Call Details";
                break;
            case rl.n /*11*/:
                str = "Quick Contacts";
                break;
            default:
                str = "Unknown";
                break;
        }
        objArr[3] = str;
        objArr[4] = Long.valueOf(this.f);
        return String.format(locale, str2, objArr);
    }
}
