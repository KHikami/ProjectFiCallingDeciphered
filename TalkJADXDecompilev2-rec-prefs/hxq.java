package p000;

import android.net.Uri;
import com.google.android.gms.wearable.PutDataRequest;

public class hxq {
    public gum<hxr> m21193a(gui gui, PutDataRequest putDataRequest) {
        return gui.mo2510a(new ibs(this, gui, putDataRequest));
    }

    public gum<hxy> m21190a(gui gui) {
        return gui.mo2510a(new ibt(this, gui));
    }

    public gum<hxy> m21191a(gui gui, Uri uri) {
        return m21192a(gui, uri, 0);
    }

    public gum<hxt> m21194b(gui gui, Uri uri) {
        return m21195b(gui, uri, 0);
    }

    public gum<hxy> m21192a(gui gui, Uri uri, int i) {
        gwb.m2048b(uri != null, (Object) "uri must not be null");
        gwb.m2048b(true, (Object) "invalid filter type");
        return gui.mo2510a(new ibu(this, gui, uri, 0));
    }

    public gum<hxt> m21195b(gui gui, Uri uri, int i) {
        gwb.m2048b(uri != null, (Object) "uri must not be null");
        gwb.m2048b(true, (Object) "invalid filter type");
        return gui.mo2510a(new ibv(this, gui, uri, 0));
    }
}
