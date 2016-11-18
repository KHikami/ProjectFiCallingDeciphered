package p000;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.feedback.LogOptions;
import com.google.android.gms.feedback.ThemeSettings;
import java.util.ArrayList;

public class gyv {
    private Bitmap f16406a;
    private String f16407b;
    private Bundle f16408c = new Bundle();
    private String f16409d;
    private String f16410e;
    private ArrayList<FileTeleporter> f16411f = new ArrayList();
    private boolean f16412g;
    private ThemeSettings f16413h;
    private LogOptions f16414i;

    public FeedbackOptions mo2426a() {
        return FeedbackOptions.m9703a(new FeedbackOptions(), this.f16406a).f7426b = this.f16407b.f7428d = this.f16409d.f7427c = this.f16408c.f7430f = this.f16410e.f7433i = this.f16411f.f7434j = this.f16412g.f7435k = this.f16413h.f7436l = this.f16414i;
    }

    public gyv m19002a(Bitmap bitmap) {
        this.f16406a = bitmap;
        return this;
    }

    public gyv m19003a(Bundle bundle) {
        if (bundle != null) {
            this.f16408c.putAll(bundle);
        }
        return this;
    }

    public gyv m19004a(String str) {
        this.f16407b = str;
        return this;
    }

    public gyv m19005a(String str, String str2) {
        this.f16408c.putString(str, str2);
        return this;
    }

    public gyv m19006a(String str, String str2, byte[] bArr) {
        this.f16411f.add(new FileTeleporter(bArr, str2, str));
        return this;
    }

    public gyv m19007a(boolean z) {
        this.f16412g = z;
        return this;
    }

    public gyv m19008b(String str) {
        this.f16409d = str;
        return this;
    }

    public gyv m19009c(String str) {
        this.f16410e = str;
        return this;
    }
}
