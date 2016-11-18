package p000;

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
    abv f35406a;
    boolean f35407b;
    public Callback f35408c;
    xv f35409d;
    private boolean f35410e;
    private boolean f35411f;
    private ArrayList<tr> f35412g = new ArrayList();
    private final Runnable f35413h = new vw(this);
    private final afu f35414i = new afu(this);

    void m41095m() {
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
        r1 = r5.m41062n();
        r2 = r1 instanceof p000.xy;
        if (r2 == 0) goto L_0x0031;
    L_0x0009:
        r0 = r1;
        r0 = (p000.xy) r0;
        r2 = r0;
    L_0x000d:
        if (r2 == 0) goto L_0x0012;
    L_0x000f:
        r2.m41436g();
    L_0x0012:
        r1.clear();	 Catch:{ all -> 0x0033 }
        r0 = r5.f35408c;	 Catch:{ all -> 0x0033 }
        r3 = 0;	 Catch:{ all -> 0x0033 }
        r0 = r0.onCreatePanelMenu(r3, r1);	 Catch:{ all -> 0x0033 }
        if (r0 == 0) goto L_0x0028;	 Catch:{ all -> 0x0033 }
    L_0x001e:
        r0 = r5.f35408c;	 Catch:{ all -> 0x0033 }
        r3 = 0;	 Catch:{ all -> 0x0033 }
        r4 = 0;	 Catch:{ all -> 0x0033 }
        r0 = r0.onPreparePanel(r3, r4, r1);	 Catch:{ all -> 0x0033 }
        if (r0 != 0) goto L_0x002b;	 Catch:{ all -> 0x0033 }
    L_0x0028:
        r1.clear();	 Catch:{ all -> 0x0033 }
    L_0x002b:
        if (r2 == 0) goto L_0x0030;
    L_0x002d:
        r2.m41437h();
    L_0x0030:
        return;
    L_0x0031:
        r2 = r0;
        goto L_0x000d;
    L_0x0033:
        r0 = move-exception;
        if (r2 == 0) goto L_0x0039;
    L_0x0036:
        r2.m41437h();
    L_0x0039:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: vv.m():void");
    }

    public vv(Toolbar toolbar, CharSequence charSequence, Callback callback) {
        this.f35406a = new afx(toolbar, false);
        this.f35408c = new wa(this, callback);
        this.f35406a.a(this.f35408c);
        toolbar.a(this.f35414i);
        this.f35406a.a(charSequence);
    }

    public Callback m41094l() {
        return this.f35408c;
    }

    public void mo4452a(View view) {
        m41061a(view, new tq(-2, -2));
    }

    private void m41061a(View view, tq tqVar) {
        if (view != null) {
            view.setLayoutParams(tqVar);
        }
        this.f35406a.a(view);
    }

    public void mo4451a(Drawable drawable) {
        this.f35406a.a(null);
    }

    public void mo4448a(float f) {
        oa.m37358f(this.f35406a.a(), f);
    }

    public Context mo4470f() {
        return this.f35406a.b();
    }

    public void mo4459b(Drawable drawable) {
        this.f35406a.b(drawable);
    }

    public void mo4458b(int i) {
        this.f35406a.b(i);
    }

    public void mo4471f(boolean z) {
    }

    public void mo4464c(int i) {
        this.f35406a.c(i);
    }

    public void mo4472g(boolean z) {
    }

    public void mo4450a(Configuration configuration) {
        super.mo4450a(configuration);
    }

    public void mo4453a(CharSequence charSequence) {
        this.f35406a.b(charSequence);
    }

    public void mo4449a(int i) {
        this.f35406a.b(i != 0 ? this.f35406a.b().getText(i) : null);
    }

    public void mo4465c(CharSequence charSequence) {
        this.f35406a.a(charSequence);
    }

    public boolean mo4476j() {
        ViewGroup a = this.f35406a.a();
        if (a == null || a.hasFocus()) {
            return false;
        }
        a.requestFocus();
        return true;
    }

    public void mo4460b(CharSequence charSequence) {
        this.f35406a.c(charSequence);
    }

    private void m41060a(int i, int i2) {
        this.f35406a.a((this.f35406a.l() & (i2 ^ -1)) | (i & i2));
    }

    public void mo4455a(boolean z) {
        m41060a(2, 2);
    }

    public void mo4462b(boolean z) {
        m41060a(z ? 4 : 0, 4);
    }

    public void mo4466c(boolean z) {
        m41060a(0, 8);
    }

    public void mo4468d(boolean z) {
        m41060a(16, 16);
    }

    public View mo4447a() {
        return this.f35406a.n();
    }

    public int mo4457b() {
        return this.f35406a.l();
    }

    public void mo4463c() {
        this.f35406a.d(0);
    }

    public void mo4467d() {
        this.f35406a.d(8);
    }

    public boolean mo4469e() {
        return this.f35406a.o() == 0;
    }

    public boolean mo4474h() {
        this.f35406a.a().removeCallbacks(this.f35413h);
        oa.m37336a(this.f35406a.a(), this.f35413h);
        return true;
    }

    public boolean mo4475i() {
        if (!this.f35406a.c()) {
            return false;
        }
        this.f35406a.d();
        return true;
    }

    public boolean mo4456a(int i, KeyEvent keyEvent) {
        Menu n = m41062n();
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

    void mo4477k() {
        this.f35406a.a().removeCallbacks(this.f35413h);
    }

    public void mo4454a(tr trVar) {
        this.f35412g.add(trVar);
    }

    public void mo4461b(tr trVar) {
        this.f35412g.remove(trVar);
    }

    public void mo4473h(boolean z) {
        if (z != this.f35411f) {
            this.f35411f = z;
            int size = this.f35412g.size();
            for (int i = 0; i < size; i++) {
                ((tr) this.f35412g.get(i)).m40813a(z);
            }
        }
    }

    private Menu m41062n() {
        if (!this.f35410e) {
            this.f35406a.a(new vx(this), new vy(this));
            this.f35410e = true;
        }
        return this.f35406a.p();
    }
}
