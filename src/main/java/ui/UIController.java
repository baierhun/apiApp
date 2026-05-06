package ui;

import com.googlecode.lanterna.gui2.Window;
import ui.windows.MainWindow;

/*
Handles navigation
 */
public class UIController {

    private final Gui gui;

    public UIController(Gui gui) {
        this.gui = gui;
    }

    public void showMainMenu() {
        gui.show(new MainWindow(this));
    }

    public void closeWindow(Window window) {
        window.close();
    }

    public void closeApp() {
        gui.close();
    }
}
