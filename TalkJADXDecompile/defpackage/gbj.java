package defpackage;

import android.content.res.Resources;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;

/* renamed from: gbj */
final class gbj implements TextWatcher {
    final /* synthetic */ gbg a;

    gbj(gbg gbg) {
        this.a = gbg;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Resources resources = this.a.a.getResources();
        gbg gbg = this.a;
        String obj = this.a.e.getText().toString();
        int codePointCount = obj.codePointCount(0, obj.length());
        String num = Integer.toString(codePointCount);
        CharSequence spannableString = new SpannableString(this.a.a.getString(bc.gj, new Object[]{Integer.valueOf(codePointCount), Integer.valueOf(140)}));
        gbg gbg2;
        Object obj2;
        if (codePointCount > 140) {
            int color = resources.getColor(gwb.er);
            this.a.g.setBackgroundColor(color);
            spannableString.setSpan(new ForegroundColorSpan(color), 0, num.length(), 33);
            this.a.h.setEnabled(false);
            CharSequence string = this.a.a.getString(bc.gl, new Object[]{Integer.valueOf(codePointCount), Integer.valueOf(140)});
            this.a.f.setContentDescription(string);
            gbg2 = this.a;
            if (gbg2.i != null && gbg2.i.isEnabled() && gbg2.i.isTouchExplorationEnabled()) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                this.a.e.setError(string);
            }
        } else {
            this.a.g.setBackgroundColor(resources.getColor(gwb.es));
            this.a.h.setEnabled(true);
            this.a.f.setContentDescription(this.a.a.getString(bc.gk, new Object[]{Integer.valueOf(codePointCount), Integer.valueOf(140)}));
            gbg2 = this.a;
            if (gbg2.i != null && gbg2.i.isEnabled() && gbg2.i.isTouchExplorationEnabled()) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                this.a.e.setError(null);
            }
        }
        this.a.f.setText(spannableString);
    }

    public void afterTextChanged(Editable editable) {
    }
}
