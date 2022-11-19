
package Sem3;

public class Axis {
    public Axis() {
    }

    public void Quadrent(float var1, float var2) {
        if (var1 > 0.0F && var2 > 0.0F) {
            System.out.println(" \tThe given input (" + var1 + "/" + var2 + ") will be at 1st quadrant ");
        } else if (var1 < 0.0F && var2 > 0.0F) {
            System.out.println(" \tThe given input (" + var1 + "/" + var2 + ") will be at 2rd quadrant ");
        } else if (var1 < 0.0F && var2 < 0.0F) {
            System.out.println(" \tThe given input (" + var1 + "/" + var2 + ") will be at 3rd quadrant ");
        } else if (var1 > 0.0F && var2 < 0.0F) {
            System.out.println(" \tThe given input (" + var1 + "/" + var2 + ") will be at 4th quadrant ");
        } else if (var1 == 0.0F && var2 == 0.0F) {
            System.out.println(" \tThe given input is at the origin ");
        } else if (var1 == 0.0F && var2 != 0.0F) {
            System.out.println(" \tThe given input (" + var1 + "/" + var2 + ") is on Y axis ");
        } else if (var1 != 0.0F && var2 == 0.0F) {
            System.out.println(" \tThe given input (" + var1 + "/" + var2 + ") is on X axis ");
        } else {
            System.out.println(" \tThe given input is in the origin ");
        }

    }

    public static void main(String[] var0) {
        try {
            float var1 = Float.parseFloat(var0[0]);
            float var2 = Float.parseFloat(var0[1]);
            Axis var3 = new Axis();
            var3.Quadrent(var1, var2);
        } catch (NumberFormatException var4) {
            System.out.println(" \t\tINVALID INPUT ");
        }

    }
}
