package p000;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;

public final class agz implements fh<ahk> {
    final /* synthetic */ agp f694a;

    agz(agp agp) {
        this.f694a = agp;
    }

    public /* synthetic */ void onLoadFinished(ig igVar, Object obj) {
        m1174a(igVar, (ahk) obj);
    }

    public ig<ahk> onCreateLoader(int i, Bundle bundle) {
        String string = bundle.getString("image_uri");
        switch (i) {
            case 1:
                return this.f694a.mo172a(1, string);
            case 2:
                return this.f694a.mo172a(2, string);
            default:
                return null;
        }
    }

    private void m1174a(ig<ahk> igVar, ahk ahk) {
        Drawable a = ahk.m1322a(this.f694a.f661c.getResources());
        agi j = this.f694a.f661c.mo162j();
        switch (igVar.m1287p()) {
            case 1:
                if (a == null) {
                    j.m1065a(null);
                    return;
                } else {
                    j.m1065a(a);
                    return;
                }
            case 2:
                fh fhVar = this.f694a;
                if (!fhVar.f675q) {
                    if (fhVar.m1158i()) {
                        fhVar.f668j.setImageDrawable(a);
                    }
                    if (a != null) {
                        if (fhVar.f665g.getMeasuredWidth() == 0) {
                            View view = fhVar.f665g;
                            view.getViewTreeObserver().addOnGlobalLayoutListener(new agw(fhVar, view));
                        } else {
                            fhVar.m1167r();
                        }
                    }
                    fhVar.f661c.m1096f().mo1994a(100, null, fhVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void onLoaderReset(ig<ahk> igVar) {
    }
}
