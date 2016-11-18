package p000;

import android.app.ActivityManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import java.util.ArrayList;

final class cmr extends ArrayAdapter<cmq> {
    final /* synthetic */ cmm f5661a;

    public void m7933a() {
        for (int i = 0; i < getCount(); i++) {
            cmq cmq = (cmq) getItem(i);
            if (!(cmq == null || cmq.f5659d == null)) {
                cmq.f5659d.m7929a();
                cmq.f5659d = null;
            }
        }
    }

    public cmr(cmm cmm, ArrayList<cmq> arrayList) {
        this.f5661a = cmm;
        super(cmm.getActivity(), 0, arrayList);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f5661a.getActivity().getLayoutInflater().inflate(gwb.nr, viewGroup, false);
        }
        cmq cmq = (cmq) getItem(i);
        ImageView imageView = (ImageView) view.findViewById(ba.jl);
        int integer;
        if (this.f5661a.f5649f.mo1511c()) {
            imageView.setContentDescription(cmx.m7943a(this.f5661a.getResources(), cmq.f5656a));
            dex dex = this.f5661a.f5649f;
            String str = cmq.f5657b;
            dey dey = this.f5661a.f5650g;
            cmm cmm = this.f5661a;
            if (((ActivityManager) cmm.context.getSystemService("activity")).getMemoryClass() >= 192) {
                integer = cmm.getActivity().getResources().getInteger(gwb.no);
            } else {
                integer = cmm.getActivity().getResources().getInteger(gwb.np);
            }
            dex.mo1505a(str, imageView, dey.mo1516b(integer), null);
        } else if (i != gwb.m1508a((Integer) imageView.getTag(), -1)) {
            gma gma = cmm.f5644a;
            int i2 = cmm.f5645b;
            cmm.f5645b = i2 + 1;
            String b = gma.m18078b("setImageItemWithBitmapCache_" + i2);
            imageView.setTag(Integer.valueOf(i));
            imageView.setContentDescription(cmx.m7943a(this.f5661a.getResources(), cmq.f5656a));
            if (cmq.f5659d != null) {
                cmr.m7932a(imageView, cmq);
            } else {
                imageView.setImageResource(gwb.nm);
                imageView.setScaleType(ScaleType.CENTER);
                imageView.setAlpha(0.2f);
                integer = this.f5661a.getActivity().getResources().getInteger(gwb.no);
                gkc b2 = new gkc(cmq.f5657b, null).m5554b(integer, integer);
                cmm cmm2 = this.f5661a;
                if (((ActivityManager) cmm2.context.getSystemService("activity")).getMemoryClass() >= 192) {
                    integer = cmm2.getActivity().getResources().getInteger(gwb.no);
                } else {
                    integer = cmm2.getActivity().getResources().getInteger(gwb.np);
                }
                gkc a = b2.m5547a(integer);
                a.m5538b(cmq.f5656a);
                ((fsi) this.f5661a.binder.m25443a(fsi.class)).mo2072a(new bon(((jca) this.f5661a.binder.m25443a(jca.class)).mo2317a(), a, cmq.f5658c, new cms(this, cmq, i), true, imageView));
                cmm.f5644a.m18079c(b);
            }
        }
        return view;
    }

    static void m7932a(ImageView imageView, cmq cmq) {
        if (cmq.f5659d.f5653b != null) {
            imageView.setImageBitmap(cmq.f5659d.f5653b.m17898e());
            imageView.setScaleType(ScaleType.FIT_CENTER);
        } else if (cmq.f5659d.f5652a != null) {
            imageView.setImageDrawable(cmq.f5659d.f5652a);
            imageView.setScaleType(ScaleType.FIT_CENTER);
            cmq.f5659d.f5652a.m18218a();
        } else {
            String str = "No cache item set:";
            String valueOf = String.valueOf(cmq.f5656a);
            iil.m21870a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        imageView.setAlpha(0.0f);
        imageView.animate().alpha(1.0f).setDuration(250).start();
    }
}
