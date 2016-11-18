package defpackage;

import android.app.Notification;
import android.os.IInterface;

public interface fd extends IInterface {
    void a(String str);

    void a(String str, int i, String str2);

    void a(String str, int i, String str2, Notification notification);
}
