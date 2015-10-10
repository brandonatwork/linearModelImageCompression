package com.cerner;

/**
 * Render an image from a linear model.
 * 
 * @author bi013621
 *
 */
public class LinearModelDecompressor {
    /**
     * Main program. Expects no arguments.
     * 
     * @param args
     */
    public static void main(String[] args) {
        for (int d1 = 1; d1 < 256; d1 += 3) {
            for (int d2 = 1; d2 < 256; d2 += 3) {
                // in the interest of readability, this line of coded is formatted over the next 70 editor lines or so.
                // Hopefully this doesn't disqualify the code from being "32 lines". The call to parseDouble is horribly
                // inefficient but it simplified getting doubles with exponents into Java.
                double v = -0.605192541120504 +
                        Math.pow(d1, 1) * Double.parseDouble("0.0893715244267458") +
                        Math.pow(d2, 1) * Double.parseDouble("0.0245793478420327") +
                        Math.pow(d1, 2) * Double.parseDouble("-0.0394744965004951") +
                        Math.pow(d2, 2) * Double.parseDouble("-0.011425692207411") +
                        Math.pow(d1, 3) * Double.parseDouble("0.00801038681612725") +
                        Math.pow(d2, 3) * Double.parseDouble("0.0026114102110426") +
                        Math.pow(d1, 4) * Double.parseDouble("-0.000898065695450656") +
                        Math.pow(d2, 4) * Double.parseDouble("-0.00031574440467004") +
                        Math.pow(d1, 5) * Double.parseDouble("6.15722726003468e-05") +
                        Math.pow(d2, 5) * Double.parseDouble("2.22025046533054e-05") +
                        Math.pow(d1, 6) * Double.parseDouble("-2.76308521945099e-06") +
                        Math.pow(d2, 6) * Double.parseDouble("-9.81987582486834e-07") +
                        Math.pow(d1, 7) * Double.parseDouble("8.51050027788306e-08") +
                        Math.pow(d2, 7) * Double.parseDouble("2.89187216021308e-08") +
                        Math.pow(d1, 8) * Double.parseDouble("-1.85424453468053e-09") +
                        Math.pow(d2, 8) * Double.parseDouble("-5.86455096250734e-10") +
                        Math.pow(d1, 9) * Double.parseDouble("2.90240889926707e-11") +
                        Math.pow(d2, 9) * Double.parseDouble("8.28749033101004e-12") +
                        Math.pow(d1, 10) * Double.parseDouble("-3.27014213598172e-13") +
                        Math.pow(d2, 10) * Double.parseDouble("-8.05224316687675e-14") +
                        Math.pow(d1, 11) * Double.parseDouble("2.61829313993462e-15") +
                        Math.pow(d2, 11) * Double.parseDouble("5.0775488819588e-16") +
                        Math.pow(d1, 12) * Double.parseDouble("-1.44206803737842e-17") +
                        Math.pow(d2, 12) * Double.parseDouble("-1.70979741805989e-18") +
                        Math.pow(d1, 13) * Double.parseDouble("5.1065794753593e-20") +
                        Math.pow(d1, 14) * Double.parseDouble("-9.69121644562239e-23") +
                        Math.pow(d2, 14) * Double.parseDouble("1.87373455059811e-23") +
                        Math.pow(d2, 16) * Double.parseDouble("-3.35022596394045e-28") +
                        Math.pow(d1, 17) * Double.parseDouble("1.45325095923064e-29") +
                        Math.pow(d1, 18) * Double.parseDouble("-1.87333439375737e-31") +
                        Math.pow(d2, 18) * Double.parseDouble("5.42114561185627e-33") +
                        Math.pow(d1, 19) * Double.parseDouble("1.04025936993303e-33") +
                        Math.pow(d1, 20) * Double.parseDouble("-2.30183343034758e-36") +
                        Math.pow(d2, 20) * Double.parseDouble("-5.90957649394947e-38") +
                        Math.pow(d2, 23) * Double.parseDouble("1.72165371530983e-45") +
                        Math.pow(d1, 25) * Double.parseDouble("1.98777280955108e-48") +
                        Math.pow(d1, 26) * Double.parseDouble("-8.49262261074367e-51") +
                        Math.pow(d2, 27) * Double.parseDouble("-2.71563312871263e-55") +
                        Math.pow(d1, 30) * Double.parseDouble("8.55279222863493e-61") +
                        Math.pow(d2, 30) * Double.parseDouble("1.08502273468089e-62") +
                        Math.pow(d1, 32) * Double.parseDouble("-4.47467588016046e-66") +
                        Math.pow(d1, 33) * Double.parseDouble("-1.36335244109756e-68") +
                        Math.pow(d2, 35) * Double.parseDouble("-4.01308440273042e-75") +
                        Math.pow(d1, 40) * Double.parseDouble("-3.31133635029574e-85") +
                        Math.pow(d2, 40) * Double.parseDouble("1.78099208333234e-87") +
                        Math.pow(d1, 42) * Double.parseDouble("2.29907285837388e-89") +
                        Math.pow(d1, 44) * Double.parseDouble("-3.2901703934185e-94") +
                        Math.pow(d1, 46) * Double.parseDouble("-9.22467387496857e-100") +
                        Math.pow(d2, 46) * Double.parseDouble("-2.44121921857832e-102") +
                        Math.pow(d1, 51) * Double.parseDouble("1.16585534741572e-110") +
                        Math.pow(d1, 52) * Double.parseDouble("-1.09379292094186e-113") +
                        Math.pow(d1, 53) * Double.parseDouble("-1.92907619743729e-115") +
                        Math.pow(d2, 53) * Double.parseDouble("1.12509043546415e-119") +
                        Math.pow(d1, 54) * Double.parseDouble("8.94114690055782e-119") +
                        Math.pow(d1, 56) * Double.parseDouble("4.60021619347891e-123") +
                        Math.pow(d2, 61) * Double.parseDouble("-1.7054623695899e-139") +
                        Math.pow(d1, 63) * Double.parseDouble("-3.51503269586758e-140") +
                        Math.pow(d1, 67) * Double.parseDouble("1.00017383992667e-149") +
                        Math.pow(d2, 70) * Double.parseDouble("7.88652131780623e-162") +
                        Math.pow(d1, 74) * Double.parseDouble("-2.81952830085366e-166") +
                        Math.pow(d1, 77) * Double.parseDouble("1.98210965675986e-173") +
                        Math.pow(d2, 80) * Double.parseDouble("-9.55315604138582e-187") +
                        Math.pow(d1, 83) * Double.parseDouble("-5.20992044580075e-188") +
                        Math.pow(d1, 88) * Double.parseDouble("6.99190519782778e-200") +
                        Math.pow(d1, 91) * Double.parseDouble("-7.61218853668015e-207") +
                        Math.pow(d1, 92) * Double.parseDouble("2.04294158498164e-209") +
                        Math.pow(d2, 92) * Double.parseDouble("7.79494670129884e-217") +
                        Math.pow(d1, 95) * Double.parseDouble("-6.61144211616486e-218") +
                        Math.pow(d1, 99) * Double.parseDouble("6.31071645605254e-230");
                // Render a 'pixel' with a small amount of antialiasing.
                System.out.print(v > 0.9 ? "**" : v > 0.85 ? "`," : v > 0.8 ? ". " : " ");
            }
            System.out.println();
        }
    }
}
