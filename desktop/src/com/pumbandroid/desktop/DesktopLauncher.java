package com.pumbandroid.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.badlogic.gdx.tools.texturepacker.TexturePacker;
import com.pumbandroid.CanyonBunnyMain;

public class DesktopLauncher {
   //для создания установить true
    private static boolean rebuildAtlas = false;
    private static boolean drawDebugOutline = false;

    public static void main(String[] arg) {
        //создание атласа текстур
        if (rebuildAtlas) {
            TexturePacker.Settings settings = new TexturePacker.Settings();
            settings.maxWidth = 1024;
            settings.maxHeight = 1024;
            settings.duplicatePadding = false;
            settings.debug = drawDebugOutline;
            TexturePacker.process(settings, "D:\\workspase_android\\CanyonBunny\\desktop\\assets-raw\\images", "images",
                    "canyonbunny.pack");
        }

        LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        LwjglApplicationConfiguration cfg = new
                LwjglApplicationConfiguration();
        config.width = 800;
        config.height = 480;
        new LwjglApplication(new CanyonBunnyMain(), config);
    }
}
