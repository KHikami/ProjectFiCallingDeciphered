package p000;

import android.app.DownloadManager;
import android.content.Context;
import android.os.AsyncTask;
import android.os.Environment;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.File;

final class gjy extends AsyncTask<Void, Void, Boolean> {
    final /* synthetic */ File f15471a;
    final /* synthetic */ gjx f15472b;

    gjy(gjx gjx, File file) {
        this.f15472b = gjx;
        this.f15471a = file;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m17866a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m17867a((Boolean) obj);
    }

    private Boolean m17866a() {
        gjx gjx = this.f15472b;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        String a = gkd.m17875a(externalStoragePublicDirectory, this.f15472b.f15470b, null);
        if (TextUtils.isEmpty(a)) {
            String valueOf = String.valueOf(externalStoragePublicDirectory.getPath());
            String str = this.f15472b.f15470b;
            glk.m17982e("Babel_GlideTarget", new StringBuilder((String.valueOf(valueOf).length() + 58) + String.valueOf(str).length()).append("could not create save name in directory:").append(valueOf).append("for content type: ").append(str).toString(), new Object[0]);
            return Boolean.valueOf(false);
        }
        if (externalStoragePublicDirectory.exists() || externalStoragePublicDirectory.mkdir()) {
            File file = new File(externalStoragePublicDirectory, a);
            try {
                mrg.m32753a(this.f15471a, file);
                ((DownloadManager) this.f15472b.f15469a.getSystemService("download")).addCompletedDownload(a, a, true, this.f15472b.f15470b, file.getPath(), file.length(), true);
                return Boolean.valueOf(true);
            } catch (Throwable e) {
                glk.m17980d("Babel_GlideTarget", "exception copy caching file while trying to save", e);
            }
        }
        return Boolean.valueOf(false);
    }

    private void m17867a(Boolean bool) {
        int i;
        Context context = this.f15472b.f15469a;
        if (gwb.m2061b(bool)) {
            i = bc.sZ;
        } else {
            i = bc.sY;
        }
        Toast.makeText(context, i, 0).show();
    }
}
