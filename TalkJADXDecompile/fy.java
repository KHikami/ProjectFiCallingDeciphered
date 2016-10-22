import android.app.Notification;

public final class fy {
    protected fy() {
    }

    public static Notification a(fx fxVar, fp fpVar) {
        Notification b = fpVar.b();
        if (fxVar.C != null) {
            b.contentView = fxVar.C;
        }
        return b;
    }
}
