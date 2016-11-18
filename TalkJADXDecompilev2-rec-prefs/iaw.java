package p000;

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
    private final ExecutorService f17502e;
    private final iaf<Object> f17503f;
    private final iaf<Object> f17504g;
    private final iaf<hxo> f17505h;
    private final iaf<hxs> f17506i;
    private final iaf<hyc> f17507j;
    private final iaf<Object> f17508k;
    private final iaf<Object> f17509l;
    private final iaf<Object> f17510m;

    public iaw(Context context, Looper looper, guk guk, gul gul, gwa gwa) {
        this(context, looper, guk, gul, gwa, Executors.newCachedThreadPool());
    }

    private iaw(Context context, Looper looper, guk guk, gul gul, gwa gwa, ExecutorService executorService) {
        super(context, looper, 14, gwa, guk, gul);
        this.f17503f = new iaf();
        this.f17504g = new iaf();
        this.f17505h = new iaf();
        this.f17506i = new iaf();
        this.f17507j = new iaf();
        this.f17508k = new iaf();
        this.f17509l = new iaf();
        this.f17510m = new iaf();
        this.f17502e = (ExecutorService) gwb.m1419L((Object) executorService);
    }

    protected void mo3023a(int i, IBinder iBinder, Bundle bundle, int i2) {
        if (Log.isLoggable("WearableClient", 2)) {
            new StringBuilder(41).append("onPostInitHandler: statusCode ").append(i);
        }
        if (i == 0) {
            this.f17503f.m21484a(iBinder);
            this.f17504g.m21484a(iBinder);
            this.f17505h.m21484a(iBinder);
            this.f17506i.m21484a(iBinder);
            this.f17507j.m21484a(iBinder);
            this.f17508k.m21484a(iBinder);
            this.f17509l.m21484a(iBinder);
            this.f17510m.m21484a(iBinder);
        }
        super.mo3023a(i, iBinder, bundle, i2);
    }

    public void m21496a(hec<hxy> hec_hxy) {
        ((iac) m18714p()).mo3103b(new ias(hec_hxy));
    }

    public void m21497a(hec<hxy> hec_hxy, Uri uri, int i) {
        ((iac) m18714p()).mo3088a(new ias(hec_hxy), uri, i);
    }

    public void m21498a(hec<hxr> hec_hxr, PutDataRequest putDataRequest) {
        for (Entry value : putDataRequest.m10021c().entrySet()) {
            Asset asset = (Asset) value.getValue();
            if (asset.m10001a() == null && asset.m10002b() == null && asset.m10003c() == null && asset.m10004d() == null) {
                String valueOf = String.valueOf(putDataRequest.m10016a());
                String valueOf2 = String.valueOf(asset);
                throw new IllegalArgumentException(new StringBuilder((String.valueOf(valueOf).length() + 33) + String.valueOf(valueOf2).length()).append("Put for ").append(valueOf).append(" contains invalid asset: ").append(valueOf2).toString());
            }
        }
        PutDataRequest a = PutDataRequest.m10014a(putDataRequest.m10016a());
        a.m10018a(putDataRequest.m10020b());
        if (putDataRequest.m10024f()) {
            a.m10025g();
        }
        List arrayList = new ArrayList();
        for (Entry value2 : putDataRequest.m10021c().entrySet()) {
            Asset asset2 = (Asset) value2.getValue();
            if (asset2.m10001a() != null) {
                try {
                    ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                    if (Log.isLoggable("WearableClient", 3)) {
                        String valueOf3 = String.valueOf(asset2);
                        String valueOf4 = String.valueOf(createPipe[0]);
                        String valueOf5 = String.valueOf(createPipe[1]);
                        new StringBuilder(((String.valueOf(valueOf3).length() + 61) + String.valueOf(valueOf4).length()) + String.valueOf(valueOf5).length()).append("processAssets: replacing data with FD in asset: ").append(valueOf3).append(" read:").append(valueOf4).append(" write:").append(valueOf5);
                    }
                    a.m10017a((String) value2.getKey(), Asset.m9998a(createPipe[0]));
                    Runnable futureTask = new FutureTask(new iax(this, createPipe[1], asset2.m10001a()));
                    arrayList.add(futureTask);
                    this.f17502e.submit(futureTask);
                } catch (Throwable e) {
                    valueOf = String.valueOf(putDataRequest);
                    throw new IllegalStateException(new StringBuilder(String.valueOf(valueOf).length() + 60).append("Unable to create ParcelFileDescriptor for asset in request: ").append(valueOf).toString(), e);
                }
            } else if (asset2.m10004d() != null) {
                try {
                    a.m10017a((String) value2.getKey(), Asset.m9998a(this.f16215a.getContentResolver().openFileDescriptor(asset2.m10004d(), "r")));
                } catch (FileNotFoundException e2) {
                    new iau(hec_hxr, arrayList).mo3077a(new PutDataResponse(4005, null));
                    valueOf2 = String.valueOf(asset2.m10004d());
                    new StringBuilder(String.valueOf(valueOf2).length() + 28).append("Couldn't resolve asset URI: ").append(valueOf2);
                    return;
                }
            } else {
                a.m10017a((String) value2.getKey(), asset2);
            }
        }
        ((iac) m18714p()).mo3091a(new iau(hec_hxr, arrayList), a);
    }

    public void m21499a(hec<hyd> hec_hyd, String str, String str2, byte[] bArr) {
        ((iac) m18714p()).mo3101a(new iav(hec_hyd), str, str2, bArr);
    }

    public void m21500b(hec<hxt> hec_hxt, Uri uri, int i) {
        ((iac) m18714p()).mo3106b(new iar(hec_hxt), uri, i);
    }

    protected String mo2346g() {
        return "com.google.android.gms.wearable.BIND";
    }

    protected String mo2347h() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    protected /* synthetic */ IInterface mo2345a(IBinder iBinder) {
        return iad.m21435a(iBinder);
    }
}
