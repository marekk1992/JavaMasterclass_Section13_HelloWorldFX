module sample.javamasterclass_section13_helloworldfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens sample to javafx.fxml;
    exports sample;
}