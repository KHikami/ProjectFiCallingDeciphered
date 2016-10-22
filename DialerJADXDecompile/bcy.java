import android.content.res.Resources;
import android.content.res.TypedArray;

/* compiled from: PG */
public final class bcy extends aiq {
    private final TypedArray a;
    private final TypedArray b;
    private final Resources c;

    public bcy(Resources resources) {
        super(resources);
        this.a = resources.obtainTypedArray(buf.jz);
        this.b = resources.obtainTypedArray(buf.jA);
        this.c = resources;
    }

    public final air a(int i) {
        if (i == 0) {
            Resources resources = this.c;
            return new air(resources.getColor(buf.jT), resources.getColor(buf.jU));
        }
        for (int i2 = 0; i2 < this.a.length(); i2++) {
            if (this.a.getColor(i2, 0) == i) {
                return new air(this.a.getColor(i2, 0), this.b.getColor(i2, 0));
            }
        }
        return super.a(i);
    }
}
