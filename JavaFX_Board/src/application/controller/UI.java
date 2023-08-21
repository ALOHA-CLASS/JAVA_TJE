package application.controller;

public enum UI {
	LIST("/application/Main.fxml"),
    INSERT("/application/UI/INSERT.fxml"),
	READ("/application/UI/READ.fxml"),
	UPDATE("/application/UI/UPDATE.fxml");

    private final String path;

    UI(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}