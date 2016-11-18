package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;

final class gjy extends AsyncTask<Void, Void, Boolean> {
    final /* synthetic */ File a;
    final /* synthetic */ gjx b;

    gjy(gjx gjx, File file) {
        this.b = gjx;
        this.a = file;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Boolean) obj);
    }

    private Boolean a() {
        gjx gjx = this.b;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String a = gkd.a(externalStoragePublicDirectory, this.b.b, null);
        if (TextUtils.isEmpty(a)) {
            String valueOf = String.valueOf(externalStoragePublicDirectory.getPath());
            String str = this.b.b;
            glk.e("Babel_GlideTarget", new StringBuilder((String.valueOf(valueOf).length() + 58) + String.valueOf(str).length()).append("could not create save name in directory:").append(valueOf).append("for content type: ").append(str).toString(), new Object[0]);
            return Boolean.valueOf(false);
        }
        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdir()) {
            File file = new File(externalStoragePublicDirectory, a);
            try {
                mrg.a(this.a, file);
                ((DownloadManager) this.b.a.getSystemService("download")).addCompletedDownload(a, a, true, this.b.b, file.getPath(), file.length(), true);
                return Boolean.valueOf(true);
            } catch (Throwable e) {
                glk.d("Babel_GlideTarget", "exception copy caching file while trying to save", e);
            }
        }
        return Boolean.valueOf(false);
    }

    private void a(Boolean bool) {
        int i;
        Context context = this.b.a;
        if (gwb.b(bool)) {
            i = bc.sZ;
        } else {
            i = bc.sY;
        }
        Toast.makeText(context, i, 0).show();
    }
}
