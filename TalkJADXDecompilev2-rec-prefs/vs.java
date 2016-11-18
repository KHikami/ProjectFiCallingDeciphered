package p000;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class vs extends Dialog implements ur {
    private us f35297a;

    protected void onCreate(Bundle bundle) {
        m40898a().mo4430j();
        super.onCreate(bundle);
        m40898a().mo4413a(bundle);
    }

    public void setContentView(int i) {
        m40898a().mo4421b(i);
    }

    public void setContentView(View view) {
        m40898a().mo4415a(view);
    }

    public void setContentView(View view, LayoutParams layoutParams) {
        m40898a().mo4416a(view, layoutParams);
    }

    public View findViewById(int i) {
        return m40898a().mo4410a(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m40898a().mo4395a(charSequence);
    }

    public void setTitle(int i) {
        super.setTitle(i);
        m40898a().mo4395a(getContext().getString(i));
    }

    public void addContentView(View view, LayoutParams layoutParams) {
        m40898a().mo4422b(view, layoutParams);
    }

    protected void onStop() {
        super.onStop();
        m40898a().mo4399e();
    }

    public boolean m40900a(int i) {
        return m40898a().mo4425c(1);
    }

    public void invalidateOptionsMenu() {
        m40898a().mo4429g();
    }

    public us m40898a() {
        if (this.f35297a == null) {
            this.f35297a = us.m40920a(getContext(), getWindow(), this);
        }
        return this.f35297a;
    }

    public void m40899a(wx wxVar) {
    }

    public void m40901b(wx wxVar) {
    }

    public vs(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(gwb.O, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        m40898a().mo4413a(null);
        m40898a().mo4402k();
    }
}
