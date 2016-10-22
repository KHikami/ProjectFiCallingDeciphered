import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;

public interface gwy extends IInterface {
    void a(int i, Bundle bundle);

    void a(int i, IBinder iBinder, Bundle bundle);
}
