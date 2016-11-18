package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window.Callback;
import java.util.ArrayList;

public final class vv extends tp {
    abv a;
    boolean b;
    public Callback c;
    xv d;
    private boolean e;
    private boolean f;
    private ArrayList<tr> g = new ArrayList();
    private final Runnable h = new vw(this);
    private final afu i = new afu(this);

    void m() {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x0030 in list [B:12:0x002d]
	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:43)
	at jadx.core.dex.instructions.IfNode.initBlocks(IfNode.java:60)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.initBlocksInIfNodes(BlockFinish.java:48)
	at jadx.core.dex.visitors.blocksmaker.BlockFinish.visit(BlockFinish.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:306)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
*/
        /*
        r5 = this;
        r0 = 0;
        r1 = r5.n();
        r2 = r1 instanceof defpackage.xy;
        if (r2 == 0) goto L_0x0031;
    L_0x0009:
        r0 = r1;
        r0 = (defpackage.xy) r0;
        r2 = r0;
    L_0x000d:
        if (r2 == 0) goto L_0x0012;
    L_0x000f:
        r2.g();
    L_0x0012:
        r1.clear();	 Catch:{ all -> 0x0033 }
        r0 = r5.c;	 Catch:{ all -> 0x0033 }
        r3 = 0;	 Catch:{ all -> 0x0033 }
        r0 = r0.onCreatePanelMenu(r3, r1);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0028;	 Catch:{ all -> 0x0033 }
    L_0x001e:
        r0 = r5.c;	 Catch:{ all -> 0x0033 }
        r3 = 0;	 Catch:{ all -> 0x0033 }
        r4 = 0;	 Catch:{ all -> 0x0033 }
        r0 = r0.onPreparePanel(r3, r4, r1);	 Catch:{ all -> 0x0033 }
        if (r0 != 0) goto L_0x002b;	 Catch:{ all -> 0x0033 }
    L_0x0028:
        r1.clear();	 Catch:{ all -> 0x0033 }
    L_0x002b:
        if (r2 == 0) goto L_0x0030;
    L_0x002d:
        r2.h();
    L_0x0030:
        return;
    L_0x0031:
        r2 = r0;
        goto L_0x000d;
    L_0x0033:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0039;
    L_0x0036:
        r2.h();
    L_0x0039:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: vv.m():void");
    }

    public vv(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.a = new afx(toolbar, false);
        this.c = new wa(this, callback);
        this.a.a(this.c);
        toolbar.a(this.i);
        this.a.a(charSequence);
    }

    public Callback l() {
        return this.c;
    }

    public void a(View view) {
        a(view, new tq(-2, -2));
    }

    private void a(View view, tq tqVar) {
        if (view != null) {
            view.setLayoutParams(tqVar);
        }
        this.a.a(view);
    }

    public void a(Drawable drawable) {
        this.a.a(null);
    }

    public void a(float f) {
        oa.f(this.a.a(), f);
    }

    public Context f() {
        return this.a.b();
    }

    public void b(Drawable drawable) {
        this.a.b(drawable);
    }

    public void b(int i) {
        this.a.b(i);
    }

    public void f(boolean z) {
    }

    public void c(int i) {
        this.a.c(i);
    }

    public void g(boolean z) {
    }

    public void a(Configuration configuration) {
        super.a(configuration);
    }

    public void a(CharSequence charSequence) {
        this.a.b(charSequence);
    }

    public void a(int i) {
        this.a.b(i != 0 ? this.a.b().getText(i) : null);
    }

    public void c(CharSequence charSequence) {
        this.a.a(charSequence);
    }

    public boolean j() {
        ViewGroup a = this.a.a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    public void b(CharSequence charSequence) {
        this.a.c(charSequence);
    }

    private void a(int i, int i2) {
        this.a.a((this.a.l() & (i2 ^ -1)) | (i & i2));
    }

    public void a(boolean z) {
        a(2, 2);
    }

    public void b(boolean z) {
        a(z ? 4 : 0, 4);
    }

    public void c(boolean z) {
        a(0, 8);
    }

    public void d(boolean z) {
        a(16, 16);
    }

    public View a() {
        return this.a.n();
    }

    public int b() {
        return this.a.l();
    }

    public void c() {
        this.a.d(0);
    }

    public void d() {
        this.a.d(8);
    }

    public boolean e() {
        return this.a.o() == 0;
    }

    public boolean h() {
        this.a.a().removeCallbacks(this.h);
        oa.a(this.a.a(), this.h);
        return true;
    }

    public boolean i() {
        if (!this.a.c()) {
            return false;
        }
        this.a.d();
        return true;
    }

    public boolean a(int i, KeyEvent keyEvent) {
        Menu n = n();
        if (n != null) {
            boolean z;
            if (KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1) {
                z = true;
            } else {
                z = false;
            }
            n.setQwertyMode(z);
            n.performShortcut(i, keyEvent, 0);
        }
        return true;
    }

    void k() {
        this.a.a().removeCallbacks(this.h);
    }

    public void a(tr trVar) {
        this.g.add(trVar);
    }

    public void b(tr trVar) {
        this.g.remove(trVar);
    }

    public void h(boolean z) {
        if (z != this.f) {
            this.f = z;
            int size = this.g.size();
            for (int i = 0; i < size; i++) {
                ((tr) this.g.get(i)).a(z);
            }
        }
    }

    private Menu n() {
        if (!this.e) {
            this.a.a(new vx(this), new vy(this));
            this.e = true;
        }
        return this.a.p();
    }
}
