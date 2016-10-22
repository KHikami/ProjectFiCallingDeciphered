import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;

/* compiled from: PG */
public final class amf extends AsyncTask {
    private /* synthetic */ Uri[] a;
    private /* synthetic */ Context b;
    private /* synthetic */ amm c;

    public amf(Uri[] uriArr, Context context, amm amm) {
        this.a = uriArr;
        this.b = context;
        this.c = amm;
    }

    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    public final /* synthetic */ void onPostExecute(Object obj) {
        ala[] alaArr = (ala[]) obj;
        if (this.c != null) {
            this.c.a(alaArr);
        }
    }

    private ala[] a() {
        int length = this.a.length;
        ala[] alaArr = new ala[length];
        int i = 0;
        while (i < length) {
            try {
                alaArr[i] = ame.a(this.b, this.a[i]);
                i++;
            } catch (Throwable e) {
                Log.w(ame.a, "Invalid URI starting call details", e);
                return null;
            }
        }
        return alaArr;
    }
}
