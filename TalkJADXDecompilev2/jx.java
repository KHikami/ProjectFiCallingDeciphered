package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class jx {
    public boolean a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    jx() {
    }
}
