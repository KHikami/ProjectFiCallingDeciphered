package defpackage;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl.GalleryItemView;
import java.util.ArrayList;
import java.util.List;

final class ckk implements OnClickListener {
    final /* synthetic */ int a;
    final /* synthetic */ cki b;

    ckk(cki cki, int i) {
        this.b = cki;
        this.a = i;
    }

    public void onClick(View view) {
        boolean z = true;
        cki cki = this.b;
        View view2 = (View) view.getParent();
        int i = this.a;
        GalleryItemView galleryItemView = (GalleryItemView) view2.findViewById(gwb.mE);
        cjs cjs = (cjs) cki.d.a(i);
        if (!cjs.h) {
            int i2;
            boolean z2;
            cju cju = cjs.b;
            if (cju == cju.VIDEO) {
                i2 = 1;
            } else {
                i2 = 10;
            }
            if (cki.a(cju) >= i2) {
                int i3;
                if (cju == cju.VIDEO) {
                    i3 = gwb.mK;
                } else {
                    i3 = gwb.mJ;
                }
                ((gai) jyn.a(cki.b, gai.class)).a(new gah(cki.b).a(cki.b.getResources().getQuantityString(i3, i2, new Object[]{Integer.valueOf(i2)})).a());
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (cjs.b == cju.IMAGE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str = cjs.a;
                if (z2) {
                    ((cnh) jyn.a(cki.b, cnh.class)).a(2321, i);
                } else {
                    iiq.a(new ckl(cki, str, i));
                }
            } else {
                return;
            }
        }
        cjs.h = !cjs.h;
        galleryItemView.a(view2, cjs, true);
        List arrayList = new ArrayList();
        List b = cki.b();
        for (int i4 = 0; i4 < b.size(); i4++) {
            bxo bxo;
            cjs cjs2 = (cjs) b.get(i4);
            bxy bxy = new bxy();
            if (cjs2.b == cju.IMAGE) {
                bxo = bxo.PHOTO;
            } else {
                bxo = bxo.VIDEO;
            }
            bxy.c = bxo;
            bxy.b = cjs2.a;
            if (bxy.c == bxo.VIDEO) {
                bxy.a = cjs2.e.toString();
                bxy.j = cjs2.c;
                bxy.d = cjs2.f;
                bxy.f = cjs2.j;
                bxy.g = cjs2.k;
                bxy.i = (int) cjs2.i;
                bxy.h = cjs2.l;
            }
            arrayList.add(bxy);
        }
        if (b.size() <= 0) {
            z = false;
        }
        cki.b(z);
        cki.c.a(cki.b, arrayList, new cgt(b));
    }
}
