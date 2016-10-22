import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

public final class hxv extends gvg<hxu> implements gup {
    private final Status b;

    public hxv(DataHolder dataHolder) {
        super(dataHolder);
        this.b = new Status(dataHolder.e());
    }

    private hxu b(int i, int i2) {
        return new ibx(this.a, i, i2);
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
