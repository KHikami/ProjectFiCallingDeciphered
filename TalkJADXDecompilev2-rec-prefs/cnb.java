package p000;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.util.ArrayList;

final class cnb extends eo {
    int f5684a = 0;
    final /* synthetic */ cmy f5685b;
    private ArrayList<cne> f5686c = new ArrayList();
    private dr f5687d;

    void m7962d() {
        if (!this.f5685b.f5637g.mo1511c()) {
            ArrayList arrayList = this.f5686c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                cne cne = (cne) obj;
                if (cne.f5699g != null) {
                    cne.f5699g.m7965a();
                    cne.f5699g = null;
                }
            }
        }
        this.f5686c = new ArrayList();
    }

    public cnb(cmy cmy, ed edVar, dr drVar) {
        this.f5685b = cmy;
        super(edVar);
        this.f5687d = drVar;
        String c = cmy.m7917c();
        for (int i = 0; i < cmy.f5639i.size(); i++) {
            eyg eyg = (eyg) cmy.f5639i.get(i);
            cne cne = new cne(this);
            cne.f5693a = i;
            cne.f5697e = eyg.f12517c.f12521b;
            cne.f5696d = eyg.f12517c.f12520a;
            cne.f5698f = eyg.f12517c.f12522c;
            cne.f5695c = eyg.f12515a;
            cne.f5694b = eyg.f12516b;
            this.f5686c.add(cne);
            if (cne.f5695c.equals(c)) {
                this.f5684a = i;
            }
        }
    }

    public void m7963e() {
        ArrayList arrayList = this.f5686c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            cne cne = (cne) arrayList.get(i);
            if (this.f5685b.f5637g.mo1511c()) {
                m7960a(cne);
                i = i2;
            } else if ("Recent".equals(cne.f5695c)) {
                m7960a(cne);
                i = i2;
            } else {
                gkc a = new gkc(cne.f5697e, null).m5547a(this.f5685b.getResources().getInteger(gwb.no));
                a.m5538b(cne.f5696d);
                if (this.f5685b.f5636f.get(cne.f5696d) != null) {
                    String str = "Babel_StickersPagerFrag";
                    String str2 = "Canceling previous request for ";
                    String valueOf = String.valueOf(cne.f5696d);
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    glk.m17979c(str, valueOf, new Object[0]);
                    this.f5685b.f5635e.m12714b((frj) this.f5685b.f5636f.get(cne.f5696d));
                    this.f5685b.f5636f.remove(cne.f5696d);
                }
                frj bon = new bon(this.f5685b.f5634d.mo2317a(), a, cne.f5698f, new cnc(this, cne), true, this);
                this.f5685b.f5636f.put(cne.f5696d, bon);
                this.f5685b.f5635e.mo2072a(bon);
                i = i2;
            }
        }
    }

    void m7960a(cne cne) {
        if (this.f5685b.isAdded() && this.f5685b.f5632b != null) {
            View a = this.f5685b.f5632b.m8364a(cne.f5693a);
            if (a != null) {
                CharSequence string;
                Resources resources = this.f5685b.getResources();
                String str = cne.f5695c;
                if (cmx.f5674a.containsKey(str)) {
                    string = resources.getString(gwb.m1507a((Integer) cmx.f5674a.get(str)));
                } else {
                    string = resources.getString(bc.ra);
                }
                a.setContentDescription(string);
                ImageView imageView = (ImageView) a.findViewById(ba.jj);
                if (this.f5685b.f5637g.mo1511c()) {
                    if ("Recent".equals(cne.f5695c)) {
                        imageView.setImageResource(gwb.nn);
                        imageView.setScaleType(ScaleType.CENTER);
                    } else {
                        this.f5685b.f5637g.mo1505a(cne.f5697e, imageView, this.f5685b.f5638h.mo1518c(this.f5685b.getResources().getInteger(gwb.no)), null);
                    }
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(250).start();
                } else {
                    if (cne.f5699g != null && cne.f5699g.f5691b != null) {
                        imageView.setImageBitmap(cne.f5699g.f5691b.m17898e());
                        imageView.setScaleType(ScaleType.FIT_CENTER);
                    } else if (cne.f5699g != null && cne.f5699g.f5690a != null) {
                        imageView.setImageDrawable(cne.f5699g.f5690a);
                        imageView.setScaleType(ScaleType.FIT_CENTER);
                        cne.f5699g.f5690a.m18218a();
                    } else if ("Recent".equals(cne.f5695c)) {
                        imageView.setImageResource(gwb.nn);
                        imageView.setScaleType(ScaleType.CENTER);
                    } else {
                        String str2 = "No cache item set:";
                        String valueOf = String.valueOf(cne.f5695c);
                        iil.m21870a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(250).start();
                }
                ((TextView) a.findViewById(ba.jk)).setText(cne.f5694b);
            }
        }
    }

    public Object mo1006a(ViewGroup viewGroup, int i) {
        dr drVar = (dr) super.mo1006a(viewGroup, i);
        drVar.setTargetFragment(this.f5687d, 5);
        return drVar;
    }

    public dr mo1005a(int i) {
        String str = ((eyg) this.f5685b.f5639i.get(i)).f12515a;
        dr cmm = new cmm();
        Bundle bundle = new Bundle();
        bundle.putString("album_id", str);
        cmm.setArguments(bundle);
        return cmm;
    }

    public int m7957a() {
        return this.f5686c.size();
    }

    public CharSequence m7961c(int i) {
        if (this.f5686c.size() >= i) {
            return ((cne) this.f5686c.get(i)).f5694b;
        }
        return "";
    }
}
