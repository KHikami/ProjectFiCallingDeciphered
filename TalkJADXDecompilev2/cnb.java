package defpackage;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.TextView;
import java.util.ArrayList;

final class cnb extends eo {
    int a = 0;
    final /* synthetic */ cmy b;
    private ArrayList<cne> c = new ArrayList();
    private dr d;

    void d() {
        if (!this.b.g.c()) {
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                cne cne = (cne) obj;
                if (cne.g != null) {
                    cne.g.a();
                    cne.g = null;
                }
            }
        }
        this.c = new ArrayList();
    }

    public cnb(cmy cmy, ed edVar, dr drVar) {
        this.b = cmy;
        super(edVar);
        this.d = drVar;
        String c = cmy.c();
        for (int i = 0; i < cmy.i.size(); i++) {
            eyg eyg = (eyg) cmy.i.get(i);
            cne cne = new cne(this);
            cne.a = i;
            cne.e = eyg.c.b;
            cne.d = eyg.c.a;
            cne.f = eyg.c.c;
            cne.c = eyg.a;
            cne.b = eyg.b;
            this.c.add(cne);
            if (cne.c.equals(c)) {
                this.a = i;
            }
        }
    }

    public void e() {
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            cne cne = (cne) arrayList.get(i);
            if (this.b.g.c()) {
                a(cne);
                i = i2;
            } else if ("Recent".equals(cne.c)) {
                a(cne);
                i = i2;
            } else {
                gkc a = new gkc(cne.e, null).a(this.b.getResources().getInteger(gwb.no));
                a.b(cne.d);
                if (this.b.f.get(cne.d) != null) {
                    String str = "Babel_StickersPagerFrag";
                    String str2 = "Canceling previous request for ";
                    String valueOf = String.valueOf(cne.d);
                    if (valueOf.length() != 0) {
                        valueOf = str2.concat(valueOf);
                    } else {
                        valueOf = new String(str2);
                    }
                    glk.c(str, valueOf, new Object[0]);
                    this.b.e.b((frj) this.b.f.get(cne.d));
                    this.b.f.remove(cne.d);
                }
                frj bon = new bon(this.b.d.a(), a, cne.f, new cnc(this, cne), true, this);
                this.b.f.put(cne.d, bon);
                this.b.e.a(bon);
                i = i2;
            }
        }
    }

    void a(cne cne) {
        if (this.b.isAdded() && this.b.b != null) {
            View a = this.b.b.a(cne.a);
            if (a != null) {
                CharSequence string;
                Resources resources = this.b.getResources();
                String str = cne.c;
                if (cmx.a.containsKey(str)) {
                    string = resources.getString(gwb.a((Integer) cmx.a.get(str)));
                } else {
                    string = resources.getString(bc.ra);
                }
                a.setContentDescription(string);
                ImageView imageView = (ImageView) a.findViewById(ba.jj);
                if (this.b.g.c()) {
                    if ("Recent".equals(cne.c)) {
                        imageView.setImageResource(gwb.nn);
                        imageView.setScaleType(ScaleType.CENTER);
                    } else {
                        this.b.g.a(cne.e, imageView, this.b.h.c(this.b.getResources().getInteger(gwb.no)), null);
                    }
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(250).start();
                } else {
                    if (cne.g != null && cne.g.b != null) {
                        imageView.setImageBitmap(cne.g.b.e());
                        imageView.setScaleType(ScaleType.FIT_CENTER);
                    } else if (cne.g != null && cne.g.a != null) {
                        imageView.setImageDrawable(cne.g.a);
                        imageView.setScaleType(ScaleType.FIT_CENTER);
                        cne.g.a.a();
                    } else if ("Recent".equals(cne.c)) {
                        imageView.setImageResource(gwb.nn);
                        imageView.setScaleType(ScaleType.CENTER);
                    } else {
                        String str2 = "No cache item set:";
                        String valueOf = String.valueOf(cne.c);
                        iil.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2));
                    }
                    imageView.setAlpha(0.0f);
                    imageView.animate().alpha(1.0f).setDuration(250).start();
                }
                ((TextView) a.findViewById(ba.jk)).setText(cne.b);
            }
        }
    }

    public Object a(ViewGroup viewGroup, int i) {
        dr drVar = (dr) super.a(viewGroup, i);
        drVar.setTargetFragment(this.d, 5);
        return drVar;
    }

    public dr a(int i) {
        String str = ((eyg) this.b.i.get(i)).a;
        dr cmm = new cmm();
        Bundle bundle = new Bundle();
        bundle.putString("album_id", str);
        cmm.setArguments(bundle);
        return cmm;
    }

    public int a() {
        return this.c.size();
    }

    public CharSequence c(int i) {
        if (this.c.size() >= i) {
            return ((cne) this.c.get(i)).b;
        }
        return "";
    }
}
