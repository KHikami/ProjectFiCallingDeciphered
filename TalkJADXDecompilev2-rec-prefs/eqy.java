package p000;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.ActionMode;
import android.widget.AbsListView.MultiChoiceModeListener;

public final class eqy {
    final era f12094a;
    ActionMode f12095b;
    private final MultiChoiceModeListener f12096c = new eqz(this);

    public eqy(era era) {
        this.f12094a = era;
    }

    public MultiChoiceModeListener m14292a() {
        return this.f12096c;
    }

    public void m14293a(CharSequence charSequence) {
        if (this.f12095b == null) {
            return;
        }
        if (charSequence != null) {
            CharSequence spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new ForegroundColorSpan(-1), 0, spannableString.length(), 33);
            this.f12095b.setTitle(spannableString);
            return;
        }
        this.f12095b.setTitle(null);
    }

    public void m14294b() {
        if (this.f12095b != null) {
            this.f12095b.invalidate();
        }
    }

    public void m14295c() {
        if (this.f12095b != null) {
            this.f12095b.finish();
        }
    }
}
