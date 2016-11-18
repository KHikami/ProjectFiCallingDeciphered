package p000;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import java.util.ArrayList;
import java.util.List;

final class cmn implements OnItemClickListener {
    final /* synthetic */ cmm f5651a;

    cmn(cmm cmm) {
        this.f5651a = cmm;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        String str;
        cmm cmm = this.f5651a;
        glk.m17970a("Babel_Stickers", "sticker pos=" + i, new Object[0]);
        cmq cmq = (cmq) ((cmr) cmm.f5646c.getAdapter()).getItem(i);
        cmm.m7928a(cmq.f5656a, "Recent".equals(cmm.f5647d));
        if (cmq.f5658c != null) {
            str = "file://";
            String valueOf = String.valueOf(cmq.f5658c);
            str = valueOf.length() != 0 ? str.concat(valueOf) : new String(str);
        } else {
            str = cmq.f5657b;
        }
        Intent intent = new Intent();
        intent.putExtra("album_id", cmm.f5647d);
        intent.putExtra("photo_url", str);
        intent.putExtra("picasa_photo_id", gwb.ad(cmq.f5656a));
        cdg cdg = (cdg) cmm.binder.m25443a(cdg.class);
        List arrayList = new ArrayList();
        byg byg = new byg();
        byg.c = bxo.STICKER;
        byg.f4768g = cmm.f5647d;
        byg.f4767f = cmq.f5656a;
        byg.b = str;
        byg.a = str;
        byg.d = gkd.m17874a(cmm.context.getContentResolver(), Uri.parse(str), "image/*");
        arrayList.add(byg);
        cdg.mo840a(arrayList);
        cmm.binder.m25443a(cmg.class);
    }
}
