package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class vs extends Dialog implements ur {
    private us a;

    protected void onCreate(Bundle bundle) {
        a().j();
        super.onCreate(bundle);
        a().a(bundle);
    }

    public void setContentView(int i) {
        a().b(i);
    }

    public void setContentView(View view) {
        a().a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        a().a(view, layoutParams);
    }

    public View findViewById(int i) {
        return a().a(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        a().a(getContext().getString(i));
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        a().b(view, layoutParams);
    }

    protected void onStop() {
        super.onStop();
        a().e();
    }

    public boolean a(int i) {
        return a().c(1);
    }

    public void invalidateOptionsMenu() {
        a().g();
    }

    public us a() {
        if (this.a == null) {
            this.a = us.a(getContext(), getWindow(), this);
        }
        return this.a;
    }

    public void a(wx wxVar) {
    }

    public void b(wx wxVar) {
    }

    public vs(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(gwb.O, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        a().a(null);
        a().k();
    }
}
