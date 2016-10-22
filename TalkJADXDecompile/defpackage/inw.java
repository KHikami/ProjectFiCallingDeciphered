package defpackage;

import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;

/* renamed from: inw */
public class inw {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public final FloatBuffer f;
    public final FloatBuffer g;
    private final String h;
    private boolean i;
    private final RectF j;
    private final RectF k;
    private boolean l;
    private float[] m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private final RectF v;
    private final float[] w;
    private final RectF x;
    private final float[] y;

    public inw(String str) {
        this.j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.m = ity.a;
        this.v = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.w = new float[8];
        this.x = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.y = new float[8];
        this.h = str;
        this.f = ByteBuffer.allocateDirect(this.w.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.g = ByteBuffer.allocateDirect(this.y.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    protected String a() {
        return this.h;
    }

    public void a(int i, int i2, int i3, boolean z) {
        if (i != this.a || i2 != this.b || i3 != this.c || z != this.i) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.i = z;
            this.n = true;
            String valueOf = String.valueOf(a());
            int i4 = this.a;
            int i5 = this.b;
            int i6 = this.c;
            itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 155).append("TextureRenderer(").append(valueOf).append("): setInputInfo: inputTextureName: ").append(i4).append(" inputTextureWidth: ").append(i5).append(" inputTextureHeight: ").append(i6).append(" inputTextureIsExternal: ").append(this.i).toString());
        }
    }

    public void a(RectF rectF) {
        boolean z = false;
        if (!this.j.equals(rectF)) {
            String valueOf = String.valueOf(rectF);
            String stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15).append("Bad crop rect: ").append(valueOf).toString();
            boolean z2 = rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.right >= 0.0f && rectF.bottom >= 0.0f;
            iil.a(stringBuilder, z2);
            if (rectF.left > 1.0f || rectF.top > 1.0f || rectF.right > 1.0f || rectF.bottom > 1.0f) {
                z2 = false;
            } else {
                z2 = true;
            }
            iil.a(stringBuilder, z2);
            if (rectF.left + rectF.right < 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            iil.a(stringBuilder, z2);
            if (rectF.top + rectF.bottom < 1.0f) {
                z = true;
            }
            iil.a(stringBuilder, z);
            this.j.left = rectF.left;
            this.j.top = rectF.top;
            this.j.right = rectF.right;
            this.j.bottom = rectF.bottom;
            this.n = true;
            String valueOf2 = String.valueOf(a());
            String valueOf3 = String.valueOf(this.j);
            itx.a(3, "vclib", new StringBuilder((String.valueOf(valueOf2).length() + 37) + String.valueOf(valueOf3).length()).append("TextureRenderer(").append(valueOf2).append("): setInputCropping: ").append(valueOf3).toString());
        }
    }

