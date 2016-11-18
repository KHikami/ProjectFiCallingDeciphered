package p000;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;

public class agi {
    final ActionBar f608a;

    public void m1068a(boolean z) {
        this.f608a.setDisplayHomeAsUpEnabled(true);
    }

    public void m1067a(tr trVar) {
        this.f608a.addOnMenuVisibilityListener(new agj(this, trVar));
    }

    public void m1064a() {
        this.f608a.setDisplayOptions(8, 8);
    }

    public void m1066a(CharSequence charSequence) {
        this.f608a.setTitle(charSequence);
    }

    public void m1070b(CharSequence charSequence) {
        this.f608a.setSubtitle(charSequence);
    }

    public void m1069b() {
        this.f608a.show();
    }

    public void m1071c() {
        this.f608a.hide();
    }

    public void m1065a(Drawable drawable) {
        this.f608a.setLogo(drawable);
    }

    public agi(ActionBar actionBar) {
        this.f608a = actionBar;
    }
}
