package p000;

import android.content.res.Resources;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.text.style.ForegroundColorSpan;

final class gbj implements TextWatcher {
    final /* synthetic */ gbg f14596a;

    gbj(gbg gbg) {
        this.f14596a = gbg;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        Resources resources = this.f14596a.f14584a.getResources();
        gbg gbg = this.f14596a;
        String obj = this.f14596a.f14588e.getText().toString();
        int codePointCount = obj.codePointCount(0, obj.length());
        String num = Integer.toString(codePointCount);
        CharSequence spannableString = new SpannableString(this.f14596a.f14584a.getString(bc.gj, new Object[]{Integer.valueOf(codePointCount), Integer.valueOf(140)}));
        gbg gbg2;
        Object obj2;
        if (codePointCount > 140) {
            int color = resources.getColor(gwb.er);
            this.f14596a.f14590g.setBackgroundColor(color);
            spannableString.setSpan(new ForegroundColorSpan(color), 0, num.length(), 33);
            this.f14596a.f14591h.setEnabled(false);
            CharSequence string = this.f14596a.f14584a.getString(bc.gl, new Object[]{Integer.valueOf(codePointCount), Integer.valueOf(140)});
            this.f14596a.f14589f.setContentDescription(string);
            gbg2 = this.f14596a;
            if (gbg2.f14592i != null && gbg2.f14592i.isEnabled() && gbg2.f14592i.isTouchExplorationEnabled()) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                this.f14596a.f14588e.setError(string);
            }
        } else {
            this.f14596a.f14590g.setBackgroundColor(resources.getColor(gwb.es));
            this.f14596a.f14591h.setEnabled(true);
            this.f14596a.f14589f.setContentDescription(this.f14596a.f14584a.getString(bc.gk, new Object[]{Integer.valueOf(codePointCount), Integer.valueOf(140)}));
            gbg2 = this.f14596a;
            if (gbg2.f14592i != null && gbg2.f14592i.isEnabled() && gbg2.f14592i.isTouchExplorationEnabled()) {
                obj2 = 1;
            } else {
                obj2 = null;
            }
            if (obj2 != null) {
                this.f14596a.f14588e.setError(null);
            }
        }
        this.f14596a.f14589f.setText(spannableString);
    }

    public void afterTextChanged(Editable editable) {
    }
}
