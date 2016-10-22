import android.app.Notification;
import android.os.Bundle;

public class gl {
    fx d;
    CharSequence e;
    CharSequence f;
    boolean g;

    public gl() {
        this.g = false;
    }

    public void a(fx fxVar) {
        if (this.d != fxVar) {
            this.d = fxVar;
            if (this.d != null) {
                this.d.a(this);
            }
        }
    }

    public Notification a() {
        if (this.d != null) {
            return this.d.b();
        }
        return null;
    }

    public void a(Bundle bundle) {
    }
}
