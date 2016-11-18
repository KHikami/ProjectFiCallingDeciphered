package p000;

import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.os.ParcelFileDescriptor;
import java.io.IOException;

final class htb extends AsyncTask<Void, Void, Bitmap> {
    final hta f17229a;
    final ParcelFileDescriptor f17230b;
    final int f17231c;
    final int f17232d;
    final int f17233e;
    final /* synthetic */ hsz f17234f;

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return m20814a();
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        m20815a((Bitmap) obj);
    }

    htb(hsz hsz, hta hta, ParcelFileDescriptor parcelFileDescriptor, int i, int i2, int i3) {
        this.f17234f = hsz;
        this.f17229a = hta;
        this.f17230b = parcelFileDescriptor;
        this.f17231c = i;
        this.f17232d = i2;
        this.f17233e = i3;
    }

    private Bitmap m20814a() {
        try {
            Bitmap b;
            if (this.f17234f.f17210e) {
                b = gwb.m1979b(this.f17230b);
                if (b == null) {
                    b = null;
                } else {
                    b = gwb.m1978b(b);
                }
            } else {
                b = hsz.m20789a(this.f17230b, this.f17231c, this.f17232d, this.f17233e, (int) ((((float) this.f17231c) * this.f17234f.f17211f) / this.f17234f.f17212g));
                if (b == null) {
                    b = null;
                } else {
                    b = hsz.m20788a(b, this.f17231c, this.f17234f.f17211f / this.f17234f.f17212g);
                }
            }
            if (b != null) {
                this.f17234f.f17209d.put(this.f17229a.f17218g, b);
            }
            if (this.f17230b != null) {
                try {
                    this.f17230b.close();
                } catch (IOException e) {
                    e.getMessage();
                }
            }
            return b;
        } catch (Throwable th) {
            if (this.f17230b != null) {
                try {
                    this.f17230b.close();
                } catch (IOException e2) {
                    e2.getMessage();
                }
            }
        }
    }

    private void m20815a(Bitmap bitmap) {
        if (this.f17229a.f17217f.getTag() == this.f17229a) {
            this.f17234f.mo2944a(this.f17229a, bitmap);
        }
    }
}
