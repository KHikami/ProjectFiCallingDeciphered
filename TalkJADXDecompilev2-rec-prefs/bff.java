package p000;

final class bff implements Runnable {
    final /* synthetic */ beq f3187a;
    final /* synthetic */ bfe f3188b;

    bff(bfe bfe, beq beq) {
        this.f3188b = bfe;
        this.f3187a = beq;
    }

    public void run() {
        bfd bfd = this.f3188b.f3186b;
        if (this.f3187a != null) {
            bfd.f3180a.setText(bfd.f3181b.getString(ba.gv, new Object[]{glq.m18038i(bfd.f3181b, r1.m5011c())}));
            bfd.f3180a.setVisibility(0);
            return;
        }
        bfd.f3180a.setText("");
        bfd.f3180a.setVisibility(8);
    }
}
