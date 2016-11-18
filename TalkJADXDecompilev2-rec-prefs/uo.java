package p000;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;

public final class uo extends vs implements DialogInterface {
    final uc f35298a = new uc(getContext(), this, getWindow());

    protected uo(Context context, int i) {
        super(context, uo.m40902a(context, i));
    }

    static int m40902a(Context context, int i) {
        if (i >= 16777216) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(gwb.D, typedValue, true);
        return typedValue.resourceId;
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f35298a.m40890a(charSequence);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f35298a.m40884a();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f35298a.m40891a(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f35298a.m40895b(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }
}
