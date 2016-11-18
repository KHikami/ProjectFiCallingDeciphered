package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class hxv extends gvg<hxu> implements gup {
    private final Status f17443b;

    public hxv(DataHolder dataHolder) {
        super(dataHolder);
        this.f17443b = new Status(dataHolder.m9682e());
    }

    private hxu m21200b(int i, int i2) {
        return new ibx(this.f13937a, i, i2);
    }

    protected /* synthetic */ Object mo3045a(int i, int i2) {
        return m21200b(i, i2);
    }

    protected String mo3046f() {
        return "path";
    }

    public Status mo1279k() {
        return this.f17443b;
    }
}
