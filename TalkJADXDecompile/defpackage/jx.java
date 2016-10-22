package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* renamed from: jx */
public class jx {
    public boolean a(ConnectivityManager connectivityManager) {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return true;
        }
        switch (activeNetworkInfo.getType()) {
            case wi.w /*0*/:
            case wi.l /*2*/:
            case wi.z /*3*/:
            case wi.h /*4*/:
            case wi.p /*5*/:
            case wi.s /*6*/:
                return true;
            case wi.j /*1*/:
                return false;
            default:
                return true;
        }
    }

    jx() {
    }
}
