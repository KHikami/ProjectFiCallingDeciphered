import android.os.Bundle;
import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

public interface hvb extends IInterface {
    void a(int i, Bundle bundle, Bundle bundle2);

    void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor);

    void a(int i, Bundle bundle, ParcelFileDescriptor parcelFileDescriptor, Bundle bundle2);

    void a(int i, Bundle bundle, DataHolder dataHolder);

    void a(int i, Bundle bundle, DataHolder[] dataHolderArr);
}
