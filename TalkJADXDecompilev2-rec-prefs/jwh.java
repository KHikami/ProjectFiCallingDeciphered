package p000;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class jwh extends jwp implements kbt {
    public final kbn f13970c = new kbn();

    public kbu getLifecycle() {
        return this.f13970c;
    }

    public void onCreate(Bundle bundle) {
        this.f13970c.m25526c(bundle);
        super.onCreate(bundle);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f13970c.m25560b(bundle);
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onViewCreated(View view, Bundle bundle) {
        this.f13970c.m25558a(view, bundle);
        super.onViewCreated(view, bundle);
    }

    public void onAttach(Activity activity) {
        this.f13970c.m25556a(activity);
        super.onAttach(activity);
    }

    public void onActivityCreated(Bundle bundle) {
        this.f13970c.m25557a(bundle);
        super.onActivityCreated(bundle);
    }

    public void onStart() {
        this.f13970c.m25528i();
        super.onStart();
    }

    public void onResume() {
        this.f13970c.m25529j();
        super.onResume();
    }

    public void onPause() {
        this.f13970c.mo3637b();
        super.onPause();
    }

    public void onStop() {
        this.f13970c.m25530k();
        super.onStop();
    }

    public void onDestroyView() {
        this.f13970c.m25555a();
        super.onDestroyView();
    }

    public void onSaveInstanceState(Bundle bundle) {
        this.f13970c.m25527d(bundle);
        super.onSaveInstanceState(bundle);
    }

    public void onDestroy() {
        this.f13970c.mo3638c();
        super.onDestroy();
    }

    public void onConfigurationChanged(Configuration configuration) {
        this.f13970c.m25517a(configuration);
        super.onConfigurationChanged(configuration);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f13970c.m25515a(i, i2, intent);
        super.onActivityResult(i, i2, intent);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f13970c.m25516a(i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onLowMemory() {
        this.f13970c.m25531l();
        super.onLowMemory();
    }

    public void setUserVisibleHint(boolean z) {
        this.f13970c.m25559a(z);
        super.setUserVisibleHint(z);
    }
}
