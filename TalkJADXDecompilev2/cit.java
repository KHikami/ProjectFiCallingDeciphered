package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public final class cit extends AsyncTask<Intent, Integer, bxy> {
    private final Context a;
    private final int b;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a((Intent[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((bxy) obj);
    }

    public cit(Context context) {
        this.a = context;
        this.b = ((jca) jyn.a(context, jca.class)).a();
    }

    private bxy a(Intent... intentArr) {
        bxy bxy = (bxy) intentArr[0].getParcelableExtra("result_media_attachment");
        if (bxy == null) {
            glk.d("Babel", "Attachment is null, stop sending the attachment.", new Object[0]);
            cancel(true);
        }
        try {
            bxy = ccy.a(this.a, this.b, bxy.c, Uri.parse(bxy.a), bxy.a, bxy.d);
        } catch (Throwable e) {
            glk.d("Babel_SendMediaAttTask", "File too big to attach.", e);
        }
        return bxy;
    }

    private void a(bxy bxy) {
        if (bxy != null) {
            cdg cdg = (cdg) jyn.a(this.a, cdg.class);
            List arrayList = new ArrayList(1);
            arrayList.add(bxy);
            cdg.a(arrayList);
            return;
        }
        Toast.makeText(this.a, this.a.getResources().getString(gwb.lU), 0).show();
    }
}
