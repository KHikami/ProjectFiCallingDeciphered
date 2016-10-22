package defpackage;

import android.app.ActivityManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.ArrayList;

/* renamed from: cmr */
final class cmr extends ArrayAdapter<cmq> {
    final /* synthetic */ cmm a;

    public void a() {
        for (int i = 0; i < getCount(); i++) {
            cmq cmq = (cmq) getItem(i);
            if (!(cmq == null || cmq.d == null)) {
                cmq.d.a();
                cmq.d = null;
            }
        }
    }

    public cmr(cmm cmm, ArrayList<cmq> arrayList) {
        this.a = cmm;
        super(cmm.getActivity(), 0, arrayList);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.a.getActivity().getLayoutInflater().inflate(gwb.nr, viewGroup, false);
        }
        cmq cmq = (cmq) getItem(i);
        ImageView imageView = (ImageView) view.findViewById(ba.jl);
        int integer;
        if (this.a.f.c()) {
            imageView.setContentDescription(cmx.a(this.a.getResources(), cmq.a));
            dex dex = this.a.f;
            String str = cmq.b;
            dey dey = this.a.g;
            cmm cmm = this.a;
            if (((ActivityManager) cmm.context.getSystemService("activity")).getMemoryClass() >= 192) {
                integer = cmm.getActivity().getResources().getInteger(gwb.no);
            } else {
                integer = cmm.getActivity().getResources().getInteger(gwb.np);
            }
            dex.a(str, imageView, dey.b(integer), null);
        } else if (i != gwb.a((Integer) imageView.getTag(), -1)) {
            gma gma = cmm.a;
            int i2 = cmm.b;
            cmm.b = i2 + 1;
            String b = gma.b("setImageItemWithBitmapCache_" + i2);
            imageView.setTag(Integer.valueOf(i));
            imageView.setContentDescription(cmx.a(this.a.getResources(), cmq.a));
            if (cmq.d != null) {
                cmr.a(imageView, cmq);
            } else {
                imageView.setImageResource(gwb.nm);
                imageView.setScaleType(ScaleType.CENTER);
                imageView.setAlpha(0.2f);
                integer = this.a.getActivity().getResources().getInteger(gwb.no);
                gkc b2 = new gkc(cmq.b, null).b(integer, integer);
                cmm cmm2 = this.a;
                if (((ActivityManager) cmm2.context.getSystemService("activity")).getMemoryClass() >= 192) {
                    integer = cmm2.getActivity().getResources().getInteger(gwb.no);
                } else {
                    integer = cmm2.getActivity().getResources().getInteger(gwb.np);
                }
                gkc a = b2.a(integer);
                a.b(cmq.a);
                ((fsi) this.a.binder.a(fsi.class)).a(new bon(((jca) this.a.binder.a(jca.class)).a(), a, cmq.c, new cms(this, cmq, i), true, imageView));
                cmm.a.c(b);
            }
        }
        return view;
    }

    static void a(ImageView imageView, cmq cmq) {
        if (cmq.d.b != null) {
            imageView.setImageBitmap(cmq.d.b.e());
            imageView.setScaleType(ScaleType.FIT_CENTER);
        } else if (cmq.d.a != null) {
            imageView.setImageDrawable(cmq.d.a);
            imageView.setScaleType(ScaleType.FIT_CENTER);
            cmq.d.a.a();
        } else {
            String str = "No cache item set:";
            String valueOf = String.valueOf(cmq.a);
            iil.a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        imageView.setAlpha(0.0f);
        imageView.animate().alpha(1.0f).setDuration(250).start();
    }
}
