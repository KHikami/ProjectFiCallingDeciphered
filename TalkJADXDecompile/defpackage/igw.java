package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;

/* renamed from: igw */
public class igw {
    public final GoogleHelp a;
    public gyv b;
    public boolean c;

    public Intent a(Context context) {
        if (this.c) {
            throw new IllegalStateException("Cannot call buildHelpIntent twice");
        }
        this.c = true;
        if (this.b != null) {
            this.a.a(this.b.a(), context.getCacheDir());
        }
        return this.a.a();
    }

    public igw a(Account account) {
        this.a.a(account);
        return this;
    }

    public igw a(Uri uri) {
        this.a.a(uri);
        return this;
    }

    public igw a(Activity activity) {
        a(GoogleHelp.a(activity));
        return this;
    }

    public igw a(int i, String str, Intent intent) {
        this.a.a(0, str, intent);
        return this;
    }

    public igw a(Bundle bundle) {
        a().a(bundle);
        return this;
    }

    public igw a(String str, String str2, byte[] bArr) {
        a().a(str, str2, bArr);
        return this;
    }

    public igw a(iha iha) {
        this.a.a(new ThemeSettings().b(iha.a()).a(iha.b()));
        return this;
    }

    public igw(String str) {
        this.a = new GoogleHelp(str);
    }

    public igw a(Bitmap bitmap) {
        a().a(bitmap);
        return this;
    }

    public gyv a() {
        if (this.b == null) {
            this.b = new gyv();
        }
        return this.b;
    }
}
