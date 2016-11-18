package p000;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;
import java.util.Locale;

public final class epm extends AsyncTask<Uri, Void, Uri> {
    int f11990a = this.f11991b.f6705n.mo2317a();
    final /* synthetic */ ViewVCardActivity f11991b;

    public epm(ViewVCardActivity viewVCardActivity) {
        this.f11991b = viewVCardActivity;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m14220a((Uri[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m14221a((Uri) obj);
    }

    private Uri m14220a(Uri... uriArr) {
        Uri uri = uriArr[0];
        return uri != null ? uri : this.f11991b.m8964c(this.f11990a);
    }

    private void m14221a(Uri uri) {
        if (uri != null) {
            this.f11991b.f6707p = uri;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(this.f11991b.f6707p, "text/x-vCard".toLowerCase(Locale.US));
            intent.addFlags(1);
            this.f11991b.startActivity(intent);
        }
    }
}
