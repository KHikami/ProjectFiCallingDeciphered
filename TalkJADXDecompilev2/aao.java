package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import android.widget.ImageView;

public final class aao {
    private final ImageView a;

    public void a(android.util.AttributeSet r7, int r8) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x003b in list [B:12:0x0038]
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
        r6 = this;
        r5 = -1;
        r1 = 0;
        r0 = r6.a;	 Catch:{ all -> 0x003c }
        r0 = r0.getDrawable();	 Catch:{ all -> 0x003c }
        if (r0 != 0) goto L_0x0031;	 Catch:{ all -> 0x003c }
    L_0x000a:
        r2 = r6.a;	 Catch:{ all -> 0x003c }
        r2 = r2.getContext();	 Catch:{ all -> 0x003c }
        r3 = defpackage.wi.P;	 Catch:{ all -> 0x003c }
        r4 = 0;	 Catch:{ all -> 0x003c }
        r1 = defpackage.afp.a(r2, r7, r3, r8, r4);	 Catch:{ all -> 0x003c }
        r2 = defpackage.wi.Q;	 Catch:{ all -> 0x003c }
        r3 = -1;	 Catch:{ all -> 0x003c }
        r2 = r1.g(r2, r3);	 Catch:{ all -> 0x003c }
        if (r2 == r5) goto L_0x0031;	 Catch:{ all -> 0x003c }
    L_0x0020:
        r0 = r6.a;	 Catch:{ all -> 0x003c }
        r0 = r0.getContext();	 Catch:{ all -> 0x003c }
        r0 = wk.b(r0, r2);	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x0031;	 Catch:{ all -> 0x003c }
    L_0x002c:
        r2 = r6.a;	 Catch:{ all -> 0x003c }
        r2.setImageDrawable(r0);	 Catch:{ all -> 0x003c }
    L_0x0031:
        if (r0 == 0) goto L_0x0036;	 Catch:{ all -> 0x003c }
    L_0x0033:
        defpackage.aci.b(r0);	 Catch:{ all -> 0x003c }
    L_0x0036:
        if (r1 == 0) goto L_0x003b;
    L_0x0038:
        r1.a();
    L_0x003b:
        return;
    L_0x003c:
        r0 = move-exception;
        if (r1 == 0) goto L_0x0042;
    L_0x003f:
        r1.a();
    L_0x0042:
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: aao.a(android.util.AttributeSet, int):void");
    }

    public aao(ImageView imageView) {
        this.a = imageView;
    }

    public void a(int i) {
        if (i != 0) {
            Drawable b = wk.b(this.a.getContext(), i);
            if (b != null) {
                aci.b(b);
            }
            this.a.setImageDrawable(b);
            return;
        }
        this.a.setImageDrawable(null);
    }

    boolean a() {
        Drawable background = this.a.getBackground();
        if (VERSION.SDK_INT < 21 || !(background instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }
}
