import android.app.Activity;
import android.net.Uri;
import java.io.FileNotFoundException;

/* compiled from: PG */
public final class arr extends asp {
    public static asp a;

    public arr(Activity activity) {
        super(activity);
    }

    protected final void a(asw asw) {
        avm avm = this.h;
        asz asz = asz.CHECK_FOR_CONTENT;
        avm.a(new ars(this, asw), new Void[0]);
    }

    protected final void a(Uri uri, boolean z) {
        if (!z) {
            b(uri);
        }
    }

    protected final boolean a(int i) {
        a(new FileNotFoundException("Voicemail archive file does not exist"));
        return false;
    }
}
