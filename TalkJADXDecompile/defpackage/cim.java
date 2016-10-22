package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.apps.hangouts.views.MessageListItemView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cim */
final class cim {
    static final AtomicInteger a;
    private final Context b;
    private dex c;
    private cin d;

    static {
        a = new AtomicInteger(0);
    }

    public cim(Context context) {
        this.b = context;
        this.c = (dex) jyn.a(context, dex.class);
        if (!this.c.c()) {
            this.d = new cin(this, context);
        }
    }

    public void a(Bundle bundle, fsi fsi, bko bko) {
        int i = 0;
        ArrayList parcelableArrayList;
        int size;
        if (this.c.c()) {
            parcelableArrayList = bundle.getParcelableArrayList("save_media_attachments");
            size = parcelableArrayList.size();
            while (i < size) {
                Object obj = parcelableArrayList.get(i);
                i++;
                fyj fyj = (fyj) obj;
                if (ba.g(fyj.b)) {
                    this.c.a(fyj.a, new gjx(this.b, fyj.b), new azl());
                }
            }
            return;
        }
        Object obj2 = this.d;
        parcelableArrayList = bundle.getParcelableArrayList("save_media_attachments");
        List arrayList = new ArrayList();
        int incrementAndGet = a.incrementAndGet();
        ArrayList arrayList2 = parcelableArrayList;
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            int i3 = i2 + 1;
            fyj fyj2 = (fyj) arrayList2.get(i2);
            if (ba.g(fyj2.b)) {
                gkc gkc = new gkc(fyj2.a, bko.a());
                gkc.e(true);
                arrayList.add(new bnn(gkc, obj2, fyj2.b, true, Integer.valueOf(incrementAndGet)));
            }
            i2 = i3;
        }
        if (!arrayList.isEmpty()) {
            obj2.a.append(incrementAndGet, arrayList);
            parcelableArrayList = (ArrayList) arrayList;
            int size3 = parcelableArrayList.size();
            size = 0;
            while (size < size3) {
                obj = parcelableArrayList.get(size);
                size++;
                fsi.c((frj) (fsr) obj);
            }
        }
    }

    public static void a(eia eia, MessageListItemView messageListItemView) {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(messageListItemView.o());
        bundle.putParcelableArrayList("save_media_attachments", arrayList);
        eia.a(new eie(gwb.lw, 2666, bundle), Collections.singletonList("android.permission.WRITE_EXTERNAL_STORAGE"));
    }
}
