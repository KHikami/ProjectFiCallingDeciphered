package defpackage;

import android.app.Activity;
import android.content.Intent;

public interface hgb {
    Activity a();

    <T extends hga> T a(String str, Class<T> cls);

    void a(String str, hga hga);

    void startActivityForResult(Intent intent, int i);
}
