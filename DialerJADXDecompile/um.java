import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewDebug.ExportedProperty;
import android.view.ViewGroup.LayoutParams;

/* compiled from: PG */
public final class um extends xq {
    @ExportedProperty
    public boolean a;
    @ExportedProperty
    public int b;
    @ExportedProperty
    public int c;
    @ExportedProperty
    public boolean d;
    @ExportedProperty
    public boolean e;
    public boolean f;

    public um(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public um(LayoutParams layoutParams) {
        super(layoutParams);
    }

    public um(um umVar) {
        super(umVar);
        this.a = umVar.a;
    }

    public um(int i, int i2) {
        super(-2, -2);
        this.a = false;
    }
}
