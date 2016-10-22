package com.google.android.apps.hangouts.conversation.v2;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.EditText;
import chu;
import giw;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class MessageEditText extends EditText {
    private final Set<chu> a;

    public MessageEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new CopyOnWriteArraySet();
        if (VERSION.SDK_INT >= 21) {
            setShowSoftInputOnFocus(giw.d(context));
        }
    }

    public void a(chu chu) {
        this.a.add(chu);
    }

    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (this.a != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            boolean z = false;
            for (chu a : this.a) {
                boolean z2;
                if (a.a()) {
                    z2 = true;
                } else {
                    z2 = z;
                }
                z = z2;
            }
            if (z) {
                return true;
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    public boolean performClick() {
        super.performClick();
        if (this.a != null) {
            for (chu b : this.a) {
                b.b();
            }
        }
        return false;
    }

    protected void onSelectionChanged(int i, int i2) {
        super.onSelectionChanged(i, i2);
        if (this.a != null) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
    }
}
