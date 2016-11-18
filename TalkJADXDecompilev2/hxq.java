package defpackage;

import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;

public class hxq {
    public gum<hxr> a(gui gui, PutDataRequest putDataRequest) {
        return gui.a(new ibs(this, gui, putDataRequest));
    }

    public gum<hxy> a(gui gui) {
        return gui.a(new ibt(this, gui));
    }

    public gum<hxy> a(gui gui, Uri uri) {
        return a(gui, uri, 0);
    }

    public gum<hxt> b(gui gui, Uri uri) {
        return b(gui, uri, 0);
    }

    public gum<hxy> a(gui gui, Uri uri, int i) {
        gwb.b(uri != null, (Object) "uri must not be null");
        gwb.b(true, (Object) "invalid filter type");
        return gui.a(new ibu(this, gui, uri, 0));
    }

    public gum<hxt> b(gui gui, Uri uri, int i) {
        gwb.b(uri != null, (Object) "uri must not be null");
        gwb.b(true, (Object) "invalid filter type");
        return gui.a(new ibv(this, gui, uri, 0));
    }
}
