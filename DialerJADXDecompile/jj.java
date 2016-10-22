import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

/* compiled from: PG */
public class jj implements Factory {
    public final jl a;

    public jj(jl jlVar) {
        this.a = jlVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return this.a.a(null, str, context, attributeSet);
    }

    public String toString() {
        return getClass().getName() + "{" + this.a + "}";
    }
}
