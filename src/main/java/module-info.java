module com.kensoftph.choicebox.understandingchoicebox {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.kensoftph.choicebox.understandingchoicebox to javafx.fxml;
    exports com.kensoftph.choicebox.understandingchoicebox;
}