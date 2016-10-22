package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: hxy */
public final class hxy extends gvg<hxw> implements gup {
    private final Status b;

    public hxy(DataHolder dataHolder) {
        super(dataHolder);
        this.b = new Status(dataHolder.e());
    }

    private hxw b(int i, int i2) {
        return new hze(this.a, i, i2);
    }

    protected /* synthetic */ Object a(int i, int i2) {
        return b(i, i2);
    }

    protected String f() {
        return "path";
    }

    public Status k() {
        return this.b;
    }
}
