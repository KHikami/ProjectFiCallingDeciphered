package defpackage;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bws */
final class bws {
    private static final AtomicInteger a;
    private final Context b;
    private dex c;

    static {
        a = new AtomicInteger(0);
    }

    public bws(Context context) {
        this.b = context;
        this.c = (dex) jyn.a(context, dex.class);
    }

    public void a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("save_media_attachments");
        int size = parcelableArrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = parcelableArrayList.get(i);
            i++;
            bta bta = (bta) obj;
            if (ba.g(bta.j)) {
                this.c.a(bta.b(), new gjx(this.b, bta.j), new azl());
            }
        }
    }

    public void a(eia eia, bta bta) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bta);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("save_media_attachments", arrayList);
        eia.a(new eie(bm.x, 2666, bundle), Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"));
    }
}
