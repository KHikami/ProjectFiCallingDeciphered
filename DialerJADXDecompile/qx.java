import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

/* compiled from: PG */
public class qx extends Dialog implements qa {
    private qb a;

    protected void onCreate(Bundle bundle) {
        a().h();
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
        a().d();
    }

    public void invalidateOptionsMenu() {
        a().f();
    }

    public final qb a() {
        if (this.a == null) {
            this.a = qb.a(getContext(), getWindow(), this);
        }
        return this.a;
    }

    public qx(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(buf.N, typedValue, true);
            i = typedValue.resourceId;
        }
        super(context, i);
        a().a(null);
        a().i();
    }
}
