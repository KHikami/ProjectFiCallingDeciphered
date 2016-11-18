package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class jwh extends jwp implements kbt {
    public final kbn c = new kbn();

    public kbu getLifecycle() {
        return this.c;
    }

    public void onCreate(Bundle bundle) {
        this.c.c(bundle);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.b(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.c.a(view, bundle);
        super.onViewCreated(view, bundle);
    }

    public void onAttach(Activity activity) {
        this.c.a(activity);
        super.onAttach(activity);
    }

    public void onActivityCreated(Bundle bundle) {
        this.c.a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onStart() {
        this.c.i();
        super.onStart();
    }

    public void onResume() {
        this.c.j();
        super.onResume();
    }

    public void onPause() {
        this.c.b();
        super.onPause();
    }

    public void onStop() {
        this.c.k();
        super.onStop();
    }

    public void onDestroyView() {
        this.c.a();
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.c.d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.c.c();
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.c.a(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.c.a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.c.a(i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.c.l();
        super.onLowMemory();
    }

    public void setUserVisibleHint(boolean z) {
        this.c.a(z);
        super.setUserVisibleHint(z);
    }
}
