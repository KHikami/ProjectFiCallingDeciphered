package p000;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class hxy extends gvg<hxw> implements gup {
    private final Status f17444b;

    public hxy(DataHolder dataHolder) {
        super(dataHolder);
        this.f17444b = new Status(dataHolder.m9682e());
    }

    private hxw m21204b(int i, int i2) {
        return new hze(this.f13937a, i, i2);
    }

    protected /* synthetic */ Object mo3045a(int i, int i2) {
        return m21204b(i, i2);
    }

    protected String mo3046f() {
        return "path";
    }

    public Status mo1279k() {
        return this.f17444b;
    }
}
