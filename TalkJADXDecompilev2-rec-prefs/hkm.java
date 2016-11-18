package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.Theme;
import android.util.TypedValue;

public class hkm {
    public final Intent f17058a;

    public hkm(String str) {
        this.f17058a = new Intent(str);
        this.f17058a.setPackage("com.google.android.gms");
    }

    protected Intent mo2601a(Activity activity) {
        Theme theme = activity.getTheme();
        TypedValue typedValue = new TypedValue();
        TypedValue typedValue2 = new TypedValue();
        if (theme.resolveAttribute(16843827, typedValue, true) && !this.f17058a.hasExtra("primary_color")) {
            this.f17058a.putExtra("primary_color", typedValue.data);
        }
        if (theme.resolveAttribute(16843828, typedValue2, true) && !this.f17058a.hasExtra("primary_color_dark")) {
            this.f17058a.putExtra("primary_color_dark", typedValue2.data);
        }
        gtp.f16131a.m18551b((Context) activity);
        return this.f17058a;
    }
}
