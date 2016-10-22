import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

final class cda extends ContentObserver {
    final /* synthetic */ ccz a;

    cda(ccz ccz, Handler handler) {
        this.a = ccz;
        super(handler);
    }

    public void onChange(boolean z) {
        onChange(z, null);
    }

    public void onChange(boolean z, Uri uri) {
        this.a.c();
    }
}
