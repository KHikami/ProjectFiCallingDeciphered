package defpackage;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

final class htb extends AsyncTask<Void, Void, Bitmap> {
    final hta a;
    final ParcelFileDescriptor b;
    final int c;
    final int d;
    final int e;
    final /* synthetic */ hsz f;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        a((Bitmap) obj);
    }

    htb(hsz hsz, hta hta, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, int i3) {
        this.f = hsz;
        this.a = hta;
        this.b = parcelFileDescriptor;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    private Bitmap a() {
        try {
            Bitmap b;
            if (this.f.e) {
                b = gwb.b(this.b);
                if (b == null) {
                    b = null;
                } else {
                    b = gwb.b(b);
                }
            } else {
                b = hsz.a(this.b, this.c, this.d, this.e, (int) ((((float) this.c) * this.f.f) / this.f.g));
                if (b == null) {
                    b = null;
                } else {
                    b = hsz.a(b, this.c, this.f.f / this.f.g);
                }
            }
            if (b != null) {
                this.f.d.put(this.a.g, b);
            }
            if (this.b != null) {
                try {
                    this.b.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
            return b;
        } catch (Throwable th) {
            if (this.b != null) {
                try {
                    this.b.close();
                } catch (IOException e2) {
                    e2.getMessage();
                }
            }
        }
    }

    private void a(Bitmap bitmap) {
        if (this.a.f.getTag() == this.a) {
            this.f.a(this.a, bitmap);
        }
    }
}
