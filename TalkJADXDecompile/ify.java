import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public abstract class ify extends Service {
    private iga a;

    public abstract int a(igi igi);

    public abstract ifz a();

    public void onCreate() {
        super.onCreate();
        this.a = a().a(this);
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        return this.a.a(intent, i2);
    }

    public IBinder onBind(Intent intent) {
        return null;
    }
}
