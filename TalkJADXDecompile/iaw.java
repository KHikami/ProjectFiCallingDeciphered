import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.PutDataResponse;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public final class iaw extends gwg<iac> {
    private final ExecutorService e;
    private final iaf<Object> f;
    private final iaf<Object> g;
    private final iaf<hxo> h;
    private final iaf<hxs> i;
    private final iaf<hyc> j;
    private final iaf<Object> k;
    private final iaf<Object> l;
    private final iaf<Object> m;

    public iaw(Context context, Looper looper, guk guk, gul gul, gwa gwa) {
        this(context, looper, guk, gul, gwa, Executors.newCachedThreadPool());
    }

    private iaw(Context context, Looper looper, guk guk, gul gul, gwa gwa, ExecutorService executorService) {
        super(context, looper, 14, gwa, guk, gul);
        this.f = new iaf();
        this.g = new iaf();
        this.h = new iaf();
        this.i = new iaf();
        this.j = new iaf();
        this.k = new iaf();
        this.l = new iaf();
        this.m = new iaf();
        this.e = (ExecutorService) gwb.L((Object) executorService);
    }

    protected void a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            new StringBuilder(41).append("onPostInitHandler: statusCode ").append(i);
        }
        if (i == 0) {
            this.f.a(iBinder);
            this.g.a(iBinder);
            this.h.a(iBinder);
            this.i.a(iBinder);
            this.j.a(iBinder);
            this.k.a(iBinder);
            this.l.a(iBinder);
            this.m.a(iBinder);
        }
        super.a(i, iBinder, bundle, i2);
    }

    public void a(hec<hxy> hec_hxy) {
        ((iac) p()).b(new ias(hec_hxy));
    }

    public void a(hec<hxy> hec_hxy, Uri uri, int i) {
        ((iac) p()).a(new ias(hec_hxy), uri, i);
    }

    public void a(hec<hxr> hec_hxr, PutDataRequest putDataRequest) {
        for (Entry value : putDataRequest.c().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.a() == null && asset.b() == null && asset.c() == null && asset.d() == null) {
                String valueOf = String.valueOf(putDataRequest.a());
                String valueOf2 = String.valueOf(asset);
                throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("Put for ").append(valueOf).append(" contains invalid asset: ").append(valueOf2).toString());
            }
        }
        PutDataRequest a = PutDataRequest.a(putDataRequest.a());
        a.a(putDataRequest.b());
        if (putDataRequest.f()) {
            a.g();
        }
        List arrayList = new ArrayList();
        for (Entry value2 : putDataRequest.c().entrySet()) {
            Asset asset2 = (Asset) value2.getValue();
            if (asset2.a() != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(asset2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        new StringBuilder(((String.valueOf(valueOf3).length() + 61) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("processAssets: replacing data with FD in asset: ").append(valueOf3).append(" read:").append(valueOf4).append(" write:").append(valueOf5);
                    }
                    a.a((String) value2.getKey(), Asset.a(createPipe[0]));
                    Runnable futureTask = new FutureTask(new iax(this, createPipe[1], asset2.a()));
                    arrayList.add(futureTask);
                    this.e.submit(futureTask);
                } catch (Throwable e) {
                    valueOf = String.valueOf(putDataRequest);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 60).append("Unable to create ParcelFileDescriptor for asset in request: ").append(valueOf).toString(), e);
                }
            } else if (asset2.d() != null) {
                try {
                    a.a((String) value2.getKey(), Asset.a(this.a.getContentResolver().openFileDescriptor(asset2.d(), "r")));
                } catch (FileNotFoundException e2) {
                    new iau(hec_hxr, arrayList).a(new PutDataResponse(4005, null));
                    valueOf2 = String.valueOf(asset2.d());
                    new StringBuilder(String.valueOf(valueOf2).length() + 28).append("Couldn't resolve asset URI: ").append(valueOf2);
                    return;
                }
            } else {
                a.a((String) value2.getKey(), asset2);
            }
        }
        ((iac) p()).a(new iau(hec_hxr, arrayList), a);
    }

    public void a(hec<hyd> hec_hyd, String str, String str2, byte[] bArr) {
        ((iac) p()).a(new iav(hec_hyd), str, str2, bArr);
    }

    public void b(hec<hxt> hec_hxt, Uri uri, int i) {
        ((iac) p()).b(new iar(hec_hxt), uri, i);
    }

    protected String g() {
        return "com.google.android.gms.wearable.BIND";
    }

    protected String h() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    protected /* synthetic */ IInterface a(IBinder iBinder) {
        return iad.a(iBinder);
    }
}
