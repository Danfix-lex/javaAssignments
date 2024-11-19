public class PixelQuantization {
    public static void main(String[] args) {
        int[] pixels = {5, 15, 45, 75, 125, 165, 190, 200};

        for (int i = 0; i < pixels.length; i++) {
            if (pixels[i] >= 0 && pixels[i] <= 20) {
                pixels[i] = 10;
            } else if (pixels[i] >= 21 && pixels[i] <= 40) {
                pixels[i] = 30;
            } else if (pixels[i] >= 41 && pixels[i] <= 60) {
                pixels[i] = 50;
            } else if (pixels[i] >= 61 && pixels[i] <= 80) {
                pixels[i] = 70;
            } else if (pixels[i] >= 81 && pixels[i] <= 100) {
                pixels[i] = 90;
            } else if (pixels[i] >= 101 && pixels[i] <= 120) {
                pixels[i] = 110;
            } else if (pixels[i] >= 121 && pixels[i] <= 140) {
                pixels[i] = 130;
            } else if (pixels[i] >= 141 && pixels[i] <= 160) {
                pixels[i] = 150;
            } else if (pixels[i] >= 161 && pixels[i] <= 180) {
                pixels[i] = 170;
            } else {
                pixels[i] = 190;
            }
        }

        for (int pixel : pixels) {
            System.out.print(pixel + " ");
        }
    }
}

