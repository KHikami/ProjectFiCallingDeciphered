package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater.Factory;
import android.view.View;

public class mu implements Factory {
    public final mw a;

    public mu(mw mwVar) {
        this.a = mwVar;
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return this.a.a(null, str, context, attributeSet);
    }

    public String toString() {
        return getClass().getName() + "{" + this.a + "}";
    }
}
