package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

public final class jbr extends jbo {
    public jbr(Context context) {
        super(context, gwb.yb);
    }

    public int getItemViewType(int i) {
        return getItem(i) instanceof jbt ? 0 : 1;
    }

    public int getViewTypeCount() {
        return 2;
    }

    protected void a(int i, Object obj) {
        jbq jbq = (jbq) getItem(i);
        if (jbq instanceof jbt) {
            ColorStateList colorStateList;
            jbt jbt = (jbt) jbq;
            jbs jbs = (jbs) obj;
            jbs.a.setText(jbt.d());
            TextView textView = jbs.a;
            if (jbt.e() == null) {
                colorStateList = getContext().getResources().getColorStateList(gwb.xX);
            } else {
                colorStateList = jbt.e();
            }
            textView.setTextColor(colorStateList);
            if (jbt.f() == null) {
                jbs.b.setVisibility(8);
            } else {
                jbs.b.setImageDrawable(jbt.f());
                jbs.b.setVisibility(0);
            }
            if (jbt.g() == null) {
                jbs.c.setVisibility(8);
                return;
            }
            jbs.c.setImageDrawable(jbt.g());
            jbs.c.setVisibility(0);
        } else if (!(jbq instanceof jbu)) {
            String str = "Unsupported item: ";
            String valueOf = String.valueOf(jbq.getClass().getSimpleName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    protected Object a(int i, View view) {
        jbq jbq = (jbq) getItem(i);
        if (jbq instanceof jbt) {
            return new jbs(view);
        }
        if (jbq instanceof jbu) {
            return null;
        }
        String str = "Unsupported item: ";
        String valueOf = String.valueOf(jbq.getClass().getSimpleName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
