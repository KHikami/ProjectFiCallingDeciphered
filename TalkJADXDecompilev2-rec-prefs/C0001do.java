package p000;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.View;

abstract class C0001do extends dn {
    C0001do() {
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View a = mo151a(view, str, context, attributeSet);
        if (a != null || VERSION.SDK_INT < 11) {
            return a;
        }
        return super.onCreateView(view, str, context, attributeSet);
    }
}
