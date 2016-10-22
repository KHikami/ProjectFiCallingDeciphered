package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.List;

/* renamed from: cmn */
final class cmn implements OnItemClickListener {
    final /* synthetic */ cmm a;

    cmn(cmm cmm) {
        this.a = cmm;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        cmm cmm = this.a;
        glk.a("Babel_Stickers", "sticker pos=" + i, new Object[0]);
        cmq cmq = (cmq) ((cmr) cmm.c.getAdapter()).getItem(i);
        cmm.a(cmq.a, "Recent".equals(cmm.d));
        if (cmq.c != null) {
            str = "file://";
            String valueOf = String.valueOf(cmq.c);
            str = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } else {
            str = cmq.b;
        }
        Intent intent = new Intent();
        intent.putExtra("album_id", cmm.d);
        intent.putExtra("photo_url", str);
        intent.putExtra("picasa_photo_id", gwb.ad(cmq.a));
        cdg cdg = (cdg) cmm.binder.a(cdg.class);
        List arrayList = new ArrayList();
        byg byg = new byg();
        byg.c = bxo.STICKER;
        byg.g = cmm.d;
        byg.f = cmq.a;
        byg.b = str;
        byg.a = str;
        byg.d = gkd.a(cmm.context.getContentResolver(), Uri.parse(str), "image/*");
        arrayList.add(byg);
        cdg.a(arrayList);
        cmm.binder.a(cmg.class);
    }
}
