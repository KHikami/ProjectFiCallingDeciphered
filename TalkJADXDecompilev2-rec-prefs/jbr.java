package p000;

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

    protected void mo1840a(int i, Object obj) {
        jbq jbq = (jbq) getItem(i);
        if (jbq instanceof jbt) {
            ColorStateList colorStateList;
            jbt jbt = (jbt) jbq;
            jbs jbs = (jbs) obj;
            jbs.f19728a.setText(jbt.m23804d());
            TextView textView = jbs.f19728a;
            if (jbt.m23805e() == null) {
                colorStateList = getContext().getResources().getColorStateList(gwb.xX);
            } else {
                colorStateList = jbt.m23805e();
            }
            textView.setTextColor(colorStateList);
            if (jbt.m23806f() == null) {
                jbs.f19729b.setVisibility(8);
            } else {
                jbs.f19729b.setImageDrawable(jbt.m23806f());
                jbs.f19729b.setVisibility(0);
            }
            if (jbt.m23807g() == null) {
                jbs.f19730c.setVisibility(8);
                return;
            }
            jbs.f19730c.setImageDrawable(jbt.m23807g());
            jbs.f19730c.setVisibility(0);
        } else if (!(jbq instanceof jbu)) {
            String str = "Unsupported item: ";
            String valueOf = String.valueOf(jbq.getClass().getSimpleName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    protected Object mo1839a(int i, View view) {
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
