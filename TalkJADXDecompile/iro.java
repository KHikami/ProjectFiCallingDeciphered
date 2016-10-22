import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.Size;
import java.util.List;

public final class iro extends iry {
    SurfaceTexture a;
    private int b;
    private int c;
    private int d;
    private int e;
    private Camera f;
    private iuc g;

    public iro(Context context) {
        int i = 0;
        super(context);
        this.b = -1;
        this.c = -1;
        this.d = 0;
        this.e = 0;
        this.s = new irp(this);
        try {
            CameraInfo cameraInfo = new CameraInfo();
            int numberOfCameras = Camera.getNumberOfCameras();
            while (i < numberOfCameras) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 1) {
                    this.b = i;
                    this.d = cameraInfo.orientation;
                } else {
                    this.c = i;
                    this.e = cameraInfo.orientation;
                }
                i++;
            }
        } catch (Throwable e) {
            itx.a("vclib", "Failed to detect cameras", e);
        }
    }

    public void a(ite ite, itq itq) {
        super.a(ite, itq);
        itq.a(this.s);
    }

    public boolean a() {
        return this.b != -1;
    }

    public boolean b() {
        return this.c != -1;
    }

    protected iuc c() {
        iuc iuc;
        synchronized (this.y) {
            iuc = this.g;
        }
        return iuc;
    }

    protected void d() {
        synchronized (this.y) {
            if (this.f != null) {
                itx.a(3, "vclib", "Camera was already opened, ignoring");
            } else if (this.C == 0) {
                itx.a("vclib", "openCamera was called with no camera selected.");
            } else if (this.f != null || this.w == null || this.z == null || this.a == null) {
            } else {
                iil.b("Attempted to open camera without a camera selected", this.C == 0);
                try {
                    int i;
                    int i2;
                    int i3;
                    this.f = Camera.open(this.C == 1 ? this.b : this.c);
                    Parameters parameters = this.f.getParameters();
                    List<int[]> supportedPreviewFpsRange = parameters.getSupportedPreviewFpsRange();
                    int[] iArr = (int[]) supportedPreviewFpsRange.get(supportedPreviewFpsRange.size() - 1);
                    int i4 = this.z.c * 1000;
                    int[] iArr2 = iArr;
                    for (int[] iArr3 : supportedPreviewFpsRange) {
                        itx.a(3, "vclib", "Camera FPS range: %d-%d", Integer.valueOf(iArr3[0]), Integer.valueOf(iArr3[1]));
                        if (iArr3[1] > iArr2[1] || iArr3[1] < i4 || (iArr3[1] >= iArr2[1] && iArr3[0] > iArr2[0])) {
                            iArr3 = iArr2;
                        }
                        iArr2 = iArr3;
                    }
                    itx.a("vclib", "Using camera FPS range: %d-%d", Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1]));
                    parameters.setPreviewFpsRange(iArr2[0], iArr2[1]);
                    iuc a = iuc.a(this.B, new iuc(this.z.d, this.z.e));
                    Size size = null;
                    i4 = Integer.MAX_VALUE;
                    for (Size size2 : parameters.getSupportedPreviewSizes()) {
                        Size size3;
                        itx.a(3, "vclib", "Camera preview candidate: %d x %d", Integer.valueOf(size2.width), Integer.valueOf(size2.height));
                        int i5 = size2.width - a.a;
                        i = size2.height - a.b;
                        if (i5 < 0) {
                            i5 *= -4;
                        }
                        if (i < 0) {
                            i *= -4;
                        }
                        i += i5;
                        if (i < i4) {
                            i2 = i;
                            size3 = size2;
                            i3 = i2;
                        } else {
                            i3 = i4;
                            size3 = size;
                        }
                        i4 = i3;
                        size = size3;
                    }
                    parameters.setPreviewSize(size.width, size.height);
                    float f = ((float) size.width) / ((float) size.height);
                    Size size4 = null;
                    float f2 = Float.MAX_VALUE;
                    i = Integer.MAX_VALUE;
                    for (Size size22 : parameters.getSupportedPictureSizes()) {
                        itx.a(3, "vclib", "Camera picture candidate: %d x %d", Integer.valueOf(size22.width), Integer.valueOf(size22.height));
                        if (size22.width >= size.width && size22.height >= size.height) {
                            if (size22.width == size.width && size22.height == size.height) {
                                break;
                            }
                            float f3;
                            Size size5;
                            float abs = Math.abs((((float) size22.width) / ((float) size22.height)) - f);
                            i4 = size22.width * size22.height;
                            if (abs < f2 || (abs == f2 && i4 < i)) {
                                f3 = abs;
                                i2 = i4;
                                size5 = size22;
                                i3 = i2;
                            } else {
                                i3 = i;
                                size5 = size4;
                                f3 = f2;
                            }
                            f2 = f3;
                            size4 = size5;
                            i = i3;
                        }
                    }
                    Size size222 = size4;
                    if (size222 == null) {
                        itx.a(5, "vclib", "No picture size appropriate for current preview size.");
                    } else {
                        itx.a("vclib", "Camera picture size: %d x %d ", Integer.valueOf(size222.width), Integer.valueOf(size222.height));
                        parameters.setPictureSize(size222.width, size222.height);
                    }
                    this.f.setParameters(parameters);
                    this.g = new iuc(parameters.getPreviewSize().width, parameters.getPreviewSize().height);
                    if (this.C == 1) {
                        i3 = (360 - this.d) % 360;
                    } else {
                        i3 = this.e;
                    }
                    this.f.setDisplayOrientation(i3);
                    itx.a("vclib", "Camera preview size: %s ", this.g);
                    try {
                        this.w.a(new itp().a(this.g.a, this.g.b));
                        this.f.setPreviewTexture(this.a);
                    } catch (Throwable e) {
                        itx.b("vclib", "Failure setting preview display", e);
                    }
                    try {
                        this.f.startPreview();
                        b(this.C == 1 ? this.d : this.e);
                    } catch (Throwable e2) {
                        itx.a("vclib", "startPreview failed; something else is using the camera.", e2);
                        l();
                    }
                } catch (Throwable e22) {
                    itx.a("vclib", "Error opening camera", e22);
                    l();
                }
            }
        }
    }

    protected void e() {
        synchronized (this.y) {
            if (this.f != null) {
                this.f.stopPreview();
                this.f.release();
                this.f = null;
            }
        }
        n();
    }
}
