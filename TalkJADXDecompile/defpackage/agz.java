package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

/* renamed from: agz */
public final class agz implements fh<ahk> {
    final /* synthetic */ agp a;

    agz(agp agp) {
        this.a = agp;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        a(igVar, (ahk) obj);
    }

    public ig<ahk> onCreateLoader(int i, Bundle bundle) {
        String string = bundle.getString("image_uri");
        switch (i) {
            case wi.j /*1*/:
                return this.a.a(1, string);
            case wi.l /*2*/:
                return this.a.a(2, string);
            default:
                return null;
        }
    }

    private void a(ig<ahk> igVar, ahk ahk) {
        Drawable a = ahk.a(this.a.c.getResources());
        agi j = this.a.c.j();
        switch (igVar.p()) {
            case wi.j /*1*/:
                if (a == null) {
                    j.a(null);
                } else {
                    j.a(a);
                }
            case wi.l /*2*/:
                fh fhVar = this.a;
                if (!fhVar.q) {
                    if (fhVar.i()) {
                        fhVar.j.setImageDrawable(a);
                    }
                    if (a != null) {
                        if (fhVar.g.getMeasuredWidth() == 0) {
                            View view = fhVar.g;
                            view.getViewTreeObserver().addOnGlobalLayoutListener(new agw(fhVar, view));
                        } else {
                            fhVar.r();
                        }
                    }
                    fhVar.c.f().a(100, null, fhVar);
                }
            default:
        }
    }

    public void onLoaderReset(ig<ahk> igVar) {
    }
}
