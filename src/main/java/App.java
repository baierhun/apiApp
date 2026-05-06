import ui.Gui;
import ui.UIController;

import java.io.IOException;

/*
Initializes everything
UI
    GUI (Window management wrapper) -> UIController (Navigation) -> Windows (What we see)
Backend
    Service (used in UIController)
 */
public class App {
    public static void run() {
        try {
            // HttpClients

            // Services

            // GUI
            Gui gui = new Gui();
            gui.start();
            UIController ui = new UIController(gui);
            ui.showMainMenu();

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        }
    }
}
