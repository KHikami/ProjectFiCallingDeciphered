final class bff implements Runnable {
    final /* synthetic */ beq a;
    final /* synthetic */ bfe b;

    bff(bfe bfe, beq beq) {
        this.b = bfe;
        this.a = beq;
    }

    public void run() {
        bfd bfd = this.b.b;
        if (this.a != null) {
            bfd.a.setText(bfd.b.getString(ba.gv, new Object[]{glq.i(bfd.b, r1.c())}));
            bfd.a.setVisibility(0);
            return;
        }
        bfd.a.setText("");
        bfd.a.setVisibility(8);
    }
}
