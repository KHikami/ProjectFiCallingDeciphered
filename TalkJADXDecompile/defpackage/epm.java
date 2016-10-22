package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import com.google.android.apps.hangouts.phone.ViewVCardActivity;
import java.util.Locale;

/* renamed from: epm */
public final class epm extends AsyncTask<Uri, Void, Uri> {
    int a;
    final /* synthetic */ ViewVCardActivity b;

    public epm(ViewVCardActivity viewVCardActivity) {
        this.b = viewVCardActivity;
        this.a = this.b.n.a();
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((Uri[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Uri) obj);
    }

    private Uri a(Uri... uriArr) {
        Uri uri = uriArr[0];
        return uri != null ? uri : this.b.c(this.a);
    }

    private void a(Uri uri) {
        if (uri != null) {
            this.b.p = uri;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setDataAndType(this.b.p, "text/x-vCard".toLowerCase(Locale.US));
            intent.addFlags(1);
            this.b.startActivity(intent);
        }
    }
}
