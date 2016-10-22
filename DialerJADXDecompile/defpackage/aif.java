package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

/* compiled from: PG */
/* renamed from: aif */
public class aif {
    private static final String a;

    static {
        a = aif.class.getSimpleName();
    }

    public static boolean a(View view, adn adn, boolean z) {
        Context context = view.getContext();
        TextView textView = (TextView) view.findViewById(cob.k);
        if (adn == null) {
            Log.w(a, "Filter is null.");
        } else if (adn.a != -2) {
            if (adn.a == 0) {
                textView.setText(context.getString(buf.fy, new Object[]{adn.c}));
                return true;
            } else if (adn.a == -3) {
                textView.setText(buf.fz);
                return true;
            } else {
                Log.w(a, "Filter type \"" + adn.a + "\" isn't expected.");
                return false;
            }
        }
        return false;
    }
}
