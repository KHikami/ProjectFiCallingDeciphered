package p000;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import java.util.List;

public final class btv extends aer implements bxi {
    private final bxj f4437p;

    public void m6619a(List<edo> list) {
        this.f4437p.m6888a(list, true, "FocusGallery");
        this.a.setContentDescription(this.f4437p.m6887a());
    }

    public ViewGroup mo710v() {
        return this.f4437p.mo710v();
    }

    public btv(Context context, ViewGroup viewGroup) {
        super(LayoutInflater.from(context).inflate(ba.hD, viewGroup, false));
        this.f4437p = new bxj(context, this.a);
    }
}
