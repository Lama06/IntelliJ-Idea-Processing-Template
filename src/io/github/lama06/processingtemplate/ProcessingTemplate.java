package io.github.lama06.processingtemplate;

import processing.core.PApplet;
import processing.core.PImage;

public class ProcessingTemplate extends PApplet {
    public static void main(String[] args) {
        PApplet.main(ProcessingTemplate.class);
    }

    PImage lama;

    @Override
    public void settings() {
        size(300, 300, P2D);
    }

    @Override
    public void setup() {
        lama = loadImage("lama.jpg");
    }

    @Override
    public void draw() {
        image(lama, 0, 0, 300, 300);
    }
}
