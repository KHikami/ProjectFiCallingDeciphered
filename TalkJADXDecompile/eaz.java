import android.content.Context;

public class eaz implements bhm {
    private static final boolean a;
    private final int b;

    static {
        kae kae = glk.o;
        a = false;
    }

    public eaz(int i) {
        this.b = i;
    }

    public int a(Context context, bhb bhb) {
        if (a) {
            new StringBuilder(65).append("FailedMessageUpdaterConcurrentTask runs for accountId ").append(this.b);
        }
        eax eax = eat.b;
        eax.a(context, this.b);
        return bhn.a;
    }
}
