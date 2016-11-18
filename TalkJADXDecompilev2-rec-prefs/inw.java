package p000;

import android.graphics.RectF;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;

public class inw {
    public int f18173a;
    public int f18174b;
    public int f18175c;
    public int f18176d;
    public int f18177e;
    public final FloatBuffer f18178f;
    public final FloatBuffer f18179g;
    private final String f18180h;
    private boolean f18181i;
    private final RectF f18182j = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private final RectF f18183k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private boolean f18184l;
    private float[] f18185m = ity.f19013a;
    private boolean f18186n;
    private int f18187o;
    private int f18188p;
    private int f18189q;
    private int f18190r;
    private int f18191s;
    private int f18192t;
    private int f18193u;
    private final RectF f18194v = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private final float[] f18195w = new float[8];
    private final RectF f18196x = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    private final float[] f18197y = new float[8];

    public inw(String str) {
        this.f18180h = str;
        this.f18178f = ByteBuffer.allocateDirect(this.f18195w.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f18179g = ByteBuffer.allocateDirect(this.f18197y.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    protected String mo3344a() {
        return this.f18180h;
    }

    public void m22400a(int i, int i2, int i3, boolean z) {
        if (i != this.f18173a || i2 != this.f18174b || i3 != this.f18175c || z != this.f18181i) {
            this.f18173a = i;
            this.f18174b = i2;
            this.f18175c = i3;
            this.f18181i = z;
            this.f18186n = true;
            String valueOf = String.valueOf(mo3344a());
            int i4 = this.f18173a;
            int i5 = this.f18174b;
            int i6 = this.f18175c;
            itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 155).append("TextureRenderer(").append(valueOf).append("): setInputInfo: inputTextureName: ").append(i4).append(" inputTextureWidth: ").append(i5).append(" inputTextureHeight: ").append(i6).append(" inputTextureIsExternal: ").append(this.f18181i).toString());
        }
    }

    public void m22402a(RectF rectF) {
        boolean z = false;
        if (!this.f18182j.equals(rectF)) {
            String valueOf = String.valueOf(rectF);
            String stringBuilder = new StringBuilder(String.valueOf(valueOf).length() + 15).append("Bad crop rect: ").append(valueOf).toString();
            boolean z2 = rectF.left >= 0.0f && rectF.top >= 0.0f && rectF.right >= 0.0f && rectF.bottom >= 0.0f;
            iil.m21874a(stringBuilder, z2);
            if (rectF.left > 1.0f || rectF.top > 1.0f || rectF.right > 1.0f || rectF.bottom > 1.0f) {
                z2 = false;
            } else {
                z2 = true;
            }
            iil.m21874a(stringBuilder, z2);
            if (rectF.left + rectF.right < 1.0f) {
                z2 = true;
            } else {
                z2 = false;
            }
            iil.m21874a(stringBuilder, z2);
            if (rectF.top + rectF.bottom < 1.0f) {
                z = true;
            }
            iil.m21874a(stringBuilder, z);
            this.f18182j.left = rectF.left;
            this.f18182j.top = rectF.top;
            this.f18182j.right = rectF.right;
            this.f18182j.bottom = rectF.bottom;
            this.f18186n = true;
            String valueOf2 = String.valueOf(mo3344a());
            String valueOf3 = String.valueOf(this.f18182j);
            itx.m23277a(3, "vclib", new StringBuilder((String.valueOf(valueOf2).length() + 37) + String.valueOf(valueOf3).length()).append("TextureRenderer(").append(valueOf2).append("): setInputCropping: ").append(valueOf3).toString());
        }
    }

    public void m22405b(RectF rectF) {
        boolean z;
        boolean z2 = false;
        if (rectF.left < 0.0f || rectF.top < 0.0f || rectF.right < 0.0f || rectF.bottom < 0.0f) {
            z = false;
        } else {
            z = true;
        }
        iil.m21874a("Expected condition to be true", z);
        if (rectF.left <= 1.0f && rectF.top <= 1.0f && rectF.right <= 1.0f && rectF.bottom <= 1.0f) {
            z2 = true;
        }
        iil.m21874a("Expected condition to be true", z2);
        if (!this.f18183k.equals(rectF)) {
            this.f18183k.left = rectF.left;
            this.f18183k.top = rectF.top;
            this.f18183k.right = rectF.right;
            this.f18183k.bottom = rectF.bottom;
            this.f18186n = true;
            String valueOf = String.valueOf(mo3344a());
            String valueOf2 = String.valueOf(this.f18183k);
            itx.m23277a(3, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 40) + String.valueOf(valueOf2).length()).append("TextureRenderer(").append(valueOf).append("): setRegionOfInterest: ").append(valueOf2).toString());
        }
    }

    public void m22403a(float[] fArr) {
        this.f18185m = fArr;
    }

    public void m22401a(int i, int i2, boolean z) {
        if (i != this.f18176d || i2 != this.f18177e || z != this.f18184l) {
            this.f18176d = i;
            this.f18177e = i2;
            this.f18184l = z;
            this.f18186n = true;
            String valueOf = String.valueOf(mo3344a());
            int i3 = this.f18176d;
            itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 116).append("TextureRenderer(").append(valueOf).append("): setOutputInfo: outputWidth: ").append(i3).append(" outputHeight: ").append(this.f18177e).append(" allowAspectRatioClipping: ").append(z).toString());
        }
    }

    public void m22404b() {
        GLES20.glDeleteProgram(this.f18187o);
        GLES20.glDeleteProgram(this.f18188p);
        this.f18187o = 0;
        this.f18188p = 0;
        this.f18189q = 0;
    }

    private static void m22398a(RectF rectF, float[] fArr) {
        fArr[0] = rectF.right;
        fArr[1] = rectF.top;
        fArr[2] = rectF.left;
        fArr[3] = rectF.top;
        fArr[4] = rectF.left;
        fArr[5] = rectF.bottom;
        fArr[6] = rectF.right;
        fArr[7] = rectF.bottom;
    }

    void m22406c() {
        if (this.f18186n) {
            float f;
            String valueOf;
            float f2 = (1.0f - this.f18182j.left) - this.f18182j.right;
            float f3 = (1.0f - this.f18182j.top) - this.f18182j.bottom;
            int i = (int) (((float) this.f18174b) * f2);
            int i2 = (int) (((float) this.f18175c) * f3);
            float f4 = ((float) i) / ((float) i2);
            float f5 = ((float) this.f18176d) / ((float) this.f18177e);
            String valueOf2 = String.valueOf(mo3344a());
            itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf2).length() + 152).append("TextureRenderer(").append(valueOf2).append("): UpdateCoordinates croppedInputWidth=").append(i).append(" croppedInputHeight=").append(i2).append(" inputRatio=").append(f4).append(" outputRatio=").append(f5).toString());
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            if (this.f18184l) {
                if (f5 > f4) {
                    f9 = Math.min((f5 - f4) / f5, 0.5f) / 2.0f;
                    f7 = f9;
                } else {
                    f8 = Math.min((f4 - f5) / f4, 0.5f) / 2.0f;
                    f6 = f8;
                }
                String valueOf3 = String.valueOf(mo3344a());
                itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf3).length() + 111).append("TextureRenderer(").append(valueOf3).append("): UpdateCoordinates clipping=").append(f6).append(",").append(f7).append(" - ").append(f8).append(",").append(f9).toString());
            }
            if (this.f18183k.right > 0.0f && this.f18183k.bottom > 0.0f) {
                f4 = this.f18183k.left * f2;
                f = this.f18183k.top * f3;
                f2 -= this.f18183k.right * f2;
                f3 -= this.f18183k.bottom * f3;
                f6 = Math.min(f6, f4);
                f7 = Math.min(f7, f);
                f8 = Math.min(f8, f2);
                f9 = Math.min(f9, f3);
                valueOf = String.valueOf(mo3344a());
                itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf).length() + 106).append("TextureRenderer(").append(valueOf).append("): UpdateCoordinates roi=").append(f6).append(",").append(f7).append(" - ").append(f8).append(",").append(f9).toString());
            }
            f2 = this.f18182j.left + f6;
            f3 = this.f18182j.top + f7;
            f4 = this.f18182j.right + f8;
            f = this.f18182j.bottom + f9;
            String valueOf4 = String.valueOf(mo3344a());
            itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf4).length() + 117).append("TextureRenderer(").append(valueOf4).append("): UpdateCoordinates effective clip=").append(f2).append(",").append(f3).append(" - ").append(f4).append(",").append(f).toString());
            this.f18194v.left = f2;
            this.f18194v.right = 1.0f - f4;
            this.f18194v.top = 1.0f - f3;
            this.f18194v.bottom = f;
            inw.m22398a(this.f18194v, this.f18195w);
            this.f18178f.put(this.f18195w).position(0);
            valueOf = String.valueOf(mo3344a());
            String valueOf5 = String.valueOf(Arrays.toString(this.f18195w));
            itx.m23277a(3, "vclib", new StringBuilder((String.valueOf(valueOf).length() + 54) + String.valueOf(valueOf5).length()).append("TextureRenderer(").append(valueOf).append("): UpdateCoordinates texture vertices=").append(valueOf5).toString());
            f8 *= (float) i;
            f9 *= (float) i2;
            f6 = (((float) i) - (f6 * ((float) i))) - f8;
            f9 = (((float) i2) - (f7 * ((float) i2))) - f9;
            String valueOf6 = String.valueOf(mo3344a());
            itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf6).length() + 76).append("TextureRenderer(").append(valueOf6).append("): UpdateCoordinates clipped=").append(f6).append("x").append(f9).toString());
            if (f5 > f6 / f9) {
                f8 = ((((float) this.f18177e) / f9) * f6) / ((float) this.f18176d);
                f9 = 1.0f;
            } else {
                f8 = 1.0f;
                f9 = (f9 * (((float) this.f18176d) / f6)) / ((float) this.f18177e);
            }
            String valueOf7 = String.valueOf(mo3344a());
            itx.m23277a(3, "vclib", new StringBuilder(String.valueOf(valueOf7).length() + 80).append("TextureRenderer(").append(valueOf7).append("): UpdateCoordinates scaled size=").append(f8).append("x").append(f9).toString());
            this.f18196x.left = -f8;
            this.f18196x.top = f9;
            this.f18196x.right = f8;
            this.f18196x.bottom = -f9;
            inw.m22398a(this.f18196x, this.f18197y);
            this.f18179g.put(this.f18197y).position(0);
            valueOf2 = String.valueOf(mo3344a());
            valueOf6 = String.valueOf(Arrays.toString(this.f18197y));
            itx.m23277a(3, "vclib", new StringBuilder((String.valueOf(valueOf2).length() + 54) + String.valueOf(valueOf6).length()).append("TextureRenderer(").append(valueOf2).append("): UpdateCoordinates polygon vertices=").append(valueOf6).toString());
            this.f18186n = false;
        }
    }

    public boolean mo3345d() {
        if (this.f18187o == 0) {
            this.f18187o = gwb.m2303n("attribute vec4 vPosition;attribute vec2 a_texCoord;uniform mat4 a_xform;varying vec2 v_texCoord;void main() {  gl_Position = vPosition;  v_texCoord = (a_xform * vec4(a_texCoord, 1.0, 1.0)).st;}", "uniform sampler2D s_texture;precision mediump float;varying vec2 v_texCoord;void main() {  gl_FragColor = texture2D(s_texture, v_texCoord);}");
            gwb.m1457V("failed to compile regular shaders");
            if (this.f18187o == 0) {
                throw new IllegalStateException("Failed to compile regular shaders; no GL error");
            }
            this.f18188p = gwb.m2303n("attribute vec4 vPosition;attribute vec2 a_texCoord;uniform mat4 a_xform;varying vec2 v_texCoord;void main() {  gl_Position = vPosition;  v_texCoord = (a_xform * vec4(a_texCoord, 1.0, 1.0)).st;}", "#extension GL_OES_EGL_image_external : require\nuniform samplerExternalOES s_texture;precision mediump float;varying vec2 v_texCoord;void main() {  gl_FragColor = texture2D(s_texture, v_texCoord);}");
            gwb.m1457V("failed to compile OES shaders");
            if (this.f18188p == 0) {
                throw new IllegalStateException("Failed to compile OES shaders; no GL error");
            }
        }
        m22406c();
        int i = this.f18181i ? this.f18188p : this.f18187o;
        if (i != this.f18189q) {
            this.f18189q = i;
            this.f18191s = GLES20.glGetAttribLocation(this.f18189q, "a_texCoord");
            this.f18192t = GLES20.glGetAttribLocation(this.f18189q, "vPosition");
            this.f18190r = GLES20.glGetUniformLocation(this.f18189q, "s_texture");
            this.f18193u = GLES20.glGetUniformLocation(this.f18189q, "a_xform");
            gwb.m1457V("get..Location");
        }
        GLES20.glUseProgram(this.f18189q);
        GLES20.glViewport(0, 0, this.f18176d, this.f18177e);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        GLES20.glDisable(3042);
        GLES20.glDisable(2929);
        GLES20.glActiveTexture(33984);
        i = 3553;
        if (this.f18181i) {
            i = 36197;
        }
        GLES20.glBindTexture(i, this.f18173a);
        GLES20.glUniformMatrix4fv(this.f18193u, 1, false, this.f18185m, 0);
        GLES20.glUniform1i(this.f18190r, gwb.m1379D(33984));
        GLES20.glTexParameteri(i, 10241, 9729);
        GLES20.glTexParameteri(i, 10240, 9729);
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
        GLES20.glVertexAttribPointer(this.f18191s, 2, 5126, false, 0, this.f18178f);
        GLES20.glEnableVertexAttribArray(this.f18191s);
        GLES20.glVertexAttribPointer(this.f18192t, 2, 5126, false, 0, this.f18179g);
        GLES20.glEnableVertexAttribArray(this.f18192t);
        GLES20.glDrawArrays(6, 0, 4);
        gwb.m1462W("drawFrame");
        return true;
    }
}
