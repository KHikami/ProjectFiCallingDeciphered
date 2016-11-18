package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class dy extends ec<dw> {
    final /* synthetic */ dw f10800a;

    public /* synthetic */ Object mo1773g() {
        return m13042r();
    }

    public dy(dw dwVar) {
        this.f10800a = dwVar;
        super(dwVar);
    }

    public void mo1766a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f10800a.dump(str, null, printWriter, strArr);
    }

    public boolean mo1768b() {
        return !this.f10800a.isFinishing();
    }

    public LayoutInflater mo1769c() {
        return this.f10800a.getLayoutInflater().cloneInContext(this.f10800a);
    }

    private dw m13042r() {
        return this.f10800a;
    }

    public void mo1770d() {
        this.f10800a.F_();
    }

    public void mo1763a(dr drVar, Intent intent, int i, Bundle bundle) {
        this.f10800a.m1090a(drVar, intent, i, bundle);
    }

    public void mo1764a(dr drVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.f10800a.m1091a(drVar, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void mo1765a(dr drVar, String[] strArr, int i) {
        this.f10800a.m1092a(drVar, strArr, i);
    }

    public boolean mo1767a(String str) {
        return cq.m10685a(this.f10800a, str);
    }

    public boolean mo1771e() {
        return this.f10800a.getWindow() != null;
    }

    public int mo1772f() {
        Window window = this.f10800a.getWindow();
        return window == null ? 0 : window.getAttributes().windowAnimations;
    }

    public void mo1762a(dr drVar) {
        this.f10800a.mo1050a(drVar);
    }

    public View mo1657a(int i) {
        return this.f10800a.findViewById(i);
    }

    public boolean mo1658a() {
        Window window = this.f10800a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
