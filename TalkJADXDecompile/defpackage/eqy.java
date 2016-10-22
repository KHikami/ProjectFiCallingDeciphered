package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ActionMode;
import android.widget.AbsListView.MultiChoiceModeListener;

/* renamed from: eqy */
public final class eqy {
    final era a;
    ActionMode b;
    private final MultiChoiceModeListener c;

    public eqy(era era) {
        this.a = era;
        this.c = new eqz(this);
    }

    public MultiChoiceModeListener a() {
        return this.c;
    }

    public void a(CharSequence charSequence) {
        if (this.b == null) {
            return;
        }
        if (charSequence != null) {
            CharSequence spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new ForegroundColorSpan(-1), 0, spannableString.length(), 33);
            this.b.setTitle(spannableString);
            return;
        }
        this.b.setTitle(null);
    }

    public void b() {
        if (this.b != null) {
            this.b.invalidate();
        }
    }

    public void c() {
        if (this.b != null) {
            this.b.finish();
        }
    }
}
