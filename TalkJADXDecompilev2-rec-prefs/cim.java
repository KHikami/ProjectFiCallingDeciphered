package p000;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.hangouts.views.MessageListItemView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

final class cim {
    static final AtomicInteger f5383a = new AtomicInteger(0);
    private final Context f5384b;
    private dex f5385c;
    private cin f5386d;

    public cim(Context context) {
        this.f5384b = context;
        this.f5385c = (dex) jyn.m25426a(context, dex.class);
        if (!this.f5385c.mo1511c()) {
            this.f5386d = new cin(this, context);
        }
    }

    public void m7722a(Bundle bundle, fsi fsi, bko bko) {
        int i = 0;
        ArrayList parcelableArrayList;
        int size;
        if (this.f5385c.mo1511c()) {
            parcelableArrayList = bundle.getParcelableArrayList("save_media_attachments");
            size = parcelableArrayList.size();
            while (i < size) {
                Object obj = parcelableArrayList.get(i);
                i++;
                fyj fyj = (fyj) obj;
                if (ba.m4642g(fyj.f14387b)) {
                    this.f5385c.mo1506a(fyj.f14386a, new gjx(this.f5384b, fyj.f14387b), new azl());
                }
            }
            return;
        }
        Object obj2 = this.f5386d;
        parcelableArrayList = bundle.getParcelableArrayList("save_media_attachments");
        List arrayList = new ArrayList();
        int incrementAndGet = f5383a.incrementAndGet();
        ArrayList arrayList2 = parcelableArrayList;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i2 + 1;
            fyj fyj2 = (fyj) arrayList2.get(i2);
            if (ba.m4642g(fyj2.f14387b)) {
                gkc gkc = new gkc(fyj2.f14386a, bko.m5629a());
                gkc.m5560e(true);
                arrayList.add(new bnn(gkc, obj2, fyj2.f14387b, true, Integer.valueOf(incrementAndGet)));
            }
            i2 = i3;
        }
        if (!arrayList.isEmpty()) {
            obj2.f5387a.append(incrementAndGet, arrayList);
            parcelableArrayList = (ArrayList) arrayList;
            int size3 = parcelableArrayList.size();
            size = 0;
            while (size < size3) {
                obj = parcelableArrayList.get(size);
                size++;
                fsi.m12718c((frj) (fsr) obj);
            }
        }
    }

    public static void m7721a(eia eia, MessageListItemView messageListItemView) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(messageListItemView.m9493o());
        bundle.putParcelableArrayList("save_media_attachments", arrayList);
        eia.mo1886a(new eie(gwb.lw, 2666, bundle), Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"));
    }
}
