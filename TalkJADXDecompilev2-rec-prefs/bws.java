package p000;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicInteger;

final class bws {
    private static final AtomicInteger f4673a = new AtomicInteger(0);
    private final Context f4674b;
    private dex f4675c;

    public bws(Context context) {
        this.f4674b = context;
        this.f4675c = (dex) jyn.m25426a(context, dex.class);
    }

    public void m6832a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("save_media_attachments");
        int size = parcelableArrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = parcelableArrayList.get(i);
            i++;
            bta bta = (bta) obj;
            if (ba.m4642g(bta.f4367j)) {
                this.f4675c.mo1506a(bta.m6575b(), new gjx(this.f4674b, bta.f4367j), new azl());
            }
        }
    }

    public void m6833a(eia eia, bta bta) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(bta);
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("save_media_attachments", arrayList);
        eia.mo1886a(new eie(bm.f3848x, 2666, bundle), Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"));
    }
}
