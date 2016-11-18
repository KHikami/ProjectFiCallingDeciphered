package p000;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

public class igw {
    public final GoogleHelp f17673a;
    public gyv f17674b;
    public boolean f17675c;

    public Intent m21765a(Context context) {
        if (this.f17675c) {
            throw new IllegalStateException("Cannot call buildHelpIntent twice");
        }
        this.f17675c = true;
        if (this.f17674b != null) {
            this.f17673a.m9754a(this.f17674b.mo2426a(), context.getCacheDir());
        }
        return this.f17673a.m9750a();
    }

    public igw m21768a(Account account) {
        this.f17673a.m9752a(account);
        return this;
    }

    public igw m21771a(Uri uri) {
        this.f17673a.m9753a(uri);
        return this;
    }

    public igw m21769a(Activity activity) {
        m21770a(GoogleHelp.m9749a(activity));
        return this;
    }

    public igw m21767a(int i, String str, Intent intent) {
        this.f17673a.m9751a(0, str, intent);
        return this;
    }

    public igw m21772a(Bundle bundle) {
        m21766a().m19003a(bundle);
        return this;
    }

    public igw m21774a(String str, String str2, byte[] bArr) {
        m21766a().m19006a(str, str2, bArr);
        return this;
    }

    public igw m21773a(iha iha) {
        this.f17673a.m9755a(new ThemeSettings().m9736b(iha.m21778a()).m9735a(iha.m21780b()));
        return this;
    }

    public igw(String str) {
        this.f17673a = new GoogleHelp(str);
    }

    public igw m21770a(Bitmap bitmap) {
        m21766a().m19002a(bitmap);
        return this;
    }

    public gyv m21766a() {
        if (this.f17674b == null) {
            this.f17674b = new gyv();
        }
        return this.f17674b;
    }
}
