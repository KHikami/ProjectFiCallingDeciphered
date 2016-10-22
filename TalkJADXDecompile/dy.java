import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.FileDescriptor;
import java.io.PrintWriter;

final class dy extends ec<dw> {
    final /* synthetic */ dw a;

    public /* synthetic */ Object g() {
        return r();
    }

    public dy(dw dwVar) {
        this.a = dwVar;
        super(dwVar);
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.a.dump(str, null, printWriter, strArr);
    }

    public boolean b() {
        return !this.a.isFinishing();
    }

    public LayoutInflater c() {
        return this.a.getLayoutInflater().cloneInContext(this.a);
    }

    private dw r() {
        return this.a;
    }

    public void d() {
        this.a.F_();
    }

    public void a(dr drVar, Intent intent, int i, Bundle bundle) {
        this.a.a(drVar, intent, i, bundle);
    }

    public void a(dr drVar, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        this.a.a(drVar, intentSender, i, intent, i2, i3, i4, bundle);
    }

    public void a(dr drVar, String[] strArr, int i) {
        this.a.a(drVar, strArr, i);
    }

    public boolean a(String str) {
        return cq.a(this.a, str);
    }

    public boolean e() {
        return this.a.getWindow() != null;
    }

    public int f() {
        Window window = this.a.getWindow();
        return window == null ? 0 : window.getAttributes().windowAnimations;
    }

    public void a(dr drVar) {
        this.a.a(drVar);
    }

    public View a(int i) {
        return this.a.findViewById(i);
    }

    public boolean a() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