    public void b(RectF rectF) {
        boolean z;
        boolean z2 = false;
        if (rectF.left < 0.0f || rectF.top < 0.0f || rectF.right < 0.0f || rectF.bottom < 0.0f) {
            z = false;
        } else {
            z = true;
        }
        iil.a("Expected condition to be true", z);
        if (rectF.left <= 1.0f && rectF.top <= 1.0f && rectF.right <= 1.0f && rectF.bottom <= 1.0f) {
            z2 = true;
        }
        iil.a("Expected condition to be true", z2);
        if (!this.k.equals(rectF)) {
            this.k.left = rectF.left;
            this.k.top = rectF.top;
            this.k.right = rectF.right;
            this.k.bottom = rectF.bottom;
            this.n = true;
            String valueOf = String.valueOf(a());
            String valueOf2 = String.valueOf(this.k);
            itx.a(3, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(valueOf2).length()).append("TextureRenderer(").append(valueOf).append("): setRegionOfInterest: ").append(valueOf2).toString());
        }
    }

    public void a(float[] fArr) {
        this.m = fArr;
    }

    public void a(int i, int i2, boolean z) {
        if (i != this.d || i2 != this.e || z != this.l) {
            this.d = i;
            this.e = i2;
            this.l = z;
            this.n = true;
            String valueOf = String.valueOf(a());
            int i3 = this.d;
            itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 116).append("TextureRenderer(").append(valueOf).append("): setOutputInfo: outputWidth: ").append(i3).append(" outputHeight: ").append(this.e).append(" allowAspectRatioClipping: ").append(z).toString());
        }
    }

    public void b() {
        GLES20.glDeleteProgram(this.o);
        GLES20.glDeleteProgram(this.p);
        this.o = 0;
        this.p = 0;
        this.q = 0;
    }

    private static void a(RectF rectF, float[] fArr) {
        fArr[0] = rectF.right;
        fArr[1] = rectF.top;
        fArr[2] = rectF.left;
        fArr[3] = rectF.top;
        fArr[4] = rectF.left;
        fArr[5] = rectF.bottom;
        fArr[6] = rectF.right;
        fArr[7] = rectF.bottom;
    }

    void c() {
        if (this.n) {
            float f;
            String valueOf;
            float f2 = (1.0f - this.j.left) - this.j.right;
            float f3 = (1.0f - this.j.top) - this.j.bottom;
            int i = (int) (((float) this.b) * f2);
            int i2 = (int) (((float) this.c) * f3);
            float f4 = ((float) i) / ((float) i2);
            float f5 = ((float) this.d) / ((float) this.e);
            String valueOf2 = String.valueOf(a());
            itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf2).length() + 152).append("TextureRenderer(").append(valueOf2).append("): UpdateCoordinates croppedInputWidth=").append(i).append(" croppedInputHeight=").append(i2).append(" inputRatio=").append(f4).append(" outputRatio=").append(f5).toString());
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            if (this.l) {
                if (f5 > f4) {
                    f9 = Math.min((f5 - f4) / f5, 0.5f) / 2.0f;
                    f7 = f9;
                } else {
                    f8 = Math.min((f4 - f5) / f4, 0.5f) / 2.0f;
                    f6 = f8;
                }
                String valueOf3 = String.valueOf(a());
                itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf3).length() + 111).append("TextureRenderer(").append(valueOf3).append("): UpdateCoordinates clipping=").append(f6).append(",").append(f7).append(" - ").append(f8).append(",").append(f9).toString());
            }
            if (this.k.right > 0.0f && this.k.bottom > 0.0f) {
                f4 = this.k.left * f2;
                f = this.k.top * f3;
                f2 -= this.k.right * f2;
                f3 -= this.k.bottom * f3;
                f6 = Math.min(f6, f4);
                f7 = Math.min(f7, f);
                f8 = Math.min(f8, f2);
                f9 = Math.min(f9, f3);
                valueOf = String.valueOf(a());
                itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 106).append("TextureRenderer(").append(valueOf).append("): UpdateCoordinates roi=").append(f6).append(",").append(f7).append(" - ").append(f8).append(",").append(f9).toString());
            }
            f2 = this.j.left + f6;
            f3 = this.j.top + f7;
            f4 = this.j.right + f8;
            f = this.j.bottom + f9;
            String valueOf4 = String.valueOf(a());
            itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf4).length() + 117).append("TextureRenderer(").append(valueOf4).append("): UpdateCoordinates effective clip=").append(f2).append(",").append(f3).append(" - ").append(f4).append(",").append(f).toString());
            this.v.left = f2;
            this.v.right = 1.0f - f4;
            this.v.top = 1.0f - f3;
            this.v.bottom = f;
            inw.a(this.v, this.w);
            this.f.put(this.w).position(0);
            valueOf = String.valueOf(a());
            String valueOf5 = String.valueOf(Arrays.toString(this.w));
            itx.a(3, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(valueOf5).length()).append("TextureRenderer(").append(valueOf).append("): UpdateCoordinates texture vertices=").append(valueOf5).toString());
            f8 *= (float) i;
            f9 *= (float) i2;
            f6 = (((float) i) - (f6 * ((float) i))) - f8;
            f9 = (((float) i2) - (f7 * ((float) i2))) - f9;
            String valueOf6 = String.valueOf(a());
            itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf6).length() + 76).append("TextureRenderer(").append(valueOf6).append("): UpdateCoordinates clipped=").append(f6).append("x").append(f9).toString());
            if (f5 > f6 / f9) {
                f8 = ((((float) this.e) / f9) * f6) / ((float) this.d);
                f9 = 1.0f;
            } else {
                f8 = 1.0f;
                f9 = (f9 * (((float) this.d) / f6)) / ((float) this.e);
            }
            String valueOf7 = String.valueOf(a());
            itx.a(3, "vclib", new StringBuilder(String.valueOf(valueOf7).length() + 80).append("TextureRenderer(").append(valueOf7).append("): UpdateCoordinates scaled size=").append(f8).append("x").append(f9).toString());
            this.x.left = -f8;
            this.x.top = f9;
            this.x.right = f8;
            this.x.bottom = -f9;
            inw.a(this.x, this.y);
            this.g.put(this.y).position(0);
            valueOf2 = String.valueOf(a());
            valueOf6 = String.valueOf(Arrays.toString(this.y));
            itx.a(3, "vclib", new StringBuilder((String.valueOf(valueOf2).length() + 54) + String.valueOf(valueOf6).length()).append("TextureRenderer(").append(valueOf2).append("): UpdateCoordinates polygon vertices=").append(valueOf6).toString());
            this.n = false;
        }
    }

    public boolean d() {
        if (this.o == 0) {
            this.o = gwb.n("attribute vec4 vPosition;attribute vec2 a_texCoord;uniform mat4 a_xform;varying vec2 v_texCoord;void main() {  gl_Position = vPosition;  v_texCoord = (a_xform * vec4(a_texCoord, 1.0, 1.0)).st;}", "uniform sampler2D s_texture;precision mediump float;varying vec2 v_texCoord;void main() {  gl_FragColor = texture2D(s_texture, v_texCoord);}");
            gwb.V("failed to compile regular shaders");
            if (this.o == 0) {
                throw new IllegalStateException("Failed to compile regular shaders; no GL error");
            }
            this.p = gwb.n("attribute vec4 vPosition;attribute vec2 a_texCoord;uniform mat4 a_xform;varying vec2 v_texCoord;void main() {  gl_Position = vPosition;  v_texCoord = (a_xform * vec4(a_texCoord, 1.0, 1.0)).st;}", "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES s_texture;precision mediump float;varying vec2 v_texCoord;void main() {  gl_FragColor = texture2D(s_texture, v_texCoord);}");
            gwb.V("failed to compile OES shaders");
            if (this.p == 0) {
                throw new IllegalStateException("Failed to compile OES shaders; no GL error");
            }
        }
        c();
        int i = this.i ? this.p : this.o;
        if (i != this.q) {
            this.q = i;
            this.s = GLES20.glGetAttribLocation(this.q, "a_texCoord");
            this.t = GLES20.glGetAttribLocation(this.q, "vPosition");
            this.r = GLES20.glGetUniformLocation(this.q, "s_texture");
            this.u = GLES20.glGetUniformLocation(this.q, "a_xform");
            gwb.V("get..Location");
        }
        GLES20.glUseProgram(this.q);
        GLES20.glViewport(0, 0, this.d, this.e);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glActiveTexture(33984);
        i = 3553;
        if (this.i) {
            i = 36197;
        }
        GLES20.glBindTexture(i, this.a);
        GLES20.glUniformMatrix4fv(this.u, 1, false, this.m, 0);
        GLES20.glUniform1i(this.r, gwb.D(33984));
        GLES20.glTexParameteri(i, 10241, 9729);
        GLES20.glTexParameteri(i, 10240, 9729);
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
        GLES20.glVertexAttribPointer(this.s, 2, 5126, false, 0, this.f);
        GLES20.glEnableVertexAttribArray(this.s);
        GLES20.glVertexAttribPointer(this.t, 2, 5126, false, 0, this.g);
        GLES20.glEnableVertexAttribArray(this.t);
        GLES20.glDrawArrays(6, 0, 4);
        gwb.W("drawFrame");
        return true;
    }
}
