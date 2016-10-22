import android.net.Uri;
import com.google.android.gms.common.api.Status;

public final class ibv extends heb {
    final /* synthetic */ Uri a;
    final /* synthetic */ int b;
    final /* synthetic */ hxq c;

    public ibv(hxq hxq, gui gui, Uri uri, int i) {
        this.c = hxq;
        this.a = uri;
        this.b = i;
        super(gui, (short) 0);
    }

    private void a(iaw iaw) {
        iaw.b(this, this.a, this.b);
    }

    protected /* synthetic */ gup b(Status status) {
        return new hxt(status, 0);
    }
}
