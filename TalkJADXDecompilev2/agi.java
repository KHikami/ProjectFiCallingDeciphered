package defpackage;

import android.app.ActionBar;
import android.graphics.drawable.Drawable;

public class agi {
    final ActionBar a;

    public void a(boolean z) {
        this.a.setDisplayHomeAsUpEnabled(true);
    }

    public void a(tr trVar) {
        this.a.addOnMenuVisibilityListener(new agj(this, trVar));
    }

    public void a() {
        this.a.setDisplayOptions(8, 8);
    }

    public void a(CharSequence charSequence) {
        this.a.setTitle(charSequence);
    }

    public void b(CharSequence charSequence) {
        this.a.setSubtitle(charSequence);
    }

    public void b() {
        this.a.show();
    }

    public void c() {
        this.a.hide();
    }

    public void a(Drawable drawable) {
        this.a.setLogo(drawable);
    }

    public agi(ActionBar actionBar) {
        this.a = actionBar;
    }
}
