package p000;

import android.graphics.drawable.Drawable;

public class axj<T extends Drawable> implements aqr<T> {
    public final T f2478a;

    public axj(T t) {
        this.f2478a = (Drawable) gwb.m1404I((Object) t);
    }

    public /* synthetic */ Object mo346c() {
        return this.f2478a.getConstantState().newDrawable();
    }

    public axj(axo axo) {
        this((Drawable) axo);
    }

    public Class<axo> mo345b() {
        return axo.class;
    }

    public int mo347d() {
        return ((axo) this.f2478a).m4284a();
    }

    public void mo348e() {
        ((axo) this.f2478a).stop();
        ((axo) this.f2478a).m4291g();
    }
}
