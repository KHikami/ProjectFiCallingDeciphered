package p000;

import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.apps.hangouts.conversation.v2.gallerypicker.impl.GalleryItemView;
import java.util.ArrayList;
import java.util.List;

final class ckk implements OnClickListener {
    final /* synthetic */ int f5509a;
    final /* synthetic */ cki f5510b;

    ckk(cki cki, int i) {
        this.f5510b = cki;
        this.f5509a = i;
    }

    public void onClick(View view) {
        boolean z = true;
        cki cki = this.f5510b;
        View view2 = (View) view.getParent();
        int i = this.f5509a;
        GalleryItemView galleryItemView = (GalleryItemView) view2.findViewById(gwb.mE);
        cjs cjs = (cjs) cki.f5500d.a(i);
        if (!cjs.f5450h) {
            int i2;
            boolean z2;
            cju cju = cjs.f5444b;
            if (cju == cju.VIDEO) {
                i2 = 1;
            } else {
                i2 = 10;
            }
            if (cki.m7850a(cju) >= i2) {
                int i3;
                if (cju == cju.VIDEO) {
                    i3 = gwb.mK;
                } else {
                    i3 = gwb.mJ;
                }
                ((gai) jyn.m25426a(cki.f5498b, gai.class)).m7655a(new gah(cki.f5498b).m16814a(cki.f5498b.getResources().getQuantityString(i3, i2, new Object[]{Integer.valueOf(i2)})).m16811a());
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                if (cjs.f5444b == cju.IMAGE) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String str = cjs.f5443a;
                if (z2) {
                    ((cnh) jyn.m25426a(cki.f5498b, cnh.class)).m7968a(2321, i);
                } else {
                    iiq.m4948a(new ckl(cki, str, i));
                }
            } else {
                return;
            }
        }
        cjs.f5450h = !cjs.f5450h;
        galleryItemView.m8356a(view2, cjs, true);
        List arrayList = new ArrayList();
        List b = cki.m7856b();
        for (int i4 = 0; i4 < b.size(); i4++) {
            bxo bxo;
            cjs cjs2 = (cjs) b.get(i4);
            bxy bxy = new bxy();
            if (cjs2.f5444b == cju.IMAGE) {
                bxo = bxo.PHOTO;
            } else {
                bxo = bxo.VIDEO;
            }
            bxy.c = bxo;
            bxy.b = cjs2.f5443a;
            if (bxy.c == bxo.VIDEO) {
                bxy.a = cjs2.f5447e.toString();
                bxy.f4761j = cjs2.f5445c;
                bxy.d = cjs2.f5448f;
                bxy.f4757f = cjs2.f5452j;
                bxy.f4758g = cjs2.f5453k;
                bxy.f4760i = (int) cjs2.f5451i;
                bxy.f4759h = cjs2.f5454l;
            }
            arrayList.add(bxy);
        }
        if (b.size() <= 0) {
            z = false;
        }
        cki.m7857b(z);
        cki.f5499c.mo933a(cki.f5498b, arrayList, new cgt(b));
    }
}
