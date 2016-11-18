package p000;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

public class mu implements Factory {
    public final mw f28330a;

    public mu(mw mwVar) {
        this.f28330a = mwVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return this.f28330a.mo1842a(null, str, context, attributeSet);
    }

    public String toString() {
        return getClass().getName() + "{" + this.f28330a + "}";
    }
}
