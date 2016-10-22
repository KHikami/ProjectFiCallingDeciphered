import android.net.Uri;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.ConnectionConfiguration;
import com.google.android.gms.wearable.PutDataRequest;
import com.google.android.gms.wearable.internal.AddListenerRequest;
import com.google.android.gms.wearable.internal.AncsNotificationParcelable;
import com.google.android.gms.wearable.internal.RemoveListenerRequest;

public interface iac extends IInterface {
    void a(hzw hzw);

    void a(hzw hzw, byte b);

    void a(hzw hzw, int i);

    void a(hzw hzw, Uri uri);

    void a(hzw hzw, Uri uri, int i);

    void a(hzw hzw, Asset asset);

    void a(hzw hzw, ConnectionConfiguration connectionConfiguration);

    void a(hzw hzw, PutDataRequest putDataRequest);

    void a(hzw hzw, AddListenerRequest addListenerRequest);

    void a(hzw hzw, AncsNotificationParcelable ancsNotificationParcelable);

    void a(hzw hzw, RemoveListenerRequest removeListenerRequest);

    void a(hzw hzw, hzt hzt, String str);

    void a(hzw hzw, String str);

    void a(hzw hzw, String str, int i);

    void a(hzw hzw, String str, ParcelFileDescriptor parcelFileDescriptor);

    void a(hzw hzw, String str, ParcelFileDescriptor parcelFileDescriptor, long j, long j2);

    void a(hzw hzw, String str, String str2);

    void a(hzw hzw, String str, String str2, byte[] bArr);

    void a(hzw hzw, boolean z);

    void b(hzw hzw);

    void b(hzw hzw, int i);

    void b(hzw hzw, Uri uri);

    void b(hzw hzw, Uri uri, int i);

    void b(hzw hzw, ConnectionConfiguration connectionConfiguration);

    void b(hzw hzw, hzt hzt, String str);

    void b(hzw hzw, String str);

    void b(hzw hzw, String str, int i);

    void b(hzw hzw, boolean z);

    void c(hzw hzw);

    void c(hzw hzw, int i);

    void c(hzw hzw, Uri uri);

    void c(hzw hzw, String str);

    void d(hzw hzw);

    void d(hzw hzw, String str);

    void e(hzw hzw);

    void e(hzw hzw, String str);

    void f(hzw hzw);

    void f(hzw hzw, String str);

    void g(hzw hzw);

    void h(hzw hzw);

    void i(hzw hzw);

    void j(hzw hzw);

    void k(hzw hzw);

    void l(hzw hzw);

    void m(hzw hzw);

    void n(hzw hzw);

    void o(hzw hzw);

    void p(hzw hzw);
}
