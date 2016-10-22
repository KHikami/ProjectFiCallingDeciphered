import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.util.TypedValue;

public class hkm {
    public final Intent a;

    public hkm(String str) {
        this.a = new Intent(str);
        this.a.setPackage("com.google.android.gms");
    }

    protected Intent a(Activity activity) {
        Theme theme = activity.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        if (theme.resolveAttribute(16843827, typedValue, true) && !this.a.hasExtra("primary_color")) {
            this.a.putExtra("primary_color", typedValue.data);
        }
        if (theme.resolveAttribute(16843828, typedValue2, true) && !this.a.hasExtra("primary_color_dark")) {
            this.a.putExtra("primary_color_dark", typedValue2.data);
        }
        gtp.a.b((Context) activity);
        return this.a;
    }
}
