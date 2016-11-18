package defpackage;

import android.graphics.drawable.Drawable;

public class axj<T extends Drawable> implements aqr<T> {
    public final T a;

    public axj(T t) {
        this.a = (Drawable) gwb.I((Object) t);
    }

    public /* synthetic */ Object c() {
        return this.a.getConstantState().newDrawable();
    }

    public axj(axo axo) {
        this((Drawable) axo);
    }

    public Class<axo> b() {
        return axo.class;
    }

    public int d() {
        return ((axo) this.a).a();
    }

    public void e() {
        ((axo) this.a).stop();
        ((axo) this.a).g();
    }
}
