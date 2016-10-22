package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

/* renamed from: gyv */
public class gyv {
    private Bitmap a;
    private String b;
    private Bundle c;
    private String d;
    private String e;
    private ArrayList<FileTeleporter> f;
    private boolean g;
    private ThemeSettings h;
    private LogOptions i;

    public gyv() {
        this.c = new Bundle();
        this.f = new ArrayList();
    }

    public FeedbackOptions a() {
        return FeedbackOptions.a(new FeedbackOptions(), this.a).b = this.b.d = this.d.c = this.c.f = this.e.i = this.f.j = this.g.k = this.h.l = this.i;
    }

    public gyv a(Bitmap bitmap) {
        this.a = bitmap;
        return this;
    }

    public gyv a(Bundle bundle) {
        if (bundle != null) {
            this.c.putAll(bundle);
        }
        return this;
    }

    public gyv a(String str) {
        this.b = str;
        return this;
    }

    public gyv a(String str, String str2) {
        this.c.putString(str, str2);
        return this;
    }

    public gyv a(String str, String str2, byte[] bArr) {
        this.f.add(new FileTeleporter(bArr, str2, str));
        return this;
    }

    public gyv a(boolean z) {
        this.g = z;
        return this;
    }

    public gyv b(String str) {
        this.d = str;
        return this;
    }

    public gyv c(String str) {
        this.e = str;
        return this;
    }
}
