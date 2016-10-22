public final class fdu extends flb {
    final fov a;

    public fdu(fov fov) {
        this.a = fov;
    }

    public void a(blo blo) {
        for (fow fow : this.a.a()) {
            if (fow.b() != 0) {
                blo.a(fow.a(), null, fow.b() == 1);
            }
        }
    }
}
