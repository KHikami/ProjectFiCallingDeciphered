package p000;

import android.content.Context;
import android.view.View;

public final class edr extends jbo {
    public edr(Context context) {
        super(context, gwb.yb);
    }

    public int getItemViewType(int i) {
        jbq jbq = (jbq) getItem(i);
        if (jbq instanceof jbt) {
            return 0;
        }
        if (jbq instanceof jbu) {
            return 1;
        }
        if (jbq instanceof eeg) {
            return 2;
        }
        String str = "Unsupported item: ";
        String valueOf = String.valueOf(jbq.getClass().getSimpleName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public int getViewTypeCount() {
        return 3;
    }

    protected void mo1840a(int i, Object obj) {
        jbq jbq = (jbq) getItem(i);
        if (jbq instanceof jbt) {
            jbt jbt = (jbt) jbq;
            eds eds = (eds) obj;
            eds.f11251a.setText(jbt.m23804d());
            eds.f11252b.setImageDrawable(jbt.m23806f());
            eds.f11252b.setVisibility(0);
            eds.f11253c.setVisibility(8);
        } else if (!(jbq instanceof jbu)) {
            if (jbq instanceof eeg) {
                ((edt) obj).f11254a.setText(((eeg) jbq).m13715c());
                return;
            }
            String str = "Unsupported item: ";
            String valueOf = String.valueOf(jbq.getClass().getSimpleName());
            throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    protected Object mo1839a(int i, View view) {
        jbq jbq = (jbq) getItem(i);
        if (jbq instanceof jbt) {
            return new eds(view);
        }
        if (jbq instanceof jbu) {
            return new edu();
        }
        if (jbq instanceof eeg) {
            return new edt(view);
        }
        String str = "Unsupported item: ";
        String valueOf = String.valueOf(jbq.getClass().getSimpleName());
        throw new IllegalStateException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
